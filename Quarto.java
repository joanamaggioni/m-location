public class Quarto {
    private int numeroQuarto;
    private String tipoQuarto;
    private boolean disponivel;

    public Quarto(int numeroQuarto, String tipoQuarto) {
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.disponivel = true;
    }

    public boolean verificarDisponibilidade() {
        return disponivel;
    }

    public void reservar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Quarto " + numeroQuarto + " reservado.");
        } else {
            System.out.println("Quarto " + numeroQuarto + " não está disponível.");
        }
    }

    public void liberar() {
        disponivel = true;
        System.out.println("Quarto " + numeroQuarto + " liberado.");
    }
}
