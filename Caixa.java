import java.util.Scanner;

public class Caixa {
    Scanner scanner = new Scanner(System.in);

    private double valorFinal;

    public Caixa() {
        this.valorFinal = 0;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void receber(Quarto quarto, Funcionario funcionario){
        double valor = quarto.getPreco();
        System.out.println("Houve consumo durante a estadia, informe o valor: ");
        double consumo = scanner.nextDouble();

        if (consumo > 0) {
            valor += consumo;
            valorFinal += valor;
        } else {
            System.out.println("Valor de consumo inválido. Somente valores positivos são aceitos.");
        }
        quarto.setLimpo(false);

        Limpeza.limpar(funcionario, quarto);
    }
}
