package api.stepdef;

import api.pojos.ProductListPojo;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ListProductApi extends  TestBaseApi {

    Response response;
    List<HashMap<String,Object>> sonUrunListesi=new ArrayList<>();
    JsonPath json;

    @Given("kullanici {string} endpointine request gonderir.")
    public void kullanici_endpointine_request_gonderir(String pathparam) {

        //String url="https://automationexercise.com/api/brandsList";

        setUp();
        spec.pathParam("parametre1",pathparam);
        Response response=given().
                accept("application/json").
                spec(spec).
                when().
                get("/{parametre1}");

        json=response.jsonPath();

        String responseString= String.valueOf(response.getBody().prettyPrint());
        String result=responseString.substring(responseString.indexOf("[{")+2,responseString.indexOf("}]")-responseString.indexOf("[{")+2);

        String[] urunlist=stringParcala(result);
        diziYazdir(urunlist);
        //System.out.println("-----------------");
        System.out.println(listeyeAktar(urunlist));


    }


    public List<HashMap<String,Object>> listeyeAktar(String[] dizi) {

        for (int i = 0; i < dizi.length; i++) {

            ProductListPojo pojo = new ProductListPojo(idBul(dizi[i]), nameBul(dizi[i]), priceBul(dizi[i]), brandBul(dizi[i]));
            sonUrunListesi.add(pojo.getir());


        }
        return sonUrunListesi;
    }

    @Then("kullanici status kodu dogrular.")
    public void kullanici_status_kodu_dogrular() {

        Assert.assertEquals(json.getInt("responseCode"),200);

    }

    @Then("kullanici urunlerin sayisinin {int} oldugunu dogrular")
    public void kullanici_urunlerin_sayisinin_oldugunu_dogrular(int int1) {

        Assert.assertEquals(sonUrunListesi.size(),int1);

    }

    @Then("kullanici {int} den kucuk urunleri log dosyasina yazdirir")
    public void kullanici_den_kucuk_urunleri_log_dosyasina_yazdirir(Integer int1) {

        for (int i=0; i<sonUrunListesi.size();i++){

           if( Integer.parseInt((String) sonUrunListesi.get(i).get("price"))<int1){
               Log.info((String) sonUrunListesi.get(i).get("name")+" "+(String) sonUrunListesi.get(i).get("price"));

           }


        }

    }




}
