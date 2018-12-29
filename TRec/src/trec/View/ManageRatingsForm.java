/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.View;

import java.util.ArrayList;
import javax.swing.JFrame;
import trec.Controller.UserController;
import trec.Model.Accommodation;
import trec.Model.Destination;
import trec.Model.User;

/**
 *
 * @author basic
 */
public class ManageRatingsForm extends javax.swing.JFrame {

  /**
   * Creates new form ManageRatingsForm
   */
  public ManageRatingsForm() {
    initComponents();
    try {
      comment_field.setText("");
      ArrayList<Destination> list = UserController.getInstance().getAllDestinations();
      for(Destination dest : list) {
        acc_dest_combo_box.addItem(dest.getName());
      }
      Destination first = list.get(0);
      double average_rating = UserController.getInstance().getRatingByPlaceID(first.getID());
      average_rating_label.setText("Average rating: " + average_rating);
      ArrayList<Integer> users_list = UserController.getInstance().getAllUsersThatRatedPlaceByPlaceID(first.getID());
      if(users_list != null) {
        for(int user_id : users_list) {
          User user = UserController.getInstance().getUserByUserID(user_id);
          users_combo_box.addItem(user.getUsername());
        }
        int rating = UserController.getInstance().getRatingByUserIDandPlaceID(users_list.get(0), first.getID());
        user_rated_label.setText("User rated: " + rating);
        comment_field.setText(UserController.getInstance().getCommentByUserIDandPlaceID(users_list.get(0), first.getID()));
      } else {
        user_rated_label.setText("User rated: --");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    name_label = new javax.swing.JLabel();
    acc_dest_combo_box = new javax.swing.JComboBox<>();
    choose_rating_label1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    comment_field = new javax.swing.JTextPane();
    back_button = new javax.swing.JButton();
    delete_button = new javax.swing.JButton();
    choose_rating_label2 = new javax.swing.JLabel();
    users_combo_box = new javax.swing.JComboBox<>();
    user_rated_label = new javax.swing.JLabel();
    average_rating_label = new javax.swing.JLabel();
    acc_dest_label1 = new javax.swing.JLabel();
    type_combo_box = new javax.swing.JComboBox<>();
    bookmarks_menu_bar = new javax.swing.JMenuBar();
    menu_bar_logout = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    name_label.setText("Name:");

    acc_dest_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        acc_dest_combo_boxItemStateChanged(evt);
      }
    });

    choose_rating_label1.setText("Comment:");

    comment_field.setEditable(false);
    jScrollPane1.setViewportView(comment_field);

