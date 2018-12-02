/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.View;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import trec.Controller.UserController;
import trec.Model.Country;

/**
 *
 * @author basic
 */
public class ManageCountries extends javax.swing.JFrame {

  /**
   * Creates new form AddCity
   */
  public ManageCountries() {
    initComponents();
    ArrayList<Country> country_list = UserController.getInstance().getCountrys();
    if(!country_list.isEmpty()) {
      country_list.forEach((country) -> {
        country_combo_box.addItem(country.getName());
      });
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

    back_button = new javax.swing.JButton();
    delete_button = new javax.swing.JButton();
    add_country_button = new javax.swing.JButton();
    choose_country_label = new javax.swing.JLabel();
    country_combo_box = new javax.swing.JComboBox<>();
    destinations_list_label = new javax.swing.JLabel();
    manage_cities_button = new javax.swing.JButton();
    manage_destinations_button = new javax.swing.JButton();
    manage_accommodations_button = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    new_field = new javax.swing.JTextPane();
    accommondations_menu_bar = new javax.swing.JMenuBar();
    acommondations_menu_bar_logout = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

    add_country_button.setText("Add country");
    add_country_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        add_country_buttonMouseClicked(evt);
      }
    });

    choose_country_label.setText("Choose a country to delete:");

    country_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        country_combo_boxItemStateChanged(evt);
      }
    });

    destinations_list_label.setText("or add a new country:");

    manage_cities_button.setText("Manage cities");
    manage_cities_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        manage_cities_buttonMouseClicked(evt);
      }
    });

    manage_destinations_button.setText("Manage destinations");
    manage_destinations_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        manage_destinations_buttonMouseClicked(evt);
      }
    });

    manage_accommodations_button.setText("Manage accommodations");
    manage_accommodations_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        manage_accommodations_buttonMouseClicked(evt);
      }
    });

    jScrollPane1.setViewportView(new_field);

    acommondations_menu_bar_logout.setText("Logout");
    acommondations_menu_bar_logout.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        acommondations_menu_bar_logoutMouseClicked(evt);
      }
    });
    accommondations_menu_bar.add(acommondations_menu_bar_logout);

    setJMenuBar(accommondations_menu_bar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addGap(17, 17, 17)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(destinations_list_label)
                .addComponent(choose_country_label)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
              .addContainerGap()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(back_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(manage_cities_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(manage_accommodations_button, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(manage_destinations_button, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
              .addComponent(delete_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(add_country_button, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(country_combo_box, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addComponent(choose_country_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(country_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(destinations_list_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(47, 47, 47)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(back_button)
          .addComponent(add_country_button))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(manage_cities_button)
          .addComponent(delete_button))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(manage_destinations_button)
          .addComponent(manage_accommodations_button))
        .addContainerGap(16, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void acommondations_menu_bar_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acommondations_menu_bar_logoutMouseClicked
    // TODO add your handling code here:
    LoginForm login_form = new LoginForm();
    login_form.setVisible(true);
    login_form.pack();
    login_form.setLocationRelativeTo(null);
    login_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_acommondations_menu_bar_logoutMouseClicked

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
    Country country = UserController
            .getInstance()
            .getCountryByName(country_combo_box.getSelectedItem().toString());
    UserController.getInstance().deleteCountry(country);
    JOptionPane.showMessageDialog(null, "Country deleted!", "Success!", JOptionPane.INFORMATION_MESSAGE);
    refresh();
  }//GEN-LAST:event_delete_buttonMouseClicked

  private void refresh() {
    ManageCountries manage_countries = new ManageCountries();
    manage_countries.setVisible(true);
    manage_countries.pack();
    manage_countries.setLocationRelativeTo(null);
    manage_countries.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }
  
  private void add_country_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_country_buttonMouseClicked
    // TODO add your handling code here:
    String name = new_field.getText();
    if(name.equals("")) {
      JOptionPane.showMessageDialog(null, "Cannot add a country with no name.", "Error!", JOptionPane.ERROR_MESSAGE);
    } else {
      Country country = new Country(name);
      if(UserController.getInstance().addCountry(country))
        JOptionPane.showMessageDialog(null, "Country added!", "Success!", JOptionPane.INFORMATION_MESSAGE);
      else
        JOptionPane.showMessageDialog(null, "Country already exists!", "Error!", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_add_country_buttonMouseClicked

  private void country_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_country_combo_boxItemStateChanged
    // TODO add your handling code here:
  }//GEN-LAST:event_country_combo_boxItemStateChanged

  private void manage_cities_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_cities_buttonMouseClicked
    // TODO add your handling code here:
    ManageCities manage_cities = new ManageCities();
    manage_cities.setVisible(true);
    manage_cities.pack();
    manage_cities.setLocationRelativeTo(null);
    manage_cities.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_manage_cities_buttonMouseClicked

  private void manage_destinations_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_destinations_buttonMouseClicked
    // TODO add your handling code here:
    ManageDestinations manage_destinations = new ManageDestinations();
    manage_destinations.setVisible(true);
    manage_destinations.pack();
    manage_destinations.setLocationRelativeTo(null);
    manage_destinations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_manage_destinations_buttonMouseClicked

  private void manage_accommodations_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_accommodations_buttonMouseClicked
    // TODO add your handling code here:
    ManageAccommodations manage_accommodations = new ManageAccommodations();
    manage_accommodations.setVisible(true);
    manage_accommodations.pack();
    manage_accommodations.setLocationRelativeTo(null);
    manage_accommodations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_manage_accommodations_buttonMouseClicked

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
      java.util.logging.Logger.getLogger(ManageCountries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ManageCountries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ManageCountries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ManageCountries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ManageCountries().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar accommondations_menu_bar;
  private javax.swing.JMenu acommondations_menu_bar_logout;
  private javax.swing.JButton add_country_button;
  private javax.swing.JButton back_button;
  private javax.swing.JLabel choose_country_label;
  private javax.swing.JComboBox<String> country_combo_box;
  private javax.swing.JButton delete_button;
  private javax.swing.JLabel destinations_list_label;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton manage_accommodations_button;
  private javax.swing.JButton manage_cities_button;
  private javax.swing.JButton manage_destinations_button;
  private javax.swing.JTextPane new_field;
  // End of variables declaration//GEN-END:variables
}
