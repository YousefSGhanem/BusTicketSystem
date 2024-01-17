/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.frauas.Bustravelio.frontend;

import de.frauas.Bustravelio.backend.DBHandler;
import de.frauas.Bustravelio.backend.Encryption;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author haith
 */
public class Updating extends javax.swing.JFrame {
String username2;
    /**
     * Creates new form CreateAccountPayment
     * @param username2
     */
    public Updating(String username2) {
        this.username2 = username2;
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

        addressPaymentTextField = new javax.swing.JTextField();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        usernamePaymentTextField = new javax.swing.JTextField();
        firstNamePaymentTextField = new javax.swing.JTextField();
        lastNamePaymentTextField = new javax.swing.JTextField();
        PasswordPaymentTextField = new javax.swing.JPasswordField();
        eMailPaymentTextField = new javax.swing.JTextField();
        UserNamePaymentLabel1 = new javax.swing.JLabel();
        firstNamePaymentLable1 = new javax.swing.JLabel();
        lastNamePaymentLabel1 = new javax.swing.JLabel();
        AddressPaymentLabel1 = new javax.swing.JLabel();
        eMailPaymentLabel1 = new javax.swing.JLabel();
        rewritePasswordPaymentLabel1 = new javax.swing.JLabel();
        labelfrom = new javax.swing.JLabel();
        LuxcoinLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign up TravelioCoin");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(addressPaymentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 200, 30));

        kGradientPanel1.setkEndColor(new java.awt.Color(254, 245, 245));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(47, 62, 96));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        jLabel1.setText("Hello "+username2);
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 160, 40));

        usernamePaymentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamePaymentTextFieldActionPerformed(evt);
            }
        });
        kGradientPanel1.add(usernamePaymentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 200, 30));

        firstNamePaymentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNamePaymentTextFieldActionPerformed(evt);
            }
        });
        kGradientPanel1.add(firstNamePaymentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 200, 30));
        kGradientPanel1.add(lastNamePaymentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 200, 30));
        kGradientPanel1.add(PasswordPaymentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 200, 30));
        kGradientPanel1.add(eMailPaymentTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 200, 30));

        UserNamePaymentLabel1.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        UserNamePaymentLabel1.setText("Username:");
        kGradientPanel1.add(UserNamePaymentLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 100, -1));

        firstNamePaymentLable1.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        firstNamePaymentLable1.setText("First name:");
        kGradientPanel1.add(firstNamePaymentLable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 94, -1));

        lastNamePaymentLabel1.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        lastNamePaymentLabel1.setText("Last name:");
        kGradientPanel1.add(lastNamePaymentLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 94, -1));

        AddressPaymentLabel1.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        AddressPaymentLabel1.setText("Address:");
        kGradientPanel1.add(AddressPaymentLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 94, -1));

        eMailPaymentLabel1.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        eMailPaymentLabel1.setText("E-Mail Address:");
        kGradientPanel1.add(eMailPaymentLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        rewritePasswordPaymentLabel1.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        rewritePasswordPaymentLabel1.setText("Password :");
        kGradientPanel1.add(rewritePasswordPaymentLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 94, -1));

        labelfrom.setFont(new java.awt.Font("Avenir Next", 0, 36)); // NOI18N
        labelfrom.setText("BusTravelio");
        kGradientPanel1.add(labelfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 200, 50));

        LuxcoinLabel1.setFont(new java.awt.Font("Ayuthaya", 1, 36)); // NOI18N
        LuxcoinLabel1.setForeground(new java.awt.Color(255, 255, 255));
        LuxcoinLabel1.setText("TravelioCoin");
        kGradientPanel1.add(LuxcoinLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 54));

        jLabel3.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Payment now one step easier");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 390, -1));

        updateButton.setBackground(new java.awt.Color(0, 0, 0));
        updateButton.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 140, 50));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNamePaymentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNamePaymentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNamePaymentTextFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        boolean Validate= EmailValidator.getInstance().isValid(eMailPaymentTextField.getText());
        
        if( Validate== false)
        {
              JOptionPane.showMessageDialog(null, "Please enter a valid E-Mail address!","ERROR", JOptionPane.ERROR_MESSAGE); 
        }
        else
        {
            String password = PasswordPaymentTextField.getText();
            String confirmationPassword= PasswordPaymentTextField.getText();
            Encryption enc= new Encryption(password);
            String hash= enc.HaschCode();
            DBHandler mydbhandler= new DBHandler();
            
            boolean updateUser= true;
       
       //System.out.println(password+ " "+confirmationPassword);
            if(!password.equals(confirmationPassword))
            {
                JOptionPane.showMessageDialog(null, "Password and Password Confirmation are not equal!","ERROR", JOptionPane.ERROR_MESSAGE);
                updateUser=false;
            }
       
            //get information to insert them in DB newUser
       
            String firstname= firstNamePaymentTextField.getText();
            String lastname= lastNamePaymentTextField.getText();
            String username= usernamePaymentTextField.getText();
            String email= eMailPaymentTextField.getText();
            String address = addressPaymentTextField.getText();
    //        String dob = ((JTextField)choosenDeparture.getDateEditor().getUiComponent()).getText();

                //jDateChooser1.get;
        
            if( updateUser){
                mydbhandler.UpdatePayment(firstname, lastname, username, hash, address,/* dob,*/ email, username2);
                JOptionPane.showMessageDialog(null, "Successfully updated","INFO", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void usernamePaymentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamePaymentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamePaymentTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressPaymentLabel1;
    private javax.swing.JLabel LuxcoinLabel1;
    public static javax.swing.JPasswordField PasswordPaymentTextField;
    private javax.swing.JLabel UserNamePaymentLabel1;
    public static javax.swing.JTextField addressPaymentTextField;
    private javax.swing.JLabel eMailPaymentLabel1;
    public static javax.swing.JTextField eMailPaymentTextField;
    private javax.swing.JLabel firstNamePaymentLable1;
    public javax.swing.JTextField firstNamePaymentTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel labelfrom;
    private javax.swing.JLabel lastNamePaymentLabel1;
    public static javax.swing.JTextField lastNamePaymentTextField;
    private javax.swing.JLabel rewritePasswordPaymentLabel1;
    public static javax.swing.JButton updateButton;
    public static javax.swing.JTextField usernamePaymentTextField;
    // End of variables declaration//GEN-END:variables

    //For PaymentStartWindow changing
    
    public void SetDate(String userN,String firstname, String lastname,String Pass,String email, String address,String date){
            usernamePaymentTextField.setText(userN);
            eMailPaymentTextField.setText(Pass);
            PasswordPaymentTextField.setText(Pass);
            lastNamePaymentTextField.setText(lastname);
            firstNamePaymentTextField.setText(firstname);
            eMailPaymentTextField.setText(email);
            addressPaymentTextField.setText(address);
    }
}
