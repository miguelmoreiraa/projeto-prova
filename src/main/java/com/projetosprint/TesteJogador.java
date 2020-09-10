package com.projetosprint;

public class TesteJogador {

    public static void main(String[] args) {
        // Criando os objetos
        JogadorMensal mm = new JogadorMensal("Miguel Moreira", 8, "Volante", 500000.0);
        JogadorMensal jm = new JogadorMensal("Julio Mota", 11, "Atacante", 200000.0);
        JogadorProdutividade mu = new JogadorProdutividade("Murillo Moreira", 10, "Meio-Campista", 1000000.0, 20, 60);
        JogadorProdutividade hm = new JogadorProdutividade("Henrique Mota", 7, "Meia-atacante", 5000000.0, 10, 80);

        System.out.println(mm);
        System.out.println(mu);


        Clube sao = new Clube("São Paulo");

        sao.adicJogador(mm);
        sao.adicJogador(jm);
        sao.adicJogador(mu);
        sao.adicJogador(hm);

        sao.exibeTodos();

        sao.exibeJogadorMensal();

        sao.exibeJogadorProdutividade();




    }


}
