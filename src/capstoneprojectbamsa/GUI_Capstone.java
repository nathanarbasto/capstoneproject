/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneprojectbamsa;

import capstoneprojectbamsa.adminwindow.admintools_window;
import capstoneprojectbamsa.filewindow.file_window;
import capstoneprojectbamsa.inquirywindow.inquiry_window;
import capstoneprojectbamsa.reportwindow.report_window;
import javax.swing.JPanel;
import transactionwindow.transaction_window;

/**
 *
 * @author user
 */
public class GUI_Capstone extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Capstone
     */
    public GUI_Capstone() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard = new javax.swing.JPanel();
        school = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        poweroff = new javax.swing.JLabel();
        filepnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        transpnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inqpnl = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        reportpnl = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        adminpnl = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance Monitoring System for School Activities");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        Dashboard.setBackground(new java.awt.Color(43, 196, 92));
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        school.setBackground(new java.awt.Color(0, 0, 0));
        school.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        school.setForeground(new java.awt.Color(255, 255, 255));
        school.setText("Tagbilaran City Science High School");
        Dashboard.add(school, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        title.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("School Activities Attendance Monitoring System");
        Dashboard.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capstoneprojectbamsa/images/output-onlinepngtools (2).png"))); // NOI18N
        Dashboard.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 0, -1, -1));

        poweroff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capstoneprojectbamsa/images/Shutdown_25px_2.png"))); // NOI18N
        poweroff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                poweroffMousePressed(evt);
            }
        });
        Dashboard.add(poweroff, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, -1));

        filepnl.setBackground(new java.awt.Color(204, 204, 204));
        filepnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                filepnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                filepnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                filepnlMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capstoneprojectbamsa/images/File_48px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("File");

        javax.swing.GroupLayout filepnlLayout = new javax.swing.GroupLayout(filepnl);
        filepnl.setLayout(filepnlLayout);
        filepnlLayout.setHorizontalGroup(
            filepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filepnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(filepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(filepnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        filepnlLayout.setVerticalGroup(
            filepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filepnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        transpnl.setBackground(new java.awt.Color(204, 204, 204));
        transpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transpnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transpnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transpnlMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capstoneprojectbamsa/images/Transaction List_50px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Transaction");

        javax.swing.GroupLayout transpnlLayout = new javax.swing.GroupLayout(transpnl);
        transpnl.setLayout(transpnlLayout);
        transpnlLayout.setHorizontalGroup(
            transpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transpnlLayout.createSequentialGroup()
                .addGroup(transpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transpnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(transpnlLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transpnlLayout.setVerticalGroup(
            transpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inqpnl.setBackground(new java.awt.Color(204, 204, 204));
        inqpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inqpnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inqpnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inqpnlMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capstoneprojectbamsa/images/Survey_64px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Inquiry");

        javax.swing.GroupLayout inqpnlLayout = new javax.swing.GroupLayout(inqpnl);
        inqpnl.setLayout(inqpnlLayout);
        inqpnlLayout.setHorizontalGroup(
            inqpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inqpnlLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(inqpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(inqpnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        inqpnlLayout.setVerticalGroup(
            inqpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inqpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        reportpnl.setBackground(new java.awt.Color(204, 204, 204));
        reportpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportpnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportpnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reportpnlMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capstoneprojectbamsa/images/System Report_52px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Report");

        javax.swing.GroupLayout reportpnlLayout = new javax.swing.GroupLayout(reportpnl);
        reportpnl.setLayout(reportpnlLayout);
        reportpnlLayout.setHorizontalGroup(
            reportpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportpnlLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(reportpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28))
        );
        reportpnlLayout.setVerticalGroup(
            reportpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminpnl.setBackground(new java.awt.Color(204, 204, 204));
        adminpnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminpnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminpnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adminpnlMousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capstoneprojectbamsa/images/Administrative Tools_50px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Administrative Tools");

        javax.swing.GroupLayout adminpnlLayout = new javax.swing.GroupLayout(adminpnl);
        adminpnl.setLayout(adminpnlLayout);
        adminpnlLayout.setHorizontalGroup(
            adminpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminpnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminpnlLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminpnlLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        adminpnlLayout.setVerticalGroup(
            adminpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(7, 7, 7)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(filepnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(transpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(inqpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(reportpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(adminpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filepnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inqpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filepnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filepnlMouseEntered
        setColor(filepnl);
    }//GEN-LAST:event_filepnlMouseEntered

    private void filepnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filepnlMouseExited
        resetColor(filepnl);
    }//GEN-LAST:event_filepnlMouseExited

    private void transpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transpnlMouseEntered
        setColor(transpnl);
    }//GEN-LAST:event_transpnlMouseEntered

    private void transpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transpnlMouseExited
        resetColor(transpnl);
    }//GEN-LAST:event_transpnlMouseExited

    private void inqpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inqpnlMouseEntered
        setColor(inqpnl);
    }//GEN-LAST:event_inqpnlMouseEntered

    private void inqpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inqpnlMouseExited
        resetColor(inqpnl);
    }//GEN-LAST:event_inqpnlMouseExited

    private void reportpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpnlMouseEntered
        setColor(reportpnl);
    }//GEN-LAST:event_reportpnlMouseEntered

    private void reportpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpnlMouseExited
        resetColor(reportpnl);
    }//GEN-LAST:event_reportpnlMouseExited

    private void adminpnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminpnlMouseEntered
        setColor(adminpnl);
    }//GEN-LAST:event_adminpnlMouseEntered

    private void adminpnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminpnlMouseExited
        resetColor(adminpnl);
    }//GEN-LAST:event_adminpnlMouseExited

    private void filepnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filepnlMousePressed
       new file_window().show();
    }//GEN-LAST:event_filepnlMousePressed

    private void transpnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transpnlMousePressed
       new transaction_window().show();
    }//GEN-LAST:event_transpnlMousePressed

    private void inqpnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inqpnlMousePressed
        new inquiry_window().show();
    }//GEN-LAST:event_inqpnlMousePressed

    private void reportpnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportpnlMousePressed
       new report_window().show();
    }//GEN-LAST:event_reportpnlMousePressed

    private void adminpnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminpnlMousePressed
        new admintools_window().show();
    }//GEN-LAST:event_adminpnlMousePressed

    private void poweroffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poweroffMousePressed
        System.exit(0);
    }//GEN-LAST:event_poweroffMousePressed
       private void setColor(JPanel panel){
           panel.setBackground(new java.awt.Color(156,156,156));
       }
       
       private void resetColor(JPanel panel){
           panel.setBackground(new java.awt.Color(204,204,204));
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
            java.util.logging.Logger.getLogger(GUI_Capstone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Capstone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Capstone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Capstone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Capstone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel adminpnl;
    private javax.swing.JPanel filepnl;
    private javax.swing.JPanel inqpnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel poweroff;
    private javax.swing.JPanel reportpnl;
    private javax.swing.JLabel school;
    private javax.swing.JLabel title;
    private javax.swing.JPanel transpnl;
    // End of variables declaration//GEN-END:variables
}
