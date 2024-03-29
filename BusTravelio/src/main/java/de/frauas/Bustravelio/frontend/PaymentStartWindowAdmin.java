/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.frauas.Bustravelio.frontend;

import com.toedter.calendar.JDateChooser;
import de.frauas.Bustravelio.backend.DBHandler;
import de.frauas.Bustravelio.backend.Encryption;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author haith
 */
public class PaymentStartWindowAdmin extends javax.swing.JFrame {
    String username2;
    /**
     * Creates new form PaymentStartWindow
     */
    public PaymentStartWindowAdmin() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendLuxcoinButton = new javax.swing.JButton();
        giveCodeButton = new javax.swing.JButton();
        showStryButton = new javax.swing.JButton();
        userNameTextField = new javax.swing.JTextField();
        LuxcoinLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        showStoryLabel = new javax.swing.JLabel();
        giveCodeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sendLuxcoinLabel = new javax.swing.JLabel();
        changingLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        labelfrom = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        welcomeUSERLabel = new javax.swing.JLabel();
        fromDatabaseLabel = new javax.swing.JLabel();
        changingButton = new javax.swing.JButton();
        userManagmentButton = new javax.swing.JButton();
        codeGeneratorButton = new javax.swing.JButton();
        passwordLabel1 = new javax.swing.JLabel();
        passordTextField = new javax.swing.JTextField();
        userNameLabel1 = new javax.swing.JLabel();
        SetCoinLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To TravelioCoin Payment Menu Admin");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sendLuxcoinButton.setBackground(new java.awt.Color(0, 0, 0));
        sendLuxcoinButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        sendLuxcoinButton.setForeground(new java.awt.Color(255, 255, 255));
        sendLuxcoinButton.setText("Send TravelioCoins");
        sendLuxcoinButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        sendLuxcoinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendLuxcoinButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sendLuxcoinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 423, 160, 50));

        giveCodeButton.setBackground(new java.awt.Color(0, 0, 0));
        giveCodeButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        giveCodeButton.setForeground(new java.awt.Color(255, 255, 255));
        giveCodeButton.setText("Give Code");
        giveCodeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        giveCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveCodeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(giveCodeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 140, 40));

        showStryButton.setBackground(new java.awt.Color(0, 0, 0));
        showStryButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        showStryButton.setForeground(new java.awt.Color(255, 255, 255));
        showStryButton.setText("Show");
        showStryButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        showStryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(showStryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 140, 40));

        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 310, 50));

        LuxcoinLabel1.setFont(new java.awt.Font("Ayuthaya", 1, 36)); // NOI18N
        LuxcoinLabel1.setForeground(new java.awt.Color(255, 255, 255));
        LuxcoinLabel1.setText("TravelioCoin");
        getContentPane().add(LuxcoinLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 54));

        jLabel3.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Payment now one step easier ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 390, -1));

        showStoryLabel.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        showStoryLabel.setText("Click on Button \"Show\" to show your Payment story :");
        getContentPane().add(showStoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 450, -1));

        giveCodeLabel.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        giveCodeLabel.setText("Click on Button \"Give Code\" to give a code of Luxcoin coupon :");
        getContentPane().add(giveCodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 540, -1));

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel2.setText("*The person should be registred in Luxpyment. Else the operation well be unsuccessfully.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 620, -1));

        sendLuxcoinLabel.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        sendLuxcoinLabel.setText("Click on Button \"Send TravelioCoins\" to send luxcoins to your Friends and Familiy :");
        getContentPane().add(sendLuxcoinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 680, -1));

        changingLabel.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        changingLabel.setText("To change password or other information, give your current Login data and click on \"Change Credentials \":");
        getContentPane().add(changingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 880, 30));

        infoLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        infoLabel.setText("Tipp : Do you know, that you can get your Luxcoins as mony in euro € in Luxbus station.");
        getContentPane().add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 710, 620, -1));

        labelfrom.setFont(new java.awt.Font("Avenir Next", 0, 48)); // NOI18N
        labelfrom.setText("BusTravelio ");
        getContentPane().add(labelfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 820, 270, -1));

        jLabel4.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jLabel4.setText("Your current coins: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(254, 245, 245));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(47, 62, 96));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeUSERLabel.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        welcomeUSERLabel.setForeground(new java.awt.Color(254, 245, 245));
        welcomeUSERLabel.setText("welcome Username Luxpayment ");
        kGradientPanel1.add(welcomeUSERLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 180, 40));

        fromDatabaseLabel.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        fromDatabaseLabel.setForeground(new java.awt.Color(254, 245, 245));
        kGradientPanel1.add(fromDatabaseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 160, 40));

        changingButton.setBackground(new java.awt.Color(0, 0, 0));
        changingButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        changingButton.setForeground(new java.awt.Color(255, 255, 255));
        changingButton.setText("Change Credentials");
        changingButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        changingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changingButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(changingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, 230, 50));

        userManagmentButton.setBackground(new java.awt.Color(0, 0, 0));
        userManagmentButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        userManagmentButton.setForeground(new java.awt.Color(255, 255, 255));
        userManagmentButton.setText("User Managment");
        userManagmentButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        userManagmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userManagmentButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(userManagmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 640, 200, 50));

        codeGeneratorButton.setBackground(new java.awt.Color(0, 0, 0));
        codeGeneratorButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        codeGeneratorButton.setForeground(new java.awt.Color(255, 255, 255));
        codeGeneratorButton.setText("Code generator");
        codeGeneratorButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        codeGeneratorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeGeneratorButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(codeGeneratorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 640, 200, 50));

        passwordLabel1.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        passwordLabel1.setText("Password");
        kGradientPanel1.add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 165, -1));

        passordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passordTextFieldActionPerformed(evt);
            }
        });
        kGradientPanel1.add(passordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 310, 50));

        userNameLabel1.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        userNameLabel1.setText("Username");
        kGradientPanel1.add(userNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 179, -1));

        SetCoinLabel.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        SetCoinLabel.setForeground(new java.awt.Color(254, 245, 245));
        kGradientPanel1.add(SetCoinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, 250, 70));

        closeButton.setBackground(new java.awt.Color(0, 0, 0));
        closeButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("Back");
        closeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 30, 140, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giveCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveCodeButtonActionPerformed
         
        GiveCouponUser mycode = new  GiveCouponUser(username2);
         mycode.setVisible(true);
         
    }//GEN-LAST:event_giveCodeButtonActionPerformed

    @SuppressWarnings("empty-statement")
    private void changingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changingButtonActionPerformed
        String username = userNameTextField.getText();
        String password = passordTextField.getText();
        Encryption enc= new Encryption(password);
        String hash= enc.HaschCode();
        if(userNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"please enter your Username");
        }
        else if(passordTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"please enter your password");
        }
       ResultSet checkSec= mydbhandler.SelectData2colmn("paymentUsers", "usernamep", "passwordp",username,hash);
       if (mydbhandler.checkstatmentExsist(checkSec))
       {
           System.out.println(username);
           
           try {
            System.out.println(username);
            Updating myRegister = new Updating(username2);
            myRegister.setVisible(true);
            String firstname = mydbhandler.SelectdataP("firstnamep", "usernamep", username);
            String lastname = mydbhandler.SelectdataP("lastnamep", "usernamep", username);
            String userN = username;//db.SelectdataP("paymentUsers","usernamep", "usernamep",username);
            String Pass = mydbhandler.SelectdataP("passwordp", "usernamep", username);
            String address = mydbhandler.SelectdataP("addressp", "usernamep", username);
            String date = mydbhandler.SelectdataP("DOBp", "usernamep", username);
            String email= mydbhandler.SelectdataP("emailp", "usernamep", username);
            Encryption enc2= new Encryption(Pass);
            String hash2= enc.HaschCode();
            myRegister.SetDate(userN, firstname, lastname, hash2, email, address, date);
            
           } catch (SQLException ex) {
               Logger.getLogger(PaymentStartWindowAdmin.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else {
           JOptionPane.showMessageDialog(null,"E-Mail or passwor are not correct");
       }
        //CreateAccountPayment myRegister= new CreateAccountPayment();
        //myRegister.SetDate(userN,firstname, lastname,Pass,email, address,date);
    }//GEN-LAST:event_changingButtonActionPerformed

    public void Setcurrentamount(String username2) {
        this.username2=username2;
        String currentamount = null;
        int counter = 0;
        try {
            currentamount = mydbhandler.SelectPriceFromUsers("currentp", "usernamep", username2);
            counter = mydbhandler.Selectcount();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentStartWindowAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(currentamount);
        SetCoinLabel.setText(currentamount +" Coins");
        welcomeUSERLabel.setText("Welcome " + username2+" in Luxpayment");
        fromDatabaseLabel.setText("do you know that more than "+ (counter - 1)+" persons are using Luxpayment");
    }
    private void passordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passordTextFieldActionPerformed

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void sendLuxcoinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendLuxcoinButtonActionPerformed
        SendLuxcoin start = new SendLuxcoin(username2);
        start.setVisible(true);
    }//GEN-LAST:event_sendLuxcoinButtonActionPerformed

    private void showStryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStryButtonActionPerformed
        ShowNow start = new ShowNow(username2);
        start.setVisible(true);
    }//GEN-LAST:event_showStryButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void userManagmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userManagmentButtonActionPerformed
        UsermanagementPayment start = new UsermanagementPayment(username);
        start.setVisible(true);
    }//GEN-LAST:event_userManagmentButtonActionPerformed

    private void codeGeneratorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeGeneratorButtonActionPerformed
        CodegeneratorForAdmin code = new CodegeneratorForAdmin();
        code.setVisible(true);
    }//GEN-LAST:event_codeGeneratorButtonActionPerformed

    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LuxcoinLabel1;
    public javax.swing.JLabel SetCoinLabel;
    private javax.swing.JButton changingButton;
    private javax.swing.JLabel changingLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton codeGeneratorButton;
    public javax.swing.JLabel fromDatabaseLabel;
    private javax.swing.JButton giveCodeButton;
    private javax.swing.JLabel giveCodeLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel labelfrom;
    private javax.swing.JTextField passordTextField;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JButton sendLuxcoinButton;
    private javax.swing.JLabel sendLuxcoinLabel;
    private javax.swing.JLabel showStoryLabel;
    private javax.swing.JButton showStryButton;
    private javax.swing.JButton userManagmentButton;
    private javax.swing.JLabel userNameLabel1;
    private javax.swing.JTextField userNameTextField;
    public javax.swing.JLabel welcomeUSERLabel;
    // End of variables declaration//GEN-END:variables
String username, password;
DBHandler mydbhandler= new DBHandler();

}
