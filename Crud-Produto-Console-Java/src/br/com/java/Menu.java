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
                System.out.println("Método 2");
                break;

            case 3:
                System.out.println("Método 3");
                break;
            case 4:
                System.out.println("Método 4");
                break;
            case 5:
                System.out.println("Finalizado");    
            default:
                System.out.println("Opção inválida..!");
                break;
        }
    }
}
