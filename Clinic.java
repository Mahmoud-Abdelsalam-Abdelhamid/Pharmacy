/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static com.sun.media.jfxmediaimpl.MediaUtils.error;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javaapplication1.functions.loading;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeFunction.function;

/**
 *
 * @author LENOVO
 */
public class Clinic extends javax.swing.JFrame {

    /**
     * Creates new form Clinic
     */
    public Clinic() {
        initComponents();
        details_btn.setVisible(false);
        save_btn.setVisible(false);
        delete_btn.setVisible(false);
        update_btn.setVisible(false);
        search_btn.setVisible(false);
        close.setVisible(false);
        min.setVisible(false);
        
        functions.loading();
        
        clinic_tabl.getColumnModel().getColumn(0).setMaxWidth(40);
        clinic_tabl.getColumnModel().getColumn(2).setMaxWidth(50);
        
        for (int i = 0 ; i < 4 ; i++){
            clinic_tabl.getColumnModel().getColumn(i).setMinWidth(50);
        }
        
        DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
        cr.setForeground(new Color(255,236,239));
        
        
        
        for (int i = 0 ; i < 5 ; i++){
            clinic_tabl.getColumnModel().getColumn(i).setCellRenderer(cr);
            
        }
        
        sc.setOpaque(false);
        sc.getViewport().setOpaque(false);
        clinic_tabl.setOpaque(false);
        cr.setOpaque(false);
        
        name.setBackground(new Color(255,255,255,50));
        age.setBackground(new Color(255,255,255,50));
        phone.setBackground(new Color(255,255,255,50));
        //id.setBackground(new Color(255,255,255,50));
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        sc = new javax.swing.JScrollPane();
        clinic_tabl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        n = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        p = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        d = new javax.swing.JLabel();
        disease = new javax.swing.JComboBox<>();
        update_btn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        save_btn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        delete_btn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        search_btn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        details_btn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clinic_tabl.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        clinic_tabl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "age", "phone", "disease"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        clinic_tabl.setRowHeight(20);
        clinic_tabl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clinic_tablMouseClicked(evt);
            }
        });
        sc.setViewportView(clinic_tabl);

        getContentPane().add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1040, 280));

        jLabel1.setFont(new java.awt.Font("Stencil", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 236, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient detection");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 540, 50));

        name.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 230, 40));

        n.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 28)); // NOI18N
        n.setForeground(new java.awt.Color(255, 236, 239));
        n.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n.setText("Name");
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 40));

        a.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 28)); // NOI18N
        a.setForeground(new java.awt.Color(255, 236, 239));
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText("Age");
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 100, 40));

        age.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageKeyReleased(evt);
            }
        });
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 100, 40));

        p.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 28)); // NOI18N
        p.setForeground(new java.awt.Color(255, 236, 239));
        p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p.setText("Phone");
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, 40));

        phone.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 190, 40));

        d.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 28)); // NOI18N
        d.setForeground(new java.awt.Color(255, 236, 239));
        d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d.setText("Disease type");
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 40));

        disease.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        disease.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eyes", "Bones", "Ear, Nose and Throat", "stomach", "Dental", "Neurologists", "Kindey", "Venereal", " ", " " }));
        disease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseaseActionPerformed(evt);
            }
        });
        getContentPane().add(disease, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 150, 40));

        update_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-update-done-50.png"))); // NOI18N
        update_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_btnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                update_btnMouseExited(evt);
            }
        });
        getContentPane().add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 50, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-update-50.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 50, 60));

        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-50 (2).png"))); // NOI18N
        save_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_btnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_btnMouseExited(evt);
            }
        });
        getContentPane().add(save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 50, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-50.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 50, 60));

        delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-50 (1).png"))); // NOI18N
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_btnMouseExited(evt);
            }
        });
        getContentPane().add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 50, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-50.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 50, 50));

        update.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setText("update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("save");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("details");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, -1, -1));

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-subtract-35 (3).png"))); // NOI18N
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 40, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-subtract-35 (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 40, 10));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-multiply-35 (2).png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 40, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-multiply-35.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 40, 30));

        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-50 (1).png"))); // NOI18N
        search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_btnMouseExited(evt);
            }
        });
        getContentPane().add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 50, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-50.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 50, 50));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("delete");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, -1, -1));

        details_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-view-details-50 (1).png"))); // NOI18N
        details_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                details_btnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                details_btnMouseExited(evt);
            }
        });
        getContentPane().add(details_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 60, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-view-details-50.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 60, 60));

        jLabel13.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("search");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home-page-38 (1).png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void clear(){
        name.setText("");
        age.setText("");
        phone.setText("");
        //id.setText("");
        
    }
    
    
    
    private void save(){
        
        functions.saving();
        clear();
        
    }
    
    
        
    
    
    private void delete(){
        functions.delete();
        functions.saving();
        clear();
    }
    
    
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void diseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diseaseActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        save();
        
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        save();

    }//GEN-LAST:event_jLabel4MouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        functions.update();
        clear();
        
    }//GEN-LAST:event_updateMouseClicked

    private void clinic_tablMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clinic_tablMouseClicked
        // TODO add your handling code here:
        DefaultTableModel mod = (DefaultTableModel)clinic_tabl.getModel() ;
        name.setText( mod.getValueAt(clinic_tabl.getSelectedRow(), 1).toString());
        age.setText( mod.getValueAt(clinic_tabl.getSelectedRow(), 2).toString());
        phone.setText( mod.getValueAt(clinic_tabl.getSelectedRow(), 3).toString());
        disease.setSelectedItem( mod.getValueAt(clinic_tabl.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_clinic_tablMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        functions.update();
        clear();

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        functions.delete();
        clear();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        functions.delete();
        clear();
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        new search().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        new details().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        new search().setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new details().setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void details_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_btnMouseClicked
        // TODO add your handling code here:
        new details().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_details_btnMouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        details_btn.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel6MouseExited

    private void details_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_btnMouseExited
        // TODO add your handling code here:
        details_btn.setVisible(false);
    }//GEN-LAST:event_details_btnMouseExited

    private void search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseClicked
        // TODO add your handling code here:
        new search().setVisible(true);
    }//GEN-LAST:event_search_btnMouseClicked

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked
        // TODO add your handling code here:
        functions.delete();
        clear();
        
    }//GEN-LAST:event_delete_btnMouseClicked

    private void update_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_btnMouseClicked
        // TODO add your handling code here:
        functions.update();
        clear();
    }//GEN-LAST:event_update_btnMouseClicked

    private void save_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_btnMouseClicked
        // TODO add your handling code here:
        save();
        clear();
    }//GEN-LAST:event_save_btnMouseClicked

    private void search_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_search_btnMouseEntered

    private void delete_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_delete_btnMouseEntered

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
        search_btn.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void search_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseExited
        // TODO add your handling code here:
        search_btn.setVisible(false);
    }//GEN-LAST:event_search_btnMouseExited

    private void delete_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseExited
        // TODO add your handling code here:
        delete_btn.setVisible(false);
    }//GEN-LAST:event_delete_btnMouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        delete_btn.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void update_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_btnMouseExited
        // TODO add your handling code here:
        update_btn.setVisible(false);
    }//GEN-LAST:event_update_btnMouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        update_btn.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void save_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_btnMouseExited
        // TODO add your handling code here:
        save_btn.setVisible(false);
    }//GEN-LAST:event_save_btnMouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        save_btn.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        new main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
        // TODO add your handling code here:
        functions.error_number(phone);
    }//GEN-LAST:event_phoneKeyReleased

    private void ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyReleased
        // TODO add your handling code here:
        functions.error_number(age);

    }//GEN-LAST:event_ageKeyReleased

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        this.setState(Clinic.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        min.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        // TODO add your handling code here:
        min.setVisible(false);
    }//GEN-LAST:event_minMouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        close.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        close.setVisible(false);
    }//GEN-LAST:event_closeMouseExited

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
            java.util.logging.Logger.getLogger(Clinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clinic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clinic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    public static javax.swing.JTextField age;
    public static javax.swing.JTable clinic_tabl;
    private javax.swing.JLabel close;
    private javax.swing.JLabel d;
    private javax.swing.JLabel delete_btn;
    private javax.swing.JLabel details_btn;
    public static javax.swing.JComboBox<String> disease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel min;
    private javax.swing.JLabel n;
    public static javax.swing.JTextField name;
    private javax.swing.JLabel p;
    public static javax.swing.JTextField phone;
    private javax.swing.JLabel save_btn;
    private javax.swing.JScrollPane sc;
    private javax.swing.JLabel search_btn;
    private javax.swing.JLabel update;
    private javax.swing.JLabel update_btn;
    // End of variables declaration//GEN-END:variables
}
