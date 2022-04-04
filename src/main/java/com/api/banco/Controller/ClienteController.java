/**
 * @Author Valdeir Camargo
 */

package com.api.banco.Controller;

import com.api.banco.Models.Cliente;
import com.api.banco.Repository.ClienteRepository;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    //METODO GET

    @GetMapping
    @ApiOperation(value = "Lista todos os clientes")
    public List<Cliente> listaClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{clienteId}") //clientes/1 (sub-recurso)
    @ApiOperation(value = "Busca um cliente")
    public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {
        return clienteRepository.findById(clienteId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    //METODO POST

    @PostMapping
    @ApiOperation(value = "Adiciona um cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@Valid @RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    //METODO PUT

    @PutMapping("/{clienteId}")
    @ApiOperation(value = "Atualiza um cliente")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long clienteId,
                                             @Valid @RequestBody Cliente cliente) {
        if (!clienteRepository.existsById(clienteId)) {
            return ResponseEntity.notFound().build();
        }

        cliente.setId(clienteId);
        cliente = clienteRepository.save(cliente);

        return ResponseEntity.ok(cliente);
    }

    //METODO DELETE

    @DeleteMapping("/{clienteId}")
    @ApiOperation(value = "Deleta um cliente")
    public ResponseEntity<Void> remover(@PathVariable Long clienteId) {
        if (!clienteRepository.existsById(clienteId)) {
            return ResponseEntity.notFound().build();
        }

        clienteRepository.deleteById(clienteId);

        return ResponseEntity.noContent().build();
    }


}
