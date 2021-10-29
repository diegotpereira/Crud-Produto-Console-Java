package br.com.java;

import br.com.java.controller.ProdutoController;

public class Menu {


    ProdutoController controle = new ProdutoController();

    public void listarMetodos() {
        System.out.println("Escolha uma opção\n" + "1 => Novo Produto | 2 => Alterar Produto | 3 => Listar Produto " + "4 => Excluir Produto | 5 => Sair");
    }

    public void executeMetodo(int opcao) {

        switch (opcao) {
            case 1:
                controle.criarProduto();
                break;
        
            case 2:
                controle.atualizarProduto();
                break;

            case 3:
                controle.listarProdutos();
                break;
            case 4:
                controle.deletarProduto();
                break;
            case 5:
                System.out.println("Finalizado");
                System.exit(0);   
            default:
                System.out.println("Opção inválida..!");
                break;
        }
    }
}
