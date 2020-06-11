package com.javaorders.demo.services;

import com.javaorders.demo.models.Agents;

public interface AgentService {
    Agents findAgentById(long id);
}
