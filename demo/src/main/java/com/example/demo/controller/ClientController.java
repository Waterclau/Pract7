package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClientService;
import com.example.demo.service.dto.ClientAccountDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/cliente/cuenta")
    public ResponseEntity<List<ClientAccountDTO>> getClientsWithAccount(@RequestParam(required = false)) {
        List<ClientAccountDTO> response = ClientService.getClientsWithAccount();
        return ResponseEntity.ok().body(response);
    }
   
}
