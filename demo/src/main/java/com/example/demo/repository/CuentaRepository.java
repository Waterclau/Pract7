package com.example.demo.repository;
import com.example.demo.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jdbc.repository.query.Query;



public interface CuentaRepository extends CrudRepository<Cliente,Long> {
    @Query("SELECT * FROM ACCOUNT WHERE ACCOUNT.CLIENT_ID= :clienteId")
    public Iterable<Cuenta> retrieveAccountByClientId(long clienteId);

    @Query("SELECT * FROM ACCOUNT WHERE ACCOUNT.ACCOUNT_ID= :cuentaId")
    public Iterable<Cuenta> retrieveAccountByCuentaId(long cuentaId);

    @Query("SELECT * FROM ACCOUNT WHERE ACCOUNT.DEPOSIT= :saldo")
    public Iterable<Cliente> retrieveAccountByDeposit(long saldo);
}
