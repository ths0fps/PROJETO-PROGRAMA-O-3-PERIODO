package model;
import controller.Pagamento;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem (Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido (produto, quantidade);
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }


    public void listarPedido() {
        System.out.println("===== PEDIDO == ");
        for (ItemPedido item : itens) {
            item.exibirItem();
            System.out.println();
        }
        System.out.println("TOTAL: R$ " + calcularTotal());
    }

    public void finalizarPedido(Pagamento pagamento){
        double total = calcularTotal();
        pagamento.pagar(total);
    }
}

