package com.luizjr.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizjr.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}