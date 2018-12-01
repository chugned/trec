/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Model;

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
  
  private Database() {
    this.destination_bookmarks_ = new HashMap<>();
    this.accommodation_bookmarks_ = new HashMap<>();
    // Hint: this hard coding is and should be just temoporary, as we will add 
    // a real database in the next development iteration
    users_list_ = new ArrayList<>();
    // hard code admin
    User admin = new User("Eman", "Basic", "eman.basic@hotmail.com", "admin", 
            "admin", "Male", 21, "Student");
    admin.setRole("Admin");
    users_list_.add(admin);
    // TODO hard code other users
    User josip = new User("Josip", "Letica", "joisp.letica@hotmail.com", "josip123", 
            "letica123", "Male", 21, "Student");
    users_list_.add(josip);
    
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
  
  public void addUser(User new_user) {
    users_list_.add(new_user);
  }
  
  public User isUserValid(String username, String password) {
    for(User user : users_list_) {
      if(user.getUsername().equals(username) && user.getPassword().equals(password))
        return user;
    }
    return null;
  }
  
  public boolean checkForUsername(String username) {
    for(User user : users_list_) {
      if(user.getUsername().equals(username))
        return true;
    }
    return false;
  }
  
  public int getNumberOfUsers() {
    return users_list_.size();
  }
  
  public ArrayList<User> getUsers() {
    return users_list_;
  }
  
  public User getUserByUsername(String username) {
    for(User user : users_list_) {
      if(user.getUsername().equals(username))
        return user;
    }
    return null;
  }
  
  public void updateUser(User new_user, String username) {
    for(User old_user : users_list_) {
      if(old_user.getUsername().equals(username)) {
        users_list_.remove(old_user);
        break;
      }
    }
    users_list_.add(new_user);
  }
  
  public void addCountry(Country country) {
    this.country_list_.add(country);
  }
  
  public ArrayList<Country> getCountrys() {
    return country_list_;
  }
  
  public Country getCountryByName(String country_name) {
    for(Country country : country_list_) {
      if(country.getName().equals(country_name)) {
        return country;
      }
    }
    return null;
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

}
