package com.vinit.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@Column
	private int productId;
	@Column
	private String productName;
	@Column
	private int productWeight;
	@Column
	private int productDesc;
	@Column
	private int productPrice;
	@Column
	private boolean productDiscount;
	@Column
	private double productDiscountPercentage;

}
