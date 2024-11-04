public class Limpeza {
    public static void limpar(Funcionario funcionario, Quarto quarto){
        System.out.println("Funcionario " + funcionario + "foi encaminhado para limpar o Quarto " + quarto);
        quarto.setLimpo(true);
        quarto.setDisponivel(true);
    }
}
