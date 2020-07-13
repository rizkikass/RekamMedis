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
public class ExecuteJadwal {
    public List<Dokter> getJad(String spesialis){
        List<Dokter> listJad = new ArrayList<>();
        String query = "select * from dokter where spesialis ='"+spesialis+"'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Dokter dok = new Dokter();
                dok.setId_dokter(rs.getInt("id_dokter"));
                dok.setNama_dokter(rs.getString("nama_dokter"));
                dok.setHari_shift(rs.getString("hari_shift"));
                dok.setMulai_shift(rs.getString("mulai_shift"));
                dok.setAkhir_shift(rs.getString("akhir_shift"));
                listJad.add(dok);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listJad;
    }
}
