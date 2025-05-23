import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class Turma {
    private String professor;
    private String semestre;
    private String formaAvaliacao;
    private boolean presencial;
    private String sala; // opcional se for remoto
    private  LocalTime horario;
    private int capacidadeMaxima;
    private List<Aluno> alunosMatriculados;

    public Turma(String professor, String semestre, String formaAvaliacao, boolean presencial,
                 String sala, String horario, int capacidadeMaxima) {

        this.professor = professor;
        this.semestre = semestre;
        this.formaAvaliacao = formaAvaliacao;
        this.presencial = presencial;

        if (!presencial && sala != null && !sala.isEmpty()) {
            System.out.println("Atenção: turma remota não pode ter sala. Ignorando valor de sala.");
            sala = null;
        }

        this.sala = presencial ? sala : null;
        this.horario = horario;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getProfessor() {
        return professor;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getFormaAvaliacao() {
        return formaAvaliacao;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public String getSala() {
        return sala;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public boolean matricularAluno(Aluno aluno) {
        if (alunosMatriculados.size() >= capacidadeMaxima) {
            System.out.println("Turma cheia. Matrícula não permitida.");
            return false;
        }
        if (!alunosMatriculados.contains(aluno)) {
            alunosMatriculados.add(aluno);
            return true;
        }
        System.out.println("Aluno já está matriculado nesta turma.");
        return false;
    }

    public void listarAlunos() {
        if (alunosMatriculados.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            for (Aluno aluno : alunosMatriculados) {
                System.out.println("- " + aluno.getNome() + " (" + aluno.getMatricula() + ")");
            }
        }
    }
}
