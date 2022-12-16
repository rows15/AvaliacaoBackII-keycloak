package com.dh.financeira.repositories;

import com.dh.financeira.models.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta,String> {
}
