package com.api.banco.Controller;


import com.api.banco.Models.Conta;
import com.api.banco.Repository.ContaRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/contas")
@CrossOrigin(origins = "*")
public class ContaController {

    @Autowired
    ContaRepository contaRepository;

    //METODO GET

    @GetMapping
    @ApiOperation(value = "Retorna todas")
    public List<Conta> listatodas() {
        return contaRepository.findAll();
    }

    @GetMapping("/{contasId}")
    @ApiOperation(value = "Retorna um id")
    public Optional<Conta> listaidUnico(@PathVariable Long contasId ) {
        return contaRepository.findById(contasId);

    }

    //METODO POST

    @PostMapping
    @ApiOperation(value = "salva")
    public Conta salvaconta(@RequestBody Conta conta) {
        return contaRepository.save(conta);
    }

    //METODO DELETE

    @DeleteMapping
    @ApiOperation(value = "Deleta")
    public void deletaconta(@RequestBody Conta conta) {
        contaRepository.delete(conta); //sem retorno, apenas excute.
    }

    //METODO PUT -- ATUALIZAR

    @PutMapping
    @ApiOperation(value = "atualiza")
    public Conta atualizaconta(@RequestBody Conta conta) {
        return contaRepository.save(conta);    }




}



