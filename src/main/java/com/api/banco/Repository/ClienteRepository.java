package com.api.banco.Repository;


import com.api.banco.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome); //pesquisa por nome.
    List<Cliente> findByNomeContaining(String nome); //pesquisa por nome. //like do SQL

    Optional<Object> findById(ClienteRepository clienteRepository);

}
