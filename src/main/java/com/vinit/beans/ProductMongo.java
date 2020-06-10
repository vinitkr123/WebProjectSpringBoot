package com.vinit.beans;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProductCollection")
public class ProductMongo {
	
	@Id
	private int Id;
	@Column
	private String ProductName;
	@Column
	private String productDesc;	
	@Column
	private String productPrice;
	@Column
	private String productCategory;	
	
}
