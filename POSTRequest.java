import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POSTRequest {

	
	@Test
	void postRequestMethod() {
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("name", "Venkat");
		jsonObject.put("job", "Leader");
		
		RestAssured.baseURI = "https://reqres.in/api/";
		
		System.out.println(jsonObject.toString());
		
		RestAssured
			.given()
				.header("", "")
				.body(jsonObject.toJSONString())
				.post("/users")
				.then()
					.statusCode(201);
		
	}
}
