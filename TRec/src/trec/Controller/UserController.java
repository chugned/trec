/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Controller;

import java.util.ArrayList;
import trec.Model.Accommodation;
import trec.Model.Country;
import trec.Model.Database;
import trec.Model.Destination;
import trec.Model.User;

/**
 *
 * @author basic
 */
public class UserController {
  private static UserController user_controller_ = null;
  private User current_user_;
  
  private UserController() {
    current_user_ = null;
  }
  
  public static UserController getInstance() {
    if(user_controller_ == null)
      user_controller_ = new UserController();
    return user_controller_;
  }
  
  public void setCurrentUser(User current_user) {
    this.current_user_ = current_user;
  }
  
  public User getCurrentUser() {
    return current_user_;
  }
  
  public void addUser(User user){
    Database.getInstance().addUser(user);
  }
  
  public boolean checkForUsername(String username) {
    return Database.getInstance().checkForUsername(username);
  }
  
  public int getNumberOfUsers() {
    return Database.getInstance().getNumberOfUsers();
  }
  
  public ArrayList<User> getUsers() {
    return Database.getInstance().getUsers();
  }
  
  public User getUserByUsername(String username) {
    return Database.getInstance().getUserByUsername(username);
  }
  
  public void updateUser(User user, String old_username) {
    Database.getInstance().updateUser(user, old_username);
  }
  
  public Country getCountryByName(String country_name) {
    return Database.getInstance().getCountryByName(country_name);
  }
  
  public boolean addDestinationBookmark(Destination destination, User user) {
    return Database.getInstance().addDestinationBookmark(destination, user);
  }
  
  public ArrayList<Destination> getDestinationBookmarks(User user) {
    return Database.getInstance().getDestinationBookmarks(user);
  }
  
  public boolean addAccommodationBookmark(Accommodation accommodation, User user) {
    return Database.getInstance().addAccommodationBookmark(accommodation, user);
  }
  
  public ArrayList<Accommodation> getAccommodationBookmarks(User user) {
    return Database.getInstance().getAccommodationBookmarks(user);
  }
}
