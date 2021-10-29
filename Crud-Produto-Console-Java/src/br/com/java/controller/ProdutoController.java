package br.com.java.controller;
import java.util.List;
import java.util.Scanner;

import br.com.java.dao.ProdutoDao;
import br.com.java.modelo.Produto;

public class ProdutoController {

    ProdutoDao dao = new ProdutoDao();
    // Produto produto = new Produto();
    
    int autoId = 0;

    public void criarProduto() {
        Produto p = new Produto(++autoId);
        salvarOuAtualizar(p);
    }

    public void salvarOuAtualizar(Produto produto) {
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Nome do Produto: ");
        String nome = entrada.nextLine();
        if (nome != null && !nome.isEmpty()) {
            produto.setNome(nome);
        }

        System.out.println("Descrição do Produto: ");
        String descricao = entrada.nextLine();
        if (descricao != null && !descricao.isEmpty()) {
            produto.setDescricao(descricao);
        }

        if (validarProduto(produto)) {
            dao.salvarOuAtualizar(produto);
        } else {
            System.out.println("Nome ou Descrição precisam ser preenchidos..!");
            produto = null;
            --autoId;
        }
    }

    public boolean validarProduto(Produto produto) {
        return ((produto.getNome() != null) && (produto.getDescricao() != null)
                                            && !(produto.getDescricao().isEmpty()) && !(produto.getNome().isEmpty()));
    }

    public void listarProdutos() {
        List<Produto> lista = dao.listarProdutos();

        if (!lista.isEmpty()) {
            System.out.println("|id \t |nome \t |descrição " + 
            "\n=================================");
            for(Produto produto : lista) {
                System.out.println(produto.getId() + "\t" + 
                produto.getNome() + "\t" + produto.getDescricao());
            }

        } else {
            System.out.println("Não existem produto cadastrados");
        }
    }

    public void deletarProduto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código do Produto que você deseja excluir..!");
        Produto produto = dao.getProduto(entrada.nextInt());

        if (produto != null) {
            dao.deletarProduto(produto);

        } else {
            System.out.println("o código do produto não foi encontrado..!");
        }
    }

    public void atualizarProduto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código do produto que você deseja atualizar..!");
        Produto produto = dao.getProduto(entrada.nextInt());

        if (produto != null) {
            salvarOuAtualizar(produto);

        } else {
            System.out.println("O código do produto não foi encontrado..!");
        }
    }
}
