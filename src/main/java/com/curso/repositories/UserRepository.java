package com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
