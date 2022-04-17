package com.example.demo.repository;
import com.example.demo.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jdbc.repository.query.Query;

public interface MovimientoRepository extends CrudRepository<Cliente,Long> {
    @Query("SELECT * FROM TRANSACTION WHERE TRANSACTION.CLIENT_ID= :clienteId")
    public Iterable<Movimientos> retrieveTransactionByClientId(long clienteId);

    @Query("SELECT * FROM TRANSACTION WHERE TRANSACTION.ACCOUNT_ID= :cuentaId")
    public Iterable<Movimientos> retrieveTransactionByAccountId(long cuentaId);

    @Query("SELECT * FROM TRANSACTION WHERE TRANSACTION.CAUSE= :motivo")
    public Iterable<Movimientos> retrieveTransactionByCause(String motivo);

}