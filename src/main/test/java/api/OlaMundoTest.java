package java.api;

public class OlaMundoTest {
    
    @Test
    public void testOlaMundo() {
        Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
        System.out.println(response.getBody().asString().equals("Ola Mundo!"));
        System.out.println(response.statusCode() == 201);

        ValidatableResponse validacao = response.then();
        validacao.statusCode(201);
    }    
}
