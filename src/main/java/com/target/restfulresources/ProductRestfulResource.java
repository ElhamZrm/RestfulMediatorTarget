package com.target.restfulresources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.target.model.Product;
import com.target.service.ProductService;

/**
 * This Class is responsible to receive requestion based on Restful Standard formate and communication with myRetail Host
 * to get data and return to client
 * 
 * @author Elham
 *
 */

@Path("products")
public class ProductRestfulResource {

	ProductService service = new ProductService();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getProducts() {
		return "all products are here!";
	}
	
	@GET
	@Path("{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@PathParam("productId") String productId , @QueryParam("excludes") String excludes) {
		
		Product product = service.getProductById(productId, excludes);
		product.setCurrent_price(service.getPrice(productId));
		return product;
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product saveProduct(Product product) {
		product.setProductId("11111111111");
		return product;
		
	}
	
	@PUT
	@Path("{productId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product saveProduct(@PathParam("productId") String productId , Product product) {
		product.setProductId(productId);
		return product;
		
	}
	
}
