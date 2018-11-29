/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.View;

import javax.swing.JFrame;
import trec.Controller.UserController;

/**
 *
 * @author basic
 */
public class AppHomeForm extends javax.swing.JFrame {

  /**
   * Creates new form AppHomeForm
   */
  public AppHomeForm() {
    initComponents();
    home_menu_bar_adminhub.setVisible(UserController.getInstance().getCurrentUser().isAdmin());
  }
  
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    home_welcome_label = new javax.swing.JLabel();
    home_search_destinations_button = new javax.swing.JButton();
    home_edit_profile_button = new javax.swing.JButton();
    home_evaluate_button = new javax.swing.JButton();
    home_statistics_button = new javax.swing.JButton();
    home_get_recommendations_button = new javax.swing.JButton();
    home_evaluate_hotels_button = new javax.swing.JButton();
    home_acommondations_button = new javax.swing.JButton();
    home_menu_bar = new javax.swing.JMenuBar();
    home_menu_bar_logout = new javax.swing.JMenu();
    home_menu_bar_adminhub = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    home_welcome_label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    home_welcome_label.setText("Welcome to T-REC! - A tourist recommendation system");

    home_search_destinations_button.setText("Search for destinations");
    home_search_destinations_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        home_search_destinations_buttonMouseClicked(evt);
      }
    });

    home_edit_profile_button.setText("Edit profile");
    home_edit_profile_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        home_edit_profile_buttonMouseClicked(evt);
      }
    });

    home_evaluate_button.setText("Evaluate interest themes");
    home_evaluate_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        home_evaluate_buttonMouseClicked(evt);
      }
    });

    home_statistics_button.setText("See statistics");
    home_statistics_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        home_statistics_buttonMouseClicked(evt);
      }
    });

    home_get_recommendations_button.setText("Get recommendations");
    home_get_recommendations_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        home_get_recommendations_buttonMouseClicked(evt);
      }
    });

    home_evaluate_hotels_button.setText("Evaluate hotels");
    home_evaluate_hotels_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        home_evaluate_hotels_buttonMouseClicked(evt);
      }
    });

    home_acommondations_button.setText("Search for accommondations");
    home_acommondations_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        home_acommondations_buttonMouseClicked(evt);
      }
    });

    home_menu_bar_logout.setText("Logout");
    home_menu_bar_logout.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        home_menu_bar_logoutMouseClicked(evt);
      }
    });
    home_menu_bar.add(home_menu_bar_logout);

    home_menu_bar_adminhub.setText("AdminHub");
    home_menu_bar_adminhub.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        home_menu_bar_adminhubMouseClicked(evt);
      }
    });
    home_menu_bar.add(home_menu_bar_adminhub);

    setJMenuBar(home_menu_bar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(home_welcome_label)
        .addContainerGap(37, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(home_statistics_button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(home_get_recommendations_button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(home_evaluate_hotels_button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(home_evaluate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(home_search_destinations_button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(home_acommondations_button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(home_edit_profile_button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(114, 114, 114))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(home_welcome_label)
        .addGap(18, 18, 18)
        .addComponent(home_edit_profile_button)
        .addGap(18, 18, 18)
        .addComponent(home_acommondations_button)
        .addGap(18, 18, 18)
        .addComponent(home_search_destinations_button)
        .addGap(18, 18, 18)
        .addComponent(home_evaluate_button)
        .addGap(18, 18, 18)
        .addComponent(home_evaluate_hotels_button)
        .addGap(18, 18, 18)
        .addComponent(home_get_recommendations_button)
        .addGap(18, 18, 18)
        .addComponent(home_statistics_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap(26, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

 
  private void home_search_destinations_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_search_destinations_buttonMouseClicked
    // TODO add your handling code here:
    DestinationsForm destinations_form = new DestinationsForm();
    destinations_form.setVisible(true);
    destinations_form.pack();
    destinations_form.setLocationRelativeTo(null);
    destinations_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_home_search_destinations_buttonMouseClicked

  private void home_edit_profile_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_edit_profile_buttonMouseClicked
    // TODO add your handling code here:
    if(UserController.getInstance().getCurrentUser().isAdmin()) {
      EditProfileFormAdmin editProfileFormAdmin = new EditProfileFormAdmin();
      editProfileFormAdmin.setVisible(true);
      editProfileFormAdmin.pack();
      editProfileFormAdmin.setLocationRelativeTo(null);
      editProfileFormAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.dispose();
    } else {
      EditProfileFormUser editProfileFormUser = new EditProfileFormUser();
      editProfileFormUser.setVisible(true);
      editProfileFormUser.pack();
      editProfileFormUser.setLocationRelativeTo(null);
      editProfileFormUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.dispose();
    }
  }//GEN-LAST:event_home_edit_profile_buttonMouseClicked

  private void home_evaluate_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_evaluate_buttonMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_home_evaluate_buttonMouseClicked

  private void home_statistics_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_statistics_buttonMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_home_statistics_buttonMouseClicked

  private void home_get_recommendations_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_get_recommendations_buttonMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_home_get_recommendations_buttonMouseClicked

  private void home_menu_bar_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_menu_bar_logoutMouseClicked
    // TODO add your handling code here:
    LoginForm login_form = new LoginForm();
    login_form.setVisible(true);
    login_form.pack();
    login_form.setLocationRelativeTo(null);
    login_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_home_menu_bar_logoutMouseClicked

  private void home_evaluate_hotels_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_evaluate_hotels_buttonMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_home_evaluate_hotels_buttonMouseClicked

  private void home_acommondations_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_acommondations_buttonMouseClicked
    // TODO add your handling code here:
    AccommondationsForm acmd_form = new AccommondationsForm();
    acmd_form.setVisible(true);
    acmd_form.pack();
    acmd_form.setLocationRelativeTo(null);
    acmd_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_home_acommondations_buttonMouseClicked

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
      java.util.logging.Logger.getLogger(AppHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(AppHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(AppHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(AppHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AppHomeForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton home_acommondations_button;
  private javax.swing.JButton home_edit_profile_button;
  private javax.swing.JButton home_evaluate_button;
  private javax.swing.JButton home_evaluate_hotels_button;
  private javax.swing.JButton home_get_recommendations_button;
  private javax.swing.JMenuBar home_menu_bar;
  private javax.swing.JMenu home_menu_bar_adminhub;
  private javax.swing.JMenu home_menu_bar_logout;
  private javax.swing.JButton home_search_destinations_button;
  private javax.swing.JButton home_statistics_button;
  private javax.swing.JLabel home_welcome_label;
  // End of variables declaration//GEN-END:variables
}
