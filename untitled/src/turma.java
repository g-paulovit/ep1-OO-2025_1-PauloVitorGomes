import java.time.LocalTime;


public class turma extends Disciplina{
        private String professor;
        private String semestre;
        private String avaliacao;
        private String frequencia;
        private Boolean presencial;
        private String sala;
        private LocalTime horario;
}
    public turma (String professor, String semestre, String avaliacao, String frequencia, Boolean presencial, String sala, LocalTime horario){
        this.professor = professor;
        this.semestre = semestre;
        this.avaliacao = avaliacao;
        this.frequencia = frequencia;
        this.presencial = presencial;
        this.sala = sala;
        this.horario = horario;
    }