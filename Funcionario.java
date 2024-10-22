public class Funcionario extends Usuario {
    private String cargo;
    private int matricula;

    public Funcionario(String nome, String documento, String cargo, int matricula) {
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void registrarEntrada() {
        System.out.println("Funcionário " + nome + " registrado na entrada.");
    }
}
