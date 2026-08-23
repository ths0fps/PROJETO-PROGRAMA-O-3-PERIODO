package repository;

import java.util.HashSet;
import java.util.Set;
import model.Produto;

public class GerenciadorProdutos {
    
    private Set<Produto> produtos;

    public GerenciadorProdutos(){
        produtos = new HashSet<>();
    }

    public void adicionarProdutos(Produto produto){
        produtos.add(produto);
    }

    public void listarProdutos(){
        System.out.println("==================Produtos=============");
        for (Produto Produto: produtos){
            Produto.exibirProduto();
            System.out.println();
        }
    }
}