package com.vinit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vinit.beans.Product;
import com.vinit.mongo.beans.ProductMongo;
import com.vinit.mongoservice.ProductMongoService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductMongoService productMongoService;
	
	
	@GetMapping(value = "/getAllProducts")
	public List<ProductMongo> getAllProducts(Model model) {
		return productMongoService.findProductList();
	}

	@GetMapping(value = "/getProductById")
	public String getProductById(Model model) {
		return null;
	}

	@PostMapping(value = "/addProduct")
	public List<ProductMongo> addProduct(@RequestBody List<ProductMongo> products, Model model) {
		
		
		ProductMongo mongo = 
		 productMongoService.findProductList();
		return null;
	}

	@DeleteMapping(value = "/removeProductById")
	public List<Product> removeProductById(@PathVariable String productId, Model model) {
		return null;
	}

}
