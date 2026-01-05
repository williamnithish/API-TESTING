import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PUTRequest {
	
	@Test
	void samplePUTRequest() {
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("name", "Venkat");
		jsonObject.put("job", "Leader");
		
		RestAssured.baseURI = "https://reqres.in";
		
		RestAssured
			.given()
				.body(jsonObject.toJSONString())
				.put("/api/users/2")
				.then()
				.statusCode(200);
		
	}
	
	@Test
	void samplePATCHRequest() {
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("name", "Venkat");
		jsonObject.put("job", "Leader");
		
		RestAssured.baseURI = "https://reqres.in";
		
		RestAssured
			.given()
				.body(jsonObject.toJSONString())
				.patch("/api/users/2")
				.then()
				.statusCode(200);
		
	}
	
	
	@Test
	void sampleDELETERequest() {
		
		RestAssured.baseURI = "https://reqres.in";
		
		RestAssured
			.given()
				.header("","")
				.when()
				.delete("/api/users/2")
				.then()
				.statusCode(204);
		
	}

}
