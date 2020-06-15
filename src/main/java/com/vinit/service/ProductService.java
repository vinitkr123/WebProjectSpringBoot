package com.vinit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vinit.beans.Product;

@Service
public interface ProductService {

	public Optional<Product> findProductById(int id);

	public List<Product> findProductListById(int id);

	public void deleteProductById(int id);
	
	public void deleteAllProducts();

	public Optional<Product> updateProductById(int id);
	
	public List<Product> addProduct(Product product);
}
