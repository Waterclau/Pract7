package com.example.demo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.service.ClientService;
import com.example.demo.service.dto.ClientAccountDTO;
import com.example.demo.repository.*;



@Service
public class ClientServiceImplementation implements ClientService{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ClientesRepository clientRepository;

     // Inner-Join
     @Override 
     public List<ClientAccountDTO> getClientWithAccount(){
         
         String query = " 
         SELECT CLIENT.CLIENT_ID, CLIENT.ACCOUNT_ID, CLIENT.AGE, CLIENT.COUNTRY, ACCOUNT.DEPOSIT, ACCOUNT.LOAN
         FROM CLIENT
         INNER JOIN ACCOUNT ON CLIENT.CLIENT_ID=ACCOUNT.CLIENT_ID;
         ";
 
         List <ClientAccountDTO> userList = jdbcTemplate.query(
             query, 
             (rs, rowNum) ->
                     new ClientAccountDTO(
                         rs.getLong("CLIENT_ID"), 
                         rs.getLong("ACCOUNT_ID"),
                         rs.getInt("AGE"),
                         rs.getString("COUNTRY"), 
                         rs.getLong("DEPOSIT"),
                         rs.getLong("LOAN"),

                     )
         );
         return userList;
     }
    
}
