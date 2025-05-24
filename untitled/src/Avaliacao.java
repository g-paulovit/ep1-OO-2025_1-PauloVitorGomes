enum TipoAvaliacao {
    SIMPLES,
    PONDERADA
}

public class Avaliacao extends Disciplina {
    private double notap1;
    private double notap2;
    private double notap3;
    private double lista;
    private double semin;

    public Avaliacao(String nome, String codigo, int carga_horaria, double notap1, double notap2, double notap3, double lista, double semin) {
        super(codigo, nome, carga_horaria);
        this.notap1 = notap1;
        this.notap2 = notap2;
        this.notap3 = notap3;
        this.lista  = lista;
        this.semin  = semin;
    }

    public double calcularMedia(TipoAvaliacao tipo) {
        if (tipo == TipoAvaliacao.SIMPLES) {
            return (notap1 + notap1 + notap1 + lista + semin) / 5;
        } else { // PONDERADA
            return (notap1 + notap1*2 + notap1*3 + lista + semin) / 8;
        }
    }
}
