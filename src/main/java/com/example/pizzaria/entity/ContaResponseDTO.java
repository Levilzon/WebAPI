package com.example.pizzaria.entity;

import java.util.UUID;

public record ContaResponseDTO(UUID conta_Id, Long mesa_Id, int pedido, double pagamento) {
    public ContaResponseDTO(Conta conta){
        this(conta.getConta_Id(), conta.getMesa_Id(), conta.getPedido(), conta.getPagamento() );
    }
}
