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
public class RecommendationsForm extends javax.swing.JFrame {

  /**
   * Creates new form RecommendationsForm
   */
  public RecommendationsForm() {
    initComponents();
    try {
      User current_user = UserController.getInstance().getCurrentUser();
      ArrayList<String> places = UserController.getInstance().getRecommendations(current_user.getID());
      if(!places.isEmpty()) {
        for(String place : places) {
          places_combo_box.addItem(place);
        }
        Accommodation acc = UserController.getInstance().getAccommodationByName(places.get(0));
        if (acc != null) {
          desc_field.setText(acc.getDescription());
        } else {
          Destination dest = UserController.getInstance().getDestinationByName(places.get(0));
          desc_field.setText(dest.getDescription());
        }
      } else {
        desc_field.setText("No recommendations. Please evaluate interest themes.");
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

    jScrollPane1 = new javax.swing.JScrollPane();
    desc_field = new javax.swing.JTextPane();
    destinations_list_label = new javax.swing.JLabel();
    places_combo_box = new javax.swing.JComboBox<>();
    back_button = new javax.swing.JButton();
    adminhub_menu_bar = new javax.swing.JMenuBar();
    adminhub_menu_bar_logout = new javax.swing.JMenu();
    home_menu_bar_adminhub = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jScrollPane1.setViewportView(desc_field);

    destinations_list_label.setText("List of places reccommended according to your interested themes:");

    places_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        places_combo_boxItemStateChanged(evt);
      }
    });

    back_button.setText("Back");
    back_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        back_buttonMouseClicked(evt);
      }
    });

    adminhub_menu_bar_logout.setText("Logout");
    adminhub_menu_bar_logout.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        adminhub_menu_bar_logoutMouseClicked(evt);
      }
    });
    adminhub_menu_bar.add(adminhub_menu_bar_logout);

    home_menu_bar_adminhub.setText("AdminHub");
    home_menu_bar_adminhub.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        home_menu_bar_adminhubMouseClicked(evt);
      }
    });
    adminhub_menu_bar.add(home_menu_bar_adminhub);

    setJMenuBar(adminhub_menu_bar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(places_combo_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(destinations_list_label)
              .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(destinations_list_label)
        .addGap(18, 18, 18)
        .addComponent(places_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(back_button)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void places_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_places_combo_boxItemStateChanged
    // TODO add your handling code here:
    try {
      String name = places_combo_box.getSelectedItem().toString();
      Accommodation acc = UserController.getInstance().getAccommodationByName(name);
      if (acc != null) {
        desc_field.setText(acc.getDescription());
      } else {
        Destination dest = UserController.getInstance().getDestinationByName(name);
        desc_field.setText(dest.getDescription());
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }//GEN-LAST:event_places_combo_boxItemStateChanged

  private void adminhub_menu_bar_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_menu_bar_logoutMouseClicked
    // TODO add your handling code here:
    LoginForm login_form = new LoginForm();
    login_form.setVisible(true);
    login_form.pack();
    login_form.setLocationRelativeTo(null);
    login_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_adminhub_menu_bar_logoutMouseClicked

  private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
    // TODO add your handling code here:
    AppHomeForm form = new AppHomeForm();
    form.setVisible(true);
    form.pack();
    form.setLocationRelativeTo(null);
    form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_back_buttonMouseClicked

  private void home_menu_bar_adminhubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_menu_bar_adminhubMouseClicked
    // TODO add your handling code here:
    AdminHub admin_hub = new AdminHub();
    admin_hub.setVisible(true);
    admin_hub.pack();
    admin_hub.setLocationRelativeTo(null);
    admin_hub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_home_menu_bar_adminhubMouseClicked

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
      java.util.logging.Logger.getLogger(RecommendationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RecommendationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RecommendationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RecommendationsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RecommendationsForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar adminhub_menu_bar;
  private javax.swing.JMenu adminhub_menu_bar_logout;
  private javax.swing.JButton back_button;
  private javax.swing.JTextPane desc_field;
  private javax.swing.JLabel destinations_list_label;
  private javax.swing.JMenu home_menu_bar_adminhub;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JComboBox<String> places_combo_box;
  // End of variables declaration//GEN-END:variables
}
