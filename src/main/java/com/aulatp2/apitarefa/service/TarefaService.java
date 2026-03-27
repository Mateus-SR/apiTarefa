package com.aulatp2.apitarefa.service;

import com.aulatp2.apitarefa.model.Tarefa;
import com.aulatp2.apitarefa.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Tarefa> buscarPorId(int id){
        return tarefaRepository.findById(id);
    }

    public Optional<Tarefa> atualizar(int id, Tarefa tarefaAtualizada){
        return tarefaRepository.findById(id).map(tarefaAtual -> {
            tarefaAtual.setTitulo(tarefaAtualizada.getTitulo());
            tarefaAtual.setDescricao(tarefaAtualizada.getDescricao());
            tarefaAtual.setPrioridade(tarefaAtualizada.getPrioridade());
            return tarefaRepository.save(tarefaAtual);
        });
    }
}
