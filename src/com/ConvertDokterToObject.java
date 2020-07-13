/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecuteDokter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class ConvertDokterToObject {
    public String[][] getDok(){
        List<Dokter> myDok = new ArrayList<Dokter>();
        ExecuteDokter eDok = new ExecuteDokter();
        myDok = eDok.getDok();
        String[][] dataDok = new String[myDok.size()][8];
        int i=0;
        for(Dokter dok : myDok){
            dataDok[i][0] = ""+dok.getId_dokter();
            dataDok[i][1] = dok.getNama_dokter();
            dataDok[i][2] = dok.getSpesialis();
            dataDok[i][3] = dok.getGender_dokter();
            dataDok[i][4] = dok.getNotlp_dokter();
            dataDok[i][5] = dok.getHari_shift();
            dataDok[i][6] = dok.getMulai_shift();
            dataDok[i][7] = dok.getAkhir_shift();
            i++;
        }
        return dataDok;
    }
}
