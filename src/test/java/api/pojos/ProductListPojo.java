package api.pojos;

import java.util.HashMap;

public class ProductListPojo {

private int id;
private String name;
private String price;
private String brand;

    public ProductListPojo() {
    }

    public ProductListPojo(int id, String name, String price, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }


    public HashMap<String,Object> getir() {
        HashMap<String,Object> map=new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        map.put("price",price);
        map.put("brand",brand);
        return map;

    }

}
