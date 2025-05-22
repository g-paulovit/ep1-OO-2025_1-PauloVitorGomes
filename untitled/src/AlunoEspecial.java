import java.util.ArrayList;
import java.util.List;

public class AlunoEspecial extends Aluno {
    private Boolean especial;
    private String nome;
    private List<String> disciplinas;
    private static final int MAX_DISCIPLINAS = 2;

    public AlunoEspecial(String nome, Boolean especial) {
        this.especial = especial;
        this.nome = nome;
        this.disciplinas = new ArrayList<String>();
    }
    public boolean adicionarDisciplina(String disciplina){
        if (disciplinas.size() >= MAX_DISCIPLINAS){
            System.out.println("Não é possível adicionar mais disciplinas!");
            return false;
        }
        disciplinas.add(disciplina);
        return true;
    }
    public void registrarPresença(String disciplina) {
        if (disciplinas.contains(disciplina)){
            System.out.println("Presença registrada" + disciplinas);
        }else {
            System.out.println("Erro: Aluno(a) não matriculado!");
        }
    }
    public void registraNota(String disciplina, double nota) {
        System.out.println("Erro: Aluno Especial não pode registrar notas, apenas presenças!");;
    }
    public void listarDisciplinas(){
        System.out.println("Disciplinas cursadas por" + nome + ": " + disciplinas);
    }
}
