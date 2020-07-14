package com.vinit.mongoservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinit.mongo.beans.ProductMongo;
import com.vinit.mongorepository.ProductMongoRepository;

@Service
public class ProductMongoServiceImpl implements ProductMongoService{

	@Autowired
	private ProductMongoRepository productMongoRepository;

	@Autowired
	private ProductMongo productMongo;

	@Override 
	public Optional<ProductMongo> findProductById(int id) 
	{
		//Comment added
		return productMongoRepository.findById(id);
	}

	@Override
	public List<ProductMongo> findProductList() {
		return productMongoRepository.findAll();
	}

	@Override
	public void deleteProductById(int id) {
		productMongoRepository.deleteById(id);
	}

	@Override
	public Optional<ProductMongo> updateProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductMongo> addProduct(List<ProductMongo> productMongo) {
			productMongoRepository.saveAll(productMongo);
			return productMongoRepository.findAll();
			
	}

	@Override
	public void deleteAllProducts() {
		productMongoRepository.deleteAll();
	}

}
