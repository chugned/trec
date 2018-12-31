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
public class Destination {
  private String name_;
  private String description_;
  private int id_;
  private int city_id_;
  private double ranking_;
  
  public Destination() {}
  
  public Destination(String name, String description) {
    this.description_ = description;
    this.name_ = name;
  }
  
  public String getName() {
    return name_;
  }
  
  public void setName(String name) {
    this.name_ = name;
  }
   
  public String getDescription() {
    return description_;
  }
  
  public void setDescription(String description) {
    this.description_ = description;
  }
  
  public void setID(int id) {
    this.id_ = id;
  }
  
  public int getID() {
    return id_;
  }
  
  public void setCityID(int city_id) {
    this.city_id_ = city_id;
  }
  
  public int getCityID() {
    return city_id_;
  }
  
  public void setRanking(double ranking) {
    this.ranking_ = ranking;
  }
  
  public double getRanking() {
    return ranking_;
  }
}
