package com.target.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.target.model.Price;

/**
 * This Class is responsible to connect to MongoDB and retrieve the price based on productId
 * Implementation is Template and does not provide real database connection
 * @author Elham
 *
 */
public class PriceDao {
	
	Map<String, com.target.model.Price> prices =  new HashMap<>();
	
	public PriceDao() {
		prices.put("13860428", new Price(BigDecimal.valueOf(200.0), "USD"));
		prices.put("13860429", new Price(BigDecimal.valueOf(250.0), "USD"));
	}
	
	public Price getPrice(String productId) {
		return prices.get(productId);
	}
	
	
	public void addPrice(String productId,BigDecimal price,String currency_code) {
		prices.put(productId,new Price(price , currency_code));
	}

}
