/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Controller;

import java.util.ArrayList;
import trec.Model.Accommodation;
import trec.Model.City;
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
  
  public void databaseConnect() throws Exception {
    Database.getInstance().connect();
  }
  
  public void databaseDisconnect() throws Exception {
    Database.getInstance().disconnect();
  }
 
  public User isUserValid(String username, String password) throws Exception {
    return Database.getInstance().isUserValid(username, password);
  }
  
  public void setCurrentUser(User current_user) {
    this.current_user_ = current_user;
  }
  
  public User getCurrentUser() {
    return current_user_;
  }
  
  public void addUser(User user) throws Exception {
    Database.getInstance().addUser(user);
  }
  
  public boolean checkForUsername(String username) throws Exception {
    return Database.getInstance().checkForUsername(username);
  }
  
  public int getNumberOfUsers() throws Exception {
    return Database.getInstance().getNumberOfUsers();
  }
  
  public ArrayList<User> getUsers() throws Exception {
    return Database.getInstance().getUsers();
  }
  
  public User getUserByUsername(String username) throws Exception {
    return Database.getInstance().getUserByUsername(username);
  }
  
  public void updateUser(User user, String old_username) throws Exception {
    Database.getInstance().updateUser(user, old_username);
  }
  
  public void deleteUser(String username) throws Exception {
    Database.getInstance().deleteUser(username);
  }
  
  public ArrayList<Country> getCountrys() throws Exception {
    return Database.getInstance().getCountrys();
  }
  
  public Country getCountryByName(String country_name) throws Exception {
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
  
  public void updateAccommodation(Country country, City city, Accommodation accommodation) {
    Database.getInstance().updateAccommodation(country, city, accommodation);
  }
  
  public boolean addAccommodation(Country country, City city, Accommodation accommodation) {
    return Database.getInstance().addAccommodation(country, city, accommodation);
  }
  
  public void deleteAccommodation(Country country, City city, Accommodation accommodation) {
    Database.getInstance().deleteAccommodation(country, city, accommodation);
  }
  
  public void updateDestination(Country country, City city, Destination destination) {
    Database.getInstance().updateDestination(country, city, destination);
  }
  
  public boolean addDestination(Country country, City city, Destination destination) {
    return Database.getInstance().addDestination(country, city, destination);
  }
  
  public void deleteDestination(Country country, City city, Destination destination) {
    Database.getInstance().deleteDestination(country, city, destination);
  }
  
  public void deleteCountry(Country country) throws Exception {
    Database.getInstance().removeCountry(country);
  }
  
  public boolean addCountry(Country country) throws Exception {
    return Database.getInstance().addCountry(country);
  }
  
  public void deleteCity(Country country, City city) {
    Database.getInstance().removeCity(country, city);
  }
  
  public boolean addCity(Country country, City city) {
    return Database.getInstance().addCity(country, city);
  }
}
