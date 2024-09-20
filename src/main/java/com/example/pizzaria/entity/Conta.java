package com.example.pizzaria.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.UUID;

@Entity(name = "conta")
@Table(name = "conta")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID conta_Id;
    private Long mesa_Id;
    private int pedido;
    private double pagamento;

    public UUID getContaId(){
        return this.conta_Id;
    }

    public Long getMesaId(){
        return this.mesa_Id;
    }
    public int getPedidio(){
        return this.pedido;
    }
    public double getPagamento(){
        return this.pagamento;
    }

    public void setContaId(UUID contaId){
        contaId = this.conta_Id;
    }
    public void setMesaId(Long mesaId){
        mesaId = mesa_Id;
    }

    public void setPedido(int pedido){
        pedido = this.pedido;
    }
    public void setPagamento(double pagamento){
        pagamento = this.pagamento;
    }
}
