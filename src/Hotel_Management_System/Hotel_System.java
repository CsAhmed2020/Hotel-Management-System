/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel_Management_System;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adel
 */
public class Hotel_System extends javax.swing.JFrame {

    /**
     * Creates new form Hotel_System
     */
    public Hotel_System() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFname = new javax.swing.JTextField();
        jTextFieldcustomerRef = new javax.swing.JTextField();
        jTextFieldAddr1 = new javax.swing.JTextField();
        jTextFieldSurname = new javax.swing.JTextField();
        jTextFieldcode = new javax.swing.JTextField();
        jTextFieldmail = new javax.swing.JTextField();
        jTextFieldphone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldTax = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jbtnexit = new javax.swing.JButton();
        jbtnubdate = new javax.swing.JButton();
        jbtndelete = new javax.swing.JButton();
        jbtnreset = new javax.swing.JButton();
        jbtntotal = new javax.swing.JButton();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jComboBoxID = new javax.swing.JComboBox<>();
        jComboBoxExtNo = new javax.swing.JComboBox<>();
        jComboBoxMeal = new javax.swing.JComboBox<>();
        jComboBoxRoomNo = new javax.swing.JComboBox<>();
        jComboBoxRoomType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FirstName");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer_Ref");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Surname");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Meal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Post Code");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("e-mail");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Customer Phone");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jTextFieldFname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldFname.setName("jtxtfname"); // NOI18N
        getContentPane().add(jTextFieldFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 180, 30));

        jTextFieldcustomerRef.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldcustomerRef.setName("jtxtcustome_ref"); // NOI18N
        jTextFieldcustomerRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcustomerRefActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldcustomerRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 180, 30));
        jTextFieldcustomerRef.getAccessibleContext().setAccessibleName("");

        jTextFieldAddr1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldAddr1.setName("jtxtaddress1"); // NOI18N
        getContentPane().add(jTextFieldAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 180, 30));

        jTextFieldSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldSurname.setName("jtxtsurname"); // NOI18N
        getContentPane().add(jTextFieldSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 180, 30));

        jTextFieldcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldcode.setName("jtxtcode"); // NOI18N
        getContentPane().add(jTextFieldcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 180, 30));

        jTextFieldmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldmail.setName("jtxtmail"); // NOI18N
        getContentPane().add(jTextFieldmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 180, 30));

        jTextFieldphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldphone.setName("jtxtphone"); // NOI18N
        getContentPane().add(jTextFieldphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Date Of Birth");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Nationality");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("ID Type");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Gender");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Check in Data");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Check out Data");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Room No");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Room Type");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jLocaleChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLocaleChooser1ActionPerformed(evt);
            }
        });
        getContentPane().add(jLocaleChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 180, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Custome_Ref", "FirstName", "SurName", "Address1", "Poast Code", "Cust_Phone", "e-mail", "Nationality", "DateOfBirth", "Gender", "Check in data", "Check out data", "Meal", "Room Type", "Room No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 1220, 670));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Room Ext.No");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 180, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 180, -1));
        getContentPane().add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 180, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Tax:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Sub Total:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Total:");

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        jbtnubdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnubdate.setText("Update");
        jbtnubdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnubdateActionPerformed(evt);
            }
        });

        jbtndelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtndelete.setText("Delete");
        jbtndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeleteActionPerformed(evt);
            }
        });

        jbtnreset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnreset.setText("Reset");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });

        jbtntotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtntotal.setText("Total Cost");
        jbtntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldTax)
                    .addComponent(jTextFieldSubTotal)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jbtntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jbtnubdate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnubdate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 1550, 190));

        jComboBoxGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "FeMale" }));
        getContentPane().add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 180, -1));

        jComboBoxID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SSN", "Driving Lic", "Passport", "Pilot Licence", "Student id" }));
        getContentPane().add(jComboBoxID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 180, -1));

        jComboBoxExtNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxExtNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "0112" }));
        getContentPane().add(jComboBoxExtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 670, 180, -1));

        jComboBoxMeal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxMeal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        getContentPane().add(jComboBoxMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 180, -1));

        jComboBoxRoomNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxRoomNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", "005", "006", "007", "008", "009", "010", "011", "012" }));
        getContentPane().add(jComboBoxRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 180, -1));

        jComboBoxRoomType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Family" }));
        getContentPane().add(jComboBoxRoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 180, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcustomerRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcustomerRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcustomerRefActionPerformed

    private void jLocaleChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLocaleChooser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLocaleChooser1ActionPerformed
    JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        frame=new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(this,"Confirm if u want to exit","Hotel Management System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeleteActionPerformed
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
        if(jTable1.getRowCount()==0){
            JOptionPane.showMessageDialog(null,"No row to delete","Hotel Management System",JOptionPane.OK_OPTION);
        }else{
        JOptionPane.showMessageDialog(null,"Select row to delete","Hotel Management System",JOptionPane.OK_OPTION);
        }
        }else{
        model.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_jbtndeleteActionPerformed

    private void jbtnubdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnubdateActionPerformed
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
        if(jTable1.getRowCount()==0){
            JOptionPane.showMessageDialog(this,"Hotel Booking Update Confirmed","Hotel Management System",JOptionPane.OK_OPTION);
        }
        }
    }//GEN-LAST:event_jbtnubdateActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
       jTextFieldcustomerRef.setText(null);
       jTextFieldFname.setText(null);
       jTextFieldSurname.setText(null);
       jTextFieldphone.setText(null);
       jTextFieldAddr1.setText(null);
       jTextFieldcode.setText(null);
       jTextFieldmail.setText(null);
       jTextFieldTax.setText(null);
       jTextFieldSubTotal.setText(null);
       jTextFieldTotal.setText(null);
       jDateChooser3.setDate(null);
       jDateChooser2.setDate(null);
       jDateChooser1.setDate(null);
       jComboBoxID.setSelectedIndex(0);
       jComboBoxRoomType.setSelectedIndex(0);
       jComboBoxRoomNo.setSelectedIndex(0);
       jComboBoxExtNo.setSelectedIndex(0);
       jComboBoxMeal.setSelectedIndex(0);
       jComboBoxGender.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jbtntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntotalActionPerformed
       int SingleRoom=100;
       int DoubleRoom=200;
       int FamilyRoom=250;
       
       int OneMeal=20;
       int TwoMeal=40;
       int ThreeMeal=50;
        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd");
        Date check_in=null;
        Date check_out=null;
        try {
            check_in=format.parse(format.format(jDateChooser2.getDate()));
            check_out=format.parse(format.format(jDateChooser3.getDate()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        long checkediff =check_in.getTime()-check_out.getTime();
        int daysiff=(int)(checkediff/1000/60/60/24);
        
        if(jComboBoxRoomType.getSelectedItem().equals("Single")&&jComboBoxMeal.getSelectedItem().equals("1")){
        jTextFieldTotal.setText(Integer.toString(daysiff*SingleRoom)+OneMeal);
        jTextFieldSubTotal.setText(Integer.toString(daysiff*SingleRoom)+OneMeal);
        jTextFieldTax.setText(Integer.toString(daysiff*SingleRoom)+OneMeal);
        
        double q = Double.parseDouble(jTextFieldTax.getText());
        q=(q*0.25)/100;
        String tax=String.format("$ %.2f",q);
        jTextFieldTax.setText(tax);
        
        double s = Double.parseDouble(jTextFieldSubTotal.getText());
        String subtotal=String.format("$ %.2f",s);
        jTextFieldSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jTextFieldTotal.getText());
        String total=String.format("$ %.2f",t);
        jTextFieldTotal.setText(total);
        }
        else if(jComboBoxRoomType.getSelectedItem().equals("Double")&&jComboBoxMeal.getSelectedItem().equals("1")){
        jTextFieldTotal.setText(Integer.toString(daysiff*DoubleRoom)+OneMeal);
        jTextFieldSubTotal.setText(Integer.toString(daysiff*DoubleRoom)+OneMeal);
        jTextFieldTax.setText(Integer.toString(daysiff*DoubleRoom)+OneMeal);
        
        double q = Double.parseDouble(jTextFieldTax.getText());
        q=(q*0.25)/100;
        String tax=String.format("$ %.2f",q);
        jTextFieldTax.setText(tax);
        
        double s = Double.parseDouble(jTextFieldSubTotal.getText());
        String subtotal=String.format("$ %.2f",s);
        jTextFieldSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jTextFieldTotal.getText());
        String total=String.format("$ %.2f",t);
        jTextFieldTotal.setText(total);
        }
        else if(jComboBoxRoomType.getSelectedItem().equals("Family")&&jComboBoxMeal.getSelectedItem().equals("1")){
        jTextFieldTotal.setText(Integer.toString(daysiff*FamilyRoom)+OneMeal);
        jTextFieldSubTotal.setText(Integer.toString(daysiff*FamilyRoom)+OneMeal);
        jTextFieldTax.setText(Integer.toString(daysiff*FamilyRoom)+OneMeal);
        
        double q = Double.parseDouble(jTextFieldTax.getText());
        q=(q*0.25)/100;
        String tax=String.format("$ %.2f",q);
        jTextFieldTax.setText(tax);
        
        double s = Double.parseDouble(jTextFieldSubTotal.getText());
        String subtotal=String.format("$ %.2f",s);
        jTextFieldSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jTextFieldTotal.getText());
        String total=String.format("$ %.2f",t);
        jTextFieldTotal.setText(total);
        }
         if(jComboBoxRoomType.getSelectedItem().equals("Single")&&jComboBoxMeal.getSelectedItem().equals("2")){
        jTextFieldTotal.setText(Integer.toString(daysiff*SingleRoom)+TwoMeal);
        jTextFieldSubTotal.setText(Integer.toString(daysiff*SingleRoom)+TwoMeal);
        jTextFieldTax.setText(Integer.toString(daysiff*SingleRoom)+OneMeal);
        
        double q = Double.parseDouble(jTextFieldTax.getText());
        q=(q*0.25)/100;
        String tax=String.format("$ %.2f",q);
        jTextFieldTax.setText(tax);
        
        double s = Double.parseDouble(jTextFieldSubTotal.getText());
        String subtotal=String.format("$ %.2f",s);
        jTextFieldSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jTextFieldTotal.getText());
        String total=String.format("$ %.2f",t);
        jTextFieldTotal.setText(total);
        }
         else if(jComboBoxRoomType.getSelectedItem().equals("Double")&&jComboBoxMeal.getSelectedItem().equals("2")){
        jTextFieldTotal.setText(Integer.toString(daysiff*DoubleRoom)+TwoMeal);
        jTextFieldSubTotal.setText(Integer.toString(daysiff*DoubleRoom)+TwoMeal);
        jTextFieldTax.setText(Integer.toString(daysiff*DoubleRoom)+TwoMeal);
        
        double q = Double.parseDouble(jTextFieldTax.getText());
        q=(q*0.25)/100;
        String tax=String.format("$ %.2f",q);
        jTextFieldTax.setText(tax);
        
        double s = Double.parseDouble(jTextFieldSubTotal.getText());
        String subtotal=String.format("$ %.2f",s);
        jTextFieldSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jTextFieldTotal.getText());
        String total=String.format("$ %.2f",t);
        jTextFieldTotal.setText(total);
        }
          else if(jComboBoxRoomType.getSelectedItem().equals("Family")&&jComboBoxMeal.getSelectedItem().equals("2")){
        jTextFieldTotal.setText(Integer.toString(daysiff*FamilyRoom)+TwoMeal);
        jTextFieldSubTotal.setText(Integer.toString(daysiff*FamilyRoom)+TwoMeal);
        jTextFieldTax.setText(Integer.toString(daysiff*FamilyRoom)+TwoMeal);
        
        double q = Double.parseDouble(jTextFieldTax.getText());
        q=(q*0.25)/100;
        String tax=String.format("$ %.2f",q);
        jTextFieldTax.setText(tax);
        
        double s = Double.parseDouble(jTextFieldSubTotal.getText());
        String subtotal=String.format("$ %.2f",s);
        jTextFieldSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jTextFieldTotal.getText());
        String total=String.format("$ %.2f",t);
        jTextFieldTotal.setText(total);
        }
         if(jComboBoxRoomType.getSelectedItem().equals("Family")&&jComboBoxMeal.getSelectedItem().equals("3")){
        jTextFieldTotal.setText(Integer.toString(daysiff*FamilyRoom)+ThreeMeal);
        jTextFieldSubTotal.setText(Integer.toString(daysiff*FamilyRoom)+ThreeMeal);
        jTextFieldTax.setText(Integer.toString(daysiff*FamilyRoom)+ThreeMeal);
        
        double q = Double.parseDouble(jTextFieldTax.getText());
        q=(q*0.25)/100;
        String tax=String.format("$ %.2f",q);
        jTextFieldTax.setText(tax);
        
        double s = Double.parseDouble(jTextFieldSubTotal.getText());
        String subtotal=String.format("$ %.2f",s);
        jTextFieldSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jTextFieldTotal.getText());
        String total=String.format("$ %.2f",t);
        jTextFieldTotal.setText(total);
        }
         else if(jComboBoxRoomType.getSelectedItem().equals("Single")&&jComboBoxMeal.getSelectedItem().equals("3")){
        jTextFieldTotal.setText(Integer.toString(daysiff*SingleRoom)+ThreeMeal);
        jTextFieldSubTotal.setText(Integer.toString(daysiff*SingleRoom)+ThreeMeal);
        jTextFieldTax.setText(Integer.toString(daysiff*SingleRoom)+ThreeMeal);
        
        double q = Double.parseDouble(jTextFieldTax.getText());
        q=(q*0.25)/100;
        String tax=String.format("$ %.2f",q);
        jTextFieldTax.setText(tax);
        
        double s = Double.parseDouble(jTextFieldSubTotal.getText());
        String subtotal=String.format("$ %.2f",s);
        jTextFieldSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jTextFieldTotal.getText());
        String total=String.format("$ %.2f",t);
        jTextFieldTotal.setText(total);
        }
         else if(jComboBoxRoomType.getSelectedItem().equals("Double")&&jComboBoxMeal.getSelectedItem().equals("3")){
        jTextFieldTotal.setText(Integer.toString(daysiff*DoubleRoom)+ThreeMeal);
        jTextFieldSubTotal.setText(Integer.toString(daysiff*DoubleRoom)+ThreeMeal);
        jTextFieldTax.setText(Integer.toString(daysiff*DoubleRoom)+ThreeMeal);
        
        double q = Double.parseDouble(jTextFieldTax.getText());
        q=(q*0.25)/100;
        String tax=String.format("$ %.2f",q);
        jTextFieldTax.setText(tax);
        
        double s = Double.parseDouble(jTextFieldSubTotal.getText());
        String subtotal=String.format("$ %.2f",s);
        jTextFieldSubTotal.setText(subtotal);
        
        double t = Double.parseDouble(jTextFieldTotal.getText());
        String total=String.format("$ %.2f",t);
        jTextFieldTotal.setText(total);
        }
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
        jTextFieldcustomerRef.getText(),
        jTextFieldFname.getText(),
        jTextFieldSurname.getText(),
        jTextFieldphone.getText(),
        jTextFieldAddr1.getText(),
        jTextFieldmail.getText(),
        jTextFieldcode.getText(),
        jComboBoxRoomType.getSelectedItem(),
        jComboBoxRoomNo.getSelectedItem(),
        jComboBoxMeal.getSelectedItem(),
        jComboBoxGender.getSelectedItem(),
        jComboBoxExtNo.getSelectedItem(),
        jDateChooser1.getCalendar(),
        jDateChooser2.getDate(),
        jDateChooser3.getDate(),
        jLocaleChooser1.getSelectedItem()
        });
    }//GEN-LAST:event_jbtntotalActionPerformed

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
            java.util.logging.Logger.getLogger(Hotel_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hotel_System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxExtNo;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private javax.swing.JComboBox<String> jComboBoxID;
    private javax.swing.JComboBox<String> jComboBoxMeal;
    private javax.swing.JComboBox<String> jComboBoxRoomNo;
    private javax.swing.JComboBox<String> jComboBoxRoomType;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAddr1;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldSurname;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldcode;
    private javax.swing.JTextField jTextFieldcustomerRef;
    private javax.swing.JTextField jTextFieldmail;
    private javax.swing.JTextField jTextFieldphone;
    private javax.swing.JButton jbtndelete;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JButton jbtntotal;
    private javax.swing.JButton jbtnubdate;
    // End of variables declaration//GEN-END:variables
}
