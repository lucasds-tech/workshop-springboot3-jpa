package com.lstech.projectWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lstech.projectWebServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
