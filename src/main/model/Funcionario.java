package model;

public class Funcionario extends Pessoa{
    private double salarioBase;
    
    public Funcionario(String nome,String cpf,String email,double salario){
        super(nome, cpf, email);
        this.salarioBase = salario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void trabalhar(){
        System.out.println(getNome() + " está Trabalhando");
    }

    public double calcularSalario(){
        return salarioBase;
    }

    @Override
    public String getTipo(){
        return "Funcionario";
    }
}
