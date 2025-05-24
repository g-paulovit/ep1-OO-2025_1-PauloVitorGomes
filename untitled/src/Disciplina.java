import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private List<String> codigosPreRequisitos;
    private List<Turma> turmas;

    public Disciplina(String codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.codigo = codigo;
        this.codigosPreRequisitos = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public List<String> getCodigosPreRequisitos() {
        return codigosPreRequisitos;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void adicionarPreRequisito(String codigoDisciplina) {
        if (!codigosPreRequisitos.contains(codigoDisciplina)) {
            codigosPreRequisitos.add(codigoDisciplina);
        }
    }

    public void adicionarTurma(Turma turma) {
        for (Turma t : turmas) {
            if (t.getHorario().equals(turma.getHorario())) {
                System.out.println("Erro: já existe uma turma dessa disciplina nesse horário.");
                return;
            }
        }
        turmas.add(turma);
        System.out.println("Turma adicionada com sucesso.");
    }

       //turmas.add(Turma);
    }


