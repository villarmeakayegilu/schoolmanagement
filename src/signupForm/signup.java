/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signupForm;

import config.dbConnector;
import config.passwordHasher;
import java.awt.event.KeyEvent;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import loginForm.login;


public class signup extends javax.swing.JFrame {


    public signup() {
        initComponents();
    }
    
    public static String email,username;
    
    public boolean duplicateCheck(){
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user WHERE u_name = '" + un.getText() + "' OR email = '" + em + "'";
             ResultSet resultSet = dbc.getData(query);
  
           if(resultSet.next()){
               email = resultSet.getString("email");
               if(email.equals(em.getText())){
                   JOptionPane.showMessageDialog(null, "Email is Already Used!!", "Message",JOptionPane.ERROR_MESSAGE);
                   em.setText("");
               }
               username = resultSet.getString("u_name");
               if(username.equals(un.getText())){
                   JOptionPane.showMessageDialog(null, "Username is Already Used!!", "Message",JOptionPane.ERROR_MESSAGE);
                   un.setText("");
               }
               return true;
           }else{
               return false;
           }
             
        }catch(SQLException ex){
            System.out.println(""+ex);
        }
        return false;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        register = new javax.swing.JButton();
        ut = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        backtologin = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        register.setText("Register");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        ut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                utKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("First name:");

        backtologin.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        backtologin.setText("Registered ? Click Here to Login");
        backtologin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtologinMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Last name:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Email:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Username:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Password:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Account Type:");

        fn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnKeyPressed(evt);
            }
        });

        ln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnKeyPressed(evt);
            }
        });

        em.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emKeyPressed(evt);
            }
        });

        un.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel10.setText("School Management ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel18))
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(un)
                                    .addComponent(em)
                                    .addComponent(ln)
                                    .addComponent(fn)
                                    .addComponent(ut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(backtologin))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backtologin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        login l = new login();
           l.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_registerMouseClicked

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() ||
    un.getText().isEmpty() || pw.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!!", "Message", JOptionPane.ERROR_MESSAGE);
} else if(pw.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message", JOptionPane.ERROR_MESSAGE);
    pw.setText("");
} else if(duplicateCheck()) {
    System.out.println("Duplicate Exist");
} else {
    dbConnector dbc = new dbConnector();

    try {
        String pass = passwordHasher.hashPassword(pw.getText());

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pass + "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    } catch(NoSuchAlgorithmException ex) {
        System.out.println("" + ex);
    }
}

    }//GEN-LAST:event_registerActionPerformed

    private void backtologinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtologinMouseClicked
            login l = new login();
           l.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_backtologinMouseClicked

    private void utKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_utKeyPressed
        if(evt.getKeyCode () == KeyEvent.VK_ENTER){
if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() ||
    un.getText().isEmpty() || pw.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!!", "Message", JOptionPane.ERROR_MESSAGE);
} else if(pw.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message", JOptionPane.ERROR_MESSAGE);
    pw.setText("");
} else if(duplicateCheck()) {
    System.out.println("Duplicate Exist");
} else {
    dbConnector dbc = new dbConnector();

    try {
        String pass = passwordHasher.hashPassword(pw.getText());

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pass + "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    } catch(NoSuchAlgorithmException ex) {
        System.out.println("" + ex);
    }
}
        }
    }//GEN-LAST:event_utKeyPressed
    
    private void unKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyPressed
      if(evt.getKeyCode () == KeyEvent.VK_ENTER){
if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() ||
    un.getText().isEmpty() || pw.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!!", "Message", JOptionPane.ERROR_MESSAGE);
} else if(pw.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message", JOptionPane.ERROR_MESSAGE);
    pw.setText("");
} else if(duplicateCheck()) {
    System.out.println("Duplicate Exist");
} else {
    dbConnector dbc = new dbConnector();

    try {
        String pass = passwordHasher.hashPassword(pw.getText());

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pass + "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    } catch(NoSuchAlgorithmException ex) {
        System.out.println("" + ex);
    }
}
        }
    }//GEN-LAST:event_unKeyPressed

    private void emKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emKeyPressed
      if(evt.getKeyCode () == KeyEvent.VK_ENTER){
if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() ||
    un.getText().isEmpty() || pw.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!!", "Message", JOptionPane.ERROR_MESSAGE);
} else if(pw.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message", JOptionPane.ERROR_MESSAGE);
    pw.setText("");
} else if(duplicateCheck()) {
    System.out.println("Duplicate Exist");
} else {
    dbConnector dbc = new dbConnector();

    try {
        String pass = passwordHasher.hashPassword(pw.getText());

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pass + "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    } catch(NoSuchAlgorithmException ex) {
        System.out.println("" + ex);
    }
}
        }
    }//GEN-LAST:event_emKeyPressed

    private void lnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnKeyPressed
      if(evt.getKeyCode () == KeyEvent.VK_ENTER){
if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() ||
    un.getText().isEmpty() || pw.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!!", "Message", JOptionPane.ERROR_MESSAGE);
} else if(pw.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message", JOptionPane.ERROR_MESSAGE);
    pw.setText("");
} else if(duplicateCheck()) {
    System.out.println("Duplicate Exist");
} else {
    dbConnector dbc = new dbConnector();

    try {
        String pass = passwordHasher.hashPassword(pw.getText());

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pass + "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    } catch(NoSuchAlgorithmException ex) {
        System.out.println("" + ex);
    }
}
        }
    }//GEN-LAST:event_lnKeyPressed

    private void fnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnKeyPressed
      if(evt.getKeyCode () == KeyEvent.VK_ENTER){
if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() ||
    un.getText().isEmpty() || pw.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!!", "Message", JOptionPane.ERROR_MESSAGE);
} else if(pw.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Max password character should be 8 above!", "Message", JOptionPane.ERROR_MESSAGE);
    pw.setText("");
} else if(duplicateCheck()) {
    System.out.println("Duplicate Exist");
} else {
    dbConnector dbc = new dbConnector();

    try {
        String pass = passwordHasher.hashPassword(pw.getText());

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pass + "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    } catch(NoSuchAlgorithmException ex) {
        System.out.println("" + ex);
    }
}
        }
    }//GEN-LAST:event_fnKeyPressed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backtologin;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField pw;
    private javax.swing.JButton register;
    private javax.swing.JTextField un;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
