import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.target.model.Message;
import com.target.model.ProWrapper;

public class Test {
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
//		WebTarget webTarget = client.target("http://localhost:8080/messenger/webapi/messages/1");
//		Response response = webTarget.request().accept(MediaType.APPLICATION_JSON).get();
//		Message message = response.readEntity(Message.class);
//		Message message = webTarget.request().get(Message.class);
//		System.out.println(message.getMessage());
		
		
		WebTarget webTarget2 = client.target("https://redsky.target.com/v2/pdp/tcin/13860428?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics,deep_red_labels,available_to_promise_network");
		Response response2 = webTarget2.request().accept(MediaType.APPLICATION_JSON).get();
		ProWrapper pro = response2.readEntity(ProWrapper.class);
		System.out.println(pro.getProduct().getItem().getProduct_description().getTitle());
		
	}
}
