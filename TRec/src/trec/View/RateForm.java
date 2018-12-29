/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import trec.Controller.UserController;

/**
 *
 * @author basic
 */
public class RateForm extends javax.swing.JFrame {

  private int place_id_;
  /**
   * Creates new form RateForm
   */
  
  public RateForm() {
    initComponents();
    menu_bar_adminhub.setVisible(UserController.getInstance().getCurrentUser().isAdmin());
  }
  
  public RateForm(int place_id) {
    initComponents();
    menu_bar_adminhub.setVisible(UserController.getInstance().getCurrentUser().isAdmin());
    this.place_id_ = place_id;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    choose_rating_label = new javax.swing.JLabel();
    rate_combo_box = new javax.swing.JComboBox<>();
    jScrollPane1 = new javax.swing.JScrollPane();
    comment_field = new javax.swing.JTextPane();
    save_button = new javax.swing.JButton();
    back_button = new javax.swing.JButton();
    choose_rating_label1 = new javax.swing.JLabel();
    bookmarks_menu_bar = new javax.swing.JMenuBar();
    menu_bar_logout = new javax.swing.JMenu();
    menu_bar_adminhub = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    choose_rating_label.setText("Choose the rating:");

    rate_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
    rate_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        rate_combo_boxItemStateChanged(evt);
      }
    });

    jScrollPane1.setViewportView(comment_field);

    save_button.setText("Save");
    save_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        save_buttonMouseClicked(evt);
      }
    });

    back_button.setText("Back");
    back_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        back_buttonMouseClicked(evt);
      }
    });

    choose_rating_label1.setText("Add a comment:");

    menu_bar_logout.setText("Logout");
    menu_bar_logout.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        menu_bar_logoutMouseClicked(evt);
      }
    });
    bookmarks_menu_bar.add(menu_bar_logout);

    menu_bar_adminhub.setText("AdminHub");
    menu_bar_adminhub.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        menu_bar_adminhubMouseClicked(evt);
      }
    });
    bookmarks_menu_bar.add(menu_bar_adminhub);

    setJMenuBar(bookmarks_menu_bar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(choose_rating_label)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rate_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(choose_rating_label1))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(rate_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(choose_rating_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(9, 9, 9)
        .addComponent(choose_rating_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(back_button)
          .addComponent(save_button))
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

  private void menu_bar_adminhubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_bar_adminhubMouseClicked
    // TODO add your handling code here:
    AdminHub admin_hub = new AdminHub();
    admin_hub.setVisible(true);
    admin_hub.pack();
    admin_hub.setLocationRelativeTo(null);
    admin_hub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_menu_bar_adminhubMouseClicked

  private void rate_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rate_combo_boxItemStateChanged
    // TODO add your handling code here:
  }//GEN-LAST:event_rate_combo_boxItemStateChanged

  private void save_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseClicked
    // TODO add your handling code here:
    try {
      String comment = comment_field.getText();
      if(!comment.equals("")) {
        int rating = Integer.parseInt(rate_combo_box.getSelectedItem().toString());
        UserController.getInstance().addRating(UserController.getInstance().getCurrentUser().getID(), place_id_, rating, comment);
        JOptionPane.showMessageDialog(null, "Rating added!", "Success!", JOptionPane.INFORMATION_MESSAGE);
        back_buttonMouseClicked(null);
      } else {
        JOptionPane.showMessageDialog(null, "Please add a comment!", "No comment!", JOptionPane.ERROR_MESSAGE);
      }
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }//GEN-LAST:event_save_buttonMouseClicked

  private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
    // TODO add your handling code here:
    BookmarksForm bookmarks_form = new BookmarksForm();
    bookmarks_form.setVisible(true);
    bookmarks_form.pack();
    bookmarks_form.setLocationRelativeTo(null);
    bookmarks_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_back_buttonMouseClicked

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
      java.util.logging.Logger.getLogger(RateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RateForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton back_button;
  private javax.swing.JMenuBar bookmarks_menu_bar;
  private javax.swing.JLabel choose_rating_label;
  private javax.swing.JLabel choose_rating_label1;
  private javax.swing.JTextPane comment_field;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JMenu menu_bar_adminhub;
  private javax.swing.JMenu menu_bar_logout;
  private javax.swing.JComboBox<String> rate_combo_box;
  private javax.swing.JButton save_button;
  // End of variables declaration//GEN-END:variables
}