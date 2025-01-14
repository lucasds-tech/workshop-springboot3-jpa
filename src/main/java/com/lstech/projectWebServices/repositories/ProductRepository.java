package com.lstech.projectWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lstech.projectWebServices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
