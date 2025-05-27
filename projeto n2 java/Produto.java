public class Produto {
    private static int contadorId = 1;
    private int id;
    private String fabricante;
    private String descricao;
    private double preco;
    private int estoque;

    public Produto(String fabricante, String descricao, double preco, int estoque) {
        this.id = contadorId++;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void reduzirEstoque(int quantidade) {
        this.estoque -= quantidade;
    }

    @Override
    public String toString() {
        return "Produto ID: " + id + ", " + descricao + " - R$" + preco + ", Estoque: " + estoque;
    }
}