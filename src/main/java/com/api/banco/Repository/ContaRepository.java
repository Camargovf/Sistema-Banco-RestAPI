package com.api.banco.Repository;

import com.api.banco.Models.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = false)
public interface ContaRepository extends JpaRepository<Conta, Long>{


    @Modifying
    @Query("update conta c set c.saldo = c.saldo + ?1 where c.id = ?2")
    void setFixedSaldoFor(double  quantidade, Long id);


    Conta findByIdConta(Long id);

    @Modifying
    @Query("update conta c set c.saldo = c.saldo - ?1 where c.id = ?2")
    void setFixedSaldo(double  quant, Long id);


}
