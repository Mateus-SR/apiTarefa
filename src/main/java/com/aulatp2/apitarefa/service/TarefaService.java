package com.aulatp2.apitarefa.service;

import com.aulatp2.apitarefa.model.Tarefa;
import com.aulatp2.apitarefa.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaService (TarefaRepository tarefaRepository){
        this.tarefaRepository = tarefaRepository;

    }

    public List<Tarefa> listar(){
        return tarefaRepository.findAll();
    }

    public Tarefa salvar (Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

    public boolean deletar(int id){
        tarefaRepository.deleteById(id);
        return false;
    }
}
