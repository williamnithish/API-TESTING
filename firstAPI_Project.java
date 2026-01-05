import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class firstAPI_Project {

	public static void main(String[] args) {

		firstAPI_Project obj = new firstAPI_Project();
		
		
//		obj.simpleGetResponse();
//		obj.getResponseBody();
		obj.getResponsewithSteps();
		

	}

	
	void simpleGetResponse() {
		Response response = RestAssured.get("http://google.co.in"); 
		
		String id = response.sessionId();
		int code = response.statusCode();
		String line = response.statusLine();
		System.out.println(code);
		System.out.println(line);
		System.out.println(id);
	}
	
	void getResponseBody() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		ResponseBody responseBody = response.body();
		
		System.out.println(responseBody.asPrettyString()); 	
		
	}
	
	void getResponsewithSteps() {
		
		RestAssured.baseURI= "https://reqres.in/api/";
		
		Response response = RestAssured
			.given()
			.param("", "")
			.header("", "")
			.when()
			.get("user/3");
//			.then()
//			.statusCode(200);
		
		
		System.out.println(response.asPrettyString());
	}
	
	
	
	
	
	
	
	
	
	
	
}
