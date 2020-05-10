import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import io.restassured.specification.RequestSpecification;


public class IntegrationTest {

    @Test
    public void GetClients()
    {
        RestAssured.baseURI = "http://editor.swagger.io/api/gen/clients";
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET);

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

        Integer statusCode=response.getStatusCode();
        System.out.println("Response Status Code =>  " +statusCode);

        Assert.assertTrue(statusCode.equals(200));







    }
}
