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
public class Accommodation {
  private String name_;
  private String description_;
  
  public Accommodation() {}
  
  public Accommodation(String name, String description) {
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
}
