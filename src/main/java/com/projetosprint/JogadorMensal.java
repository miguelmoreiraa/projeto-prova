package com.projetosprint;

public class JogadorMensal extends Jogador {

    // Atributos
    private Double salario;

    // Construtor
    public JogadorMensal(String nome, Integer numeroDeCamisa, String posicao, Double salario) {
        super(nome, numeroDeCamisa, posicao);
        this.salario = salario;
    }

    // Implementando o método abstrato
    @Override
    public Double calculaSalario() {
        return salario;
    }

    public Double getSalario() {
        return calculaSalario();
    }

    @Override
    public String toString() {
        return "JogadorMensal: \n" +
                "\n salario=" + calculaSalario() +
                " " + super.toString();
    }

}
