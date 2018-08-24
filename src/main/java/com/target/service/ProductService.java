package com.target.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import com.target.dao.PriceDao;
import com.target.model.Price;
import com.target.model.ProWrapper;
import com.target.model.Product;


/**
 * 
 * This Class is responsible provide services
 * 
 * @author Elham
 *
 */
public class ProductService {
	
	public Product getProductById(String productId , String queryParams) {
		Client client = ClientBuilder.newClient();
		WebTarget baseTarget = client.target("http://redsky.target.com/v2/pdp/tcin/{productId}");
		WebTarget productTarget = baseTarget.resolveTemplate("productId", productId).queryParam("excludes", queryParams);
		ProWrapper pro = productTarget.request().accept(MediaType.APPLICATION_JSON).get(ProWrapper.class);
		Product product = new Product();
		product.setProductId(productId);
		product.setName(pro.getProduct().getItem().getProduct_description().getTitle());
		
		return product;
	}
	
	
	public Price getPrice(String productId) {
		PriceDao priceDao = new PriceDao();
		return priceDao.getPrice(productId);
	}

}
