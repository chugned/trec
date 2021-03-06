/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.View;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import trec.Controller.UserController;
import trec.Model.Accommodation;
import trec.Model.Destination;

/**
 *
 * @author basic
 */
public class BindInteresThemesAndPlacesForm extends javax.swing.JFrame {
  private ArrayList<String> interest_themes_list = new ArrayList<>();
  private ArrayList<JCheckBox> checkboxes = new ArrayList<>();
  /**
   * Creates new form BindInteresThemesAndPlacesForm
   */
  public BindInteresThemesAndPlacesForm() {
    initComponents();
    try {
      // load ITs
      interest_themes_list = UserController.getInstance().getAllITs();
      jPanel2.setLayout(new GridLayout(0, 2, 10, 10));
      for (String it : interest_themes_list) {
        JCheckBox cb = new JCheckBox(it);
        checkboxes.add(cb);
        jPanel2.add(cb);
        jPanel2.revalidate();
        jPanel2.repaint();
      }
      // load accommodations
      ArrayList<Accommodation> accommodations = UserController.getInstance().getAllAccommodations();
      for(Accommodation acc : accommodations) {
        acc_dest_combo_box.addItem(acc.getName());
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

    acc_dest_label1 = new javax.swing.JLabel();
    bind_button = new javax.swing.JButton();
    back_button = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jPanel2 = new javax.swing.JPanel();
    type_combo_box = new javax.swing.JComboBox<>();
    acc_dest_combo_box = new javax.swing.JComboBox<>();
    bookmarks_menu_bar = new javax.swing.JMenuBar();
    menu_bar_logout = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    acc_dest_label1.setText("Bind interest themes to a place:");

    bind_button.setText("Bind");
    bind_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        bind_buttonMouseClicked(evt);
      }
    });

    back_button.setText("Back");
    back_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        back_buttonMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 269, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 167, Short.MAX_VALUE)
    );

    jScrollPane1.setViewportView(jPanel2);

    type_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accommodation", "Destination" }));
    type_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        type_combo_boxItemStateChanged(evt);
      }
    });

    acc_dest_combo_box.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        acc_dest_combo_boxItemStateChanged(evt);
      }
    });
    acc_dest_combo_box.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        acc_dest_combo_boxActionPerformed(evt);
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
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(bind_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(acc_dest_combo_box, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(back_button, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(type_combo_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(acc_dest_label1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
            .addGap(0, 10, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(acc_dest_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(type_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(acc_dest_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(bind_button)
            .addGap(18, 18, 18)
            .addComponent(back_button))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

  private void bind_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bind_buttonMouseClicked
    // TODO add your handling code here:
    try {
      if(type_combo_box.getSelectedItem().toString().equals("Accommodation")) {
        String name = acc_dest_combo_box.getSelectedItem().toString();
        Accommodation acc = UserController.getInstance().getAccommodationByName(name);
        UserController.getInstance().deleteAllConnectionsByPlaceID(acc.getID());
        for(JCheckBox ch : checkboxes) {
          if (ch.isSelected()) {
            int it_id = UserController.getInstance().getITIDByName(ch.getText());
            UserController.getInstance().bindPlaceAndIT(acc.getID(), it_id);
          }
        }
      } else {
        String name = acc_dest_combo_box.getSelectedItem().toString();
        Destination dest = UserController.getInstance().getDestinationByName(name);
        UserController.getInstance().deleteAllConnectionsByPlaceID(dest.getID());
        for(JCheckBox ch : checkboxes) {
          if (ch.isSelected()) {
            int it_id = UserController.getInstance().getITIDByName(ch.getText());
            UserController.getInstance().bindPlaceAndIT(dest.getID(), it_id);
          }
        }
      }
      JOptionPane.showMessageDialog(null, "Interest themes binded to " + acc_dest_combo_box.getSelectedItem().toString() + "!", "Success!", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }//GEN-LAST:event_bind_buttonMouseClicked

  private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
    // TODO add your handling code here:
    AdminHub admin_hub = new AdminHub();
    admin_hub.setVisible(true);
    admin_hub.pack();
    admin_hub.setLocationRelativeTo(null);
    admin_hub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
  }//GEN-LAST:event_back_buttonMouseClicked

  private void type_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_type_combo_boxItemStateChanged
    // TODO add your handling code here:
    acc_dest_combo_box.removeAllItems();
    try {
      if(type_combo_box.getSelectedItem().toString().equals("Accommodation")) {
        ArrayList<Accommodation> accommodations = UserController.getInstance().getAllAccommodations();
        for(Accommodation acc : accommodations) {
          acc_dest_combo_box.addItem(acc.getName());
        }
      } else {
        ArrayList<Destination> destinations = UserController.getInstance().getAllDestinations();
        for(Destination dest : destinations) {
          acc_dest_combo_box.addItem(dest.getName());
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }//GEN-LAST:event_type_combo_boxItemStateChanged

  private void acc_dest_combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_dest_combo_boxActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_acc_dest_combo_boxActionPerformed

  private void acc_dest_combo_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_acc_dest_combo_boxItemStateChanged
    // TODO add your handling code here:
    for(JCheckBox ch : checkboxes) { ch.setSelected(false); }
    try {
      String type = type_combo_box.getSelectedItem().toString();
      String name = acc_dest_combo_box.getSelectedItem().toString();
      int place_id = 0;
      if(type.equals("Accommodation")) {
        Accommodation acc = UserController.getInstance().getAccommodationByName(name);
        place_id = acc.getID();
      } else {
        Destination dest = UserController.getInstance().getDestinationByName(name);
        place_id = dest.getID();
      }
      ArrayList<Integer> checked_by_place = UserController.getInstance().getAllITsByPlaceID(place_id);
      if(!checked_by_place.isEmpty()) {
        for(int it_id : checked_by_place) {
          for(JCheckBox ch : checkboxes) {
            String it_name = UserController.getInstance().getITNameByID(it_id);
            if(it_name.equals(ch.getText())) {
              ch.setSelected(true);
            }
          }
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }//GEN-LAST:event_acc_dest_combo_boxItemStateChanged

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
      java.util.logging.Logger.getLogger(BindInteresThemesAndPlacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(BindInteresThemesAndPlacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(BindInteresThemesAndPlacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(BindInteresThemesAndPlacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new BindInteresThemesAndPlacesForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> acc_dest_combo_box;
  private javax.swing.JLabel acc_dest_label1;
  private javax.swing.JButton back_button;
  private javax.swing.JButton bind_button;
  private javax.swing.JMenuBar bookmarks_menu_bar;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JMenu menu_bar_logout;
  private javax.swing.JComboBox<String> type_combo_box;
  // End of variables declaration//GEN-END:variables
}
