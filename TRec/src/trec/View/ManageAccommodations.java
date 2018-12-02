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
import trec.Model.Accommodation;
import trec.Model.City;
import trec.Model.Country;
import trec.Model.Database;

/**
 *
 * @author basic
 */
public class ManageAccommodations extends javax.swing.JFrame {
  private Country current_country_;
  /**
   * Creates new form InterestThemes
   */
  public ManageAccommodations() {
    initComponents();
    ArrayList<Country> country_list = UserController.getInstance().getCountrys();
    country_list.forEach((country) -> {
      country_combo_box.addItem(country.getName());
    });
    current_country_ = country_list.get(0);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    choose_country_label = new javax.swing.JLabel();
    country_combo_box = new javax.swing.JComboBox<>();
    choose_city_label = new javax.swing.JLabel();
    city_combo_box = new javax.swing.JComboBox<>();
    destinations_list_label = new javax.swing.JLabel();
    accommodations_list_combo_box = new javax.swing.JComboBox<>();
    jScrollPane1 = new javax.swing.JScrollPane();
    desc_field = new javax.swing.JTextPane();
    back_button = new javax.swing.JButton();
    update_button = new javax.swing.JButton();
    delete_button = new javax.swing.JButton();
    adminhub_menu_bar = new javax.swing.JMenuBar();
    adminhub_menu_bar_logout = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    choose_country_label.setText("Choose country:");

    country_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        country_combo_boxItemStateChanged(evt);
      }
    });

    choose_city_label.setText("Choose city:");

    city_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        city_combo_boxItemStateChanged(evt);
      }
    });

    destinations_list_label.setText("List of accommodations:");

    accommodations_list_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        accommodations_list_combo_boxItemStateChanged(evt);
      }
    });

    jScrollPane1.setViewportView(desc_field);

    back_button.setText("Back");
    back_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        back_buttonMouseClicked(evt);
      }
    });

    update_button.setText("Update");
    update_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        update_buttonMouseClicked(evt);
      }
    });

    delete_button.setText("Delete");
    delete_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        delete_buttonMouseClicked(evt);
      }
    });

    adminhub_menu_bar_logout.setText("Logout");
    adminhub_menu_bar_logout.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        adminhub_menu_bar_logoutMouseClicked(evt);
      }
    });
    adminhub_menu_bar.add(adminhub_menu_bar_logout);

    setJMenuBar(adminhub_menu_bar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addGroup(layout.createSequentialGroup()
              .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(27, 27, 27)
              .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(33, 33, 33)
              .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(choose_city_label, javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(choose_country_label)
                .addComponent(destinations_list_label))
              .addGap(28, 28, 28)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(accommodations_list_combo_box, 0, 255, Short.MAX_VALUE)
                .addComponent(city_combo_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(country_combo_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        .addContainerGap(17, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(choose_country_label)
          .addComponent(country_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(choose_city_label)
          .addComponent(city_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(destinations_list_label)
          .addComponent(accommodations_list_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(back_button)
          .addComponent(update_button)
          .addComponent(delete_button))
        .addContainerGap(16, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void adminhub_menu_bar_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_menu_bar_logoutMouseClicked
    // TODO add your handling code here:
    LoginForm login_form = new LoginForm();
    login_form.setVisible(true);
    login_form.pack();
    login_form.setLocationRelativeTo(null);
    login_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_adminhub_menu_bar_logoutMouseClicked

  private void country_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_country_combo_boxItemStateChanged
    // TODO add your handling code here:
    String current_country_name = country_combo_box.getSelectedItem().toString();
    current_country_ = UserController.getInstance().getCountryByName(current_country_name);
    ArrayList<City> city_list = current_country_.getCities();
    city_combo_box.removeAllItems();
    city_list.forEach((city) -> {
      city_combo_box.addItem(city.getName());
    });
    accommodations_list_combo_box.removeAllItems();
    ArrayList<Accommodation> accommodation_list = city_list.get(0).getAccommodations();
    if(accommodation_list.isEmpty()) {
      desc_field.setText("No item selected.");
    } else {
      accommodation_list.forEach((accommodation) -> {
        accommodations_list_combo_box.addItem(accommodation.getName());
      });
      desc_field.setText(accommodation_list.get(0).getDescription());
    }
  }//GEN-LAST:event_country_combo_boxItemStateChanged

  private void city_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_city_combo_boxItemStateChanged
    // TODO add your handling code here:
    ArrayList<City> city_list = current_country_.getCities();
    int index = city_combo_box.getSelectedIndex();
    City current_city;
    if(index >= 0) {
      current_city = city_list.get(index);
      accommodations_list_combo_box.removeAllItems();
      ArrayList<Accommodation> accommodation_list = current_city.getAccommodations();
      if(!accommodation_list.isEmpty()) {
        accommodation_list.forEach((accommodation) -> {
         accommodations_list_combo_box.addItem(accommodation.getName());
        });
        desc_field.setText(accommodation_list.get(0).getDescription());
      } else {
        desc_field.setText("No item selected");
      }
    } else {
      desc_field.setText("No item selected");
    }
      
  }//GEN-LAST:event_city_combo_boxItemStateChanged

  private void accommodations_list_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_accommodations_list_combo_boxItemStateChanged
    // TODO add your handling code here:
    ArrayList<City> city_list = current_country_.getCities();
    City current_city = city_list.get(city_combo_box.getSelectedIndex());
    ArrayList<Accommodation> accommodation_list = current_city.getAccommodations();
    int index = accommodations_list_combo_box.getSelectedIndex();
    if(index >= 0)
      desc_field.setText(accommodation_list.get(index).getDescription());
    else
      desc_field.setText("No item selected.");
  }//GEN-LAST:event_accommodations_list_combo_boxItemStateChanged

  private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
    // TODO add your handling code here:
    AdminHub admin_hub = new AdminHub();
    admin_hub.setVisible(true);
    admin_hub.pack();
    admin_hub.setLocationRelativeTo(null);
    admin_hub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_back_buttonMouseClicked

  private void update_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_buttonMouseClicked
    // TODO add your handling code here:
    Accommodation accommodation = new Accommodation();
    if(accommodations_list_combo_box.getItemCount() >= 0) {
      accommodation.setName(accommodations_list_combo_box.getSelectedItem().toString());
      accommodation.setDescription(desc_field.getText());
      ArrayList<City> city_list = current_country_.getCities();
      City city = null;
      for(City it : city_list) {
        if(it.getName().equals(city_combo_box.getSelectedItem().toString())) {
          city = it;
          break;
        }
      }
      UserController.getInstance().updateAccommodation(current_country_, city, accommodation);
      JOptionPane.showMessageDialog(null, "Accommodation updated!", "Success!", JOptionPane.INFORMATION_MESSAGE);
      country_combo_boxItemStateChanged(null);
    } else {
      JOptionPane.showMessageDialog(null, "Cannot update, there is no accommodation selected.", "Error!", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_update_buttonMouseClicked

  private void delete_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_buttonMouseClicked
    // TODO add your handling code here:
    Accommodation accommodation = new Accommodation();
    if(accommodations_list_combo_box.getItemCount() >= 0) {
      accommodation.setName(accommodations_list_combo_box.getSelectedItem().toString());
      accommodation.setDescription(desc_field.getText());
      ArrayList<City> city_list = current_country_.getCities();
      City city = null;
      for(City it : city_list) {
        if(it.getName().equals(city_combo_box.getSelectedItem().toString())) {
          city = it;
          break;
        }
      }
      UserController.getInstance().deleteAccommodation(current_country_, city, accommodation);
      JOptionPane.showMessageDialog(null, "Accommodation deleted!", "Success!", JOptionPane.INFORMATION_MESSAGE);
      country_combo_boxItemStateChanged(null);
    } else {
      JOptionPane.showMessageDialog(null, "Cannot delete, there is no accommodation selected.", "Error!", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_delete_buttonMouseClicked

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
      java.util.logging.Logger.getLogger(ManageAccommodations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ManageAccommodations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ManageAccommodations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ManageAccommodations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ManageAccommodations().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> accommodations_list_combo_box;
  private javax.swing.JMenuBar adminhub_menu_bar;
  private javax.swing.JMenu adminhub_menu_bar_logout;
  private javax.swing.JButton back_button;
  private javax.swing.JLabel choose_city_label;
  private javax.swing.JLabel choose_country_label;
  private javax.swing.JComboBox<String> city_combo_box;
  private javax.swing.JComboBox<String> country_combo_box;
  private javax.swing.JButton delete_button;
  private javax.swing.JTextPane desc_field;
  private javax.swing.JLabel destinations_list_label;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton update_button;
  // End of variables declaration//GEN-END:variables
}
