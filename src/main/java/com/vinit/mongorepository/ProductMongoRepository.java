package com.vinit.mongorepository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vinit.beans.ProductMongo;

public interface ProductMongoRepository extends MongoRepository<ProductMongo, Integer> {

	public ProductMongo findByFirstName(String firstName);

	public List<ProductMongo> findByLastName(String lastName);

}
