package com.javaorders.demo.services;

import com.javaorders.demo.models.Agents;
import com.javaorders.demo.repositories.AgentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "agentsService")
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentRepo agtrepos;

    @Override
    public Agents findAgentById(long id) {
        return agtrepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Agent " + id + " Not found"));
    }
}
