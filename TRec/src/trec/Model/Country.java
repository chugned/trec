/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Model;

import java.util.ArrayList;

/**
 *
 * @author basic
 */
public class Country {
  private String name_;
  private ArrayList<City> cities_;
  
  public Country(String name) {
    this.name_ = name;
    this.cities_ = new ArrayList<>();
  }
  
  public void setName(String name) {
    this.name_ = name;
  }
  
  public String getName() {
    return name_;
  }
  
  public ArrayList<City> getCities() {
    return cities_;
  }
  
  public void addCity(City city) {
    this.cities_.add(city);
  }
  
  public boolean removeCity(City city_to_be_removed) {
    for(City city : cities_) {
      if(city.getName().equals(city_to_be_removed.getName())) {
        cities_.remove(city);
        return true;
      }
    }
    return false;
  }
}
