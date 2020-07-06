package com.vinit.mongo.beans;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "ProductCollection")
@Data
@Builder(toBuilder = true)
@ToString
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
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
