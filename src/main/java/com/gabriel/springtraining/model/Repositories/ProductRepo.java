package com.gabriel.springtraining.model.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.springtraining.model.Entities.Product;

public interface ProductRepo extends JpaRepository<Product, Long> { }
