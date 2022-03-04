package com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
