public class Disciplina {
    private String nome;
    private String codigo;
    private String carga_horaria;
    private String pre_requisitos ;
    private int presenca;
    private int nota;

    public Disciplina(String nome, String codigo, String carga_horaria, String pre_requisitos, int presenca, int nota) {
        this.nome = nome;
        this.codigo = codigo;
        this.carga_horaria = carga_horaria;
        this.pre_requisitos = pre_requisitos;
        this.presenca = presenca;
        this.nota = nota;
    }
}
