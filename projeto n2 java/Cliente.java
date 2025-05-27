public class Cliente {
    private static int contadorId = 1;
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    public Cliente(String nome, String email, String telefone, String endereco) {
        this.id = contadorId++;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente ID: " + id + ", Nome: " + nome + ", Email: " + email;
    }
}