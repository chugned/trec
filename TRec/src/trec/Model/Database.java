/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Model;

//import com.sun.xml.internal.stream.events.AttributeImpl;
import java.util.ArrayList;

/**
 *
 * @author basic
 */
public class Database {
  private static Database database_ = null;
  private ArrayList<User> users_list_;
  
  private Database() {
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
}
