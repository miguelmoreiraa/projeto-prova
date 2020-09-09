package com.projetosprint;

public class JogadorProdutividade extends Jogador {

    // Atributos
    private Double salario;
    private Integer quantidadeDeGols;
    private Integer quantidadeDeJogos;

    // Construtor
    public JogadorProdutividade(String nome, Integer numeroDeCamisa, String posicao, Double salario, Integer quantidadeDeGols, Integer quantidadeDeJogos) {
        super(nome, numeroDeCamisa, posicao);
        this.salario = salario;
        this.quantidadeDeGols = quantidadeDeGols;
        this.quantidadeDeJogos = quantidadeDeJogos;
    }

    // Implementando o método abstrato
    @Override
    public Double calculaSalario() {
        return salario + (quantidadeDeGols * 0.2) + (quantidadeDeJogos * 0.5);
    }

    // Getters
    public Double getSalario() {
        return calculaSalario();
    }

    public Integer getQuantidadeDeGols() {
        return quantidadeDeGols;
    }

    public Integer getQuantidadeDeJogos() {
        return quantidadeDeJogos;
    }

    // toString
    @Override
    public String toString() {
        return "JogadorProdutividade{" +
                "salario=" + salario +
                ", quantidadeDeGols=" + quantidadeDeGols +
                ", quantidadeDeJogos=" + quantidadeDeJogos +
                ", total de sálario: " + calculaSalario() +
                "} " + super.toString();
    }
}
