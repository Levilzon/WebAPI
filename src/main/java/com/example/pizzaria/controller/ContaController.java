package com.example.pizzaria.controller;

import com.example.pizzaria.entity.Conta;
import com.example.pizzaria.repository.RepositorioConta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "v1")
public class ContaController {
   @Autowired
   private RepositorioConta conta;
    //testando se salva

    @PostMapping("save")
    public Conta salvar(@RequestBody Conta objeto){
        return conta.save(objeto);
    }
    @GetMapping("lista")
   public List<Conta> lista(){
        return conta.findAll();
   }


    @GetMapping("hello")
    public String hello(){
        return "Hello World!";
    }
}
