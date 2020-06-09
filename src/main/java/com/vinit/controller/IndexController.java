package com.vinit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping(value= "/")
	public String login(Model model)
	{
		model.addAttribute("message","Hello from controller");
		return "index";
	}
	
}
