package com.dh.financeira.controller;

import com.dh.financeira.models.Conta;
import com.dh.financeira.service.ContaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contas")
@RequiredArgsConstructor
public class FinanceiroController {
    private final ContaService service;

    @GetMapping("/all")
    @PreAuthorize("hasGroup('PROVIDER')")
    public ResponseEntity<List<Conta>> getAll() {
        return ResponseEntity.ok().body(service.getAllConta());
    }




    
}
