package com.tkj.demo.tkjstockservice.bean;

public class ProductStockBean {
	
	private Long id;
	private String productName;
	private double discount;
	private String productAvailability;
	
	private int port;
	
	

	public ProductStockBean(Long id, String productName, double discount, String productAvailability, int port) {
		super();
		this.id = id;
		this.productName = productName;
		this.discount = discount;
		this.productAvailability = productAvailability;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(String productAvailability) {
		this.productAvailability = productAvailability;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
