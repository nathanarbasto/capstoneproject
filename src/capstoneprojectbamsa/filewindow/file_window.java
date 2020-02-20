/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneprojectbamsa.filewindow;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class file_window extends javax.swing.JFrame {
Connection con= null;
PreparedStatement pst= null;
PreparedStatement pst1= null;
ResultSet rs= null;
    CardLayout cardLayout;
    public file_window() {
        initComponents();
        cardLayout = (CardLayout)(displaypnl.getLayout());
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filedashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        menupanel = new javax.swing.JPanel();
        studentpnl = new javax.swing.JPanel();
        indicator1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        teacherpnl = new javax.swing.JPanel();
        indicator2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        yearlvlpnl = new javax.swing.JPanel();
        indicator3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        activitypnl = new javax.swing.JPanel();
        indicator4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        displaypnl = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        studentdisplay = new javax.swing.JPanel();
        student_IDnum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        student_firstname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        yearlevel_combo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        section_combo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        teacher_combo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fingerprintpnl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        submitbtn = new javax.swing.JButton();
        student_middleinitial = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        student_lastname = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        teacherdisplay = new javax.swing.JPanel();
        teacher_ID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        teacher_name = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        yearlvldisplay = new javax.swing.JPanel();
        section_name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        yearlvl_combo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        activitydisplay = new javax.swing.JPanel();
        act_code = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        act_name = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        act_date = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        act_time = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setTitle("FIle");

        filedashboard.setBackground(new java.awt.Color(43, 196, 92));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("File");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capstoneprojectbamsa/images/File_48px.png"))); // NOI18N

        javax.swing.GroupLayout filedashboardLayout = new javax.swing.GroupLayout(filedashboard);
        filedashboard.setLayout(filedashboardLayout);
        filedashboardLayout.setHorizontalGroup(
            filedashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filedashboardLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        filedashboardLayout.setVerticalGroup(
            filedashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filedashboardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(filedashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        menupanel.setBackground(new java.awt.Color(255, 255, 255));

        studentpnl.setBackground(new java.awt.Color(255, 255, 255));
        studentpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentpnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentpnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentpnlMousePressed(evt);
            }
        });

        indicator1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout indicator1Layout = new javax.swing.GroupLayout(indicator1);
        indicator1.setLayout(indicator1Layout);
        indicator1Layout.setHorizontalGroup(
            indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        indicator1Layout.setVerticalGroup(
            indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Student");

        javax.swing.GroupLayout studentpnlLayout = new javax.swing.GroupLayout(studentpnl);
        studentpnl.setLayout(studentpnlLayout);
        studentpnlLayout.setHorizontalGroup(
            studentpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentpnlLayout.createSequentialGroup()
                .addComponent(indicator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        studentpnlLayout.setVerticalGroup(
            studentpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        teacherpnl.setBackground(new java.awt.Color(255, 255, 255));
        teacherpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacherpnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacherpnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                teacherpnlMousePressed(evt);
            }
        });

        indicator2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout indicator2Layout = new javax.swing.GroupLayout(indicator2);
        indicator2.setLayout(indicator2Layout);
        indicator2Layout.setHorizontalGroup(
            indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        indicator2Layout.setVerticalGroup(
            indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Teacher/Adviser");

        javax.swing.GroupLayout teacherpnlLayout = new javax.swing.GroupLayout(teacherpnl);
        teacherpnl.setLayout(teacherpnlLayout);
        teacherpnlLayout.setHorizontalGroup(
            teacherpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherpnlLayout.createSequentialGroup()
                .addComponent(indicator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        teacherpnlLayout.setVerticalGroup(
            teacherpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        yearlvlpnl.setBackground(new java.awt.Color(255, 255, 255));
        yearlvlpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yearlvlpnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yearlvlpnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                yearlvlpnlMousePressed(evt);
            }
        });

        indicator3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout indicator3Layout = new javax.swing.GroupLayout(indicator3);
        indicator3.setLayout(indicator3Layout);
        indicator3Layout.setHorizontalGroup(
            indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        indicator3Layout.setVerticalGroup(
            indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Year Level and Section");

        javax.swing.GroupLayout yearlvlpnlLayout = new javax.swing.GroupLayout(yearlvlpnl);
        yearlvlpnl.setLayout(yearlvlpnlLayout);
        yearlvlpnlLayout.setHorizontalGroup(
            yearlvlpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yearlvlpnlLayout.createSequentialGroup()
                .addComponent(indicator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        yearlvlpnlLayout.setVerticalGroup(
            yearlvlpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yearlvlpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        activitypnl.setBackground(new java.awt.Color(255, 255, 255));
        activitypnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                activitypnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                activitypnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                activitypnlMousePressed(evt);
            }
        });

        indicator4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout indicator4Layout = new javax.swing.GroupLayout(indicator4);
        indicator4.setLayout(indicator4Layout);
        indicator4Layout.setHorizontalGroup(
            indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        indicator4Layout.setVerticalGroup(
            indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Activity");

        javax.swing.GroupLayout activitypnlLayout = new javax.swing.GroupLayout(activitypnl);
        activitypnl.setLayout(activitypnlLayout);
        activitypnlLayout.setHorizontalGroup(
            activitypnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activitypnlLayout.createSequentialGroup()
                .addComponent(indicator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        activitypnlLayout.setVerticalGroup(
            activitypnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(indicator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activitypnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacherpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearlvlpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activitypnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(studentpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teacherpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yearlvlpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(activitypnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(menupanel);

        displaypnl.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        displaypnl.add(jPanel1, "card6");

        student_IDnum.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel7.setText("ID Number");

        student_firstname.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel8.setText("Student First Name");

        jLabel9.setText("Year Level");

        jLabel10.setText("Section");

        jLabel11.setText("Section Adviser/Teacher in Charge");

        fingerprintpnl.setBackground(new java.awt.Color(255, 255, 255));
        fingerprintpnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fingerprintpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(fingerprintpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton1.setText("SCAN");

        jLabel21.setText("Fingerprint");

        submitbtn.setText("Submit");
        submitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitbtnMouseClicked(evt);
            }
        });

        student_middleinitial.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel20.setText("Middle Initial");

        student_lastname.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel22.setText("Student Last Name");

        javax.swing.GroupLayout studentdisplayLayout = new javax.swing.GroupLayout(studentdisplay);
        studentdisplay.setLayout(studentdisplayLayout);
        studentdisplayLayout.setHorizontalGroup(
            studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentdisplayLayout.createSequentialGroup()
                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentdisplayLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentdisplayLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel7)
                                .addGap(162, 162, 162)
                                .addComponent(jLabel8))
                            .addGroup(studentdisplayLayout.createSequentialGroup()
                                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(yearlevel_combo, 0, 114, Short.MAX_VALUE)
                                    .addGroup(studentdisplayLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(31, 31, 31)))
                                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(studentdisplayLayout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(section_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(studentdisplayLayout.createSequentialGroup()
                                        .addGap(147, 147, 147)
                                        .addComponent(jLabel10))))
                            .addGroup(studentdisplayLayout.createSequentialGroup()
                                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(teacher_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(studentdisplayLayout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addGroup(studentdisplayLayout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(jLabel21))))
                            .addGroup(studentdisplayLayout.createSequentialGroup()
                                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentdisplayLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(81, 81, 81))
                                    .addGroup(studentdisplayLayout.createSequentialGroup()
                                        .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(student_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(studentdisplayLayout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(student_IDnum, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(22, 22, 22)))
                                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(student_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(studentdisplayLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(student_middleinitial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(studentdisplayLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        studentdisplayLayout.setVerticalGroup(
            studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentdisplayLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_IDnum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(student_middleinitial, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addGap(23, 23, 23)
                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearlevel_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(section_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGroup(studentdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentdisplayLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1))
                    .addGroup(studentdisplayLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(studentdisplayLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(teacher_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        displaypnl.add(studentdisplay, "studentdisplay");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Teacher ID Number");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Name");

        jButton4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton4.setText("Submit");

        javax.swing.GroupLayout teacherdisplayLayout = new javax.swing.GroupLayout(teacherdisplay);
        teacherdisplay.setLayout(teacherdisplayLayout);
        teacherdisplayLayout.setHorizontalGroup(
            teacherdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherdisplayLayout.createSequentialGroup()
                .addGroup(teacherdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherdisplayLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(teacherdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacher_name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacher_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(teacherdisplayLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12))))
                    .addGroup(teacherdisplayLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel13))
                    .addGroup(teacherdisplayLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        teacherdisplayLayout.setVerticalGroup(
            teacherdisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherdisplayLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(teacher_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(61, 61, 61)
                .addComponent(teacher_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        displaypnl.add(teacherdisplay, "teacherdisplay");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Year Level");

        yearlvl_combo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Section Name");

        jButton3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton3.setText("Submit");

        javax.swing.GroupLayout yearlvldisplayLayout = new javax.swing.GroupLayout(yearlvldisplay);
        yearlvldisplay.setLayout(yearlvldisplayLayout);
        yearlvldisplayLayout.setHorizontalGroup(
            yearlvldisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yearlvldisplayLayout.createSequentialGroup()
                .addGroup(yearlvldisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yearlvldisplayLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(section_name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(yearlvldisplayLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel15))
                    .addGroup(yearlvldisplayLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel14))
                    .addGroup(yearlvldisplayLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(yearlvl_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(yearlvldisplayLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        yearlvldisplayLayout.setVerticalGroup(
            yearlvldisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yearlvldisplayLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(yearlvl_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(61, 61, 61)
                .addComponent(section_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        displaypnl.add(yearlvldisplay, "yearlvldisplay");

        act_code.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel16.setText("Activity Code");

        act_name.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel17.setText("Activity Name");

        act_date.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel18.setText("Date of Activity");

        act_time.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel19.setText("Time");

        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setText("Submit");

        javax.swing.GroupLayout activitydisplayLayout = new javax.swing.GroupLayout(activitydisplay);
        activitydisplay.setLayout(activitydisplayLayout);
        activitydisplayLayout.setHorizontalGroup(
            activitydisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activitydisplayLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(136, 136, 136))
            .addGroup(activitydisplayLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(157, 157, 157))
            .addGroup(activitydisplayLayout.createSequentialGroup()
                .addGroup(activitydisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(activitydisplayLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(activitydisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(act_date, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(act_code, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(activitydisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(act_name, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(act_time)))
                    .addGroup(activitydisplayLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        activitydisplayLayout.setVerticalGroup(
            activitydisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activitydisplayLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(activitydisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(act_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(act_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(activitydisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(51, 51, 51)
                .addGroup(activitydisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(act_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(act_time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(activitydisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        displaypnl.add(activitydisplay, "activitydisplay");

        jSplitPane1.setRightComponent(displaypnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filedashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(filedashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentpnlMouseEntered
       onHover(studentpnl);
       
       
    }//GEN-LAST:event_studentpnlMouseEntered

    private void teacherpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherpnlMouseEntered
       onHover(teacherpnl);
    }//GEN-LAST:event_teacherpnlMouseEntered

    private void yearlvlpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearlvlpnlMouseEntered
        onHover(yearlvlpnl);
    }//GEN-LAST:event_yearlvlpnlMouseEntered

    private void activitypnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activitypnlMouseEntered
        onHover(activitypnl);
    }//GEN-LAST:event_activitypnlMouseEntered

    private void studentpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentpnlMouseExited
        onHoverOut(studentpnl);
    }//GEN-LAST:event_studentpnlMouseExited

    private void teacherpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherpnlMouseExited
        onHoverOut(teacherpnl);
    }//GEN-LAST:event_teacherpnlMouseExited

    private void yearlvlpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearlvlpnlMouseExited
        onHoverOut(yearlvlpnl);
    }//GEN-LAST:event_yearlvlpnlMouseExited

    private void activitypnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activitypnlMouseExited
        onHoverOut(activitypnl);
    }//GEN-LAST:event_activitypnlMouseExited

    private void studentpnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentpnlMousePressed
        //display panel for data input
        cardLayout.show(displaypnl, "studentdisplay");
        
        //click
        onClick(jLabel3);
        onClickOut(jLabel4);
        onClickOut(jLabel5);
        onClickOut(jLabel6);
        
       //indicators
       indicatorColor(indicator1);
       indicatorColorOut(indicator2);
       indicatorColorOut(indicator3);
       indicatorColorOut(indicator4);
    }//GEN-LAST:event_studentpnlMousePressed

    private void teacherpnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherpnlMousePressed
        //display panel for data input
        cardLayout.show(displaypnl, "teacherdisplay");
        
        //click
        onClick(jLabel4);
         onClickOut(jLabel3);
        onClickOut(jLabel5);
        onClickOut(jLabel6);
        
       //indicators
       indicatorColor(indicator2);
       indicatorColorOut(indicator1);
       indicatorColorOut(indicator3);
       indicatorColorOut(indicator4);
    }//GEN-LAST:event_teacherpnlMousePressed

    private void yearlvlpnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearlvlpnlMousePressed
          //display panel for data input
        cardLayout.show(displaypnl, "yearlvldisplay");
        
        //click
        onClick(jLabel5);
         onClickOut(jLabel3);
        onClickOut(jLabel4);
        onClickOut(jLabel6);
        
        //indicators
       indicatorColor(indicator3);
       indicatorColorOut(indicator1);
       indicatorColorOut(indicator2);
       indicatorColorOut(indicator4);
    }//GEN-LAST:event_yearlvlpnlMousePressed

    private void activitypnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activitypnlMousePressed
          //display panel for data input
        cardLayout.show(displaypnl, "activitydisplay");
        
        //click
        onClick(jLabel6);
         onClickOut(jLabel3);
        onClickOut(jLabel4);
        onClickOut(jLabel5);
         
        //indicators
       indicatorColor(indicator4);
       indicatorColorOut(indicator1);
       indicatorColorOut(indicator2);
       indicatorColorOut(indicator3);
    }//GEN-LAST:event_activitypnlMousePressed

    private void submitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitbtnMouseClicked
        try{
                String query= "INSERT INTO `student_creds`(`ID`, `lastname`, `firstname`, `middleinitial`,`yearlvl`, `section`, `classadviser`) VALUES (?,?,?,?,?,?,?)";
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/capstone_bams", "root", "");
                pst=con.prepareStatement(query);
                pst.setString(1,"");
                pst.setString(1, "");
                pst.setString(1, "");
                pst.setString(1, "");
                pst.setString(1, "");
                pst.setString(1, "");
                pst.setString(1, "");
                
                JOptionPane.showMessageDialog(null, "Student added to the Database");
                
                
                
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_submitbtnMouseClicked
    
    private void onHover(JPanel panel){
        panel.setBackground(new java.awt.Color(105,250,131));
    }
    private void onHoverOut(JPanel panel){
         panel.setBackground(new java.awt.Color(255,255,255));
    }
    private void onClick(JLabel label){
        label.setForeground(new java.awt.Color(105,250,131));
    }
    private void onClickOut(JLabel label){
        label.setForeground(new java.awt.Color(0,0,0));
    }
    private void indicatorColor( JPanel panel){
        panel.setBackground(new java.awt.Color(17,229,68));
    }
    private void indicatorColorOut( JPanel panel){
        panel.setBackground(new java.awt.Color(255,255,255));
    }
    
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
            java.util.logging.Logger.getLogger(file_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(file_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(file_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(file_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new file_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField act_code;
    private javax.swing.JTextField act_date;
    private javax.swing.JTextField act_name;
    private javax.swing.JTextField act_time;
    private javax.swing.JPanel activitydisplay;
    private javax.swing.JPanel activitypnl;
    private javax.swing.JPanel displaypnl;
    private javax.swing.JPanel filedashboard;
    private javax.swing.JLabel fingerprintpnl;
    private javax.swing.JPanel indicator1;
    private javax.swing.JPanel indicator2;
    private javax.swing.JPanel indicator3;
    private javax.swing.JPanel indicator4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel menupanel;
    private javax.swing.JComboBox<String> section_combo;
    private javax.swing.JTextField section_name;
    private javax.swing.JTextField student_IDnum;
    private javax.swing.JTextField student_firstname;
    private javax.swing.JTextField student_lastname;
    private javax.swing.JTextField student_middleinitial;
    private javax.swing.JPanel studentdisplay;
    private javax.swing.JPanel studentpnl;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField teacher_ID;
    private javax.swing.JComboBox<String> teacher_combo;
    private javax.swing.JTextField teacher_name;
    private javax.swing.JPanel teacherdisplay;
    private javax.swing.JPanel teacherpnl;
    private javax.swing.JComboBox<String> yearlevel_combo;
    private javax.swing.JComboBox<String> yearlvl_combo;
    private javax.swing.JPanel yearlvldisplay;
    private javax.swing.JPanel yearlvlpnl;
    // End of variables declaration//GEN-END:variables
}
