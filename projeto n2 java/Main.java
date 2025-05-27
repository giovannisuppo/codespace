//Henrique Durão - 10438068

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.inicializarDados();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à QuickShop!");
        System.out.print("Digite seu ID de cliente: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine();  // consumir quebra de linha
        Cliente cliente = loja.buscarClientePorId(idCliente);

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        int opcao;
        do {
            System.out.println("\n** QuickShop **");
            System.out.println("Bem-vindo, " + cliente.getNome() + "!");
            System.out.println("1) Ver Catálogo de Produtos");
            System.out.println("2) Fazer Novo Pedido");
            System.out.println("3) Ver Meus Pedidos");
            System.out.println("4) Sair");
            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    for (Produto p : loja.getProdutos()) {
                        System.out.println(p);
                    }
                    break;
                case 2:
                    Pedido pedido = new Pedido(cliente);
                    while (true) {
                        System.out.print("Digite o ID do produto (ou 0 para finalizar): ");
                        int idProduto = scanner.nextInt();
                        if (idProduto == 0) break;
                        Produto produto = loja.buscarProdutoPorId(idProduto);
                        if (produto == null) {
                            System.out.println("Produto não encontrado.");
                            continue;
                        }
                        System.out.print("Quantidade: ");
                        int quantidade = scanner.nextInt();
                        if (quantidade > produto.getEstoque()) {
                            System.out.println("Estoque insuficiente.");
                            continue;
                        }
                        pedido.adicionarItem(new Item(produto, quantidade));
                        produto.reduzirEstoque(quantidade);
                    }
                    loja.adicionarPedido(pedido);
                    System.out.println("Pedido realizado com sucesso!");
                    break;
                case 3:
                    for (Pedido p : loja.getPedidosPorCliente(cliente)) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar a QuickShop!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);
        scanner.close();
    }
}