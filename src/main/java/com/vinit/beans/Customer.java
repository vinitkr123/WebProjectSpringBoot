package com.vinit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Autowired
	private Address customerAddress;
}
