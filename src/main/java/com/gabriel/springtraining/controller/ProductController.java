package com.gabriel.springtraining.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.springtraining.model.Entities.Product;
import com.gabriel.springtraining.model.Repositories.ProductRepo;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProductController {
    
    @Autowired
    private ProductRepo productRepo;

    @PostMapping
    public @ResponseBody Product create(@RequestBody @Valid Product product) {
        return productRepo.save(product);
    }

    @GetMapping
    public Iterable<Product> readAll() {
        return productRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> readById(@PathVariable Long id) {
        return productRepo.findById(id);
    }

}
