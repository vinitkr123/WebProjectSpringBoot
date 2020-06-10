package com.vinit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinit.beans.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
