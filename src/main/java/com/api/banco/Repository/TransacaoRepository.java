package com.api.banco.Repository;

import com.api.banco.Models.Conta;
import com.api.banco.Models.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = false)
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findByContaIn(Conta conta);

}