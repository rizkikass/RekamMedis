/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecuteRegistrasi;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class ConvertRegistrasiToObject {
    public String[][] getReg(){
        List<Registrasi> myReg = new ArrayList<Registrasi>();
        ExecuteRegistrasi eReg = new ExecuteRegistrasi();
        myReg = eReg.getReg();
        String[][] dataReg = new String[myReg.size()][9];
        int i=0;
        for(Registrasi reg : myReg){
            dataReg[i][0] = ""+reg.getId_registrasi();
            dataReg[i][1] = ""+reg.getId_pasien();
            dataReg[i][2] = ""+reg.getId_admin();
            dataReg[i][3] = ""+reg.getId_dokter();
            dataReg[i][4] = reg.getTgl_regis();
            dataReg[i][5] = reg.getCara_pembayaran();
            dataReg[i][6] = reg.getCara_masuk();
            dataReg[i][7] = reg.getPoliklinik();
            dataReg[i][8] = reg.getTriase();
            i++;
        }
        return dataReg;
    }
}
