package com.vinit.mongoservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.vinit.beans.Product;
import com.vinit.mongo.beans.ProductMongo;
import com.vinit.mongorepository.ProductMongoRepository;
import com.vinit.repository.ProductRepository;

@Service
public class ProductMongoServiceImpl implements ProductMongoService{

	@Autowired
	private ProductMongoRepository productMongoRepository;

	@Override 
	public Optional<ProductMongo> findProductById(int id) 
	{
		//Comment added
		return productMongoRepository.findById(id);
	}

	@Override
	public List<ProductMongo> findProductListById(int id) {

		return null;
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
	public List<ProductMongo> addProduct(ProductMongo productMongo) {
			productMongoRepository.save(productMongo);
			return productMongoRepository.findAll();
			
	}

	@Override
	public void deleteAllProducts() {
		productMongoRepository.deleteAll();
	}

}
