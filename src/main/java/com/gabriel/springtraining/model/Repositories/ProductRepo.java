package com.gabriel.springtraining.model.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.gabriel.springtraining.model.Entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> { }
