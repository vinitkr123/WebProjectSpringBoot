package com.vinit.mongorepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vinit.mongo.beans.ProductMongo;

public interface ProductMongoRepository extends MongoRepository<ProductMongo, Integer> {

}
