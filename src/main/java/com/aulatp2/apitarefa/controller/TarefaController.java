package com.aulatp2.apitarefa.controller;

import com.aulatp2.apitarefa.model.Tarefa;
import com.aulatp2.apitarefa.service.TarefaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    private final TarefaService tarefaService;
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> listar(){
        return ResponseEntity.ok(tarefaService.listar());
    }

    @PostMapping
    public ResponseEntity<Tarefa> salvar(@RequestBody Tarefa tarefa){
        return ResponseEntity.ok(tarefaService.salvar(tarefa));
    }

    /*
    public ResponseEntity<Tarefa> buscaPorId(@PathVariable int id){

    }
*/
}
