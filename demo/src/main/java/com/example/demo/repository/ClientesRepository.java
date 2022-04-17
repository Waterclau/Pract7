package com.example.demo.repository;
import com.example.demo.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jdbc.repository.query.Query;

public interface ClientesRepository extends CrudRepository<Cliente,Long> {
    @Query("SELECT * FROM CLIENT WHERE CLIENT.CLIENT_ID= :clienteId")
    public Iterable<Cliente> retrieveClientByClientId(long clienteId);

    @Query("SELECT * FROM CLIENT WHERE CLIENT.ACCOUNT_ID= :cuentaId")
    public Iterable<Cliente> retrieveClientByAccountId(long cuentaId);

    @Query("SELECT * FROM CLIENT WHERE CLIENT.CLIENT_NAME= :nombre")
    public Iterable<Cliente> retrieveClientByClientName(String nombre);

}
