package com.vinit.mongo.beans;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
@Document(collection = "ProductCollection")
public class ProductMongo {
	
	@Id
	private int Id;
	@Column
	private String productName;
	@Column
	private String productDesc;	
	@Column
	private String productPrice;
	@Column
	private String productCategory;
	
}
