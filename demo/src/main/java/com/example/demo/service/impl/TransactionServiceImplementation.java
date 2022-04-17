package com.example.demo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.service.TransactionService;
import com.example.demo.service.dto.ClientTransactionDTO;
import com.example.demo.repository.*;



@Service
public class TransactionServiceImplementation implements TransactionService{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ClientesRepository clientRepository;

     // Inner-Join
     @Override 
     public List<ClientTransactionDTO> getClientWithTransaction(){
         
         String query = " 
         SELECT CLIENT.CLIENT_ID, CLIENT.ACCOUNT_ID, CLIENT.AGE, CLIENT.COUNTRY, TRANSACTION.ACCOUNT_SECONDARY, TRANSACTION_CREDIT, TRANSACTION_CAUSE
         FROM CLIENT
         INNER JOIN ACCOUNT ON CLIENT.CLIENT_ID=TRANSACTION.CLIENT_ID;
         ";
 
         List <ClientAccountDTO> userList = jdbcTemplate.query(
             query, 
             (rs, rowNum) ->
                     new ClientAccountDTO(
                         rs.getLong("CLIENT_ID"), 
                         rs.getLong("ACCOUNT_ID"),
                         rs.getInt("AGE"),
                         rs.getString("COUNTRY"), 
                         rs.getLong("ACCOUNT_SECONDARY"),
                         rs.getLong("CREDIT"),
                         rs.getString("CAUSE"), 

                     )
         );
         return userList;
     }
}
