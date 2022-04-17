package com.example.demo.service.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClientAccountDTO {
    Long clienteId;
    Long cuentaId;
    Long edad;
    String pais;
    String nombre;
    Long saldo;
    Long deudas;    
}
