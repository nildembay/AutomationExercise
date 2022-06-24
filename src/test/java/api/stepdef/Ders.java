package api.stepdef;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.bouncycastle.crypto.signers.ISOTrailers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import utilities.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Ders extends TestBaseApi {
/*
    Response response;
    JsonPath jsonPath;
    List<HashMap<String,Object>> abc;
    @Given("kullanici {string} endpointine request gonderir.")
    public void kullanici_endpointine_request_gonderir(String pathparametresi) {

    setUp();
    spec.pathParam("parametre",pathparametresi);
    response = given().spec(spec).when().get("/{parametre}");

//        String responseString= String.valueOf(response.getBody().prettyPrint());
//        System.out.println("--------------------------");
//        System.out.println(responseString);

        jsonPath=response.jsonPath();
        abc = jsonPath.getList("products");


       // int adet=jsonPath.getList("products.id").size();


    }
    @Then("kullanici status kodu dogrular.")
    public void kullanici_status_kodu_dogrular() {

        Assert.assertEquals(response.getStatusCode(),200);
    
    }
    @Then("kullanici urunlerin sayisinin {int} oldugunu dogrular")
    public void kullanici_urunlerin_sayisinin_oldugunu_dogrular(int int1) {

        Assert.assertEquals(jsonPath.getList("products").size(),int1);

    }
    @Then("kullanici {int} den kucuk urunleri log dosyasina yazdirir")
    public void kullanici_den_kucuk_urunleri_log_dosyasina_yazdirir(Integer int1) {

        for (int i=0; i<abc.size(); i++)
            if (Integer.parseInt(((String) (abc.get(i).get("price"))).substring(4))<int1){

                Log.info("------" +Integer.parseInt(((String) (abc.get(i).get("price"))).substring(4)));


            }

        }
*/

}
