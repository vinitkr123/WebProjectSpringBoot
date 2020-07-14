package com.vinit.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vinit.mongoservice.ProductMongoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinit.beans.Product;
import com.vinit.mongo.beans.ProductMongo;
import com.vinit.mongoservice.ProductMongoService;

@RestController
public class ProductController {

	@Autowired
	private ProductMongoServiceImpl productMongoService;

	@Autowired
	private ProductMongo productMongo;

	
	public ProductController(ProductMongo productMongo) {
		this.productMongo = productMongo;
	}

	@GetMapping(value = "/getAllProducts")
	public String getAllProducts(Model model) {
        List<ProductMongo> productList = productMongoService.findProductList();
        return "Total "+productList.size() +" Found in MongoDb";
	}

	@GetMapping(value = "/getProductById")
	public String getProductById(Model model) {
		return null;
	}

	@PostMapping(value = "/addProduct")
	public String addProduct(@RequestBody List<ProductMongo> products) {
		List<ProductMongo> productMongos = productMongoService.addProduct(products);
		return products.size() + "Products added successfully";
	}

	@DeleteMapping(value = "/removeProductById")
	public List<Product> removeProductById(@PathVariable String productId, Model model) {
		return null;
	}

}
