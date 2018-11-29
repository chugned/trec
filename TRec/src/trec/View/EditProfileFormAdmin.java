/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import trec.Controller.UserController;
import trec.Model.Helper;
import trec.Model.User;

/**
 *
 * @author basic
 */
public class EditProfileFormAdmin extends javax.swing.JFrame {
  private String old_username;
  private Helper helper = new Helper();
  /**
   * Creates new form EditProfileForm
   */
  public EditProfileFormAdmin() {
    initComponents();
    for(User user : UserController.getInstance().getUsers()) {
      users_combo_box.addItem(user.getUsername());      
    }
    User selected_user = UserController.getInstance().getUserByUsername(users_combo_box.getSelectedItem().toString());
    first_name_field.setText(selected_user.getFirstName());
    last_name_field.setText(selected_user.getLastName());
    email_field.setText(selected_user.getEmail());
    username_field.setText(selected_user.getUsername());
    old_username = selected_user.getUsername();
    password_field.setText(selected_user.getPassword());
    gender_field.setText(selected_user.getGender());
    age_field.setText(String.valueOf(selected_user.getAge()));
    occupation_field.setText(selected_user.getOccupation());
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    save_button = new javax.swing.JButton();
    choose_user_label = new javax.swing.JLabel();
    users_combo_box = new javax.swing.JComboBox<>();
    jScrollPane1 = new javax.swing.JScrollPane();
    first_name_field = new javax.swing.JTextPane();
    cancel_button = new javax.swing.JButton();
    first_name_label = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    last_name_field = new javax.swing.JTextPane();
    last_name_label = new javax.swing.JLabel();
    jScrollPane3 = new javax.swing.JScrollPane();
    email_field = new javax.swing.JTextPane();
    email_label = new javax.swing.JLabel();
    username_label = new javax.swing.JLabel();
    password_label = new javax.swing.JLabel();
    jScrollPane5 = new javax.swing.JScrollPane();
    password_field = new javax.swing.JTextPane();
    jScrollPane6 = new javax.swing.JScrollPane();
    gender_field = new javax.swing.JTextPane();
    gender_label = new javax.swing.JLabel();
    jScrollPane7 = new javax.swing.JScrollPane();
    age_field = new javax.swing.JTextPane();
    age_label = new javax.swing.JLabel();
    jScrollPane8 = new javax.swing.JScrollPane();
    occupation_field = new javax.swing.JTextPane();
    occupation_label = new javax.swing.JLabel();
    jScrollPane4 = new javax.swing.JScrollPane();
    username_field = new javax.swing.JTextPane();
    home_menu_bar = new javax.swing.JMenuBar();
    destinations_menu_bar_logout = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    save_button.setText("Save");
    save_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        save_buttonMouseClicked(evt);
      }
    });

    choose_user_label.setText("Choose a user:");

    users_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        users_combo_boxItemStateChanged(evt);
      }
    });

    jScrollPane1.setViewportView(first_name_field);

    cancel_button.setText("Cancel");
    cancel_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cancel_buttonMouseClicked(evt);
      }
    });

    first_name_label.setText("First name:");

    jScrollPane2.setViewportView(last_name_field);

    last_name_label.setText("Last name:");

    jScrollPane3.setViewportView(email_field);

    email_label.setText("Email:");

    username_label.setText("Username:");

    password_label.setText("Password:");

    jScrollPane5.setViewportView(password_field);

    jScrollPane6.setViewportView(gender_field);

    gender_label.setText("Gender:");

    jScrollPane7.setViewportView(age_field);

    age_label.setText("Age:");

    jScrollPane8.setViewportView(occupation_field);

    occupation_label.setText("Occupation:");

    jScrollPane4.setViewportView(username_field);

    destinations_menu_bar_logout.setText("Logout");
    destinations_menu_bar_logout.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        destinations_menu_bar_logoutMouseClicked(evt);
      }
    });
    home_menu_bar.add(destinations_menu_bar_logout);

    setJMenuBar(home_menu_bar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(29, 29, 29)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
            .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(occupation_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
              .addComponent(password_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(gender_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(age_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(32, 32, 32)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
              .addComponent(jScrollPane8)
              .addComponent(jScrollPane6)
              .addComponent(jScrollPane5)))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(choose_user_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(first_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(last_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(email_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(username_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(32, 32, 32)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jScrollPane3)
              .addComponent(users_combo_box, 0, 217, Short.MAX_VALUE)
              .addComponent(jScrollPane2)
              .addComponent(jScrollPane1)
              .addComponent(jScrollPane4))))
        .addContainerGap(34, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(choose_user_label)
          .addComponent(users_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane1)
          .addComponent(first_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jScrollPane2)
          .addComponent(last_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(gender_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(occupation_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(50, 50, 50)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cancel_button)
          .addComponent(save_button))
        .addContainerGap(19, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void save_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseClicked
    // TODO add your handling code here:
    User changed_user = new User();
    if(!username_field.getText().equals("")) {
      if(!password_field.getText().equals("")) {
        changed_user.setFirstName(first_name_field.getText());
        changed_user.setLastName(last_name_field.getText());
        changed_user.setEmail(email_field.getText());
        changed_user.setUsername(username_field.getText());
        changed_user.setPassword(password_field.getText());
        String gender = gender_field.getText();
        if(gender.equals("Male") || gender.equals("Female")) {
          changed_user.setGender(gender_field.getText());
          String age = age_field.getText();
          if(helper.isNumeric(age)) {
            changed_user.setAge(Integer.parseInt(age));
            changed_user.setOccupation(occupation_field.getText());
            UserController.getInstance().updateUser(changed_user, old_username);
            old_username = username_field.getText();
            JOptionPane.showMessageDialog(null, "User data successfully changed!", "Success", JOptionPane.INFORMATION_MESSAGE);
          } else {
            JOptionPane.showMessageDialog(null, "Please enter valid age format.", "Age format error", JOptionPane.INFORMATION_MESSAGE);
          }
        } else {
          JOptionPane.showMessageDialog(null, "Gender can either be \"Male\" or \"Female\"", "Gender error", JOptionPane.INFORMATION_MESSAGE);
        }
      } else {
        JOptionPane.showMessageDialog(null, "Please enter a valid password.", "Passwrod error", JOptionPane.INFORMATION_MESSAGE);
      }
    } else {
      JOptionPane.showMessageDialog(null, "Please enter a valid username.", "Username error", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_save_buttonMouseClicked

  private void cancel_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_buttonMouseClicked
    // TODO add your handling code here:
    AppHomeForm app_home_form = new AppHomeForm();
    app_home_form.setVisible(true);
    app_home_form.pack();
    app_home_form.setLocationRelativeTo(null);
    app_home_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_cancel_buttonMouseClicked

  private void destinations_menu_bar_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinations_menu_bar_logoutMouseClicked
    // TODO add your handling code here:
    LoginForm login_form = new LoginForm();
    login_form.setVisible(true);
    login_form.pack();
    login_form.setLocationRelativeTo(null);
    login_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_destinations_menu_bar_logoutMouseClicked

  private void users_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_users_combo_boxItemStateChanged
    // TODO add your handling code here:
    User selected_user = UserController.getInstance().getUserByUsername(users_combo_box.getSelectedItem().toString());
    first_name_field.setText(selected_user.getFirstName());
    last_name_field.setText(selected_user.getLastName());
    email_field.setText(selected_user.getEmail());
    username_field.setText(selected_user.getUsername());
    old_username = selected_user.getUsername();
    password_field.setText(selected_user.getPassword());
    gender_field.setText(selected_user.getGender());
    age_field.setText(String.valueOf(selected_user.getAge()));
    occupation_field.setText(selected_user.getOccupation());
  }//GEN-LAST:event_users_combo_boxItemStateChanged

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
      java.util.logging.Logger.getLogger(EditProfileFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(EditProfileFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(EditProfileFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(EditProfileFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new EditProfileFormAdmin().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextPane age_field;
  private javax.swing.JLabel age_label;
  private javax.swing.JButton cancel_button;
  private javax.swing.JLabel choose_user_label;
  private javax.swing.JMenu destinations_menu_bar_logout;
  private javax.swing.JTextPane email_field;
  private javax.swing.JLabel email_label;
  private javax.swing.JTextPane first_name_field;
  private javax.swing.JLabel first_name_label;
  private javax.swing.JTextPane gender_field;
  private javax.swing.JLabel gender_label;
  private javax.swing.JMenuBar home_menu_bar;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JScrollPane jScrollPane5;
  private javax.swing.JScrollPane jScrollPane6;
  private javax.swing.JScrollPane jScrollPane7;
  private javax.swing.JScrollPane jScrollPane8;
  private javax.swing.JTextPane last_name_field;
  private javax.swing.JLabel last_name_label;
  private javax.swing.JTextPane occupation_field;
  private javax.swing.JLabel occupation_label;
  private javax.swing.JTextPane password_field;
  private javax.swing.JLabel password_label;
  private javax.swing.JButton save_button;
  private javax.swing.JTextPane username_field;
  private javax.swing.JLabel username_label;
  private javax.swing.JComboBox<String> users_combo_box;
  // End of variables declaration//GEN-END:variables
}
