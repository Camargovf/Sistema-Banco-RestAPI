package com.api.banco.Models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Valdeir Camargo
 */

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Por favor adicione um nome")
    @Size(max = 60)
    private String nome;

    @NotBlank
    @Size(max = 20)
    private String cpf;

    @NotBlank
    @Size(max = 20)
    private String telefone;

    @NotBlank
    @Size(max = 20)
    private String cep;


}