    back_button.setText("Back");
    back_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        back_buttonMouseClicked(evt);
      }
    });

    delete_button.setText("Delete");
    delete_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        delete_buttonMouseClicked(evt);
      }
    });

    choose_rating_label2.setText("User:");

    users_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        users_combo_boxItemStateChanged(evt);
      }
    });

    user_rated_label.setText("User rated:");

    average_rating_label.setText("Average rating: ");

    acc_dest_label1.setText("Accommodation/Destination:");

    type_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Destination", "Accommodation" }));
    type_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        type_combo_boxItemStateChanged(evt);
      }
    });

    menu_bar_logout.setText("Logout");
    menu_bar_logout.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        menu_bar_logoutMouseClicked(evt);
      }
    });
    bookmarks_menu_bar.add(menu_bar_logout);

    setJMenuBar(bookmarks_menu_bar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(choose_rating_label2)
              .addComponent(user_rated_label))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(average_rating_label)
              .addComponent(users_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(acc_dest_label1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(type_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(name_label)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(acc_dest_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(choose_rating_label1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(0, 0, Short.MAX_VALUE))))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(type_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(acc_dest_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(acc_dest_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(choose_rating_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(users_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(user_rated_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(average_rating_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(choose_rating_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(back_button)
          .addComponent(delete_button))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void menu_bar_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_bar_logoutMouseClicked
    // TODO add your handling code here:
    LoginForm login_form = new LoginForm();
    login_form.setVisible(true);
    login_form.pack();
    login_form.setLocationRelativeTo(null);
    login_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_menu_bar_logoutMouseClicked

  private void acc_dest_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_acc_dest_combo_boxItemStateChanged
    // TODO add your handling code here:
    String type = type_combo_box.getSelectedItem().toString();
    users_combo_box.removeAllItems();
    comment_field.setText("");
    int place_id;
    try {      
      if (type.equals("Accommodation")) {
        String current = acc_dest_combo_box.getSelectedItem().toString();
        Accommodation acc = UserController.getInstance().getAccommodationByName(current);
        double average = UserController.getInstance().getRatingByPlaceID(acc.getID());
        average_rating_label.setText("Average rating: " + average);
        place_id = acc.getID();
      } else {
        String current = acc_dest_combo_box.getSelectedItem().toString();
        Destination dest = UserController.getInstance().getDestinationByName(current);
        double average = UserController.getInstance().getRatingByPlaceID(dest.getID());
        average_rating_label.setText("Average rating: " + average);
        place_id = dest.getID();
      }
      ArrayList<Integer> users_list = UserController.getInstance().getAllUsersThatRatedPlaceByPlaceID(place_id);
      if(users_list != null) {
        for(int user_id : users_list) {
          User user = UserController.getInstance().getUserByUserID(user_id);
          users_combo_box.addItem(user.getUsername());
        }
        int rating = UserController.getInstance().getRatingByUserIDandPlaceID(users_list.get(0), place_id);
        user_rated_label.setText("User rated: " + rating);
        comment_field.setText(UserController.getInstance().getCommentByUserIDandPlaceID(users_list.get(0), place_id));
      } else {
        user_rated_label.setText("User rated: --");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }//GEN-LAST:event_acc_dest_combo_boxItemStateChanged

  private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
    // TODO add your handling code here:
    AdminHub admin_hub = new AdminHub();
    admin_hub.setVisible(true);
    admin_hub.pack();
    admin_hub.setLocationRelativeTo(null);
    admin_hub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_back_buttonMouseClicked

  private void delete_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_buttonMouseClicked
    // TODO add your handling code here:
    try {
      
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }//GEN-LAST:event_delete_buttonMouseClicked

  private void users_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_users_combo_boxItemStateChanged
    // TODO add your handling code here:
    comment_field.setText("");
    String type = type_combo_box.getSelectedItem().toString();
    int place_id;
    try {
      if(type.equals("Accommodation")) {
        Accommodation acc = UserController.getInstance().getAccommodationByName(acc_dest_combo_box.getSelectedItem().toString());
        place_id = acc.getID();
      } else {
        Destination dest = UserController.getInstance().getDestinationByName(acc_dest_combo_box.getSelectedItem().toString());
        place_id = dest.getID();
      }
      User user = UserController.getInstance().getUserByUsername(users_combo_box.getSelectedItem().toString());
      comment_field.setText(UserController.getInstance().getCommentByUserIDandPlaceID(user.getID(), place_id));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }//GEN-LAST:event_users_combo_boxItemStateChanged

  private void type_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_type_combo_boxItemStateChanged
    // TODO add your handling code here:
    comment_field.setText("");
    String type = type_combo_box.getSelectedItem().toString();
    acc_dest_combo_box.removeAllItems();
    users_combo_box.removeAllItems();
    if (type.equals("Accommodation")) {
      try {
        ArrayList<Accommodation> list = UserController.getInstance().getAllAccommodations();
        for(Accommodation acc : list) {
          acc_dest_combo_box.addItem(acc.getName());
        }
        Accommodation first = list.get(0);
        double average_rating = UserController.getInstance().getRatingByPlaceID(first.getID());
        average_rating_label.setText("Average rating: " + average_rating);
        ArrayList<Integer> users_list = UserController.getInstance().getAllUsersThatRatedPlaceByPlaceID(first.getID());
        if(users_list != null) {
          System.out.println("uslo");
          for(int user_id : users_list) {
            User user = UserController.getInstance().getUserByUserID(user_id);
            users_combo_box.addItem(user.getUsername());
          }
          int rating = UserController.getInstance().getRatingByUserIDandPlaceID(users_list.get(0), first.getID());
          user_rated_label.setText("User rated: " + rating);
          comment_field.setText(UserController.getInstance().getCommentByUserIDandPlaceID(users_list.get(0), first.getID()));
        } else {
          user_rated_label.setText("User rated: --");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    } else {
      try {
        ArrayList<Destination> list = UserController.getInstance().getAllDestinations();
        for(Destination dest : list) {
          acc_dest_combo_box.addItem(dest.getName());
        }
        Destination first = list.get(0);
        double average_rating = UserController.getInstance().getRatingByPlaceID(first.getID());
        average_rating_label.setText("Average rating: " + average_rating);
        ArrayList<Integer> users_list = UserController.getInstance().getAllUsersThatRatedPlaceByPlaceID(first.getID());
        if(users_list != null) {
          System.out.println("uslo");
          for(int user_id : users_list) {
            User user = UserController.getInstance().getUserByUserID(user_id);
            users_combo_box.addItem(user.getUsername());
          }
          int rating = UserController.getInstance().getRatingByUserIDandPlaceID(users_list.get(0), first.getID());
          user_rated_label.setText("User rated: " + rating);
          comment_field.setText(UserController.getInstance().getCommentByUserIDandPlaceID(users_list.get(0), first.getID()));
        } else {
          user_rated_label.setText("User rated: --");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }//GEN-LAST:event_type_combo_boxItemStateChanged

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(ManageRatingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ManageRatingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ManageRatingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ManageRatingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ManageRatingsForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> acc_dest_combo_box;
  private javax.swing.JLabel acc_dest_label1;
  private javax.swing.JLabel average_rating_label;
  private javax.swing.JButton back_button;
  private javax.swing.JMenuBar bookmarks_menu_bar;
  private javax.swing.JLabel choose_rating_label1;
  private javax.swing.JLabel choose_rating_label2;
  private javax.swing.JTextPane comment_field;
  private javax.swing.JButton delete_button;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JMenu menu_bar_logout;
  private javax.swing.JLabel name_label;
  private javax.swing.JComboBox<String> type_combo_box;
  private javax.swing.JLabel user_rated_label;
  private javax.swing.JComboBox<String> users_combo_box;
  // End of variables declaration//GEN-END:variables
}
