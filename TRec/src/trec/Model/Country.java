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
  private int id_;
  
  public Country(String name) {
    this.name_ = name;
    this.id_= -1;
  }
  
  public void setName(String name) {
    this.name_ = name;
  }
  
  public String getName() {
    return name_;
  }
  
  public void setID(int id) {
    this.id_ = id;
  }
  
  public int getID() {
    return id_;
  }
}
