

package repository;

import java.util.ArrayList;
import  model.Produto;

public class Carrinho {

    private ArrayList<Produto> produtos;
    public Carrinho() {
        produtos = new ArrayList<>();
    }


    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        System.out.println("===== CARRINHO =====");
        for (Produto produto : produtos) {
            produto.exibirProduto();
            System.out.println();
        }
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }
    
    public int quantidadeProdutos(){
        return produtos.size();
    }

}