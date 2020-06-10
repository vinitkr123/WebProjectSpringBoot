package com.vinit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinit.beans.Product;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Product> updateProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
