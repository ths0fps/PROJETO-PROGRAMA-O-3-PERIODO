package model;

import controller.Pagamento;

public class CartaoCredito implements Pagamento{

    @Override
    public void pagar(double valor){
        System.out.print("Pagamento realizado via Cartão De Credito.");
        System.out.println("Valor R$:"+ valor);
    }
}