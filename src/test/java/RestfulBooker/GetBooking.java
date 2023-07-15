package RestfulBooker;

import io.restassured.RestAssured;

public class GetBooking {

	public static void main(String[] args) {
		
		// Build request
		RestAssured
			.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/{id}")
			.pathParam("id", 1)
		//Hit the request and get response
		.when()
			.get()
		//Validate Response
		.then()
			.log()
			.all()
	
			.statusCode(200);
	}
}
