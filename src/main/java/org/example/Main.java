package org.example;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

class ReadJsonFile {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {


            Object obj = new JSONParser().parse(new FileReader(reviews.json));
            JSONObject jsonObject = (JSONObject) obj;


            String reviewText = (String) jsonObject.get("reviewText");


            System.out.println("reviewText: " + reviewText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

