
package studentForm;

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
 

public class students extends javax.swing.JFrame {


    public students() {
        initComponents();
        displayData();
    }
    
    Color navcolor = new Color(102,204,255);
    Color hovercolor = new Color(102,255,255);
    
    public void displayData(){
        try{
             dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT uid, fname, lname, email, u_status, u_image FROM tbl_user");
            usersTable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors:"+ex.getMessage());
        }
    }
    
        public void refreshUI() {
        try {
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT uid, fname, lname, email, u_status, u_image FROM tbl_user");
            usersTable.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (SQLException ex) {
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        account_id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        editPanel = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        printPanel = new javax.swing.JPanel();
        print = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        add = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 720, 430));

        account_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        account_id.setText("ID");
        jPanel2.add(account_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Current User:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Student Form");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-arrow-back-48.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 50, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Search Student");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 50));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 460, 50));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Refresh");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 90, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Search");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 90, 50));

        deletePanel.setBackground(new java.awt.Color(102, 204, 255));
        deletePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletePanelMouseExited(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete)
                .addContainerGap())
        );

        jPanel2.add(deletePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 100, -1));

        editPanel.setBackground(new java.awt.Color(102, 204, 255));
        editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editPanelMouseExited(evt);
            }
        });

        edit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edit.setText("UPDATE");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edit)
                .addGap(82, 82, 82))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(editPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 90, -1));

        printPanel.setBackground(new java.awt.Color(102, 204, 255));
        printPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printPanelMouseExited(evt);
            }
        });

        print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        print.setText("PRINT");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });

        javax.swing.GroupLayout printPanelLayout = new javax.swing.GroupLayout(printPanel);
        printPanel.setLayout(printPanelLayout);
        printPanelLayout.setHorizontalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(print)
                .addGap(18, 18, 18))
        );
        printPanelLayout.setVerticalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(printPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 100, -1));

        addPanel.setBackground(new java.awt.Color(102, 204, 255));
        addPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPanelMouseExited(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("ADD NEW");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(addPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 110, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session session = Session.getInstance();
       account_id.setText(""+session.getUid());
    }//GEN-LAST:event_formWindowActivated

    private void addPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseEntered
             addPanel.setBackground(hovercolor);
    }//GEN-LAST:event_addPanelMouseEntered

    private void addPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseExited
             addPanel.setBackground(navcolor);
    }//GEN-LAST:event_addPanelMouseExited

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        createUserForm cuf = new createUserForm();
        cuf.setVisible(true);
        cuf.remove.setEnabled(false);
        cuf.select.setEnabled(true);
        this.dispose();
        
    }//GEN-LAST:event_addMouseClicked

    private void editPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseEntered
        editPanel.setBackground(hovercolor);
    }//GEN-LAST:event_editPanelMouseEntered

    private void editPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseExited
        editPanel.setBackground(navcolor);
    }//GEN-LAST:event_editPanelMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
       editPanel.setBackground(hovercolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
      editPanel.setBackground(navcolor);  
    }//GEN-LAST:event_editMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowIndex = usersTable.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please select an item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = usersTable.getModel();
                
                ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE uid = '"+tbl.getValueAt(rowIndex,0)+"'");
                
                if(rs.next()){
                  createUserForm crf = new createUserForm(); 
                  crf.fn.setText(""+rs.getString("fname"));
                  crf.ln.setText(""+rs.getString("lname"));
                  crf.em.setText(""+rs.getString("email"));
                  crf.un.setText(""+rs.getString("u_name"));
                  crf.pw.setText(""+rs.getString("u_pass"));
                  crf.ut.setSelectedItem(""+rs.getString("u_type"));
                  crf.us.setSelectedItem(""+rs.getString("u_status"));
                  crf.image.setIcon(crf.ResizeImage(rs.getString("u_image"),null,crf.image));
                  crf.oldpath = rs.getString("u_image");
                  crf.path = rs.getString("u_image");
                  crf.destination = rs.getString("u_image");
                  crf.add.setEnabled(false);
                  crf.update.setEnabled(true);
                  crf.setVisible(true);
                  
                  if(rs.getString("u_image").isEmpty()){
                     crf.select.setEnabled(true);
                     crf.remove.setEnabled(false);
                  }else{
                     crf.select.setEnabled(false);
                     crf.remove.setEnabled(true);
                  }
                  
                  this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }   
        }
    }//GEN-LAST:event_editMouseClicked

    private void editPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseClicked
        int rowIndex = usersTable.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please select an item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = usersTable.getModel();
                
                ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE uid = '"+tbl.getValueAt(rowIndex,0)+"'");
                
                if(rs.next()){
                  createUserForm crf = new createUserForm(); 
                  crf.fn.setText(""+rs.getString("fname"));
                  crf.ln.setText(""+rs.getString("lname"));
                  crf.em.setText(""+rs.getString("email"));
                  crf.un.setText(""+rs.getString("u_name"));
                  crf.pw.setText(""+rs.getString("u_pass"));
                  crf.ut.setSelectedItem(""+rs.getString("u_type"));
                  crf.us.setSelectedItem(""+rs.getString("u_status"));
                  crf.image.setIcon(crf.ResizeImage(rs.getString("u_image"),null,crf.image));
                  crf.oldpath = rs.getString("u_image");
                  crf.path = rs.getString("u_image");
                  crf.destination = rs.getString("u_image");
                  crf.add.setEnabled(false);
                  crf.update.setEnabled(true);
                  crf.setVisible(true);
                  
                  if(rs.getString("u_image").isEmpty()){
                     crf.select.setEnabled(true);
                     crf.remove.setEnabled(false);
                  }else{
                     crf.select.setEnabled(false);
                     crf.remove.setEnabled(true);
                  }
                  
                  this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }   
        }
    }//GEN-LAST:event_editPanelMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
    int rowIndex = usersTable.getSelectedRow();
    
    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select an item!");
    } else {
        try {
            dbConnector dbc = new dbConnector();
            TableModel tbl = usersTable.getModel();
            Object userId = tbl.getValueAt(rowIndex, 0);
            
            
            PreparedStatement pstmt = dbc.getConnection().prepareStatement("DELETE FROM tbl_user WHERE uid = ?");
            
            
            pstmt.setObject(1, userId);
            
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "User deleted successfully!");
                    refreshUI();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete user!");
            }
            
            
            pstmt.close();
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
    }
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        deletePanel.setBackground(hovercolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        deletePanel.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void deletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseClicked
    int rowIndex = usersTable.getSelectedRow();
    
    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select an item!");
    } else {
        try {
            dbConnector dbc = new dbConnector();
            TableModel tbl = usersTable.getModel();
            Object userId = tbl.getValueAt(rowIndex, 0);
            
            
            PreparedStatement pstmt = dbc.getConnection().prepareStatement("DELETE FROM tbl_user WHERE uid = ?");
            
            
            pstmt.setObject(1, userId);
            
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "User deleted successfully!");

            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete user!");
            }
            
            
            pstmt.close();
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
    }
    }//GEN-LAST:event_deletePanelMouseClicked

    private void deletePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseEntered
        deletePanel.setBackground(hovercolor);
    }//GEN-LAST:event_deletePanelMouseEntered

    private void deletePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseExited
        deletePanel.setBackground(navcolor);
    }//GEN-LAST:event_deletePanelMouseExited

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        
    }//GEN-LAST:event_addPanelMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       adminDashbord ads = new adminDashbord();
            ads.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
     
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        printPanel.setBackground(hovercolor);
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        printPanel.setBackground(navcolor);
    }//GEN-LAST:event_printMouseExited

    private void printPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_printPanelMouseClicked

    private void printPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printPanelMouseEntered
        printPanel.setBackground(hovercolor);
    }//GEN-LAST:event_printPanelMouseEntered

    private void printPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printPanelMouseExited
        printPanel.setBackground(navcolor);
    }//GEN-LAST:event_printPanelMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        addPanel.setBackground(hovercolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
       addPanel.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

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
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account_id;
    private javax.swing.JLabel add;
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel delete;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JLabel edit;
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel print;
    private javax.swing.JPanel printPanel;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
