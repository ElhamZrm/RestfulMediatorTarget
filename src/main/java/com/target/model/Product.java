package com.target.model;

/**
 * This Class is Helper for Product
 * @author Elham
 *
 */
public class Product {
	
	String productId;
	
	String name;
	
	String queryParams;
	
	Price current_price;
	
	Item item;


	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(String queryParams) {
		this.queryParams = queryParams;
	}

	public Item getItem() {
	  return item;
	 }
	
	 public void setItem(Item item) {
	  this.item = item;
	 }

	public Price getCurrent_price() {
		return current_price;
	}

	public void setCurrent_price(Price current_price) {
		this.current_price = current_price;
	}

}
