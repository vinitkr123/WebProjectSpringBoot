package com.vinit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.vinit.beans.Product;
import com.vinit.exceptions.ProductNotFoundException;
import com.vinit.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Optional<Product> findProductById(int id) {
		return productRepository.findById(id);
	}

	@Override
	public List<Product> findProductListById(int id) {
		
		return null;
	}

	@Override
	public void deleteProductById(int id) {
		productRepository.deleteById(id);
	}

	@Override
	public Optional<Product> updateProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addProduct(Product product) throws ProductNotFoundException {
		if(!StringUtils.isEmpty(product))
			return productRepository.save(product);
		else
			throw new ProductNotFoundException("No Product to add");
	}

	@Override
	public void deleteAllProducts() {
		productRepository.deleteAll();
	}
	
	
	
	
	
}
