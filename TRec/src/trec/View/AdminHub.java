/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.View;

import javax.swing.JFrame;

/**
 *
 * @author basic
 */
public class AdminHub extends javax.swing.JFrame {

  /**
   * Creates new form AdminHub
   */
  public AdminHub() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    adminhub_back_button = new javax.swing.JButton();
    adminhub_manage_users_button = new javax.swing.JButton();
    adminhub_manage_hotels_button = new javax.swing.JButton();
    adminhub_manage_destinations_button = new javax.swing.JButton();
    adminhub_manage_evaluations_button = new javax.swing.JButton();
    adminhub_statistics_button = new javax.swing.JButton();
    adminhub_adminhub_label = new javax.swing.JLabel();
    adminhub_manage_countries_button = new javax.swing.JButton();
    adminhub_manage_cities_button = new javax.swing.JButton();
    adminhub_menu_bar = new javax.swing.JMenuBar();
    adminhub_menu_bar_logout = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    adminhub_back_button.setText("Back");
    adminhub_back_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        adminhub_back_buttonMouseClicked(evt);
      }
    });

    adminhub_manage_users_button.setText("Manage users");
    adminhub_manage_users_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        adminhub_manage_users_buttonMouseClicked(evt);
      }
    });
    adminhub_manage_users_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        adminhub_manage_users_buttonActionPerformed(evt);
      }
    });

    adminhub_manage_hotels_button.setText("Manage accommodations");
    adminhub_manage_hotels_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        adminhub_manage_hotels_buttonMouseClicked(evt);
      }
    });

    adminhub_manage_destinations_button.setText("Manage destinations");
    adminhub_manage_destinations_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        adminhub_manage_destinations_buttonMouseClicked(evt);
      }
    });

    adminhub_manage_evaluations_button.setText("Manage hotel evaluations");
    adminhub_manage_evaluations_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        adminhub_manage_evaluations_buttonMouseClicked(evt);
      }
    });

    adminhub_statistics_button.setText("See statistics");
    adminhub_statistics_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        adminhub_statistics_buttonMouseClicked(evt);
      }
    });

    adminhub_adminhub_label.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    adminhub_adminhub_label.setText("Admin Hub");

    adminhub_manage_countries_button.setText("Manage countries");
    adminhub_manage_countries_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        adminhub_manage_countries_buttonMouseClicked(evt);
      }
    });

    adminhub_manage_cities_button.setText("Manage cities");
    adminhub_manage_cities_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        adminhub_manage_cities_buttonMouseClicked(evt);
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
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(adminhub_manage_evaluations_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(adminhub_statistics_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(adminhub_manage_hotels_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(adminhub_manage_users_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(adminhub_manage_destinations_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(adminhub_back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(adminhub_manage_countries_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(adminhub_manage_cities_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(101, 101, 101)
            .addComponent(adminhub_adminhub_label)))
        .addContainerGap(33, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addComponent(adminhub_adminhub_label)
        .addGap(18, 18, 18)
        .addComponent(adminhub_manage_users_button)
        .addGap(18, 18, 18)
        .addComponent(adminhub_statistics_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(18, 18, 18)
        .addComponent(adminhub_manage_hotels_button)
        .addGap(18, 18, 18)
        .addComponent(adminhub_manage_evaluations_button)
        .addGap(18, 18, 18)
        .addComponent(adminhub_manage_destinations_button)
        .addGap(18, 18, 18)
        .addComponent(adminhub_manage_countries_button)
        .addGap(18, 18, 18)
        .addComponent(adminhub_manage_cities_button)
        .addGap(18, 18, 18)
        .addComponent(adminhub_back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(19, Short.MAX_VALUE))
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

  private void adminhub_back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_back_buttonMouseClicked
    // TODO add your handling code here:
    AppHomeForm app_home_form = new AppHomeForm();
    app_home_form.setVisible(true);
    app_home_form.pack();
    app_home_form.setLocationRelativeTo(null);
    app_home_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_adminhub_back_buttonMouseClicked

  private void adminhub_manage_users_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_manage_users_buttonMouseClicked
    // TODO add your handling code here:
    EditProfileFormAdmin editProfileFormAdmin = new EditProfileFormAdmin();
    editProfileFormAdmin.setVisible(true);
    editProfileFormAdmin.pack();
    editProfileFormAdmin.setLocationRelativeTo(null);
    editProfileFormAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_adminhub_manage_users_buttonMouseClicked

  private void adminhub_manage_hotels_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_manage_hotels_buttonMouseClicked
    // TODO add your handling code here:
    ManageAccommodations manage_accommodations = new ManageAccommodations();
    manage_accommodations.setVisible(true);
    manage_accommodations.pack();
    manage_accommodations.setLocationRelativeTo(null);
    manage_accommodations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_adminhub_manage_hotels_buttonMouseClicked

  private void adminhub_manage_destinations_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_manage_destinations_buttonMouseClicked
    // TODO add your handling code here:
    ManageDestinations manage_destinations = new ManageDestinations();
    manage_destinations.setVisible(true);
    manage_destinations.pack();
    manage_destinations.setLocationRelativeTo(null);
    manage_destinations.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_adminhub_manage_destinations_buttonMouseClicked

  private void adminhub_manage_evaluations_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_manage_evaluations_buttonMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_adminhub_manage_evaluations_buttonMouseClicked

  private void adminhub_statistics_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_statistics_buttonMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_adminhub_statistics_buttonMouseClicked

  private void adminhub_manage_countries_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_manage_countries_buttonMouseClicked
    // TODO add your handling code here:
    ManageCountries manage_countries = new ManageCountries();
    manage_countries.setVisible(true);
    manage_countries.pack();
    manage_countries.setLocationRelativeTo(null);
    manage_countries.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_adminhub_manage_countries_buttonMouseClicked

  private void adminhub_manage_cities_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhub_manage_cities_buttonMouseClicked
    // TODO add your handling code here:
    ManageCities manage_cities = new ManageCities();
    manage_cities.setVisible(true);
    manage_cities.pack();
    manage_cities.setLocationRelativeTo(null);
    manage_cities.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_adminhub_manage_cities_buttonMouseClicked

  private void adminhub_manage_users_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminhub_manage_users_buttonActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_adminhub_manage_users_buttonActionPerformed

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
      java.util.logging.Logger.getLogger(AdminHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(AdminHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(AdminHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(AdminHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AdminHub().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel adminhub_adminhub_label;
  private javax.swing.JButton adminhub_back_button;
  private javax.swing.JButton adminhub_manage_cities_button;
  private javax.swing.JButton adminhub_manage_countries_button;
  private javax.swing.JButton adminhub_manage_destinations_button;
  private javax.swing.JButton adminhub_manage_evaluations_button;
  private javax.swing.JButton adminhub_manage_hotels_button;
  private javax.swing.JButton adminhub_manage_users_button;
  private javax.swing.JMenuBar adminhub_menu_bar;
  private javax.swing.JMenu adminhub_menu_bar_logout;
  private javax.swing.JButton adminhub_statistics_button;
  // End of variables declaration//GEN-END:variables
}
