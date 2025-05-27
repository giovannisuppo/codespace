import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contadorId = 1;
    private int id;
    private Cliente cliente;
    private List<Item> itens;

    public Pedido(Cliente cliente) {
        this.id = contadorId++;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido ID: ").append(id).append("\nCliente: ").append(cliente.getNome()).append("\nItens:\n");
        for (Item item : itens) {
            sb.append(" - ").append(item).append("\n");
        }
        return sb.toString();
    }
}