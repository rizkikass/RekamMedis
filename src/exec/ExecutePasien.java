/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.Pasien;
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
public class ExecutePasien {
    public List<Pasien> getPat(){
        List<Pasien> listPat = new ArrayList<>();
        String query = "select * from pasien";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Pasien pat = new Pasien();
                pat.setId_pasien(rs.getInt("id_pasien"));
                pat.setNama_pasien(rs.getString("nama_pasien"));
                pat.setDob_pasien(rs.getString("dob_pasien"));
                pat.setGender_pasien(rs.getString("gender_pasien"));
                pat.setAgama_pasien(rs.getString("agama_pasien"));
                pat.setKewarganegaraan_pasien(rs.getString("kewarganegaraan_pasien"));
                pat.setAlamat_pasien(rs.getString("alamat_pasien"));
                pat.setPekerjaan_pasien(rs.getString("pekerjaan_pasien"));
                pat.setNotlp_pasien(rs.getString("notlp_pasien"));
                listPat.add(pat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listPat;
    }
    
    public int insertPat(Pasien pat){
        int hasil = 0;
        String query = "Insert into pasien( nama_pasien, dob_pasien, gender_pasien, agama_pasien, kewarganegaraan_pasien, alamat_pasien, pekerjaan_pasien, notlp_pasien)"
                + "value('"+ pat.getNama_pasien()+"','"+ pat.getDob_pasien()+"','"+ pat.getGender_pasien()+"','"+ pat.getAgama_pasien()+"','"+pat.getKewarganegaraan_pasien()+
                "','"+pat.getAlamat_pasien()+"','"+pat.getPekerjaan_pasien()+"','"+pat.getNotlp_pasien()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int deletePat(int delId_pasien){
        int hasil = 0;
        String query = "delete from pasien where id_pasien='"+delId_pasien+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updatePat(Pasien newPat){
        int hasil = 0;
        String query = "update pasien set nama_pasien='"+newPat.getNama_pasien()+"', dob_pasien='"+newPat.getDob_pasien()+
                "', gender_pasien='"+newPat.getGender_pasien()+"', agama_pasien='"+newPat.getAgama_pasien()+
                "', kewarganegaraan_pasien='"+newPat.getKewarganegaraan_pasien()+"' , alamat_pasien='"+newPat.getAlamat_pasien()+"' , pekerjaan_pasien='"+newPat.getPekerjaan_pasien()+
                "', notlp_pasien = '"+ newPat.getNotlp_pasien()+"' where id_pasien = '"+newPat.getId_pasien() + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecutePasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
