/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author basic
 */
public class Helper {
  
  public Helper() {}
  
  public static boolean isNumeric(String str) {
    if(str.equals("")) return false;
    NumberFormat formatter = NumberFormat.getInstance();
    ParsePosition pos = new ParsePosition(0);
    formatter.parse(str, pos);
    return str.length() == pos.getIndex();
  }
  
  public ArrayList<Accommodation> sortAccommodationsAscending(ArrayList<Accommodation> list) {
    list.sort(Comparator.comparing(Accommodation::getRanking));
    return list;
  }
  
  public ArrayList<Accommodation> sortAccommodationsDescending(ArrayList<Accommodation> list) {
    list.sort(Comparator.comparing(Accommodation::getRanking).reversed());
    return list;
  }
  
  public ArrayList<Destination> sortDestinationsAscending(ArrayList<Destination> list) {
    list.sort(Comparator.comparing(Destination::getRanking));
    return list;
  }
  
  public ArrayList<Destination> sortDestinationsDescending(ArrayList<Destination> list) {
    list.sort(Comparator.comparing(Destination::getRanking).reversed());
    return list;
  }
  
  public static Map<String, Object> jsonToMap(String str) {
    return new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>(){}.getType());
  }
  
  public WeatherModel getWeather(String location) throws IOException {
    WeatherModel model = new WeatherModel();
    String API_KEY = "3d3d5e5537958448b0ac90a928063b99";
    String url_string = "http://api.openweathermap.org/data/2.5/weather?q="+location+"&appid=" + API_KEY + "&units=metric";
    StringBuilder result = new StringBuilder();
    URL url = new URL(url_string);
    URLConnection connection = url.openConnection();
    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    String line;
    while((line = reader.readLine()) != null) {
      result.append(line);
    }
    reader.close();
//    System.out.println(result);
    
    Map<String, Object> respMap = jsonToMap(result.toString());
    Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());   
    
    model.setTemperature(mainMap.get("temp").toString());
    model.setHumidity(mainMap.get("humidity").toString());
    model.setTempMax(mainMap.get("temp_max").toString());
    model.setTempMin(mainMap.get("temp_min").toString());
    
    Gson gson = new Gson();
    JsonObject json = gson.fromJson(result.toString(), JsonObject.class);
    JsonArray array = json.getAsJsonArray("weather");
    JsonElement el = array.get(0);
    model.setDescription(el.getAsJsonObject().get("description").getAsString());
    return model;
  }
}
