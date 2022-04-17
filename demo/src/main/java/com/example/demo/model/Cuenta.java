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
@Table("ACCOUNT")
public class Cuenta {
    private @Column("CLIENT_ID") @Id Long clienteId;
	private @Column("ACCOUNT_ID") Long cuentaId;
	private @Column("DEPOSIT") Long saldo;
	private @Column("LOANS") Long deudas;
}
