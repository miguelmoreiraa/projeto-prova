package com.projetosprint;

import java.util.ArrayList;
import java.util.List;

public class Clube {

    // Atributos
    private String nome;
    private List<Jogador> lista;

    // Construtor
    public Clube(String nome) {
        this.nome = nome;
        lista = new ArrayList<>();
    }

    // Método adiciona jogador
    public void adicJogador(Jogador j) {
        lista.add(j);
    }

    // Método exibe todos jogadores
    public void exibeTodos() {
        System.out.println("\n Todos os jogadores");
        for (Jogador j : lista) {
            System.out.println(j);
        }
    }

    // Método exibe jogadores mensal
    public void exibeJogadorMensal() {
        System.out.println("\n Jogadores Mensal");
        for (Jogador j : lista) {
            if (j instanceof JogadorMensal) {
                System.out.println(j);
            }
        }
    }

    // Método exibe jogadores produtividade
    public void exibeJogadorProdutividade() {
        System.out.println("\n Jogadores Produtividade");
        for (Jogador j : lista) {
            if (j instanceof JogadorProdutividade) {
                System.out.println(j);
            }
        }
    }



}
