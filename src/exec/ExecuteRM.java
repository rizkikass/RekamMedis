/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.RekamMedis;
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
public class ExecuteRM {
    public List<RekamMedis> getRM(){
        List<RekamMedis> listRM = new ArrayList<>();
        String query = "select * from rekam_medis";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                RekamMedis rm = new RekamMedis();
                rm.setId_rm(rs.getInt("id_rm"));
                rm.setId_registrasi(rs.getInt("id_registrasi"));
                rm.setTgl_masuk(rs.getString("tgl_masuk"));
                rm.setTgl_keluar(rs.getString("tgl_keluar"));
                rm.setRuang(rs.getString("ruang"));
                rm.setPoliklinik(rs.getString("poliklinik"));
                rm.setAnamnesa(rs.getString("anamnesa"));
                rm.setDiagnosa(rs.getString("diagnosa"));
                rm.setTerapi(rs.getString("terapi"));
                rm.setCara_keluar(rs.getString("cara_keluar"));
                listRM.add(rm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listRM;
    }
    
    public int insertRM(RekamMedis rm){
        int hasil = 0;
        String query = "Insert into rekam_medis( id_registrasi, tgl_masuk, tgl_keluar, ruang, poliklinik, anamnesa, diagnosa, terapi, cara_keluar)"
                + "value('"+ rm.getId_registrasi()+"','"+ rm.getTgl_masuk()+"','"+ rm.getTgl_keluar()+"','"+rm.getRuang()+
                "','"+rm.getPoliklinik()+"','"+rm.getAnamnesa()+"','"+rm.getDiagnosa()+"','"+rm.getTerapi()+"','"+rm.getCara_keluar()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int deleteRM(int delId_rm){
        int hasil = 0;
        String query = "delete from rekam_medis where id_rm='"+delId_rm+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateRM(RekamMedis newRM){
        int hasil = 0;
        String query = "update rekam_medis set id_registrasi='"+newRM.getId_registrasi()+"', tgl_masuk='"+newRM.getTgl_masuk()+
                "', tgl_keluar='"+newRM.getTgl_keluar()+"', ruang='"+newRM.getRuang()+"', poliklinik='"+newRM.getPoliklinik()+
                "', anamnesa='"+newRM.getAnamnesa()+"' , diagnosa='"+newRM.getDiagnosa()+"' , terapi='"+newRM.getTerapi()+
                "', cara_keluar = '"+ newRM.getCara_keluar()+"' where id_rm = '"+newRM.getId_rm() + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}
