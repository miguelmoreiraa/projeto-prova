package com.projetosprint;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogadoresmensal")
public class JogadorMensalController {

    private List<JogadorMensal> playersmensal = new ArrayList<>();


    // listando todos os jogadores
    @GetMapping()
    public ResponseEntity getPlayersMensal() {
        if (playersmensal.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok().body(playersmensal);
        }
    }


    // recuperando o jogador pelo id
    @GetMapping("/{id}")
    public ResponseEntity recuperarJogadorMensal(@PathVariable int id) {
        if (playersmensal.size() >= id) {
            return ResponseEntity.accepted().body(playersmensal.get(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // cadastrando os jogadores
    @PostMapping()
    public ResponseEntity cadastrarJogadorMensal(@RequestBody JogadorMensal novaContratacaoMensal) {
        playersmensal.add(novaContratacaoMensal);
        return ResponseEntity.status(201).build();
    }


    // deletando um jogador
    @DeleteMapping("{id}")
    public ResponseEntity excluirJogador(@PathVariable int id) {
        if (playersmensal.size() >= id) {
            playersmensal.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
