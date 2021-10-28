package br.com.java.modelo;

public class Produto {
    private int id;
    private String nome;
    private String descricao;

    public Produto(int id) {
        this.id = id;
    }

    // public Produto(int id, String nome, String descricao) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.descricao = descricao;
    // }



    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
