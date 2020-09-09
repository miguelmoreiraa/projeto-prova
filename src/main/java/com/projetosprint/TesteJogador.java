package com.projetosprint;

public class TesteJogador {

    public static void main(String[] args) {
        // Criando os objetos
        JogadorMensal m = new JogadorMensal("Miguel", 8, "Volante", 500000.0);
        JogadorProdutividade mu = new JogadorProdutividade("Murillo", 10, "Meio-Campista", 1000000.0, 20, 60);

        System.out.println(m);
        System.out.println(mu);
    }


}
