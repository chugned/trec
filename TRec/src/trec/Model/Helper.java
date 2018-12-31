/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Model;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author basic
 */
public class Helper {
  
  public Helper() {}
  
  public static boolean isNumeric(String str) {
    if(str.equals("")) return false;
    NumberFormat formatter = NumberFormat.getInstance();
    ParsePosition pos = new ParsePosition(0);
    formatter.parse(str, pos);
    return str.length() == pos.getIndex();
  }
  
  public ArrayList<Accommodation> sortAccommodationsAscending(ArrayList<Accommodation> list) {
    list.sort(Comparator.comparing(Accommodation::getRanking));
    return list;
  }
  
  public ArrayList<Accommodation> sortAccommodationsDescending(ArrayList<Accommodation> list) {
    list.sort(Comparator.comparing(Accommodation::getRanking).reversed());
    return list;
  }
  
  public ArrayList<Destination> sortDestinationsAscending(ArrayList<Destination> list) {
    list.sort(Comparator.comparing(Destination::getRanking));
    return list;
  }
  
  public ArrayList<Destination> sortDestinationsDescending(ArrayList<Destination> list) {
    list.sort(Comparator.comparing(Destination::getRanking).reversed());
    return list;
  }
}
