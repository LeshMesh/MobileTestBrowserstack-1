package guru.qa.helpers;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Browserstack {
    public static String videoUrl(String sessionId) {
        return given()
                .auth().basic("vqc_0bH8Qp", "Xq4qfDh9Sr6JNBya6gJz")
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId +".json")
                .then()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}
