//package com.api.banco.Services;
//
//import com.api.banco.Models.Cliente;
//import com.api.banco.Models.Conta;
//import com.api.banco.Models.Transacao;
//import com.api.banco.Repository.ClienteRepository;
//import com.api.banco.Repository.ContaRepository;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@AllArgsConstructor
//@Setter
//@Getter
//@Service
//public class ContaService extends GenericService<Conta>{
//
//    @Autowired
//    private ContaRepository contaRepository;
//
//    @Autowired
//    private ClienteRepository clienteRepository;
//
//    @Autowired
//    private TransacaoService transacaoService
//
//
//    public Conta salvar(Conta conta) {
//        return contaRepository.save(conta);
//    }
//
//    public void deposita( double quantidade, Long id) {
//        contaRepository.setFixedSaldoFor(quantidade, id);
//    }
//
//    public void sacar( double quantidade, Long id) {
//        contaRepository.setFixedSaldo(quantidade, id);
//    }
//
//    public Conta buscarSado(Long id) {
//        return contaRepository.findByIdConta(id);
//    }
//
//    public List<Conta> listar() {
//        return contaRepository.findAll();
//    }
//    public Conta verificarConta(Long id) {
//        return contaRepository.findByIdConta(id);
//    }
//
//    public List<Transacao> extratoConta(Long id) {
//        Conta c = verificarConta(id);
//        return transService.buscarContas(c);
//
//    }
//
//
//}