package model;

import controller.Pagamento;

public class Pix implements Pagamento{

    @Override
    public void pagar(double valor){
        System.out.print("Pagamento realizado via PIX.");
        System.out.println("Valor R$:"+ valor);
    }
}
