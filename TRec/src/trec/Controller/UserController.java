/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Controller;

import java.sql.SQLException;
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
  
  // database specific stuff
  public void databaseConnect() throws Exception {
    Database.getInstance().connect();
  }
  
  public void databaseDisconnect() throws Exception {
    Database.getInstance().disconnect();
  }
 
  // user specific stuff
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
  
  // country specific stuff
  public ArrayList<Country> getCountrys() throws Exception {
    return Database.getInstance().getCountrys();
  }
  
  public Country getCountryByName(String country_name) throws Exception {
    return Database.getInstance().getCountryByName(country_name);
  }
  
  public void deleteCountry(Country country) throws Exception {
    Database.getInstance().removeCountry(country);
  }
  
  public boolean addCountry(Country country) throws Exception {
    return Database.getInstance().addCountry(country);
  }
  
  // city specific stuff
  public void deleteCity(City city) throws Exception {
    Database.getInstance().removeCity(city);
  }
  
  public boolean addCity(Country country, City city) throws Exception {
    return Database.getInstance().addCity(country, city);
  }
  
  public ArrayList<City> getCitiesByCountryID(int country_id) throws Exception {
    return Database.getInstance().getCitiesByCountryID(country_id);
  }
  
  public City getCityByName(String name, int country_id) throws Exception {
    return Database.getInstance().getCityByName(name, country_id);
  }
  
  // destination specific stuff
  public boolean addDestinationBookmark(Destination destination, User user) throws Exception {
    return Database.getInstance().addDestinationBookmark(destination, user);
  }
  
  public ArrayList<Destination> getDestinationBookmarks(User user) throws Exception {
    return Database.getInstance().getDestinationBookmarks(user);
  }
  
  public Destination getDestinationByName(String name) throws Exception {
    return Database.getInstance().getDestinationByName(name);
  }
  
   public void updateDestination(Destination destination) throws Exception {
    Database.getInstance().updateDestination(destination);
  }
  
  public boolean addDestination(City city, Destination destination) throws Exception {
    return Database.getInstance().addDestination(city, destination);
  }
  
  public void deleteDestination(Destination destination) throws Exception {
    Database.getInstance().deleteDestination(destination);
  }
  
  public ArrayList<Destination> getDestinationByCityID(int city_id) throws Exception {
    return Database.getInstance().getDestinationByCityID(city_id);
  }
  
  // accommodation specific stuff
  public boolean addAccommodationBookmark(Accommodation accommodation, User user) throws Exception {
    return Database.getInstance().addAccommodationBookmark(accommodation, user);
  }
  
  public ArrayList<Accommodation> getAccommodationBookmarks(User user) throws SQLException {
    return Database.getInstance().getAccommodationBookmarks(user);
  }
  
  public void updateAccommodation(Accommodation accommodation) throws Exception {
    Database.getInstance().updateAccommodation(accommodation);
  }
  
  public boolean addAccommodation(City city, Accommodation accommodation) throws Exception {
    return Database.getInstance().addAccommodation(city, accommodation);
  }
  
  public void deleteAccommodation(Accommodation accommodation) throws Exception {
    Database.getInstance().deleteAccommodation(accommodation);
  }
  
  public Accommodation getAccommodationByName(String name) throws Exception {
    return Database.getInstance().getAccommodationByName(name);
  }
  
  public ArrayList<Accommodation> getAccommodationByCityID(int city_id) throws Exception {
    return Database.getInstance().getAccommodationByCityID(city_id);
  }
}
