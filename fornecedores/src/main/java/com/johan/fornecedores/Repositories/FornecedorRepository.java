package com.johan.fornecedores.repositories;

import com.johan.fornecedores.models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {
}