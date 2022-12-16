package com.dh.financeira.service;


import com.dh.financeira.models.Conta;
import com.dh.financeira.repositories.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContaService {
    private  final ContaRepository repository;

    public List<Conta> getAllConta(){
        return repository.findAll();
    }
}
