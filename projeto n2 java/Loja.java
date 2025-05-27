import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void adicionarPedido(Pedido p) {
        pedidos.add(p);
    }

    public Cliente buscarClientePorId(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Pedido> getPedidosPorCliente(Cliente cliente) {
        List<Pedido> lista = new ArrayList<>();
        for (Pedido p : pedidos) {
            if (p.getCliente().getId() == cliente.getId()) {
                lista.add(p);
            }
        }
        return lista;
    }

    public void inicializarDados() {
        adicionarCliente(new Cliente("Alice", "alice@email.com", "1111-1111", "Rua A"));
        adicionarCliente(new Cliente("Bob", "bob@email.com", "2222-2222", "Rua B"));

        adicionarProduto(new Produto("Samsung", "Smartphone Galaxy", 1500.0, 10));
        adicionarProduto(new Produto("LG", "Smart TV 50\"", 2500.0, 5));
        adicionarProduto(new Produto("Dell", "Notebook Inspiron", 3500.0, 7));
    }
}