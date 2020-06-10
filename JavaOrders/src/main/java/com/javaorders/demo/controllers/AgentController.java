package com.javaorders.demo.controllers;

import com.javaorders.demo.models.Agents;
import com.javaorders.demo.services.AgentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AgentController {
    @Autowired
    private AgentsService agentsService;

    // http://localhost:2019/agents/agent/9
    @GetMapping(value = "/agent/{id}",
            produces = {"application/json"})
    public ResponseEntity<?> findAgentById(
            @PathVariable
                    long id)
    {
        Agents a = agentsService.findAgentById(id);
        return new ResponseEntity<>(a,
                HttpStatus.OK);
    }
}
