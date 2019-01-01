/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Model;

/**
 *
 * @author basic
 */
public class WeatherModel {
  private String temperature;
  private String temp_min;
  private String temp_max;
  private String humidity;
  private String description;
  
  public WeatherModel() {}
  
  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }

  public String getTempMin() {
    return temp_min;
  }

  public void setTempMin(String temp_min) {
    this.temp_min = temp_min;
  }

  public String getTempMax() {
    return temp_max;
  }

  public void setTempMax(String temp_max) {
    this.temp_max = temp_max;
  }

  public String getHumidity() {
    return humidity;
  }

  public void setHumidity(String humidity) {
    this.humidity = humidity;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
