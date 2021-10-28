package br.com.java.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.java.modelo.Produto;

public class ProdutoDao {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public List<Produto>listarProdutos() {
        return this.produtos;
    }

    public void salvarOuAtualizar(Produto produto) {
        if (produtos.contains(produto)) {
            System.out.println("Produto " + produto.getId() + "atualizado com sucesso!");

        } else {
            produtos.add(produto);
            System.out.println("Produto salvo com sucesso..!");
        }
    }

    public Produto getProduto(int id) {
        Produto produto = null;

        for(Produto prod : produtos) {
            if (prod.getId() == id) {
                produto = prod;
            }
        }
        return produto;
    }

    public void deletarProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Apagando produto " + produto.getId() + "...");
        produto = null;
        System.out.println("Produto removido com sucesso..!");
    }
}
