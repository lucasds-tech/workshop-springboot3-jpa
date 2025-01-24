package com.lstech.projectWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lstech.projectWebServices.entities.OrderItem;
import com.lstech.projectWebServices.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
