package model;

import controller.Pagamento;

public class Boleto implements Pagamento{

    @Override
    public void pagar(double valor){
        System.out.print("Pagamento realizado via Boleto.");
        System.out.println("Valor R$:"+ valor);
    }
}
