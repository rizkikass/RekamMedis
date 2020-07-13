/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.Admin;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class ExecuteAdmin {
    public List<Admin> getAdm(){
        List<Admin> listAdm = new ArrayList<>();
        String query = "select * from admin";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Admin adm = new Admin();
                adm.setId_admin(rs.getInt("id_admin"));
                adm.setNama_admin(rs.getString("nama_admin"));
                adm.setGender_admin(rs.getString("gender_admin"));
                adm.setNotlp_admin(rs.getString("notlp_admin"));
                adm.setEmail_admin(rs.getString("email_admin"));
                adm.setPass_admin(rs.getString("pass_admin"));
                listAdm.add(adm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listAdm;
    }
    
    public int insertAdm(Admin adm){
        int hasil = 0;
        String query = "Insert into admin( nama_admin, gender_admin, notlp_admin, email_admin, pass_admin)"
                + "value('"+ adm.getNama_admin()+"','"+adm.getGender_admin()+"','"+adm.getNotlp_admin()
                +"','"+adm.getEmail_admin()+"','"+adm.getPass_admin()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int deleteAdm(int delId_admin){
        int hasil = 0;
        String query = "delete from admin where id_admin='"+delId_admin+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateAdm(Admin newAdm){
        int hasil = 0;
        String query = "update admin set nama_admin='"+newAdm.getNama_admin()+"',gender_admin='"+
                newAdm.getGender_admin()+"', notlp_admin = '"+ newAdm.getNotlp_admin()+"', email_admin = '"+
                newAdm.getEmail_admin()+"', pass_admin = '"+ newAdm.getPass_admin()+"' where id_admin = '"+
                newAdm.getId_admin() + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
