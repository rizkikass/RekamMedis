/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.Dokter;
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
public class ExecuteDokter {
    public List<Dokter> getDok(){
        List<Dokter> listDok = new ArrayList<>();
        String query = "select * from dokter";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Dokter dok = new Dokter();
                dok.setId_dokter(rs.getInt("id_dokter"));
                dok.setNama_dokter(rs.getString("nama_dokter"));
                dok.setSpesialis(rs.getString("spesialis"));
                dok.setGender_dokter(rs.getString("gender_dokter"));
                dok.setNotlp_dokter(rs.getString("notlp_dokter"));
                dok.setHari_shift(rs.getString("hari_shift"));
                dok.setMulai_shift(rs.getString("mulai_shift"));
                dok.setAkhir_shift(rs.getString("akhir_shift"));
                listDok.add(dok);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listDok;
    }
    
    public int insertDok(Dokter dok){
        int hasil = 0;
        String query = "Insert into dokter( nama_dokter, spesialis, gender_dokter, notlp_dokter, hari_shift, mulai_shift, akhir_shift)"
                + "value('"+ dok.getNama_dokter()+"','"+dok.getSpesialis()+"','"+dok.getGender_dokter()+"','"+dok.getNotlp_dokter()
                +"','"+dok.getHari_shift()+"','"+dok.getMulai_shift()+"','"+dok.getAkhir_shift()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int deleteDok(int delId_dokter){
        int hasil = 0;
        String query = "delete from dokter where id_dokter='"+delId_dokter+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateDok(Dokter newDok){
        int hasil = 0;
        String query = "update dokter set nama_dokter='"+newDok.getNama_dokter()+"', spesialis='"+newDok.getSpesialis()+
                "', gender_dokter='"+newDok.getGender_dokter()+"', notlp_dokter='"+newDok.getNotlp_dokter()+
                "', hari_shift='"+newDok.getHari_shift()+"' , mulai_shift='"+newDok.getMulai_shift()+
                "', akhir_shift = '"+ newDok.getAkhir_shift()+"' where id_dokter = '"+newDok.getId_dokter() + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
