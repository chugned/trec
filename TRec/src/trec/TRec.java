/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import trec.View.LoginForm;

/**
 *
 * @author basic
 */
public class TRec extends JApplet {
  
  private static final int JFXPANEL_WIDTH_INT = 300;
  private static final int JFXPANEL_HEIGHT_INT = 250;
  private static JFXPanel fxContainer;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      
      @Override
      public void run() {
//        try {
//          UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//        } catch (Exception e) {
//        }
//        
//        JFrame frame = new JFrame("JavaFX 2 in Swing");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        JApplet applet = new TRec();
//        applet.init();
//        
//        frame.setContentPane(applet.getContentPane());
//        
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//        
//        applet.start();
      
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Platform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Platform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Platform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Platform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      LoginForm login_form = new LoginForm();
      login_form.setVisible(true);
      login_form.pack();
      login_form.setLocationRelativeTo(null);
      login_form.setSize(444, 224);
      login_form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      this.setVisible(false);
      }
    });
  }
  
  @Override
  public void init() {
    fxContainer = new JFXPanel();
    fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
    add(fxContainer, BorderLayout.CENTER);
    // create JavaFX scene
    Platform.runLater(new Runnable() {
      
      @Override
      public void run() {
        createScene();
      }
    });
  }
  
  private void createScene() {
    Button btn = new Button();
    btn.setText("Say 'Hello World'");
    btn.setOnAction(new EventHandler<ActionEvent>() {
      
      @Override
      public void handle(ActionEvent event) {
        System.out.println("Hello World!");
      }
    });
    StackPane root = new StackPane();
    root.getChildren().add(btn);
    fxContainer.setScene(new Scene(root));
  }
  
}
