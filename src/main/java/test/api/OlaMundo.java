package test.api;

public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Olá mundo, java/test/api");
        // Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
        // System.out.println(response.getBody().asString().equals("Ola Mundo!"));
        // System.out.println(response.statusCode() == 200);

        // ValidatableResponse validacao = response.then();
        // validacao.statusCode(200);
    }
}
