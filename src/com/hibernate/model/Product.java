package com.hibernate.model;

public class Product {
	private int idProduct;
	private String product;
	private String ProductName;
	private double ProductPrice;
	
	public Product() {}

	public Product(int idProduct, String product, String productName, double productPrice) {
		this.idProduct = idProduct;
		this.product = product;
		this.ProductName = productName;
		this.ProductPrice = productPrice;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + idProduct + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice + "]";
	}
}
