package com.stream.dao;

import java.util.ArrayList;
import java.util.List;

public class Product {
	int productID;
	String productName;
	double productPrice;
	String productBrand;
	String productDescription;
	Supplier productSupplier;
	float productRating;
	List<Comment> comments;
	
	public Product() {
		this(0,"",0.0,"","",new Supplier(),0.0f,new ArrayList<>());
	}

	public Product(int productID, String productName, double productPrice, String productBrand,
			String productDescription, Supplier productSupplier, float productRating, List<Comment> comments) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
		this.productSupplier = productSupplier;
		this.productRating = productRating;
		this.comments = comments;
	}

	public Product(int productID, String productName, double productPrice, String productBrand,
			String productDescription, float productRating, String name, String company, List<Comment> comments) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
		this.productSupplier = new Supplier(name,company);
		this.productRating = productRating;
		this.comments = comments;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
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

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getProductRating() {
		return productRating;
	}

	public void setProductRating(float productRating) {
		this.productRating = productRating;
	}

	public Supplier getProductSupplier() {
		return productSupplier;
	}

	public void setProductSupplier(Supplier productSupplier) {
		this.productSupplier = productSupplier;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		//return productName + "\t\t" + productPrice + "\t\t" + productBrand + "\t\t" + productDescription + "\t\t" + productSupplier.getName() + "\t\t" + productSupplier.getCompany() + "\t\t" + productRating;
		return String.format("%-5d %-20s %.2f \t %-20s %-20s %-20s %-20s %.1f",productID,productName,productPrice,productBrand,productDescription,productSupplier.getName(),productSupplier.getCompany(),productRating);
	}
}
