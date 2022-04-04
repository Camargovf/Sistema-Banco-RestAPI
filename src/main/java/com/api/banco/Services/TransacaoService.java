//package com.api.banco.Services;
//
//import com.api.banco.Models.Conta;
//import com.api.banco.Models.Transacao;
//import com.api.banco.Repository.TransacaoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class TransacaoService {
//
//    @Autowired
//    private TransacaoRepository transacaoRepository;
//
//    public Transacao salvar(Transacao trans) {
//        return transacaoRepository.save(trans);
//    }
//
//    public List<Transacao> listar() {
//        return transacaoRepository.findAll();
//    }
//
//    public void delete(Long id) {
//        transacaoRepository.deleteById(id);
//    }
//
//    public void buscarPeloId(Long id) {
//        transacaoRepository.findById(id);
//    }
//
//    public List<Transacao> buscarContas(Conta conta) {
//        return transacaoRepository.findByContaIn(conta);
//    }
//
//}
