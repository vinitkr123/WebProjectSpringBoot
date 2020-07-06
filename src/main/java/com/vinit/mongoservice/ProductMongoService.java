package com.vinit.mongoservice;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vinit.mongo.beans.ProductMongo;

@Service
public interface ProductMongoService {

	public Optional<ProductMongo> findProductById(int id);

	public List<ProductMongo> findProductList();

	public void deleteProductById(int id);
	
	public void deleteAllProducts();

	public Optional<ProductMongo> updateProductById(int id);
	
	public List<ProductMongo> addProduct(List<ProductMongo> productMongo);
}
