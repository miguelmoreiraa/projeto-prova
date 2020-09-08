package com.projetosprint;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogadoresprodutividade")
public class JogadorProdutividadeController {


    private List<JogadorProdutividade> playersprodutividade = new ArrayList<>();


    // listando todos os jogadores
    @GetMapping()
    public ResponseEntity getPlayersProdutividade() {
        if (playersprodutividade.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok().body(playersprodutividade);
        }
    }

    // recuperando o jogador pelo id
    @GetMapping("{id}")
    public ResponseEntity recuperarJogadorProdutividade(@PathVariable int id) {
        if (playersprodutividade.size() >= id) {
            return ResponseEntity.accepted().body(playersprodutividade.get(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // cadastrando os jogadores
    @PostMapping()
    public ResponseEntity cadastrarJogadorProdutividade(@RequestBody JogadorProdutividade novaContratacaoProdutividade) {
        playersprodutividade.add(novaContratacaoProdutividade);
        return ResponseEntity.status(201).build();
    }

    // deletando um jogador
    @DeleteMapping("{id}")
    public ResponseEntity excluirJogadorProdutividade(@PathVariable int id) {
        if (playersprodutividade.size() >= id) {
            playersprodutividade.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
