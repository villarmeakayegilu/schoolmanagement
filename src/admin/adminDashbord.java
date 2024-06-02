/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import scoreForm.score;
import markssheetForm.markssheet;
import courseForm.course;
import config.Session;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import loginForm.login;

public class adminDashbord extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public adminDashbord() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        marksheet = new javax.swing.JPanel();
        usersForm2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        usersForm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        account_fname = new javax.swing.JLabel();
        account_lname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        course = new javax.swing.JPanel();
        usersForm1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        score = new javax.swing.JPanel();
        usersForm3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 450));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marksheet.setBackground(new java.awt.Color(0, 204, 204));
        marksheet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marksheetMouseClicked(evt);
            }
        });
        marksheet.setLayout(null);

        usersForm2.setBackground(new java.awt.Color(255, 255, 255));
        usersForm2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usersForm2.setForeground(new java.awt.Color(255, 255, 255));
        usersForm2.setText("MarkSheet");
        usersForm2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersForm2MouseClicked(evt);
            }
        });
        marksheet.add(usersForm2);
        usersForm2.setBounds(10, 100, 100, 29);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/score.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        marksheet.add(jLabel7);
        jLabel7.setBounds(10, 0, 100, 100);

        jPanel4.add(marksheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 120, 130));

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(null);

        usersForm.setBackground(new java.awt.Color(255, 255, 255));
        usersForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usersForm.setForeground(new java.awt.Color(255, 255, 255));
        usersForm.setText("Student");
        usersForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersFormMouseClicked(evt);
            }
        });
        jPanel8.add(usersForm);
        usersForm.setBounds(20, 90, 74, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-users-96.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel1);
        jLabel1.setBounds(10, 0, 100, 100);

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 120, 130));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        account_fname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        account_fname.setText("Firstname");

        account_lname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        account_lname.setText("Lastname");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-manager-80.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(account_fname)
                    .addComponent(account_lname)
                    .addComponent(jLabel2))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(account_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(account_lname)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 370));

        course.setBackground(new java.awt.Color(0, 204, 204));
        course.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseMouseClicked(evt);
            }
        });
        course.setLayout(null);

        usersForm1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usersForm1.setForeground(new java.awt.Color(255, 255, 255));
        usersForm1.setText("Course");
        usersForm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersForm1MouseClicked(evt);
            }
        });
        course.add(usersForm1);
        usersForm1.setBounds(30, 100, 74, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/course.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        course.add(jLabel6);
        jLabel6.setBounds(10, 0, 100, 100);

        jPanel4.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 120, 130));

        score.setBackground(new java.awt.Color(0, 204, 204));
        score.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoreMouseClicked(evt);
            }
        });
        score.setLayout(null);

        usersForm3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usersForm3.setForeground(new java.awt.Color(255, 255, 255));
        usersForm3.setText("Score");
        usersForm3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersForm3MouseClicked(evt);
            }
        });
        score.add(usersForm3);
        usersForm3.setBounds(30, 100, 60, 29);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marksheet.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        score.add(jLabel8);
        jLabel8.setBounds(10, 0, 100, 100);

        jPanel4.add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 120, 130));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 820, 370));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ADMIN DASHBOARD");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("LOGOUT");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

            
    }//GEN-LAST:event_formWindowActivated

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        JFrame frame = new JFrame("Logout");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Logout", "Logout",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        usersForm uf = new usersForm();
        uf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void usersFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersFormMouseClicked
        usersForm userT = new usersForm();
        userT.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usersFormMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        usersForm uf = new usersForm();
        uf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void usersForm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersForm1MouseClicked
        course crs = new course();
        crs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usersForm1MouseClicked

    private void courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseClicked
        course crs = new course();
        crs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_courseMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        course crs = new course();
        crs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void usersForm2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersForm2MouseClicked
        markssheet ms = new markssheet();
        ms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usersForm2MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        markssheet ms = new markssheet();
        ms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void marksheetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marksheetMouseClicked
        markssheet ms = new markssheet();
        ms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_marksheetMouseClicked

    private void usersForm3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersForm3MouseClicked
            score sc = new score();
        sc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usersForm3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
             score sc = new score();
        sc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void scoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreMouseClicked
        score sc = new score();
        sc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_scoreMouseClicked

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
            java.util.logging.Logger.getLogger(adminDashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashbord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account_fname;
    private javax.swing.JLabel account_lname;
    private javax.swing.JPanel course;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel marksheet;
    private javax.swing.JPanel score;
    private javax.swing.JLabel usersForm;
    private javax.swing.JLabel usersForm1;
    private javax.swing.JLabel usersForm2;
    private javax.swing.JLabel usersForm3;
    // End of variables declaration//GEN-END:variables
}
