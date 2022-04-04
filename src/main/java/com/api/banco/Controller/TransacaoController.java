//package com.api.banco.Controller;
//
//import com.api.banco.Models.Transacao;
//import com.api.banco.Services.TransacaoService;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RestController
//@RequestMapping("transacao")
//public class TransacaoController {
//
//    @Autowired
//    private TransacaoService transacaoService;
//
//    @ApiOperation(value = "salvar deposito")
//    @RequestMapping(method= RequestMethod.POST, path="salvar" )
//    public ResponseEntity<?> depositar(@RequestBody Transacao trans){
//
//        Transacao transacao = this.transacaoService.salvar(trans);
//        return new ResponseEntity<>(transacao, HttpStatus.OK);
//    }
//
//    @ApiOperation(value = "deleta valor")
//    @RequestMapping(method=RequestMethod.DELETE, path="deletar/{id}" )
//    public ResponseEntity<?> saldo( @PathVariable Long id){
//
//        this.transacaoService.delete(id);
//
//        return new ResponseEntity<>( HttpStatus.OK);
//    }
//
//    @ApiOperation(value = "lista transacoes")
//    @RequestMapping(method=RequestMethod.GET, path="listar" )
//    public ResponseEntity<?> listar(){
//
//        List<Transacao> transacoes = this.transacaoService.listar();
//        return new ResponseEntity<>(transacoes, HttpStatus.OK);
//    }
//    @ApiOperation(value = "busca pelo id")
//    @RequestMapping(method=RequestMethod.GET, path="buscar/{id}"  )
//    public ResponseEntity<?> lisbuscarPorId(@PathVariable Long id){
//        transacaoService.buscarPeloId(id);
//        return new ResponseEntity<>( HttpStatus.OK);
//    }
//
//
//
//
//
//}
