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
public class User {
  
  public User() {
    this.role_ = "User";
  }
  
  public User(String first_name, String last_name, String email, String username,
          String password, String gender, int age, String occpuation) {
    this.first_name_ = first_name;
    this.last_name_ = last_name;
    this.email_ = email;
    this.username_ = username;
    this.password_ = password;
    this.gender_ = gender;
    this.age_ = age;
    this.occupation_ = occpuation;
    this.role_ = "User";
    this.id_ = -1;
  }
  
  public String getFirstName() {
    return first_name_;
  }

  public void setFirstName(String first_name) {
    this.first_name_ = first_name;
  }

  public String getLastName() {
    return last_name_;
  }

  public void setLastName(String last_name) {
    this.last_name_ = last_name;
  }

  public String getEmail() {
    return email_;
  }

  public void setEmail(String email) {
    this.email_ = email;
  }

  public String getUsername() {
    return username_;
  }

  public void setUsername(String username) {
    this.username_ = username;
  }

  public String getPassword() {
    return password_;
  }

  public void setPassword(String password) {
    this.password_ = password;
  }

  public String getGender() {
    return gender_;
  }

  public void setGender(String gender) {
    this.gender_ = gender;
  }

  public int getAge() {
    return age_;
  }

  public void setAge(int age) {
    this.age_ = age;
  }

  public String getOccupation() {
    return occupation_;
  }

  public void setOccupation(String occupation) {
    this.occupation_ = occupation;
  }
  
  public boolean isAdmin() {
    return role_.equals("admin");
  }
  
  public void setRole(String role) {
    this.role_ = role;
  }
  
  public String getRole() {
    return role_;
  }
  
  public void setID(int id) {
    this.id_ = id;
  }
  
  public int getID() {
    return id_;
  }
  
  private String first_name_;
  private String last_name_;
  private String email_;
  private String username_;
  private String password_;
  private String gender_;
  private int age_;
  private String occupation_;
  private String role_;
  private int id_;
}
