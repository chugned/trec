/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    // Hint: this hard coding is and should be just temoporary, as we will add 
    // a real database in the next development iteration
    users_list_ = new ArrayList<>();

    // hard code a country
    country_list_ = new ArrayList<>();
    // Austria
    // Graz
    // schlossberg
    String description = "The \"Schlossberg\" is one of the most attractive places"
            + " one can visit in Graz. A great location in the very center of"
            + " Graz that gives you a beautiful view to the whole town. There are"
            + " several ways one can get to the Schlossberg: by walking, by a lift or"
            + " by a railee.";
    Destination schlossberg = new Destination("Schlossberg", description);
    // murinsel
    description = "Island or boat? It isn’t easy to tell with this extravagant "
            + "steel construction by US-American artist Vito Acconci. The Island"
            + " in the Mur, Graz was commissioned as part of the city’s role as"
            + " Capital of Culture in 2003. What is clear is its function as a"
            + " link between river and city, a wonderful place to drink coffee"
            + " or enjoy a cocktail. With the river Mur swirling cheerfully by"
            + " on both left and right sides, from the Murinsel you can"
            + " appreciate a completely new perspective of the city of Graz";
    Destination murinsel = new Destination("Mur Insel", description);
    // IBIS Hotel
    description = "The ibis budget Hotel Graz Zentrum is so central that just a"
            + " five-minute walk will take you to the main square (old town),"
            + " Schlossberg castle and the Graz Art Museum. This bed and breakfast"
            + " hotel is not just an alternative to youth hostels, hostels and"
            + " low-cost guest houses in and around Graz for inexpensive holidays,"
            + "weekend or cultural breaks; with free WIFI for example, this 2-star"
            + " hotel is great for low-cost business trips too. Book or reserve "
            + "your room at the ibis Budget Hotel Graz online today!";
    Accommodation ibis = new Accommodation("IBIS Hotel", description);
    // Hotel Weitzer
    description = "You’ll really love staying in one of our bright economy rooms"
            + " with 20 sqm viewing \"Gries\" alley or the courtyard. The rooms"
            + " offer an extra comfortable bed with leather headboard, flat-screen "
            + "TV, air condition, free WiFi, work desk, minibar, safe and hair dryer. "
            + "All economy rooms are non-smoking ones.";
    Accommodation weitzer = new Accommodation("Hotel Weitzer", description);
    City graz = new City("Graz");
    graz.addDestination(murinsel);
    graz.addDestination(schlossberg);
    graz.addAccommodation(weitzer);
    graz.addAccommodation(ibis);
    Country austria = new Country("Austria");
    austria.addCity(graz);
    
    // Wien
    // Schoenbrunn
    description = "At the end of the seventeenth century Emperor Leopold I "
            + "commissioned the Baroque architect Johann Bernhard Fischer von "
            + "Erlach, who had received his training in Rome, to design an "
            + "imperial hunting lodge for his son, Crown Prince Joseph, later "
            + "to become Emperor Joseph I. Replacing the château de plaisance "
            + "built on this site for the dowager empress Eleonora of Gonzaga "
            + "in 1642, it was to grow into a palatial imperial residence over "
            + "the course of the eighteenth century.";
    Destination schoenbrunn = new Destination("Schoenbrunn", description);
    // Stephansdom
    description = "St. Stephen's Cathedral (more commonly known by its German "
            + "title: Stephansdom) is the mother church of the Roman Catholic "
            + "Archdiocese of Vienna and the seat of the Archbishop of Vienna, "
            + "Christoph Cardinal Schönborn, OP. The current Romanesque and "
            + "Gothic form of the cathedral, seen today in the Stephansplatz, "
            + "was largely initiated by Duke Rudolf IV (1339–1365) and stands "
            + "on the ruins of two earlier churches, the first a parish church "
            + "consecrated in 1147. The most important religious building in "
            + "Vienna, St. Stephen's Cathedral has borne witness to many "
            + "important events in Habsburg and Austrian history and has, "
            + "with its multi-coloured tile roof, become one of the city's "
            + "most recognizable symbols.";
    Destination stephansdom = new Destination("Stephansdom", description);
    // The Guesthouse
    description = "Sharing the same square as the Albertina, Opera House and "
            + "Sacher Hotel, this property is a favourite among the hotel "
            + "offerings in the city centre. It is remarkable what happens to "
            + "a youth hostel in the hands of Sir Terence Conran. The "
            + "transformation has succeeded on every level.";
    Accommodation guesthouse = new Accommodation("The Guesthouse", description);
    // Hotel Sacher
    description = "The Sacher offers resplendent elegance, prominently "
            + "positioned in the heart of the city, behind the Vienna State "
            + "Opera House and next door to the Albertina Museum. It's like "
            + "staying in a royal residence and is undeniably one of the best, "
            + "most appealing, places to stay if it's luxurious old-world "
            + "charm you want.";
    Accommodation sacher = new Accommodation("Hotel Sacher", description);
    City vienna = new City("Vienna");
    vienna.addDestination(schoenbrunn);
    vienna.addDestination(stephansdom);
    vienna.addAccommodation(guesthouse);
    vienna.addAccommodation(sacher);
    austria.addCity(vienna);
    country_list_.add(austria);
  }
  
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
  
  public void addUser(User new_user) throws SQLException {
//    OLD CODE
//    users_list_.add(new_user);
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
//      OLD CODE
//    for(User user : users_list_) {
//      if(user.getUsername().equals(username) && user.getPassword().equals(password))
//        return user;
//    }
//    return null;
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
  
  public boolean addCountry(Country country) throws SQLException {
//    for(Country it : country_list_) {
//      if(it.getName().equals(country.getName())) {
//        return false;
//      }
//    }
//    this.country_list_.add(country);
//    return true;
    String query1 = "select * from oad_trec.countries where name=?";
    PreparedStatement stmt1 = con.prepareStatement(query1);
    stmt1.setString(1, country.getName());
    ResultSet result = stmt1.executeQuery();
    if(result.isBeforeFirst()) {
      stmt1.close();
      return false;
    } else {
      String insert_stmt = "insert into oad_trec.countries(name) values('?')";
      PreparedStatement stmt2 = con.prepareStatement(insert_stmt);
      stmt2.setString(1, country.getName());
      stmt2.executeUpdate();
      stmt2.close();
      stmt1.close();
      return true;
    }
  }
  
  public void removeCountry(Country country) throws SQLException {
//    for(Country it : country_list_) {
//      if(it.getName().equals(country.getName())) {
//        country_list_.remove(it);
//      }
//    }
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
//    for(Country country : country_list_) {
//      if(country.getName().equals(country_name)) {
//        return country;
//      }
//    }
//    return null;
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

  public boolean addDestinationBookmark(Destination destination, User user) {
    ArrayList<Destination> bookmarks = this.destination_bookmarks_.get(user);
    if(bookmarks != null) {
      for(Destination iterator : bookmarks) {
        if(iterator.getName().equals(destination.getName())) {
          System.out.println("[INFO] Bookmark already exists. Do nothing.");
          return false;
        }
      }      
    } else {
      bookmarks = new ArrayList<>();
    }
    bookmarks.add(destination);
    this.destination_bookmarks_.put(user, bookmarks);
    return true;
  }
  
  public ArrayList<Destination> getDestinationBookmarks(User user) {
    return destination_bookmarks_.get(user);
  }
  
  public boolean addAccommodationBookmark(Accommodation accommodation, User user) {
    ArrayList<Accommodation> bookmarks = this.accommodation_bookmarks_.get(user);
    if(bookmarks != null) {
      for(Accommodation iterator : bookmarks) {
        if(iterator.getName().equals(accommodation.getName())) {
          System.out.println("[INFO] Bookmark already exists. Do nothing.");
          return false;
        }
      }      
    } else {
      bookmarks = new ArrayList<>();
    }
    bookmarks.add(accommodation);
    this.accommodation_bookmarks_.put(user, bookmarks);
    return true;
  }
  
  public ArrayList<Accommodation> getAccommodationBookmarks(User user) {
    return accommodation_bookmarks_.get(user);
  }
  
  public void updateAccommodation(Country country, City city, Accommodation accommodation) {
    Country old_country = null;
    for(Country it : country_list_) {
      if(it.getName().equals(country.getName())) {
        old_country = it;
        country_list_.remove(it);
        break;
      }
    }
    ArrayList<City> city_list = old_country.getCities();
    City old_city = null;
    for(City it : city_list) {
      if(it.getName().equals(city.getName())) {
        old_city = it;
        city_list.remove(it);
        break;
      }
    }
    // update, find by name and remove
    old_city.removeAccommodation(accommodation);
    // add with new description
    old_city.addAccommodation(accommodation);
    // go back 
    old_country.addCity(old_city);
    country_list_.add(old_country);
  }
  
   public void deleteAccommodation(Country country, City city, Accommodation accommodation) {
    Country old_country = null;
    for(Country it : country_list_) {
      if(it.getName().equals(country.getName())) {
        old_country = it;
        country_list_.remove(it);
        break;
      }
    }
    ArrayList<City> city_list = old_country.getCities();
    City old_city = null;
    for(City it : city_list) {
      if(it.getName().equals(city.getName())) {
        old_city = it;
        city_list.remove(it);
        break;
      }
    }
    // find by name and remove
    old_city.removeAccommodation(accommodation);
    // go back 
    old_country.addCity(old_city);
    country_list_.add(old_country);
  }
   
  public void updateDestination(Country country, City city, Destination destination) {
    Country old_country = null;
    for(Country it : country_list_) {
      if(it.getName().equals(country.getName())) {
        old_country = it;
        country_list_.remove(it);
        break;
      }
    }
    ArrayList<City> city_list = old_country.getCities();
    City old_city = null;
    for(City it : city_list) {
      if(it.getName().equals(city.getName())) {
        old_city = it;
        city_list.remove(it);
        break;
      }
    }
    // update, find by name and remove
    old_city.removeDestination(destination);
    // add with new description
    old_city.addDestination(destination);
    // go back 
    old_country.addCity(old_city);
    country_list_.add(old_country);
  }
  
  public void deleteDestination(Country country, City city, Destination destination) {
    Country old_country = null;
    for(Country it : country_list_) {
      if(it.getName().equals(country.getName())) {
        old_country = it;
        country_list_.remove(it);
        break;
      }
    }
    ArrayList<City> city_list = old_country.getCities();
    City old_city = null;
    for(City it : city_list) {
      if(it.getName().equals(city.getName())) {
        old_city = it;
        city_list.remove(it);
        break;
      }
    }
    // find by name and remove
    old_city.removeDestination(destination);
    // go back 
    old_country.addCity(old_city);
    country_list_.add(old_country);
  }
  
  public boolean addCity(Country country, City city) {
    Country old_country = null;
    for(Country it : country_list_) {
      if(it.getName().equals(country.getName())) {
        old_country = it;
        country_list_.remove(it);
        break;
      }
    }
    ArrayList<City> city_list = old_country.getCities();
    for(City it : city_list) {
      if(it.getName().equals(city.getName())) {
        return false;
      }
    }
    old_country.addCity(city);
    country_list_.add(old_country);
    return true;
  }
  
  public void removeCity(Country country, City city) {
    Country old_country = null;
    for(Country it : country_list_) {
      if(it.getName().equals(country.getName())) {
        old_country = it;
        country_list_.remove(it);
        break;
      }
    }
    old_country.removeCity(city);
    country_list_.add(old_country);
  }
  
  public boolean addDestination(Country country, City city, Destination destination) {
    Country old_country = null;
    for(Country it : country_list_) {
      if(it.getName().equals(country.getName())) {
        old_country = it;
        country_list_.remove(it);
        break;
      }
    }
    ArrayList<City> city_list = old_country.getCities();
    City old_city = null;
    for(City it : city_list) {
      if(it.getName().equals(city.getName())) {
        old_city = it;
        city_list.remove(it);
        break;
      }
    }
    for(Destination it : old_city.getDestinations()) {
      if(it.getName().equals(destination.getName())) {
        return false;
      }
    }
    old_city.addDestination(destination);
    old_country.addCity(old_city);
    country_list_.add(old_country);
    return true;
  }
  
  public boolean addAccommodation(Country country, City city, Accommodation accommodation) {
    Country old_country = null;
    for(Country it : country_list_) {
      if(it.getName().equals(country.getName())) {
        old_country = it;
        country_list_.remove(it);
        break;
      }
    }
    ArrayList<City> city_list = old_country.getCities();
    City old_city = null;
    for(City it : city_list) {
      if(it.getName().equals(city.getName())) {
        old_city = it;
        city_list.remove(it);
        break;
      }
    }
    for(Accommodation it : old_city.getAccommodations()) {
      if(it.getName().equals(accommodation.getName())) {
        return false;
      }
    }
    old_city.addAccommodation(accommodation);
    old_country.addCity(old_city);
    country_list_.add(old_country);
    return true;
  }
}
