package com.luizjr.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizjr.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}