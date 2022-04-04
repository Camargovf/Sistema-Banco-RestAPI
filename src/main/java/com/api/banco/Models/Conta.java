package com.api.banco.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "conta") //Para mostrar o uso do JPA sem flyway.
@Getter
@Setter
public class Conta {

    @NotNull
    @Id
    @SequenceGenerator(name = "conta_seq", sequenceName = "conta_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conta_seq")
    private long id;

    @OneToOne
    @JoinColumn
    private Cliente cliente;

    private BigDecimal saldo;

    private Date dataCriacao;
}
