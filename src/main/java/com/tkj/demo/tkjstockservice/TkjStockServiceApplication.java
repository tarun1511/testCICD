package com.tkj.demo.tkjstockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tkj.demo.tkjstockservice.*"})
@EntityScan(basePackages = {"com.tkj.demo.tkjstockservice.*"})
public class TkjStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkjStockServiceApplication.class, args);
	}

}
