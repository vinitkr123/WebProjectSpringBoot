package com.vinit.exceptions;

import org.springframework.stereotype.Component;

@Component
public class ProductNotFoundException extends Exception {

	public ProductNotFoundException(String message) {
		super(message);
	}

}
