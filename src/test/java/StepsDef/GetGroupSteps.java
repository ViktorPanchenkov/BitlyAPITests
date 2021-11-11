package StepsDef;
import Pojos.GetGroupByGroupIDResponce;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import static org.assertj.core.api.Assertions.assertThat;

import static io.restassured.RestAssured.given;

public class GetGroupSteps {

    GetGroupByGroupIDResponce responce = new GetGroupByGroupIDResponce();
    public static  final String Token = "Bearer b929be4906d1c4c364a9f8a826f2416a9d03db33";
    @Given("I perform GET operation for {string}")
    public void SendGetRequest(String BasUrl){
        GetGroupByGroupIDResponce responce =
        given().baseUri(BasUrl).header("Authorization",Token)
             .contentType(ContentType.JSON)
                .get()
                .then().log().all()
                .extract().as(GetGroupByGroupIDResponce.class);

    }
    @Then("Check that group guid is Equal to {string}")
    public void CheckGroupGuid(String Group_guid){

    assertThat(responce).isNotNull()
            .extracting(GetGroupByGroupIDResponce::getGuid)
            .isEqualTo(Group_guid);
    }
    @Then("Check that name is Equal to {string}")
    public void CheckName(String Name){
        assertThat(responce).isNotNull()
                .extracting(GetGroupByGroupIDResponce::getName)
                .isEqualTo(Name);
    }
    @Then("Check that role is Equal to {string}")
    public void CheckRole(String Role){
        assertThat(responce).isNotNull()
                .extracting(GetGroupByGroupIDResponce::getName)
                .isEqualTo(Role);
    }


}
