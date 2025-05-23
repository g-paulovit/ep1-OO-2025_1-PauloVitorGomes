public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String email;
    private Boolean especial;

    public Aluno(String nome, String matricula, String curso, String email, Boolean especial) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.email = email;
        this.especial = especial;
    }


    public Aluno() {
    }

    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }
    public String getEmail() {
        return email;
    }
    public Boolean getEspecial() {
        return especial;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEspecial(Boolean especial) {
        this.especial = especial;
    }
    @Override
    public String toString() {
        return String.format("Nome: %s | Matrícula: %s | Curso: %s | Email: %s | Especial: %s",
                nome, matricula, curso, email, especial ? "Sim" : "Não");
    }
}
