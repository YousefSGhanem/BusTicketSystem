/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.frauas.Bustravelio.frontend;

import de.frauas.Bustravelio.backend.DBHandler;
import de.frauas.Bustravelio.backend.Encryption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author haith
 */
public class PaymentLogin extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public PaymentLogin() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        LuxcoinLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsernamejLabel2 = new javax.swing.JLabel();
        PasswordjLabel2 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        showpasssowrd = new javax.swing.JCheckBox();
        loginButton = new javax.swing.JButton();
        createAccountButton = new javax.swing.JButton();
        WelcomeLabla = new javax.swing.JLabel();
        labelfrom = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign In TravelioCoin");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LuxcoinLabel1.setFont(new java.awt.Font("Ayuthaya", 1, 36)); // NOI18N
        LuxcoinLabel1.setForeground(new java.awt.Color(255, 255, 255));
        LuxcoinLabel1.setText("TravelioCoin");
        getContentPane().add(LuxcoinLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 54));

        jLabel3.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Payment now one step easier ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 390, -1));

        UsernamejLabel2.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        UsernamejLabel2.setText("Username:");
        getContentPane().add(UsernamejLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 101, -1));

        PasswordjLabel2.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        PasswordjLabel2.setText("Password:");
        getContentPane().add(PasswordjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 90, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(254, 245, 245));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(47, 62, 96));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        kGradientPanel1.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 310, 50));

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        kGradientPanel1.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 310, 50));

        showpasssowrd.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        showpasssowrd.setText("show password");
        showpasssowrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasssowrdActionPerformed(evt);
            }
        });
        kGradientPanel1.add(showpasssowrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 149, -1));

        loginButton.setBackground(new java.awt.Color(0, 0, 0));
        loginButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Sign In");
        loginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 140, 40));

        createAccountButton.setBackground(new java.awt.Color(0, 0, 0));
        createAccountButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        createAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        createAccountButton.setText("Sign Up");
        createAccountButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(createAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 140, 40));

        WelcomeLabla.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        WelcomeLabla.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeLabla.setText("Welcome");
        WelcomeLabla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WelcomeLabla.setMaximumSize(new java.awt.Dimension(142, 20));
        WelcomeLabla.setPreferredSize(new java.awt.Dimension(120, 30));
        kGradientPanel1.add(WelcomeLabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 180, -1));

        labelfrom.setFont(new java.awt.Font("Avenir Next", 0, 36)); // NOI18N
        labelfrom.setText("BusTravelio ");
        kGradientPanel1.add(labelfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 230, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 140, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        //new PaymentStartWindow().setVisible(true);
        String pw = passwordTextField.getText();
        Encryption enc = new Encryption(pw);
        String hash= enc.HaschCode();
        DBHandler mydbhandler= new DBHandler();
        ResultSet checkSec= mydbhandler.SelectData2colmn("paymentUsers", "usernamep", "passwordp",usernameTextField.getText(),hash);
        if(usernameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"please enter a valid Username");
        }
        else if(passwordTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"please enter a valid password");
        }
        else if (!mydbhandler.checkstatmentExsist(checkSec))
        {
            JOptionPane.showMessageDialog(null,"Username or passwor are not correct");
        }
        else {
            /*
            try {
                mydbhandler.SelectData2colmn("paymentUsers", "usernamep", "passwordp",usernameTextField.getText(),hash).close();
            } catch (SQLException ex) {
                Logger.getLogger(PaymentLogin.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            ResultSet checkAdmin = mydbhandler.checkAdminPayment(usernameTextField.getText());
            if (!mydbhandler.checkstatmentExsist(checkAdmin))
            {
               dispose();
               PaymentStartWindow payment = new PaymentStartWindow();
               payment.setVisible(true);
               payment.Setcurrentamount(usernameTextField.getText());
               
            }
            else {
               dispose();
               PaymentStartWindowAdmin payment2 = new PaymentStartWindowAdmin();
               payment2.setVisible(true);
               payment2.Setcurrentamount(usernameTextField.getText());
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

 
    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        CreateAccountPayment myAccount= new CreateAccountPayment();
        myAccount.setVisible(true);
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void showpasssowrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasssowrdActionPerformed
        showpasssowrd.isSelected();
       if (evt.getSource() == showpasssowrd) {
            if (showpasssowrd.isSelected()) {
                passwordTextField.setEchoChar((char) 0);
            }
            else {
                passwordTextField.setEchoChar('*');
            } 
         }
    }//GEN-LAST:event_showpasssowrdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LuxcoinLabel1;
    private javax.swing.JLabel PasswordjLabel2;
    private javax.swing.JLabel UsernamejLabel2;
    private javax.swing.JLabel WelcomeLabla;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel labelfrom;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JCheckBox showpasssowrd;
    public static javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

}
