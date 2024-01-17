/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.frauas.Bustravelio.frontend;

import de.frauas.Bustravelio.frontend.LastBook;
import de.frauas.Bustravelio.frontend.Login2;

/**
 *
 * @author Mohamad Fakher
 */
public class BookingConfirmation extends javax.swing.JFrame {
    
    int id;
    String Fromcity;
    String Tocity;
    String Datum;
    String DepartureTime;
    String ArriveTime;
    double Price;
    int seat;
    int seatdb;
    String classart;
    String username;
    /**
     * Creates new form BookingConfirmation
     */
    public BookingConfirmation(String username,int id,String Fromcity,String Tocity,String Datum,String DepartureTime,String ArriveTime,double Price,int seat,int seatdb,String classart) {
        initComponents();
        this.username=username;
        this.id=id;
        this.Fromcity=Fromcity;
        this.Tocity=Tocity;
        this.Datum=Datum;
        this.DepartureTime=DepartureTime;
        this.ArriveTime=ArriveTime;
        this.seat=seat;
        this.seatdb=seatdb;
        this.classart=classart;
        this.Price=Price * seat;
        System.out.println("   Fromcity ->   "+Fromcity+"    Tocity ->   "+Tocity+"   Price   "+Price);
                       System.out.println("Seat BookingConfirmation --->"+seatdb);
                       System.out.println("username BookingConfirmation --->"+username);

        FromCity.setText(Fromcity);
        ToCity.setText(Tocity);
        DepatureTime.setText(DepartureTime);
        Time2.setText(ArriveTime);
        DateFrom.setText(Datum);
        DateTo.setText(Datum);
        jPrice.setText(""+Price*seat);
        tseat.setText(""+seat);
        tclass.setText(classart);

    }
  
        /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelfrom = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FromCity = new java.awt.Label();
        DepatureTime = new java.awt.Label();
        DateFrom = new java.awt.Label();
        ToCity = new java.awt.Label();
        Time2 = new java.awt.Label();
        DateTo = new java.awt.Label();
        jPrice = new javax.swing.JLabel();
        tseat = new javax.swing.JLabel();
        tclass = new java.awt.Label();
        Book = new java.awt.Button();
        Return = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Booking Confirmation");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(254, 245, 245));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(47, 62, 96));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jLabel8.setText("Class :");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel11.setText("Seat :");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel10.setText("Price :");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jLabel7.setText("Date :");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 268, -1, -1));

        jLabel6.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jLabel6.setText("Arrive Time :");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 236, -1, -1));

        jLabel5.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jLabel5.setText("To :");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 204, -1, -1));

        jLabel9.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jLabel9.setText("Date :");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 172, -1, -1));

        jLabel4.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jLabel4.setText("Departure Time : ");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jLabel3.setText("From :");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 108, -1, -1));

        labelfrom.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        labelfrom.setForeground(new java.awt.Color(255, 255, 255));
        labelfrom.setText("BusTravelio");
        kGradientPanel1.add(labelfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Boooking Confirmation");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        FromCity.setBackground(new java.awt.Color(0, 0, 0));
        FromCity.setForeground(new java.awt.Color(255, 255, 255));
        FromCity.setText(Fromcity);
        kGradientPanel1.add(FromCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 146, -1));

        DepatureTime.setBackground(new java.awt.Color(0, 0, 0));
        DepatureTime.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        DepatureTime.setForeground(new java.awt.Color(255, 255, 255));
        DepatureTime.setText(DepartureTime);
        kGradientPanel1.add(DepatureTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 85, -1));

        DateFrom.setBackground(new java.awt.Color(0, 0, 0));
        DateFrom.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        DateFrom.setForeground(new java.awt.Color(255, 255, 255));
        DateFrom.setText(Datum);
        kGradientPanel1.add(DateFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 115, -1));

        ToCity.setBackground(new java.awt.Color(0, 0, 0));
        ToCity.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        ToCity.setForeground(new java.awt.Color(255, 255, 255));
        ToCity.setName(""); // NOI18N
        ToCity.setText(Tocity);
        kGradientPanel1.add(ToCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 115, -1));

        Time2.setBackground(new java.awt.Color(0, 0, 0));
        Time2.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        Time2.setForeground(new java.awt.Color(255, 255, 255));
        Time2.setText(ArriveTime);
        kGradientPanel1.add(Time2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 80, -1));

        DateTo.setBackground(new java.awt.Color(0, 0, 0));
        DateTo.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        DateTo.setForeground(new java.awt.Color(255, 255, 255));
        DateTo.setText(Datum);
        kGradientPanel1.add(DateTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 115, -1));

        jPrice.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jPrice.setText(""+Price);
        kGradientPanel1.add(jPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 115, -1));

        tseat.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        tseat.setText(""+seat);
        kGradientPanel1.add(tseat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, -1));

        tclass.setBackground(new java.awt.Color(0, 0, 0));
        tclass.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        tclass.setForeground(new java.awt.Color(255, 255, 255));
        tclass.setText(classart);
        kGradientPanel1.add(tclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 146, -1));

        Book.setActionCommand("Book");
        Book.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        Book.setLabel("Payment");
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookActionPerformed(evt);
            }
        });
        kGradientPanel1.add(Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 140, 50));

        Return.setActionCommand("Return");
        Return.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        Return.setLabel("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 140, 50));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ReturnActionPerformed

    private void BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookActionPerformed
        if(username==null){
            new Login2(username,id,Fromcity,Tocity,Datum,DepartureTime,ArriveTime,Price,seat,seatdb).setVisible(true);
                dispose();

        }
        else{
        LastBook start = new LastBook(this.id,this.Fromcity,this.Tocity,this.Datum,this.DepartureTime,this.ArriveTime,this.Price,this.seat,this.seatdb);
                dispose();
        start.setVisible(true);
        /*
        this.id=id;
        this.Fromcity=Fromcity;
        this.Tocity=Tocity;
        this.Datum=Datum;
        this.DepartureTime=DepartureTime;
        this.ArriveTime=ArriveTime;
        this.Price=Price;
        this.seat=seat;
        this.seatdb=seatdb;
        */
        }
    }//GEN-LAST:event_BookActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Book;
    private java.awt.Label DateFrom;
    private java.awt.Label DateTo;
    private java.awt.Label DepatureTime;
    private java.awt.Label FromCity;
    private java.awt.Button Return;
    private java.awt.Label Time2;
    private java.awt.Label ToCity;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jPrice;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel labelfrom;
    private java.awt.Label tclass;
    private javax.swing.JLabel tseat;
    // End of variables declaration//GEN-END:variables
}