package model;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;


    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void exibirInformacoes() {
        System.out.println("Tipo: "+ getTipo());
        System.out.println("NOME: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
    }

    public abstract String getTipo();
    
    public String getNome() {return nome;}

    public String getCpf() {return cpf;}

    public String getEmail() {return email;}

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


