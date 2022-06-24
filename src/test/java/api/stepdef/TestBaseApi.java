package api.stepdef;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.util.List;


public class TestBaseApi {

        protected RequestSpecification spec;


        public void setUp(){
            spec= new RequestSpecBuilder()
                    .setBaseUri("https://automationexercise.com/api").build();
        }


        public String[] stringParcala(String string){

            String[] product=string.split("}},");
            return product;
        }

        public void diziYazdir(String[] dizi){
            for (int i=0; i<dizi.length; i++)
            {
                System.out.println(dizi[i]);
            }
        }

        public int idBul(String string){
            String idS=string.substring(string.indexOf("id"));//+5,string.indexOf(",")-2-string.indexOf("id")+5);
            //System.out.println("-----------------------");
            int id= Integer.parseInt(idS.substring(5,idS.indexOf(",")));
            //System.out.println(id);
            return id;
        }

        public String nameBul(String string){
           String name=string.substring(string.indexOf("name"));
//            System.out.println(name);
//            System.out.println(name.substring(8,name.indexOf(",")-1));
            return name.substring(8,name.indexOf(",")-1);
        }

        public String priceBul(String string){
            String price=string.substring(string.indexOf("price"));
            //System.out.println(price.substring(13,price.indexOf(",")-1));
            return price.substring(13,price.indexOf(",")-1);
        }
        public String brandBul(String string){
             String brand=string.substring(string.indexOf("brand"));
            // System.out.println(brand.substring(9,brand.indexOf(",")-1));
             return brand.substring(9,brand.indexOf(",")-1);
        }





    }






