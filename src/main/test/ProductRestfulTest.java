import static org.junit.Assert.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Before;
import org.junit.Test;

import com.target.model.ProWrapper;
import com.target.model.Product;

public class ProductRestfulTest {
	
	private Client client;
	private WebTarget webTarget;

	@Before
	public void createUri() {
		client = ClientBuilder.newClient();
		webTarget = client.target("https://localhost:8080/RestfulMediatorTarget/webapi/products/{productId}");
		
	}

	@Test
	public void test() {
		String productId = "13860428";
		Product product = webTarget.resolveTemplate("productId",productId).request().accept(MediaType.APPLICATION_JSON).get(Product.class);
		assertTrue("result is correct", product!=null);
	}

}
