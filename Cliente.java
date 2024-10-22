public class Cliente extends Usuario { // uso de heranca 
    private String telefone;
    private String email;

    public Cliente(String nome, String documento, String telefone, String email) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void realizarReserva() {
        System.out.println("Reserva realizada pelo cliente: " + nome);
    }
}
