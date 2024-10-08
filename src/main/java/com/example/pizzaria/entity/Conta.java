package com.example.pizzaria.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.UUID;

@Entity(name = "conta")
@Table(name = "conta")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "conta_Id")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID conta_Id;
    @NotNull
    private Long mesa_Id;
    @NotNull
    private int pedido;
    private double pagamento;

    public Conta(ContaRequestDTO dados){
        this.mesa_Id = dados.mesa_Id();
        this.pedido = dados.pedido();
        this.pagamento = dados.pagamento();
    }
}
