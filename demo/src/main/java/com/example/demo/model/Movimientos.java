package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("TRANSACTIONS")
public class Movimientos {
    private @Column("CLIENT_ID") @Id Long clienteId;
	private @Column("ACCOUNT_ID") Long cuentaId;
	private @Column("ACCOUNT_SECONDARY") Long cuentaReceptora;
	private @Column("CREDIT") Long movimiento;
    private @Column("CAUSE") String motivo; 
}
