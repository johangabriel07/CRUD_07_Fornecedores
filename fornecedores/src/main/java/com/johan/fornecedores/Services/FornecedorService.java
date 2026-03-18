package com.johan.fornecedores.services;

import com.johan.fornecedores.models.FornecedorModel;
import com.johan.fornecedores.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public FornecedorModel criarFornecedor(FornecedorModel fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    public List<FornecedorModel> findAll(){
        return fornecedorRepository.findAll();
    }

    public Optional<FornecedorModel> buscarFornecedorPorId(Long id){
        return fornecedorRepository.findById(id);
    }

    public void deletarFornecedor(Long id){
        fornecedorRepository.deleteById(id);
    }
}