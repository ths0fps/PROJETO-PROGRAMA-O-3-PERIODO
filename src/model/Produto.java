package model;

public class Produto {

    private String name;

    private double preco;

    private int quantity;

    public Produto( String name, double preco, int quantity) {
        this.name = name;

        this.preco = preco;

        this.quantity = quantity;
    }

    public void exibirProduto() {

        System.out.println( "===== PRODUCT =====");

        System.out.println("Name: " + name);

        System.out.println("Price: R$ " + preco);

        System.out.println("Quantity: " + quantity);


    }

    public String getName() {

        return name;

    }
    public double getPreco() {

        return preco;

    }
    public int getQuantity() {

        return quantity;

    }
}


