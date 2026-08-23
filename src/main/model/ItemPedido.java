package model;

public class ItemPedido {

    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {return produto;}

    public int getQuantidade() {return quantidade;}

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public void exibirItem() {
        System.out.println(produto.getName());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Subtotal: R$ " + calcularSubtotal());
    }
}