package com.roceys.org.web;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.roceys.org.model.Basket1;
import com.roceys.org.model.ElemeJson;

import java.io.*;
import java.lang.reflect.Type;

public class ExportOrders {
    public static void main(String[] args) {

        String json = "{\"group\":[[{\"attrs\":[],\"image_hash\":\"\",\"name\":\"海带排骨饭\",\"new_specs\":[],\"price\":-30.99,\"quantity\":1,\"specs\":[]}]]}";
        Gson g = new Gson();
        //  Map<String,ArrayList<HashMap<String,Object>>> map = g.fromJson(json,HashMap.class);
        Type type = new TypeToken<Basket1>() {}.getType();
        Basket1 basket = g.fromJson(json, type);
        System.out.printf("666666666666666666");


        try {
            FileInputStream in = new FileInputStream("eleme-20170414-old_orders.json");
            Reader reader = new InputStreamReader(in, "UTF-8");

            Gson gson = new GsonBuilder().create();

            ElemeJson elemeJson = gson.fromJson(reader, ElemeJson.class);
            System.out.println(elemeJson);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
