package com.kelvin.springdatajpamapping.repository;

import com.kelvin.springdatajpamapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
