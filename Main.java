import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro do Cliente ===");
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Documento do cliente (CPF): ");
        String documentoCliente = scanner.nextLine();

        System.out.print("Telefone do cliente: ");
        String telefoneCliente = scanner.nextLine();

        System.out.print("Email do cliente: ");
        String emailCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, documentoCliente, telefoneCliente, emailCliente);

        System.out.println("\n=== Cadastro do Funcionario ===");
        System.out.print("Nome do funcionario: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.print("Documento do funcionario (CPF): ");
        String documentoFuncionario = scanner.nextLine();

        System.out.print("Cargo do funcionario: ");
        String cargoFuncionario = scanner.nextLine();

        System.out.print("Matrícula do funcionario: ");
        int matriculaFuncionario = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha após int

        Funcionario funcionario = new Funcionario(nomeFuncionario, documentoFuncionario, cargoFuncionario, matriculaFuncionario);

        System.out.println("\n=== Cadastro do Quarto ===");
        System.out.print("Numero do quarto: ");
        int numeroQuarto = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tipo do quarto: ");
        String tipoQuarto = scanner.nextLine();

        Quarto quarto = new Quarto(numeroQuarto, tipoQuarto);

        System.out.println("\n=== Acoes ===");
        System.out.println("1. Realizar reserva do cliente");
        System.out.println("2. Registrar entrada do funcionario");
        System.out.println("3. Verificar disponibilidade do quarto");
        System.out.println("Escolha uma opcao (1-3): ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                cliente.realizarReserva();
                break;
            case 2:
                funcionario.registrarEntrada();
                break;
            case 3:
                if (quarto.verificarDisponibilidade()) {
                    System.out.println("Quarto disponivel!");
                    quarto.reservar();
                } else {
                    System.out.println("Quarto indisponivel.");
                }
                break;
            default:
                System.out.println("Opção invalida.");
                break;
        }

        scanner.close();
    }
}
