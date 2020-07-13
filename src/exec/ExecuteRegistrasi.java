/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.Registrasi;
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
public class ExecuteRegistrasi {
    public List<Registrasi> getReg(){
        List<Registrasi> listReg = new ArrayList<>();
        String query = "select * from registrasi";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Registrasi reg = new Registrasi();
                reg.setId_registrasi(rs.getInt("id_registrasi"));
                reg.setId_pasien(rs.getInt("id_pasien"));
                reg.setId_admin(rs.getInt("id_admin"));
                reg.setId_dokter(rs.getInt("id_dokter"));
                reg.setTgl_regis(rs.getString("tgl_regis"));
                reg.setCara_pembayaran(rs.getString("cara_pembayaran"));
                reg.setCara_masuk(rs.getString("cara_masuk"));
                reg.setPoliklinik(rs.getString("poliklinik"));
                reg.setTriase(rs.getString("triase"));
                listReg.add(reg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteRegistrasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listReg;
    }
    
    public int insertReg(Registrasi reg){
        int hasil = 0;
        String query = "Insert into registrasi( id_pasien, id_admin, id_dokter, tgl_regis, cara_pembayaran, cara_masuk, poliklinik, triase)"
                + "value('"+ reg.getId_pasien()+"','"+ reg.getId_admin()+"','"+ reg.getId_dokter()+"','"+ reg.getTgl_regis()+"','"+ reg.getCara_pembayaran()+"','"+reg.getCara_masuk()+
                "','"+reg.getPoliklinik()+"','"+reg.getTriase()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteRegistrasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int deleteReg(int delId_registrasi){
        int hasil = 0;
        String query = "delete from registrasi where id_registrasi='"+delId_registrasi+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteRegistrasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateReg(Registrasi newReg){
        int hasil = 0;
        String query = "update registrasi set id_pasien='"+newReg.getId_pasien()+"', id_admin='"+newReg.getId_admin()+"', id_dokter='"+newReg.getId_dokter()+
                "', tgl_regis='"+newReg.getTgl_regis()+"', cara_pembayaran='"+newReg.getCara_pembayaran()+
                "', cara_masuk='"+newReg.getCara_masuk()+"' , poliklinik='"+newReg.getPoliklinik()+
                "', triase = '"+ newReg.getTriase()+"' where id_registrasi = '"+newReg.getId_registrasi() + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteRegistrasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
