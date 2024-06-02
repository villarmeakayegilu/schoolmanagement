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
    }

       Color navcolor = new Color(102,204,255);
    Color hovercolor = new Color(102,255,255);
    
            public void refreshUI() {
        try {
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT uid, fname, lname, email, u_status FROM tbl_user");
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
        account_id3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        back3 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        addPanel3 = new javax.swing.JPanel();
        add3 = new javax.swing.JLabel();
        editPanel = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        printPanel = new javax.swing.JPanel();
        print = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel15.setBackground(new java.awt.Color(102, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(courseTable);

        jPanel15.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 125, 650, 480));

        account_id3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        account_id3.setText("ID");
        jPanel15.add(account_id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 566, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Current User:");
        jPanel15.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 540, -1, -1));

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
        jPanel16.add(back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 50, 30));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 50));

        jPanel17.setBackground(new java.awt.Color(102, 204, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addPanel3.setBackground(new java.awt.Color(102, 204, 255));
        addPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPanel3MouseExited(evt);
            }
        });

        add3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add3.setText("Save");
        add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout addPanel3Layout = new javax.swing.GroupLayout(addPanel3);
        addPanel3.setLayout(addPanel3Layout);
        addPanel3Layout.setHorizontalGroup(
            addPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanel3Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        addPanel3Layout.setVerticalGroup(
            addPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.add(addPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

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
        edit.setText("Print");
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
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(edit)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.add(editPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, 39));

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
        delete.setText("Clear");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.add(deletePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, 39));

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
        print.setText("Add Course");
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
            .addGroup(printPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(print)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        printPanelLayout.setVerticalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(print)
                .addContainerGap())
        );

        jPanel17.add(printPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 39));

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 600));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("Search Student");
        jPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));
        jPanel15.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 280, 40));

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Refresh");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, 80, 30));

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Search");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 80, 30));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseClicked
        createUserForm cuf = new createUserForm();
        cuf.setVisible(true);
        cuf.remove.setEnabled(false);
        cuf.select.setEnabled(true);
        this.dispose();

    }//GEN-LAST:event_add3MouseClicked

    private void add3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseEntered
        addPanel3.setBackground(hovercolor);
    }//GEN-LAST:event_add3MouseEntered

    private void add3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseExited
        addPanel3.setBackground(navcolor);
    }//GEN-LAST:event_add3MouseExited

    private void addPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanel3MouseClicked

    }//GEN-LAST:event_addPanel3MouseClicked

    private void addPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanel3MouseEntered
        addPanel3.setBackground(hovercolor);
    }//GEN-LAST:event_addPanel3MouseEntered

    private void addPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanel3MouseExited
        addPanel3.setBackground(navcolor);
    }//GEN-LAST:event_addPanel3MouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowIndex = courseTable.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please select an item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = courseTable.getModel();

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

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        editPanel.setBackground(hovercolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        editPanel.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited

    private void editPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseClicked
        int rowIndex = courseTable.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please select an item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = courseTable.getModel();

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

    private void editPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseEntered
        editPanel.setBackground(hovercolor);
    }//GEN-LAST:event_editPanelMouseEntered

    private void editPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseExited
        editPanel.setBackground(navcolor);
    }//GEN-LAST:event_editPanelMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowIndex = courseTable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an item!");
        } else {
            try {
                dbConnector dbc = new dbConnector();
                TableModel tbl = courseTable.getModel();
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
        int rowIndex = courseTable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an item!");
        } else {
            try {
                dbConnector dbc = new dbConnector();
                TableModel tbl = courseTable.getModel();
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

    private void printPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printPanelMouseExited
        printPanel.setBackground(navcolor);
    }//GEN-LAST:event_printPanelMouseExited

    private void printPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printPanelMouseEntered
        printPanel.setBackground(hovercolor);
    }//GEN-LAST:event_printPanelMouseEntered

    private void printPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_printPanelMouseClicked

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        printPanel.setBackground(navcolor);
    }//GEN-LAST:event_printMouseExited

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        printPanel.setBackground(hovercolor);
    }//GEN-LAST:event_printMouseEntered

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked

    }//GEN-LAST:event_printMouseClicked

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
    private javax.swing.JLabel account_id3;
    private javax.swing.JLabel add3;
    private javax.swing.JPanel addPanel3;
    private javax.swing.JLabel back3;
    private javax.swing.JTable courseTable;
    private javax.swing.JLabel delete;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JLabel edit;
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel print;
    private javax.swing.JPanel printPanel;
    // End of variables declaration//GEN-END:variables
}
