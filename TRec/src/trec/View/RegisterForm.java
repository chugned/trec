/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.View;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import trec.Controller.UserController;
import trec.Model.Database;
import trec.Model.Helper;
import trec.Model.User;

/**
 *
 * @author basic
 */
public class RegisterForm extends javax.swing.JFrame {

  /**
   * Creates new form RegisterForm
   */
  public RegisterForm() {
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

    register_back_button = new javax.swing.JButton();
    register_register_button = new javax.swing.JButton();
    register_first_name_field = new javax.swing.JFormattedTextField();
    register_last_name_field = new javax.swing.JFormattedTextField();
    register_username_field = new javax.swing.JFormattedTextField();
    register_password_field = new javax.swing.JPasswordField();
    register_reenter_password_field = new javax.swing.JPasswordField();
    register_gender_combo_box = new javax.swing.JComboBox<>();
    register_age_field = new javax.swing.JFormattedTextField();
    register_occupation_field = new javax.swing.JFormattedTextField();
    register_first_name_label = new javax.swing.JLabel();
    register_last_name_label = new javax.swing.JLabel();
    register_username_label = new javax.swing.JLabel();
    register_password_label = new javax.swing.JLabel();
    register_reenter_password_label = new javax.swing.JLabel();
    register_gender_label = new javax.swing.JLabel();
    register_age_label = new javax.swing.JLabel();
    register_occupation_label = new javax.swing.JLabel();
    register_welcome_label = new javax.swing.JLabel();
    register_email_label = new javax.swing.JLabel();
    register_email_field = new javax.swing.JFormattedTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    register_back_button.setText("Back");
    register_back_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        register_back_buttonMouseClicked(evt);
      }
    });
    register_back_button.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        register_back_buttonKeyPressed(evt);
      }
    });

    register_register_button.setText("Register");
    register_register_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        register_register_buttonMouseClicked(evt);
      }
    });
    register_register_button.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        register_register_buttonKeyPressed(evt);
      }
    });

    register_reenter_password_field.setToolTipText("");
    register_reenter_password_field.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        register_reenter_password_fieldActionPerformed(evt);
      }
    });

    register_gender_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

    register_occupation_field.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        register_occupation_fieldKeyPressed(evt);
      }
    });

    register_first_name_label.setText("First name:");

    register_last_name_label.setText("Last name:");

    register_username_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    register_username_label.setText("Username:");

    register_password_label.setText("Password:");

    register_reenter_password_label.setText("Re-enter password:");

    register_gender_label.setText("Gender:");

    register_age_label.setText("Age:");

    register_occupation_label.setText("Occupation:");

    register_welcome_label.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    register_welcome_label.setText("Enter your data below:");

    register_email_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    register_email_label.setText("Email:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(43, 43, 43)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(register_first_name_label)
          .addComponent(register_last_name_label)
          .addComponent(register_password_label)
          .addComponent(register_reenter_password_label)
          .addComponent(register_age_label)
          .addComponent(register_occupation_label)
          .addComponent(register_username_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(register_email_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(register_gender_label))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(register_age_field, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(register_gender_combo_box, javax.swing.GroupLayout.Alignment.LEADING, 0, 218, Short.MAX_VALUE)
          .addComponent(register_reenter_password_field, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(register_password_field, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(register_username_field, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(register_email_field, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(register_last_name_field, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(register_first_name_field, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(register_occupation_field))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(register_welcome_label)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(61, Short.MAX_VALUE)
        .addComponent(register_back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(110, 110, 110)
        .addComponent(register_register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(61, 61, 61))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(register_welcome_label)
        .addGap(36, 36, 36)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(register_first_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(register_first_name_label))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(register_last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(register_last_name_label))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(register_email_label)
          .addComponent(register_email_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(register_username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(register_username_label))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(register_password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(register_password_label))
            .addGap(18, 18, 18)
            .addComponent(register_reenter_password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(register_reenter_password_label))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(register_gender_label)
          .addComponent(register_gender_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(register_age_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(register_age_label))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(register_occupation_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(register_occupation_label))
        .addGap(41, 41, 41)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(register_back_button)
          .addComponent(register_register_button))
        .addContainerGap(23, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void register_back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_back_buttonMouseClicked
    // TODO add your handling code here:
    LoginForm login_form = new LoginForm();
    login_form.setVisible(true);
    login_form.pack();
    login_form.setLocationRelativeTo(null);
    login_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_register_back_buttonMouseClicked

  private void register_reenter_password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_reenter_password_fieldActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_register_reenter_password_fieldActionPerformed

  private void register_register_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_register_buttonMouseClicked
    // TODO add your handling code here:
    Helper helper = new Helper();
    
    if(register_first_name_field.getText().equals("") || 
            register_last_name_field.getText().equals("") ||
            register_email_field.getText().equals("") ||
            register_username_field.getText().equals("") ||
            register_age_field.getText().equals("") ||
            register_occupation_field.getText().equals(""))
    {
      JOptionPane.showMessageDialog(null, "Please enter all user data.", "Registration error", JOptionPane.ERROR_MESSAGE);
    } else if(String.copyValueOf(register_password_field.getPassword()).equals("") ||
            String.copyValueOf(register_reenter_password_field.getPassword()).equals("")) {
      JOptionPane.showMessageDialog(null, "Please enter password.", "Invalid password", JOptionPane.ERROR_MESSAGE);
    } else if(!String.copyValueOf(register_password_field.getPassword())
            .equals(String.copyValueOf(register_reenter_password_field.getPassword()))) {
      JOptionPane.showMessageDialog(null, "Passwords do not match.", "Invalid password", JOptionPane.ERROR_MESSAGE);
    } else if(!helper.isNumeric(register_age_field.getText())) {
      JOptionPane.showMessageDialog(null, "Please enter valid age.", "Invalid age", JOptionPane.ERROR_MESSAGE);
    } else if(UserController.getInstance().checkForUsername(register_username_field.getText())) {
      JOptionPane.showMessageDialog(null, "Username already exists!", "Registration error", JOptionPane.ERROR_MESSAGE);
    } else {
      User new_user = new User();
      new_user.setFirstName(register_first_name_field.getText());
      new_user.setLastName(register_last_name_field.getText());
      new_user.setEmail(register_email_field.getText());
      new_user.setUsername(register_username_field.getText());
      new_user.setPassword(String.copyValueOf(register_password_field.getPassword()));
      new_user.setGender(register_gender_combo_box.getName());
      new_user.setAge(Integer.parseInt(register_age_field.getText()));
      new_user.setOccupation(register_occupation_field.getText());
      UserController.getInstance().addUser(new_user);      
      JOptionPane.showMessageDialog(null, "Registration successful!", "Success!", JOptionPane.INFORMATION_MESSAGE);
      register_first_name_field.setText("");
      register_last_name_field.setText("");
      register_email_field.setText("");
      register_username_field.setText("");
      register_password_field.setText("");
      register_reenter_password_field.setText("");
      register_age_field.setText("");
      register_occupation_field.setText("");
    }
  }//GEN-LAST:event_register_register_buttonMouseClicked

  private void register_register_buttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_register_register_buttonKeyPressed
    // TODO add your handling code here:
    if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
      register_register_buttonMouseClicked(null);
    }
  }//GEN-LAST:event_register_register_buttonKeyPressed

  private void register_back_buttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_register_back_buttonKeyPressed
    // TODO add your handling code here:
    if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
      register_back_buttonMouseClicked(null);
    }
  }//GEN-LAST:event_register_back_buttonKeyPressed

  private void register_occupation_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_register_occupation_fieldKeyPressed
    // TODO add your handling code here:
    if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
      register_register_buttonMouseClicked(null);
    }
  }//GEN-LAST:event_register_occupation_fieldKeyPressed

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
      java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RegisterForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JFormattedTextField register_age_field;
  private javax.swing.JLabel register_age_label;
  private javax.swing.JButton register_back_button;
  private javax.swing.JFormattedTextField register_email_field;
  private javax.swing.JLabel register_email_label;
  private javax.swing.JFormattedTextField register_first_name_field;
  private javax.swing.JLabel register_first_name_label;
  private javax.swing.JComboBox<String> register_gender_combo_box;
  private javax.swing.JLabel register_gender_label;
  private javax.swing.JFormattedTextField register_last_name_field;
  private javax.swing.JLabel register_last_name_label;
  private javax.swing.JFormattedTextField register_occupation_field;
  private javax.swing.JLabel register_occupation_label;
  private javax.swing.JPasswordField register_password_field;
  private javax.swing.JLabel register_password_label;
  private javax.swing.JPasswordField register_reenter_password_field;
  private javax.swing.JLabel register_reenter_password_label;
  private javax.swing.JButton register_register_button;
  private javax.swing.JFormattedTextField register_username_field;
  private javax.swing.JLabel register_username_label;
  private javax.swing.JLabel register_welcome_label;
  // End of variables declaration//GEN-END:variables
}
