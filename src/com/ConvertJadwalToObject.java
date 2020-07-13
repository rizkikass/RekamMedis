/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecuteJadwal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class ConvertJadwalToObject {
    public String[][] getJad(String spesialis){
        List<Dokter> myDok = new ArrayList<Dokter>();
        ExecuteJadwal eJad = new ExecuteJadwal();
        myDok = eJad.getJad(spesialis);
        String[][] dataDok = new String[myDok.size()][5];
        int i=0;
        for(Dokter dok : myDok){
            dataDok[i][0] = ""+dok.getId_dokter();
            dataDok[i][1] = dok.getNama_dokter();
            dataDok[i][2] = dok.getHari_shift();
            dataDok[i][3] = dok.getMulai_shift();
            dataDok[i][4] = dok.getAkhir_shift();
            i++;
        }
        return dataDok;
    }
}
