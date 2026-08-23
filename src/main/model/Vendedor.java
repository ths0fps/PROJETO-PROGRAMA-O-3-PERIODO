package model;

public class Vendedor extends Funcionario{
    
    private double vendas;
    public Vendedor(String nome,String cpf, String email, double salario, double vendas){
        super(nome, cpf, email, salario);
        this.vendas = vendas;
    }
    @Override
    public double calcularSalario(){
        return getSalarioBase() + vendas * 0.05;
    }
    @Override
    public String getTipo(){
        return "Vendedor";
    }
}
