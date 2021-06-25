package com.tkj.demo.tkjstockservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class ProductStockController {
	
	Logger log = LoggerFactory.getLogger(ProductStockController.class);


	
	@Autowired
	Environment env;
	
	@GetMapping("/right")
	public String right() {
		
		log.info("request received ");
		return "hello world";
	}
	
	@GetMapping("/wrong")
	public String wrong() {
		try {
		log.error("error mappings ");
		throw new Exception("wrong url");
		}
		catch(Exception e) {
			log.error("incorrect " + e.getStackTrace() + e.getMessage() + e.getCause());
		}
		return "error url";
	}
	
}
