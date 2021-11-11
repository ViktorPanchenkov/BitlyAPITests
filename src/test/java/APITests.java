import io.restassured.response.Response;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.*;
import static org.hamcrest.Matchers.hasKey;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class APITests {


   public static  final String Token = "Bearer b929be4906d1c4c364a9f8a826f2416a9d03db33";
   public static final String URL = "https://api-ssl.bitly.com/";

    @Test
    public void GetGroupByGroupID(){
        String Group_guid = "Blb58VZzvFD";

        Response response =
                given()
                .baseUri("https://api-ssl.bitly.com/v4/groups/"+Group_guid)
              //  .basePath("/v4/groups/" + Group_guid)
                .header("Authorization",Token)
                .contentType(ContentType.JSON)
                        .get()
                .then().log().all()
                        .assertThat().body("guid",equalTo(Group_guid))
                        .assertThat().body("organization_guid",equalTo("Olb58nXhHfk"))
                        .assertThat().body("name", equalTo("o_7hajmglt0v"))
                .extract().response();
    }


}
