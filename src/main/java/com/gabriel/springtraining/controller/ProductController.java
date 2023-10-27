package com.gabriel.springtraining.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    private final int PAGE_SIZE = 15;

    @PostMapping
    public @ResponseBody Product create(@RequestBody @Valid Product product) {
        return productRepo.save(product);
    }

    @GetMapping
    public Iterable<Product> read(@RequestParam int page) {
        return productRepo.findAll(PageRequest.of(page, PAGE_SIZE));
    }

    @GetMapping("/{id}")
    public Optional<Product> readById(@PathVariable Long id) {
        return productRepo.findById(id);
    }

    @PutMapping
    public @ResponseBody Product update(@RequestBody @Valid Product product) {
        return productRepo.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productRepo.deleteById(id);
    }

}
