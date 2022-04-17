package com.example.demo.controller;
package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Movimientos;
import com.example.demo.service.TransactionService;
import com.example.demo.service.dto.ClientAccountDTO;
import com.example.demo.service.dto.ClientTransactionDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/cliente/movimiento")
    public ResponseEntity<List<ClientTransactionDTO>> getClientsWithTransaction(@RequestParam(required = false)) {
        List<ClientTransactionDTO> response = TransactionService.getClientsWithTransaction();
        return ResponseEntity.ok().body(response);
    }
   
}


