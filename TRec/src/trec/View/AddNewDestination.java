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
import trec.Model.City;
import trec.Model.Country;
import trec.Model.Destination;

/**
 *
 * @author basic
 */
public class AddNewDestination extends javax.swing.JFrame {
  private Country current_country_;
  /**
   * Creates new form AddNewDestination
   */
  public AddNewDestination() {
    initComponents();
    ArrayList<Country> country_list = UserController.getInstance().getCountrys();
    if(!country_list.isEmpty()) {
      country_list.forEach((country) -> {
        country_combo_box.addItem(country.getName());
      });
      current_country_ = country_list.get(0);
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
    choose_country_label = new javax.swing.JLabel();
    country_combo_box = new javax.swing.JComboBox<>();
    add_button = new javax.swing.JButton();
    choose_city_label = new javax.swing.JLabel();
    city_combo_box = new javax.swing.JComboBox<>();
    destinations_list_label = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    desc_field = new javax.swing.JTextPane();
    destination_name_field = new javax.swing.JScrollPane();
    desc_field1 = new javax.swing.JTextPane();
    destinations_list_label1 = new javax.swing.JLabel();
    adminhub_menu_bar = new javax.swing.JMenuBar();
    adminhub_menu_bar_logout = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    back_button.setText("Back");
    back_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        back_buttonMouseClicked(evt);
      }
    });

    choose_country_label.setText("Choose country:");

    country_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        country_combo_boxItemStateChanged(evt);
      }
    });

    add_button.setText("Add");
    add_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        add_buttonMouseClicked(evt);
      }
    });

    choose_city_label.setText("Choose city:");

    city_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        city_combo_boxItemStateChanged(evt);
      }
    });

    destinations_list_label.setText("Destination name:");

    jScrollPane1.setViewportView(desc_field);

    destination_name_field.setViewportView(desc_field1);

    destinations_list_label1.setText("Destination description:");

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
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(choose_country_label)
              .addComponent(destinations_list_label))
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(country_combo_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(destination_name_field)))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(city_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(destinations_list_label1)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                  .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(181, 181, 181)
                  .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(choose_city_label, javax.swing.GroupLayout.Alignment.LEADING))
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(14, Short.MAX_VALUE))
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
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(destination_name_field)
          .addComponent(destinations_list_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(23, 23, 23)
        .addComponent(destinations_list_label1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(back_button)
          .addComponent(add_button))
        .addContainerGap(14, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
    // TODO add your handling code here:
    AdminHub admin_hub = new AdminHub();
    admin_hub.setVisible(true);
    admin_hub.pack();
    admin_hub.setLocationRelativeTo(null);
    admin_hub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_back_buttonMouseClicked

  private void country_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_country_combo_boxItemStateChanged
    // TODO add your handling code here:
    String current_country_name = country_combo_box.getSelectedItem().toString();
    current_country_ = UserController.getInstance().getCountryByName(current_country_name);
    city_combo_box.removeAllItems();
    ArrayList<City> city_list = current_country_.getCities();
    if(!city_list.isEmpty()) {
      city_list.forEach((city) -> {
        city_combo_box.addItem(city.getName());
      });
    }
  }//GEN-LAST:event_country_combo_boxItemStateChanged

  private void add_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_buttonMouseClicked
    // TODO add your handling code here:
    Destination destination = new Destination();
    if(city_combo_box.getItemCount() >= 0) {
      String name = desc_field1.getText();
      String description = desc_field.getText();
      if(name.equals("")) {
        JOptionPane.showMessageDialog(null, "Cannot add a destination without a name.", "Error!", JOptionPane.ERROR_MESSAGE);
      } else if(description.equals("")) {
        JOptionPane.showMessageDialog(null, "Cannot add a destination without description.", "Error!", JOptionPane.ERROR_MESSAGE);
      } else {
        destination.setName(name);
        destination.setDescription(description);
        ArrayList<City> city_list = current_country_.getCities();
        City city = null;
        for(City it : city_list) {
          if(it.getName().equals(city_combo_box.getSelectedItem().toString())) {
            city = it;
            break;
          }
        }
        if(UserController.getInstance().addDestination(current_country_, city, destination)) {
          JOptionPane.showMessageDialog(null, "Destination added!", "Success!", JOptionPane.INFORMATION_MESSAGE);
          desc_field.setText("");
          desc_field1.setText("");
          country_combo_boxItemStateChanged(null);
        } else {
          JOptionPane.showMessageDialog(null, "Destination already exists!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
      }
    } else {
      JOptionPane.showMessageDialog(null, "Cannot add, there is no destination selected.", "Error!", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_add_buttonMouseClicked

  private void city_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_city_combo_boxItemStateChanged
    // TODO add your handling code here:
  }//GEN-LAST:event_city_combo_boxItemStateChanged

  private void adminhub_menu_bar_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_menu_bar_logoutMouseClicked
    // TODO add your handling code here:
    LoginForm login_form = new LoginForm();
    login_form.setVisible(true);
    login_form.pack();
    login_form.setLocationRelativeTo(null);
    login_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_adminhub_menu_bar_logoutMouseClicked

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
      java.util.logging.Logger.getLogger(AddNewDestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(AddNewDestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(AddNewDestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(AddNewDestination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AddNewDestination().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton add_button;
  private javax.swing.JMenuBar adminhub_menu_bar;
  private javax.swing.JMenu adminhub_menu_bar_logout;
  private javax.swing.JButton back_button;
  private javax.swing.JLabel choose_city_label;
  private javax.swing.JLabel choose_country_label;
  private javax.swing.JComboBox<String> city_combo_box;
  private javax.swing.JComboBox<String> country_combo_box;
  private javax.swing.JTextPane desc_field;
  private javax.swing.JTextPane desc_field1;
  private javax.swing.JScrollPane destination_name_field;
  private javax.swing.JLabel destinations_list_label;
  private javax.swing.JLabel destinations_list_label1;
  private javax.swing.JScrollPane jScrollPane1;
  // End of variables declaration//GEN-END:variables
}
