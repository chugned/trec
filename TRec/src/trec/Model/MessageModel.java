/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Model;

/**
 *
 * @author basic
 */
public class MessageModel {
  private int user_id;
  private String message_;
  private String subject_;
  
  public MessageModel(String subject, String message) {
    this.message_ = message;
    this.subject_ = subject;
  }
  
  public void setUserID(int user_id) {
    this.user_id = user_id;
  }
  
  public int getUserID() {
    return user_id;
  }
  
  public void setMessage(String message) {
    this.message_ = message;
  }
  
  public String getMessage() {
    return message_;
  }
  
  public void setSubject(String subject) {
    this.subject_ = subject;
  }
  
  public String getSubject() {
    return subject_;
  }
}
