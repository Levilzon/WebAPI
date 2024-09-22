package com.example.pizzaria.controller;

import com.example.pizzaria.entity.Conta;
import com.example.pizzaria.entity.ContaRequestDTO;
import com.example.pizzaria.entity.ContaResponseDTO;
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
    public Conta salvar(@RequestBody ContaRequestDTO dados){
        Conta cliente = new Conta(dados);
        return conta.save(cliente);
    }
    @GetMapping("lista")
   public List<ContaResponseDTO> lista(){
        List<ContaResponseDTO> contaList = conta.findAll().stream().map(ContaResponseDTO::new).toList();
        return contaList;

   }


    @GetMapping("hello")
    public String hello(){
        return "Hello World!";
    }
}
