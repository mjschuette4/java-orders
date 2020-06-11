package com.javaorders.demo.repositories;

import com.javaorders.demo.models.Agents;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepo extends CrudRepository<Agents, Long> {
}
