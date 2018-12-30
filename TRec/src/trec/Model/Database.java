/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Model;

import com.sun.javafx.collections.ListListenerHelper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author basic
 */
public class Database {
  private static Database database_ = null;
  private ArrayList<User> users_list_;
  private ArrayList<Country> country_list_;
  private Map<User, ArrayList<Destination>> destination_bookmarks_ = new HashMap<>(); 
  private Map<User, ArrayList<Accommodation>> accommodation_bookmarks_ = new HashMap<>(); 
  private Connection con;
  
  private Database() {
    this.destination_bookmarks_ = new HashMap<>();
    this.accommodation_bookmarks_ = new HashMap<>();
    users_list_ = new ArrayList<>();
    country_list_ = new ArrayList<>();
  }
  
  // database related stuff
  public static Database getInstance() {
    if(database_ == null)
      database_ = new Database();
    return database_;
  }
  
  public void connect() throws Exception {
        if(con != null) return;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found, install it BRETE");
        }

        String connectionUrl = "jdbc:mysql://localhost:3306/oad_trec";
        con = DriverManager.getConnection(connectionUrl, "root", "root");
    }

  public void disconnect() {
        if(con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Cant close it its stuck");
            }
        }
  }
  
  // user related stuff
  public void addUser(User new_user) throws SQLException {
    String query = "insert into oad_trec.users (first_name, last_name, email, username, password, gender, age, occupation, `role`) values(?,?,?,?,?,?,?,?,?)";
    PreparedStatement insertStmt = con.prepareStatement(query);
    insertStmt.setString(1, new_user.getFirstName());
    insertStmt.setString(2, new_user.getLastName());
    insertStmt.setString(3, new_user.getEmail());
    insertStmt.setString(4, new_user.getUsername());
    insertStmt.setString(5, new_user.getPassword());
    insertStmt.setString(6, new_user.getGender());
    insertStmt.setInt(7, new_user.getAge());
    insertStmt.setString(8, new_user.getOccupation());
    insertStmt.setString(9, "user");
    insertStmt.executeUpdate();
    insertStmt.close();
  }
  
  public User isUserValid(String username, String password) throws SQLException {
    String query = "select id, first_name, last_name, email, username, password, gender, age, occupation, role from users where password=? and username=?";
    PreparedStatement selectStmt = con.prepareStatement(query);
    selectStmt.setString(1, password);
    selectStmt.setString(2, username);
    ResultSet results = selectStmt.executeQuery();
    if(results.first()) {
      User newUser = new User();
      newUser.setID(results.getInt("id"));
      newUser.setFirstName(results.getString("first_name"));
      newUser.setLastName(results.getString("last_name"));
      newUser.setEmail(results.getString("email"));
      newUser.setUsername(results.getString("username"));
      newUser.setPassword(results.getString("password"));
      newUser.setGender(results.getString("gender"));
      newUser.setAge(results.getInt("age"));
      newUser.setOccupation(results.getString("occupation"));
      newUser.setRole(results.getString("role"));
      selectStmt.close();
      return newUser;   
    } else {
      selectStmt.close();
      return null;
    }
  }
  
  public void deleteUser(String username) throws SQLException {
    String query = "delete from users where username=?";
    PreparedStatement stmt = con.prepareStatement(query);
    stmt.setString(1, username);
    stmt.executeUpdate();
    stmt.close();
  }
  
  public boolean checkForUsername(String username) throws SQLException {
    users_list_.clear();
    users_list_ = getUsers();
    for(User user : users_list_) {
      if(user.getUsername().equals(username))
        return true;
    }
    return false;
  }
  
  public int getNumberOfUsers() throws Exception {
    try {
      users_list_.clear();
      users_list_ = getUsers();
    } catch (SQLException exception) {
      System.out.println(exception.getMessage());
    }
    return users_list_.size();
    
  }
  
  public ArrayList<User> getUsers() throws SQLException {
    users_list_.clear();
    String select_query = "SELECT id, first_name, last_name, email, username, password, gender, age, occupation, `role` FROM oad_trec.users where role='user'";
    Statement selectStmt = con.createStatement();
    ResultSet results = selectStmt.executeQuery(select_query);
    while(results.next()) {
      User user = new User();
      user.setID(results.getInt("id"));
      user.setFirstName(results.getString("first_name"));
      user.setLastName(results.getString("last_name"));
      user.setEmail(results.getString("email"));
      user.setUsername(results.getString("username"));
      user.setPassword(results.getString("password"));
      user.setGender(results.getString("gender"));
      user.setAge(results.getInt("age"));
      user.setOccupation(results.getString("occupation"));
      user.setRole(results.getString("role"));
      users_list_.add(user);
    }
    selectStmt.close();
    return users_list_;
  }
  
    public ArrayList<User> getUsersAndAdmins() throws SQLException {
    users_list_.clear();
    String select_query = "SELECT id, first_name, last_name, email, username, password, gender, age, occupation, `role` FROM oad_trec.users";
    Statement selectStmt = con.createStatement();
    ResultSet results = selectStmt.executeQuery(select_query);
    while(results.next()) {
      User user = new User();
      user.setID(results.getInt("id"));
      user.setFirstName(results.getString("first_name"));
      user.setLastName(results.getString("last_name"));
      user.setEmail(results.getString("email"));
      user.setUsername(results.getString("username"));
      user.setPassword(results.getString("password"));
      user.setGender(results.getString("gender"));
      user.setAge(results.getInt("age"));
      user.setOccupation(results.getString("occupation"));
      user.setRole(results.getString("role"));
      users_list_.add(user);
    }
    selectStmt.close();
    return users_list_;
  }
  
  public User getUserByUsername(String username) throws SQLException {
    users_list_.clear();
    users_list_ = getUsers();
    for(User user : users_list_) {
     if(user.getUsername().equals(username)) {
        return user;
      }
    }
    return null;
  }
  
  public User getUserByUserID(int user_id) throws SQLException {
    users_list_.clear();
    users_list_ = getUsersAndAdmins();
    for(User user : users_list_) {
      if(user.getID() == user_id) {
        return user;
      }
    }
    return null;
  }
  
  public void updateUser(User user, String username) throws SQLException {
      String update_query = "UPDATE oad_trec.users SET first_name=?, last_name=?, email=?, username=?, password=?, gender=?, age=?, occupation=?, role=? WHERE username=?";
      PreparedStatement updateStmt = con.prepareStatement(update_query);
      updateStmt.setString(1, user.getFirstName());
      updateStmt.setString(2, user.getLastName());
      updateStmt.setString(3, user.getEmail());
      updateStmt.setString(4, user.getUsername());
      updateStmt.setString(5, user.getPassword());
      updateStmt.setString(6, user.getGender());
      updateStmt.setInt(7, user.getAge());
      updateStmt.setString(8, user.getOccupation());
      updateStmt.setString(9, user.getRole());
      updateStmt.setString(10, username);
      updateStmt.executeUpdate();
      updateStmt.close();
      
      users_list_.clear();
      users_list_ = getUsers();
  }
  
  // country related stuff
  public boolean addCountry(Country country) throws SQLException {
    String query1 = "select * from oad_trec.countries where name=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setString(1, country.getName());
    ResultSet result = stmt1.executeQuery();
    if(result.isBeforeFirst()) {
      stmt1.close();
      return false;
    } else {
      String insert_stmt = "insert into oad_trec.countries(name) values(?)";
      PreparedStatement stmt2 = con.prepareStatement(insert_stmt);
      stmt2.setString(1, country.getName());
      stmt2.executeUpdate();
      stmt2.close();
      stmt1.close();
      return true;
    }
  }
  
  public void removeCountry(Country country) throws SQLException {
    String query = "delete from oad_trec.countries where country_id=?";
    PreparedStatement stmt = con.prepareStatement(query);
    stmt.setInt(1, country.getID());
    stmt.executeUpdate();
    stmt.close();
  }
  
  public ArrayList<Country> getCountrys() throws SQLException {
    ArrayList<Country> counties = new ArrayList<>();
    String query = "select country_id, name from oad_trec.countries";
    Statement selectStmt = con.createStatement();
    ResultSet results = selectStmt.executeQuery(query);
    while(results.next()) {
      int country_id = results.getInt("country_id");
      String name = results.getString("name");
      Country country = new Country(name);
      country.setID(country_id);
      counties.add(country);
    }
    selectStmt.close();
    return counties;
  }
  
  public Country getCountryByName(String country_name) throws SQLException {
    String query = "select country_id, name from oad_trec.countries where name=?";
    PreparedStatement stmt = con.prepareStatement(query);
    stmt.setString(1, country_name);
    ResultSet result = stmt.executeQuery();
    result.next();
    Country country = new Country(result.getString("name"));
    country.setID(result.getInt("country_id"));
    stmt.close();
    return country;
  }
  
  public Country getCountryByCountryID(int country_id) throws SQLException {
    ArrayList<Country> list = getCountrys();
    for(Country c : list) {
      if(c.getID() == country_id)
        return c;
    }
    return null;
  }
  
  // city related stuff
  public boolean addCity(Country country, City city) throws SQLException {
    Country the_country = getCountryByName(country.getName());
    String query1 = "select * from oad_trec.cities where name=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setString(1, city.getName());
    ResultSet result = stmt1.executeQuery();
    if(result.isBeforeFirst()) {
      stmt1.close();
      return false;
    } else {
      String insert_stmt = "insert into oad_trec.cities(name, country_id) values(?, ?)";
      PreparedStatement stmt2 = con.prepareStatement(insert_stmt);
      stmt2.setString(1, country.getName());
      stmt2.setInt(2, the_country.getID());
      stmt2.executeUpdate();
      stmt2.close();
      stmt1.close();
      return true;
    }
  }
  
  public void removeCity(City city) throws SQLException {
    String query = "delete from oad_trec.cities where name=?";
    PreparedStatement stmt = con.prepareStatement(query);
    stmt.setString(1, city.getName());
    stmt.executeUpdate();
    stmt.close();
  }
  
  public ArrayList<City> getCitiesByCountryID(int country_id) throws SQLException {
    ArrayList<City> list = new ArrayList<>();
    String query = "SELECT city_id, name, country_id FROM oad_trec.cities WHERE country_id=" + country_id;
    Statement selectStmt = con.createStatement();
    ResultSet results = selectStmt.executeQuery(query);
    while(results.next()) {
      int city_id = results.getInt("city_id");
      String name = results.getString("name");
      City city = new City(name);
      city.setID(city_id);
      city.setCountryID(country_id);
      list.add(city);
    }
    selectStmt.close();
    return list;
  }
  
  public City getCityByName(String name, int country_id) throws SQLException {
    ArrayList<City> list = getCitiesByCountryID(country_id);
    for(City city : list) {
      if (city.getName().equals(name))
        return city;
    }
    return null;
  }
  
  public City getCityByCityID(int city_id) throws SQLException {
    String query = "select * from cities where city_id=" + city_id;
    Statement selectStmt = con.createStatement();
    selectStmt.execute(query);
    ResultSet results = selectStmt.executeQuery(query);
    results.next();
    String name = results.getString("name");
    int id = results.getInt("city_id");
    int country_id = results.getInt("country_id");
    City city = new City(name);
    city.setID(id);
    city.setCountryID(country_id);
    selectStmt.close();
    return city;
  }
  
  // destination related stuff
  public boolean addDestinationBookmark(Destination destination, User user) throws SQLException {
    String query1 = "select * from oad_trec.destination_bookmarks where user_id=? and destination_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, user.getID());
    stmt1.setInt(2, destination.getID());
    ResultSet result = stmt1.executeQuery();
    if(result.isBeforeFirst()) {
      stmt1.close();
      return false;
    } else {
      String query = "INSERT INTO oad_trec.destination_bookmarks (user_id, destination_id) VALUES(?, ?)";
      PreparedStatement insertStmt = con.prepareStatement(query);
      insertStmt.setInt(1, user.getID());
      insertStmt.setInt(2, destination.getID());
      insertStmt.executeUpdate();
      stmt1.close();
      insertStmt.close();
      return true;
    }    
  }
  
  public ArrayList<Destination> getDestinationBookmarks(User user) throws SQLException {
    ArrayList<Destination> list = new ArrayList<>();
    ArrayList<Integer> ids = new ArrayList<>();
    String query1 = "SELECT user_id, destination_id FROM oad_trec.destination_bookmarks WHERE user_id=" + user.getID();
    Statement selectStmt = con.createStatement();
    ResultSet results = selectStmt.executeQuery(query1);
    while(results.next()) {
      ids.add(results.getInt("destination_id"));
    }
    // now fetch destinations for each destination_id
    ArrayList<Destination> temp_destinations = getAllDestinations();
    for(int i : ids) {
      for(Destination d : temp_destinations) {
        if(d.getID() == i) {
          list.add(d);
        }
      }
    }
    return list;
  }
  
  public boolean addDestination(City city, Destination destination) throws SQLException {
    String query1 = "select * from oad_trec.acc_and_dest where name=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setString(1, destination.getName());
    ResultSet result = stmt1.executeQuery();
    if(result.isBeforeFirst()) {
      stmt1.close();
      return false;
    } else {
      String query = "INSERT INTO oad_trec.acc_and_dest(name, description, type_of, city_id) VALUES(?, ?, ?, ?)";
      PreparedStatement insertStmt = con.prepareStatement(query);
      insertStmt.setString(1, destination.getName());
      insertStmt.setString(2, destination.getDescription());
      insertStmt.setString(3, "Destination");
      insertStmt.setInt(4, city.getID());
      insertStmt.executeUpdate();
      stmt1.close();
      insertStmt.close();
      return true;
    }
  }
  
  public void updateDestination(Destination destination) throws SQLException {
    String query = "UPDATE oad_trec.acc_and_dest SET description=? WHERE name=?";
    PreparedStatement updateStmt = con.prepareStatement(query);
    updateStmt.setString(1, destination.getDescription());
    updateStmt.setString(2, destination.getName());
    updateStmt.executeUpdate();
    updateStmt.close();
  }
  
  public void deleteDestination(Destination destination) throws SQLException {
    String query = "DELETE FROM oad_trec.acc_and_dest WHERE id=?";
    PreparedStatement updateStmt = con.prepareStatement(query);
    updateStmt.setInt(1, destination.getID());
    updateStmt.executeUpdate();
    updateStmt.close();
  }
  
  public ArrayList<Destination> getAllDestinations() throws SQLException {
    ArrayList<Destination> list = new ArrayList<>();
    String query = "SELECT id, name, description, type_of, city_id FROM oad_trec.acc_and_dest";
    Statement selectStmt = con.createStatement();
    ResultSet results = selectStmt.executeQuery(query);
    while(results.next()) {
      int id = results.getInt("id");
      String name = results.getString("name");
      String description = results.getString("description");
      String type = results.getString("type_of");
      int city_id = results.getInt("city_id");
      if (type.equals("Destination")) {
        Destination dest = new Destination();
        dest.setName(name);
        dest.setDescription(description);
        dest.setID(id);
        dest.setCityID(city_id);
        list.add(dest);
      }
    }
    selectStmt.close();
    return list;
  }
  
  public Destination getDestinationByName(String name) throws SQLException {
    ArrayList<Destination> list = getAllDestinations();
    for(Destination destination : list) {
      if(destination.getName().equals(name))
        return destination;
    }
    return null;
  }
  
  public ArrayList<Destination> getDestinationByCityID(int city_id) throws SQLException { 
    ArrayList<Destination> temp_list = getAllDestinations();
    ArrayList<Destination> list = new ArrayList<>();
    for(Destination dest : temp_list) {
      if(dest.getCityID() == city_id) 
        list.add(dest);
    }
    return list;
  }
  
  // accommodation related stuff
  public boolean addAccommodationBookmark(Accommodation accommodation, User user) throws SQLException {
    String query1 = "select * from oad_trec.accommodation_bookmarks where user_id=? and accommodation_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, user.getID());
    stmt1.setInt(2, accommodation.getID());
    ResultSet result = stmt1.executeQuery();
    if(result.isBeforeFirst()) {
      stmt1.close();
      return false;
    } else {
      String query = "INSERT INTO oad_trec.accommodation_bookmarks (user_id, accommodation_id) VALUES(?, ?)";
      PreparedStatement insertStmt = con.prepareStatement(query);
      insertStmt.setInt(1, user.getID());
      insertStmt.setInt(2, accommodation.getID());
      insertStmt.executeUpdate();
      stmt1.close();
      insertStmt.close();
      return true;
    }
  }
  
  public ArrayList<Accommodation> getAccommodationBookmarks(User user) throws SQLException {
    ArrayList<Accommodation> list = new ArrayList<>();
    ArrayList<Integer> ids = new ArrayList<>();
    String query1 = "SELECT user_id, accommodation_id FROM oad_trec.accommodation_bookmarks WHERE user_id=" + user.getID();
    Statement selectStmt = con.createStatement();
    ResultSet results = selectStmt.executeQuery(query1);
    while(results.next()) {
      ids.add(results.getInt("accommodation_id"));
    }
    // now fetch accommodations for each accommodation_id
    ArrayList<Accommodation> temp_accomodations = getAllAccomodations();
    for(int i : ids) {
      for(Accommodation acc : temp_accomodations) {
        if(acc.getID() == i) {
          list.add(acc);
        }
      }
    }
    return list;
  }
  
  public boolean addAccommodation(City city, Accommodation accommodation) throws SQLException {
    String query1 = "select * from oad_trec.acc_and_dest where name=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setString(1, accommodation.getName());
    ResultSet result = stmt1.executeQuery();
    if(result.isBeforeFirst()) {
      stmt1.close();
      return false;
    } else {
      String query = "INSERT INTO oad_trec.acc_and_dest(name, description, type_of, city_id) VALUES(?, ?, ?, ?)";
      PreparedStatement insertStmt = con.prepareStatement(query);
      insertStmt.setString(1, accommodation.getName());
      insertStmt.setString(2, accommodation.getDescription());
      insertStmt.setString(3, "Accommodation");
      insertStmt.setInt(4, city.getID());
      insertStmt.executeUpdate();
      stmt1.close();
      insertStmt.close();
      return true; 
    }
  }
  
  public void updateAccommodation(Accommodation accommodation) throws SQLException {
    String query = "UPDATE oad_trec.acc_and_dest SET description=? WHERE name=?";
    PreparedStatement updateStmt = con.prepareStatement(query);
    updateStmt.setString(1, accommodation.getDescription());
    updateStmt.setString(2, accommodation.getName());
    updateStmt.executeUpdate();
    updateStmt.close();
  }
  
  public void deleteAccommodation(Accommodation accommodation) throws SQLException {
    String query = "DELETE FROM oad_trec.acc_and_dest WHERE id=?";
    PreparedStatement updateStmt = con.prepareStatement(query);
    updateStmt.setInt(1, accommodation.getID());
    updateStmt.executeUpdate();
    updateStmt.close();
  }
  
  public ArrayList<Accommodation> getAllAccomodations() throws SQLException {
    ArrayList<Accommodation> list = new ArrayList<>();
    String query = "SELECT id, name, description, type_of, city_id FROM oad_trec.acc_and_dest";
    Statement selectStmt = con.createStatement();
    ResultSet results = selectStmt.executeQuery(query);
    while(results.next()) {
      int id = results.getInt("id");
      String name = results.getString("name");
      String description = results.getString("description");
      String type = results.getString("type_of");
      int city_id = results.getInt("city_id");
      if (type.equals("Accommodation")) {
        Accommodation acc = new Accommodation();
        acc.setName(name);
        acc.setDescription(description);
        acc.setID(id);
        acc.setCityID(city_id);
        list.add(acc);
      }
    }
    selectStmt.close();
    return list;
  }
  
  public Accommodation getAccommodationByName(String name) throws SQLException {
    ArrayList<Accommodation> list = getAllAccomodations();
    for(Accommodation accommodation : list) {
      if(accommodation.getName().equals(name))
        return accommodation;
    }
    return null;
  }
  
  public ArrayList<Accommodation> getAccommodationByCityID(int city_id) throws SQLException { 
    ArrayList<Accommodation> temp_list = getAllAccomodations();
    ArrayList<Accommodation> list = new ArrayList<>();
    for(Accommodation acc : temp_list) {
      if(acc.getCityID() == city_id) 
        list.add(acc);
    }
    return list;
  }

  // TODO when I delete a country, delete all cities???????

  // ratings
  public void addRating(int user_id, int place_id, int rating, String comment) throws SQLException {
    String query1 = "select * from oad_trec.ratings where user_id=? and place_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, user_id);
    stmt1.setInt(2, place_id);
    ResultSet result = stmt1.executeQuery();
    if(result.isBeforeFirst()) {
      // UPDATE IF EXISTS
      String query = "UPDATE oad_trec.ratings SET rating=?, comment=?";
      PreparedStatement updateStmt = con.prepareStatement(query);
      updateStmt.setInt(1, rating);
      updateStmt.setString(2, comment);
      updateStmt.executeUpdate();
      updateStmt.close();
      stmt1.close();
    } else {
      // INSERT IF FIRST TIME
      String query = "INSERT INTO oad_trec.ratings (user_id, place_id, rating, comment) VALUES(?, ?, ?, ?)";
      PreparedStatement insertStmt = con.prepareStatement(query);
      insertStmt.setInt(1, user_id);
      insertStmt.setInt(2, place_id);
      insertStmt.setInt(3, rating);
      insertStmt.setString(4, comment);
      insertStmt.executeUpdate();
      insertStmt.close();
      stmt1.close();    
    }
  }
  
  public void deleteRating(int user_id, int place_id) throws SQLException {
    String query = "delete from ratings where user_id=? and place_id=?";
    PreparedStatement stmt = con.prepareStatement(query);
    stmt.setInt(1, user_id);
    stmt.setInt(2, place_id);
    stmt.executeUpdate();
    stmt.close();
  }
  
  public ArrayList<Integer> getAllUsersThatRatedPlaceByPlaceID(int place_id) throws SQLException {
    ArrayList<Integer> list = new ArrayList<>();
    String query1 = "select user_id from oad_trec.ratings where place_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, place_id);
    ResultSet result = stmt1.executeQuery();
    while(result.next()) {
      list.add(result.getInt("user_id"));
    }
    stmt1.close();
    return list.isEmpty() ? null : list;
  }
  
  public double getRatingByPlaceID(int place_id) throws SQLException {
    String query1 = "select rating from oad_trec.ratings where place_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, place_id);
    ResultSet result = stmt1.executeQuery();
    int sum = 0, counter = 0;
    while(result.next()) {
      sum += result.getInt("rating");
      counter++;
    }
      stmt1.close();
    if(counter == 0) return 0;
    return (double) sum / counter;
  }
  
  public int getRatingByUserIDandPlaceID(int user_id, int place_id) throws SQLException {
    String query1 = "select rating from oad_trec.ratings where user_id=? and place_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, user_id);
    stmt1.setInt(2, place_id);
    ResultSet result = stmt1.executeQuery();
    result.next();
    int rating = result.getInt("rating");
    stmt1.close();
    return rating;
  }
  
  public String getCommentByUserIDandPlaceID(int user_id, int place_id) throws SQLException {
    String query1 = "select comment from oad_trec.ratings where user_id=? and place_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, user_id);
    stmt1.setInt(2, place_id);
    ResultSet result = stmt1.executeQuery();
    result.next();
    String comment = result.getString("comment");
    stmt1.close();
    return comment;
  }
  
  // interest themes
  public boolean addNewIT(String name) throws SQLException {
    String query1 = "select * from oad_trec.interest_themes where it_name=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setString(1, name);
    ResultSet result = stmt1.executeQuery();
    if(result.isBeforeFirst()) {
      // RETURN FALSE IF EXISTS
      stmt1.close();
      return false;
    } else {
      String query = "INSERT INTO oad_trec.interest_themes(it_name) VALUES(?)";
      PreparedStatement insertStmt = con.prepareStatement(query);
      insertStmt.setString(1, name);
      insertStmt.executeUpdate();
      insertStmt.close();
      stmt1.close();
      return true;
    }
  }
  
  public void deleteIT(String name) throws SQLException {
    String query = "delete from interest_themes where it_name=?";
    PreparedStatement stmt = con.prepareStatement(query);
    stmt.setString(1, name);
    stmt.executeUpdate();
    stmt.close();
  }
  
  public ArrayList<String> getAllITs() throws SQLException {
    ArrayList<String> list = new ArrayList<>();
    String query1 = "select * from oad_trec.interest_themes";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    ResultSet result = stmt1.executeQuery();
    while(result.next()) {
      list.add(result.getString("it_name"));
    }
    stmt1.close();
    return list;
  }
  
  public int getITIDByName(String name) throws SQLException {
    String query1 = "select * from oad_trec.interest_themes";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    ResultSet result = stmt1.executeQuery();
    while(result.next()) {
      if (result.getString("it_name").equals(name)) {
        int id = result.getInt("it_id");
        stmt1.close();
        return id;
      }
    }
    stmt1.close();
    return -1;
  }
  
  public String getITNameByID(int id) throws SQLException {
    String query1 = "select it_name from oad_trec.interest_themes where it_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, id);
    ResultSet result = stmt1.executeQuery();
    result.next();
    String name = result.getString("it_name");
    stmt1.close();
    return name;
  }
  
  public void addNewITPair(int user_id, int it_id) throws SQLException {
      String query = "INSERT INTO oad_trec.it_pairs(user_id, it_id) VALUES(?, ?)";
      PreparedStatement insertStmt = con.prepareStatement(query);
      insertStmt.setInt(1, user_id);
      insertStmt.setInt(2, it_id);
      insertStmt.executeUpdate();
      insertStmt.close();    
  }
  
  public ArrayList<Integer> getAllITbyUserID(int user_id) throws SQLException {
    ArrayList<Integer> list = new ArrayList<>();
    String query1 = "select * from oad_trec.it_pairs where user_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, user_id);
    ResultSet result = stmt1.executeQuery();
    while(result.next()) {
      list.add(result.getInt("it_id"));
    }
    stmt1.close();
    return list;
  }
  
  public void deleteAllUserITs(int user_id) throws SQLException {
    String query = "DELETE FROM oad_trec.it_pairs WHERE user_id=?";
    PreparedStatement updateStmt = con.prepareStatement(query);
    updateStmt.setInt(1, user_id);
    updateStmt.executeUpdate();
    updateStmt.close();
  }
  
  // interest themes and places
  public void bindPlaceAndIT(int place_id, int it_id) throws SQLException {
    String query = "INSERT INTO oad_trec.places_and_its(place_id, it_id) VALUES(?, ?)";
    PreparedStatement insertStmt = con.prepareStatement(query);
    insertStmt.setInt(1, place_id);
    insertStmt.setInt(2, it_id);
    insertStmt.executeUpdate();
    insertStmt.close();    
  }
 
  public void deletePlaceAndITConnection(int place_id, int it_id) throws SQLException {
    String query = "DELETE FROM oad_trec.places_and_its WHERE place_id=? and it_id=?";
    PreparedStatement updateStmt = con.prepareStatement(query);
    updateStmt.setInt(1, place_id);
    updateStmt.setInt(2, it_id);
    updateStmt.executeUpdate();
    updateStmt.close();
  }
  
  public ArrayList<Integer> getAllITsByPlaceID(int place_id) throws SQLException {
    ArrayList<Integer> list = new ArrayList<>();
    String query1 = "select * from oad_trec.places_and_its where place_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, place_id);
    ResultSet result = stmt1.executeQuery();
    while(result.next()) {
      list.add(result.getInt("it_id"));
    }
    stmt1.close();
    return list;
  }
  
  public void deleteAllConnectionsByPlaceID(int place_id) throws SQLException {
    String query = "DELETE FROM oad_trec.places_and_its WHERE place_id=?";
    PreparedStatement updateStmt = con.prepareStatement(query);
    updateStmt.setInt(1, place_id);
    updateStmt.executeUpdate();
    updateStmt.close();
  }
  
  public ArrayList<Integer> getAllPlaceIDsByITID(int it_id) throws SQLException {
    ArrayList<Integer> list = new ArrayList<>();
    String query1 = "select * from oad_trec.places_and_its where it_id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, it_id);
    ResultSet result = stmt1.executeQuery();
    while(result.next()) {
      list.add(result.getInt("place_id"));
    }
    stmt1.close();
    return list;
  }
  
  public String getPlaceNameByPlaceID(int place_id) throws SQLException {
    String query1 = "select * from oad_trec.acc_and_dest where id=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setInt(1, place_id);
    ResultSet result = stmt1.executeQuery();
    result.next();
    String name = result.getString("name");
    stmt1.close();
    return name;
  }
  
  public ArrayList<String> getRecommendations(int user_id) throws SQLException {
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Integer> it_id_list = getAllITbyUserID(user_id);
    if(it_id_list.isEmpty()) { return list; }
    ArrayList<Integer> place_ids = new ArrayList<>();
    for(int it_id : it_id_list) {
      place_ids = getAllPlaceIDsByITID(it_id);
      if(place_ids.isEmpty()) continue;
      for(int place_id : place_ids) {
        String name = getPlaceNameByPlaceID(place_id);
        list.add(name);
      }
    }
    list = removeDuplicates(list);
    return list;
  }
  
  ArrayList<String> removeDuplicates(ArrayList<String> list) {
    Set<String> set = new HashSet<>(list);
    list.clear();
    list.addAll(set);
    return list;
  }
}
