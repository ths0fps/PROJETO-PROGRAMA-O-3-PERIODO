package model;

import controller.Pagamento;

public class PayPal implements Pagamento{

    @Override
    public void pagar(double valor){
        System.out.print("Pagamento realizado via PayPal.");
        System.out.println("Valor R$:"+ valor);
    }
}