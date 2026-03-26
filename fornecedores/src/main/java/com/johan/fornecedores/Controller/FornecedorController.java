package com.johan.fornecedores.controllers;

import com.johan.fornecedores.models.FornecedorModel;
import com.johan.fornecedores.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public ResponseEntity<FornecedorModel> criarCliente(@RequestBody FornecedorModel fornecedorModel){

        FornecedorModel request = fornecedorService.criarFornecedor(fornecedorModel);

        URI uri = URI.create("/fornecedores/" + request.getId());
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<FornecedorModel>> findAll(){
        List<FornecedorModel> request = fornecedorService.findAll();
        return ResponseEntity.ok().body(request);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarFornecedor(@PathVariable Long id){
        fornecedorService.deletarFornecedor(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public void buscarFornecedorPorId(@PathVariable Long id){
        fornecedorService.buscarFornecedorPorId(id);
    }

}