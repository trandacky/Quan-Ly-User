package com.dacky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dacky.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
