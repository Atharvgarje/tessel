package com.tessel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tessel.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
