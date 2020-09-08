package com.projetosprint;

public abstract class Jogador {

    // Atributos
    private String nome;
    private Integer numeroDeCamisa;
    private String posicao;

    // Construtor
    public Jogador(String nome, Integer numeroDeCamisa, String posicao) {
        this.nome = nome;
        this.numeroDeCamisa = numeroDeCamisa;
        this.posicao = posicao;
    }

    // Método abstrato
    public abstract Double calculaSalario();

    //Getters
    public String getNome() {
        return nome;
    }
    public Integer getNumeroDeCamisa() {
        return numeroDeCamisa;
    }
    public String getPosicao() {
        return posicao;
    }

    //toString
    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", numeroDeCamisa=" + numeroDeCamisa +
                ", posicao='" + posicao + '\'' +
                '}';
    }
}
