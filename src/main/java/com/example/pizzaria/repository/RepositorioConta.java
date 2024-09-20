package com.example.pizzaria.repository;

import com.example.pizzaria.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioConta extends JpaRepository<Conta, Long> {
}
