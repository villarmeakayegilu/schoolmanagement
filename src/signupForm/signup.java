/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signupForm;

import config.dbConnector;
import config.passwordHasher;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
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
    
    
    
     public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: ");
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    
        public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    
public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}

public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        register = new javax.swing.JButton();
        ckbox = new javax.swing.JCheckBox();
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
        images = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        browse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 91, -1, -1));

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
        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 412, 99, 33));

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
        jPanel3.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 411, 100, 34));

        ckbox.setBackground(new java.awt.Color(255, 255, 255));
        ckbox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ckbox.setText(" ");
        ckbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-eye-24.png"))); // NOI18N
        ckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckboxActionPerformed(evt);
            }
        });
        jPanel3.add(ckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 30, 20));

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
        jPanel3.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 360, 273, 36));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("First name:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 113, -1, -1));

        backtologin.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        backtologin.setText("Registered ? Click Here to Login");
        backtologin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtologinMouseClicked(evt);
            }
        });
        jPanel3.add(backtologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 451, -1, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Last name:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 163, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Email:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 213, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Username:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 265, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Password:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 318, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Account Type:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 364, -1, -1));

        fn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnKeyPressed(evt);
            }
        });
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 109, 273, 37));

        ln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnKeyPressed(evt);
            }
        });
        jPanel3.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 159, 273, 37));

        em.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emKeyPressed(evt);
            }
        });
        jPanel3.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 208, 273, 39));

        un.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unKeyPressed(evt);
            }
        });
        jPanel3.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 258, 273, 42));
        jPanel3.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 311, 270, 43));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel10.setText("School Management ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 41, -1, -1));

        images.setBackground(new java.awt.Color(0, 153, 255));
        images.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        images.setForeground(new java.awt.Color(255, 255, 255));
        images.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagesMouseClicked(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-100.png"))); // NOI18N

        javax.swing.GroupLayout imagesLayout = new javax.swing.GroupLayout(images);
        images.setLayout(imagesLayout);
        imagesLayout.setHorizontalGroup(
            imagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        imagesLayout.setVerticalGroup(
            imagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.add(images, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 240, 200));

        browse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        browse.setForeground(new java.awt.Color(255, 255, 255));
        browse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        browse.setText("BROWSE");
        browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseMouseClicked(evt);
            }
        });
        jPanel3.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
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
}else {
    dbConnector dbc = new dbConnector();

    try {
        String pass = passwordHasher.hashPassword(pw.getText());

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status ) "
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

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pw.getText() +  "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
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

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pw.getText() +  "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
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

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pw.getText() +  "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
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

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pw.getText() +  "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
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

        if(dbc.insertData("INSERT INTO tbl_user(fname, lname, email, u_name, u_pass, u_type, u_status) "
            + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + pw.getText() +  "','"
            + ut.getSelectedItem() + "','Pending')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            login l = new login();
            l.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    
}
        }
    }//GEN-LAST:event_fnKeyPressed

    private void ckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckboxActionPerformed
        if(ckbox.isSelected()){
            pw.setEchoChar((char)0);
        }else{
            pw.setEchoChar('*');
        }
    }//GEN-LAST:event_ckboxActionPerformed

    private void browseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMouseClicked
        browse.setVisible(false);
        image.setIcon(null);
        destination = "";
        path="";
    }//GEN-LAST:event_browseMouseClicked

    private void imagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagesMouseClicked
              JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/userimages/" + selectedFile.getName();
                path  = selectedFile.getAbsolutePath();

                if(FileExistenceChecker(path) == 1){
                    JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                    destination = "";
                    path="";
                }else{
                    image.setIcon(ResizeImage(path, null, image));
                    System.out.println(""+destination);
                    browse.setVisible(true);
                    browse.setText("REMOVE");
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_imagesMouseClicked

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
    public javax.swing.JLabel browse;
    private javax.swing.JButton cancel;
    private javax.swing.JCheckBox ckbox;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel image;
    public javax.swing.JPanel images;
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
