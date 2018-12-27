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
public class City {
  private String name_;
  private int id_;
  private int country_id_;
  
  public City(String name) {
    this.name_ = name;
  }
  
  public String getName() {
    return name_;
  }
  
  public void setName(String name) {
    this.name_ = name;
  }
  
  public void setID(int id) {
    this.id_ = id;
  }
  
  public int getID() {
    return id_;
  }
  
  public void setCountryID(int country_id) {
    this.country_id_ = country_id;
  }
  
  public int getCountryID() {
    return country_id_;
  }
}