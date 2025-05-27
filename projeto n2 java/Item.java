public class Item {
    private Produto produto;
    private int quantidade;
    private double precoUnitario;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();
    }

    public double getTotal() {
        return precoUnitario * quantidade;
    }

    @Override
    public String toString() {
        return produto.getDescricao() + " x" + quantidade + " = R$" + getTotal();
    }
}