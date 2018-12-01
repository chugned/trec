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
public class City {
  private String name_;
  private ArrayList<Destination> destinations_;
  private ArrayList<Accommodation> accommodations_;
  
  public City(String name) {
    this.name_ = name;
    this.destinations_ = new ArrayList<>();
    this.accommodations_ = new ArrayList<>();
  }
  
  public String getName() {
    return name_;
  }
  
  public void setName(String name) {
    this.name_ = name;
  }
  
  public ArrayList<Destination> getDestinations() {
    return destinations_;
  }
  
  public void addDestination(Destination destination) {
    this.destinations_.add(destination);
  }
  
  public boolean removeDestination(Destination destination) {
    for(Destination destination_ : destinations_) {
      if(destination_.getName().equals(destination.getName())) {
        destinations_.remove(destination_);
        return true;
      }
    }
    return false;
  }
  
  public ArrayList<Accommodation> getAccommodations() {
    return accommodations_;
  }
  
  public void addAccommodation(Accommodation accommodation) {
    this.accommodations_.add(accommodation);
  }
  
  public boolean removeAccommodation(Accommodation accommodation) {
    for(Accommodation accommodation_ : accommodations_) {
      if(accommodation_.getName().equals(accommodation.getName())) {
        accommodations_.remove(accommodation_);
        return true;
      }
    }
    return false;
  }
}
