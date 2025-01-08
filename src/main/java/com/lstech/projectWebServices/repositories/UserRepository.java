package com.lstech.projectWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lstech.projectWebServices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
