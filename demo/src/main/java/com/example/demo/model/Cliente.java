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
@Table("CLIENT")
public class Cliente {
    private @Column("CLIENT_ID") @Id Long clienteId;
	private @Column("ACCOUNT_ID") Long cuentaId;
	private @Column("AGE") Long edad;
	private @Column("COUNTRY") String pais;
    private @Column("CLIENT_NAME") String nombre; 
}
