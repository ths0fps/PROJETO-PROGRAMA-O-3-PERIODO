package model;
import repository.Carrinho;

public class Cliente extends Pessoa{

    private Carrinho carrinho;

    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
        this.carrinho = new Carrinho();
    }

    public Carrinho getCarrinho(){return carrinho;}

    public void adicionarProdutoAoCarrinho(Produto produto){
        carrinho.adicionarProduto(produto);
    }

    public void listarCarrinho(){
        carrinho.listarProdutos();
    }

    @Override
    public String getTipo(){
        return "Cliente";
    }
}


