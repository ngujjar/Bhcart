package com.Bhcart.Bhcart.repository;

import com.Bhcart.Bhcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}