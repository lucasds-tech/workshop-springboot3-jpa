package com.lstech.projectWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lstech.projectWebServices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
