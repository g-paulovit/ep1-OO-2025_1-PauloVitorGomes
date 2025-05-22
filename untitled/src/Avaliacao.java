public enum TipoAvaliacao {
    SIMPLES,
    PONDERADA
}

public class Avaliacao extends Disciplina {
    private double notap1;
    private double notap2;
    private double notap3;
    private double lista;
    private double semin;

    public Avaliacao(String nome, String codigo, String carga_horaria, String pre_requisitos) {
        super();
        this.notap1 = notap1;
        this.notap1 = notap2;
        this.notap1 = notap3;
        this.lista = lista;
        this.semin = semin;
    }
    public double calcularMedia(TipoAvaliacao tipo) {
        if (tipo == TipoAvaliacao.SIMPLES) {
            return (notap1 + notap1 + notap1 + lista + semin) / 5;
        } else { // PONDERADA
            return (notap1 + notap1*2 + notap1*3 + lista + semin) / 8;
        }
    }
}
