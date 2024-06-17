/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseForm;


import admin.adminDashbord;
import admin.createUserForm;
import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;   
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.sql.PreparedStatement;
 

public class course extends javax.swing.JFrame {

    /**
     * Creates new form course
     */
    public course() {
        initComponents();
        displayData();
    }

       Color navcolor = new Color(102,204,255);
    Color hovercolor = new Color(102,255,255);
    
    
        public void displayData(){
        try{
              dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT cid, user_id, sem, Course1, Course2, Course3, Course4, Course5 FROM tbl_course");
            courseTable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors:"+ex.getMessage());
        }
    }
            public void refreshUI() {
        try {
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT cid, user_id, sem, Course1, Course2, Course3, Course4, Course5 FROM tbl_course");
            courseTable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (SQLException ex) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        back3 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>();
        c1 = new javax.swing.JComboBox<>();
        sem = new javax.swing.JComboBox<>();
        c3 = new javax.swing.JComboBox<>();
        c4 = new javax.swing.JComboBox<>();
        c5 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        search1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        print1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(102, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        courseTable.setEnabled(false);
        jScrollPane4.setViewportView(courseTable);

        jPanel15.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 680, 420));

        refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refresh.setText("Refresh");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel15.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 60, 90, 40));

        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel15.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 100, 40));

        jPanel16.setBackground(new java.awt.Color(0, 153, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Course Form");
        jPanel16.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-arrow-back-48.png"))); // NOI18N
        back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back3MouseClicked(evt);
            }
        });
        jPanel16.add(back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 50, 30));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 50));

        jPanel17.setBackground(new java.awt.Color(102, 204, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Student's ID:");
        jPanel17.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        sid.setEnabled(false);
        jPanel17.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 241, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Semester :");
        jPanel17.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Course 1 :");
        jPanel17.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel17.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 241, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Account Status:");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "C++", "Java", "HTML", "PHP", "Python", "BOOTSTRAP", "CSS", "JAVASCRIPT" }));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        jPanel17.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 241, 30));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "C++", "Java", "HTML", "PHP", "Python", "BOOTSTRAP", "CSS", "JAVASCRIPT" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel17.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 241, 30));

        sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd" }));
        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });
        jPanel17.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 241, 30));

        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "C++", "Java", "HTML", "PHP", "Python", "BOOTSTRAP", "CSS", "JAVASCRIPT" }));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        jPanel17.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 241, 30));

        c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "C++", "Java", "HTML", "PHP", "Python", "BOOTSTRAP", "CSS", "JAVASCRIPT" }));
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        jPanel17.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 241, 30));

        c5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "C++", "Java", "HTML", "PHP", "Python", "BOOTSTRAP", "CSS", "JAVASCRIPT" }));
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        jPanel17.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 241, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Course 2 :");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Course 3 :");
        jPanel17.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Course 4 :");
        jPanel17.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Course 5 :");
        jPanel17.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel17.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Student's ID");
        jPanel17.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        search1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search1.setText("Search");
        search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search1MouseClicked(evt);
            }
        });
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        jPanel17.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 100, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("ID:");
        jPanel17.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        cid.setEnabled(false);
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        jPanel17.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 241, 30));

        save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel17.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 110, 50));

        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel17.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 110, 50));

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 460, 580));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("Search Student");
        jPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel15.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 280, 40));

        print1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        print1.setText("Print");
        print1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                print1MouseClicked(evt);
            }
        });
        print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print1ActionPerformed(evt);
            }
        });
        jPanel15.add(print1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 110, 50));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back3MouseClicked
        adminDashbord ads = new adminDashbord();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back3MouseClicked

    private void print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print1ActionPerformed

    private void print1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_print1MouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
dbConnector dbc = new dbConnector();
        if(dbc.insertData("INSERT INTO tbl_course(cid, user_id, sem, course1, course2, course3, course4, course5) "
            + "VALUES('" + cid.getText() + "','" + sid.getText() + "','" + sem.getSelectedItem() + "','" + c1.getSelectedItem() + "','" + c2.getSelectedItem() + "','"
            + c3.getSelectedItem() + "','" + c4.getSelectedItem() + "','" + c5.getSelectedItem() + "',)")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
        }

       
    }//GEN-LAST:event_saveActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_search1MouseClicked

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
             Session session = Session.getInstance();
       cid.setText(""+session.getCid());
       sid.setText(""+session.getUserid());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back3;
    public javax.swing.JComboBox<String> c1;
    public javax.swing.JComboBox<String> c2;
    public javax.swing.JComboBox<String> c3;
    public javax.swing.JComboBox<String> c4;
    public javax.swing.JComboBox<String> c5;
    public javax.swing.JTextField cid;
    private javax.swing.JButton clear;
    private javax.swing.JTable courseTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton print1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JButton search1;
    public javax.swing.JComboBox<String> sem;
    public javax.swing.JTextField sid;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
