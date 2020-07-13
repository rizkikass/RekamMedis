/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecutePasien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class ConvertPasienToObject {
    public String[][] getPat(){
        List<Pasien> myPat = new ArrayList<Pasien>();
        ExecutePasien ePat = new ExecutePasien();
        myPat = ePat.getPat();
        String[][] dataPat = new String[myPat.size()][9];
        int i=0;
        for(Pasien pat : myPat){
            dataPat[i][0] = ""+pat.getId_pasien();
            dataPat[i][1] = pat.getNama_pasien();
            dataPat[i][2] = pat.getDob_pasien();
            dataPat[i][3] = pat.getGender_pasien();
            dataPat[i][4] = pat.getAgama_pasien();
            dataPat[i][5] = pat.getKewarganegaraan_pasien();
            dataPat[i][6] = pat.getAlamat_pasien();
            dataPat[i][7] = pat.getPekerjaan_pasien();
            dataPat[i][8] = pat.getNotlp_pasien();
            i++;
        }
        return dataPat;
    }
}
