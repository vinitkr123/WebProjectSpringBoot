package com.vinit.exceptions;

import org.springframework.stereotype.Component;

@Component
public class ProductNotFoundException extends Exception {

	/**
	 * Added if product is not found in the portal
	 */
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(String message) {
		super(message);
	}

}
