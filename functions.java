/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LENOVO
 */
public class functions {
    
    static void error_number (JTextField argument){
        try{
            Integer.parseInt(argument.getText());
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(new JFrame(),"enter only integers"); 
            argument.setText("");
        }
    }
    
    
   static void search(JTable t,JTextField f ,JComboBox c){
           DefaultTableModel Model = (DefaultTableModel)t.getModel(); 
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(Model);
            t.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(f.getText().trim(),c.getSelectedIndex()));
   }
   

    
    
    static void loading(){

        String url ="jdbc:mysql://localhost:3306/Project0" ;
        String user ="root";
        String pass ="Alora@19/7$";
        String sql ="select * from patient;";
        
        try(Connection con = DriverManager.getConnection(url, user, pass)){
            
            
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            DefaultTableModel mod = (DefaultTableModel)Clinic.clinic_tabl.getModel();
            
            while(rs.next()){
                mod.addRow(new Object[]{rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getString("phone"),rs.getString("disease")});
            }
            
        }
        catch(SQLException ex){
            
        }
    }
    
    static void det_loading(){
        
        DefaultTableModel mod = (DefaultTableModel)Clinic.clinic_tabl.getModel();
        String url ="jdbc:mysql://localhost:3306/Project0" ;
        String user ="root";
        String pass ="Alora@19/7$"; 
        String sql ="select * from details where id = "+Integer.parseInt(mod.getValueAt(Clinic.clinic_tabl.getSelectedRow(), 0).toString() )+"  ;";
        
        try(Connection con = DriverManager.getConnection(url, user, pass)){
            
            System.out.print("done");
            
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            details.address1.setText(rs.getString("address"));
            details.spe_disease1.setText(rs.getString("spe_disease"));
            details.date1.setText(rs.getString("dt_exam"));
            details.date2.setText(rs.getString("nxt_vst_dt"));
            }
            
        }
        catch(SQLException ex){
            
        }
    }
    
    
    static void combo_loading(){

        String url ="jdbc:mysql://localhost:3306/Project0" ;
        String user ="root";
        String pass ="Alora@19/7$"; 
        String sql ="select * from details ;";
        
        try(Connection con = DriverManager.getConnection(url, user, pass)){
            
            
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                details.cmb_disease.addItem(rs.getString("spe_disease"));
            }
            
            
            
        }
        catch(SQLException ex){
            
        }
    }
        
    static void saving() {
        
        String url ="jdbc:mysql://localhost:3306/project0" ;
        String user ="root";
        String pass ="Alora@19/7$";
        String sql ="insert into patient( name, age, phone, disease) values(?,?,?,?);";
        
        try(Connection con = DriverManager.getConnection(url, user, pass)){
            
            PreparedStatement  pst = con.prepareStatement(sql);
            
            pst.setString(1, Clinic.name.getText());
            pst.setString(2, Clinic.age.getText());
            pst.setString(3, Clinic.phone.getText());
            pst.setString(4, Clinic.disease.getSelectedItem().toString());
            pst.execute();
            
            DefaultTableModel mod = (DefaultTableModel)Clinic.clinic_tabl.getModel();
            
            mod.setRowCount(0);
            
            loading();
            
        }catch(SQLException ex){
            
        }  
    }
    
    static void det_saving() {
        
        String url ="jdbc:mysql://localhost:3306/project0" ;
        String user ="root";
        String pass ="Alora@19/7$";
        String sql ="insert into details(id, address, spe_disease, dt_exam, nxt_vst_dt) values(?,?,?,?,?);";
        
        try(Connection con = DriverManager.getConnection(url, user, pass)){
            
            PreparedStatement  pst = con.prepareStatement(sql);
            
            pst.setString(2, details.address1.getText());
            pst.setString(3, details.spe_disease1.getText());
            pst.setString(4, details.date1.getText());
            pst.setString(5, details.date2.getText());
            pst.setInt(1, Integer.parseInt(details.id1.getText()));
            
            pst.execute();
            
            
            
        }catch(SQLException ex){
            
        }  
    }
    
    
    static void det_update() {
        
        String url ="jdbc:mysql://localhost:3306/project0" ;
        String user ="root";
        String pass ="Alora@19/7$";
        String sql ="update patient set name = ? ,  age = ? ,  phone = ? , disease = ? where id = ? ;";
        
        try(Connection con = DriverManager.getConnection(url, user, pass)){
            
            DefaultTableModel mod = (DefaultTableModel)Clinic.clinic_tabl.getModel();
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, details.name1.getText());
            pst.setString(2, details.age1.getText());
            pst.setString(3, details.phone1.getText());
            pst.setString(4, details.disease1.getSelectedItem().toString());
            pst.setInt(5, Integer.parseInt(details.id1.getText()));
            
            
            pst.execute();
            
            mod.setRowCount(0);
            
            loading();
            
        }catch(SQLException ex){
            
        }
    }
    
    
    static void delete() {
        
        String url ="jdbc:mysql://localhost:3306/project0" ;
        String user ="root";
        String pass ="Alora@19/7$";
        String sql ="delete from patient where id = ? ;";
        
        try(Connection con = DriverManager.getConnection(url, user, pass)){
            
            DefaultTableModel mod = (DefaultTableModel)Clinic.clinic_tabl.getModel();
            
            PreparedStatement  pst = con.prepareStatement(sql);
            
            pst.setInt(1, Integer.parseInt(mod.getValueAt(Clinic.clinic_tabl.getSelectedRow(), 0).toString()));
            
            pst.execute();
            
            mod.setRowCount(0);
            
            loading();
            
        }catch(SQLException ex){
            
        }       
    
    }
    
    static void update() {
        
        String url ="jdbc:mysql://localhost:3306/project0" ;
        String user ="root";
        String pass ="Alora@19/7$";
        String sql ="update patient set name = ? ,  age = ? ,  phone = ? , disease = ? where id = ? ;";
        
        try(Connection con = DriverManager.getConnection(url, user, pass)){
            
            DefaultTableModel mod = (DefaultTableModel)Clinic.clinic_tabl.getModel();
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, Clinic.name.getText());
            pst.setString(2, Clinic.age.getText());
            pst.setString(3, Clinic.phone.getText());
            pst.setString(4, Clinic.disease.getSelectedItem().toString());
            pst.setInt(5, Integer.parseInt(mod.getValueAt(Clinic.clinic_tabl.getSelectedRow(), 0).toString()));
            
            
            pst.execute();
            
            mod.setRowCount(0);
            
            loading();
            
        }catch(SQLException ex){
            
        }
    }
    
}



      
