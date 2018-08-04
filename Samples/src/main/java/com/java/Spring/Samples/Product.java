package com.java.Spring.Samples;

public class Product {

	private int productid;
	private String productName;
	private double productPrice;
	private Vendor vendor;

	public Product(int productid, String productName, double productPrice, Vendor vendor) {
		super();
		System.out.println("product param const");
		this.productid = productid;
		this.productName = productName;
		this.productPrice = productPrice;
		this.vendor = vendor;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "\n Product [productid=" + productid + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", vendor=" + vendor + "]";
	}

	public Product() {
		super();
		System.out.println("product default const");

	}

}
