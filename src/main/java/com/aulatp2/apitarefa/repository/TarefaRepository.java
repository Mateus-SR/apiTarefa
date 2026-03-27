package com.aulatp2.apitarefa.repository;

import com.aulatp2.apitarefa.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa,Integer> {
}
