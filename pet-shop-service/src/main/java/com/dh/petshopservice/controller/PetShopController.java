package com.dh.petshopservice.controller;

//import com.dh.petshopservice.domain.repository.FinanceiroFeignClient;
import com.dh.petshopservice.domain.repository.FinanceiroFeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("petshop")
public class PetShopController {

//    @GetMapping
//    public ResponseEntity<String> getPet(){
//        return ResponseEntity.ok("gato");
//    }



    private final FinanceiroFeignClient cliente;

    public PetShopController(FinanceiroFeignClient cliente) {
        this.cliente = cliente;    }

    @GetMapping
    public ResponseEntity<String> getPet() {
        return ResponseEntity.ok("Gato " + cliente.get().getBody());
    }
}
