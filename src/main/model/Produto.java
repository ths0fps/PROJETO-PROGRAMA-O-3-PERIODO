package model;

import java.util.Objects;

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

    public String getName() {return name;}

    public double getPreco() {return preco;}

    public int getQuantity() {return quantity;}

    public void setName(String name) {
        this.name = name;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    // toString

    

    @Override

    public String toString() {
        return "Produto{" +
                "nome='" + name +'\'' +
                ", preço=" + preco +
                //", estoque-" + estoque +
                '}';
    }

    // equals

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Produto)) {
            return false;
        }
    
        Produto outro = (Produto) obj;

        return Objects.equals(this.name, outro.name);
    }

    // hashCode

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}


