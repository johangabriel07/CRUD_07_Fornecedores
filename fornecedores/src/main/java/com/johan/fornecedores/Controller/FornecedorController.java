package com.johan.fornecedores.controllers;

import com.johan.fornecedores.models.FornecedorModel;
import com.johan.fornecedores.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public FornecedorModel criarFornecedor(@RequestBody FornecedorModel fornecedor){
        return fornecedorService.criarFornecedor(fornecedor);
    }

    @GetMapping
    public List<FornecedorModel> listarFornecedores(){
        return fornecedorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FornecedorModel> buscarFornecedorPorId(@PathVariable Long id){
        return fornecedorService.buscarFornecedorPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarFornecedor(@PathVariable Long id){
        fornecedorService.deletarFornecedor(id);
    }
}