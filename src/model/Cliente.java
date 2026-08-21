package model;
import repository.carrinho;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    private carrinho carrinhos;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.carrinhos = new carrinho();
    }

    public void exibiInformacoes() {
        System.out.println("=======  CLIENTE =======");
        System.out.println("NOME: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);

    }

    public String getNome() {

        return nome;

    }

    public String getCpf() {

        return cpf;

    }

    public String getEmail() {

        return email;
    }

    public carrinho getCarrinhos(){
        return carrinhos;
    }

    public void setNome (String nome) {

        if (nome != null && !nome.isBlank()) {

            this.nome = nome;

        }

    }

    public void setCpf(String cpf) {

        if (cpf != null && cpf.length() == 11) {

            this.cpf = cpf;
        }

    }

    public void setEmail(String email) {

    if (email != null && email.contains( "@")) {

            this.email = email;
        }

    }





}


