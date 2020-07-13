/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecuteRM;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class ConvertRMToObject {
    public String[][] getRM(){
        List<RekamMedis> myRM = new ArrayList<RekamMedis>();
        ExecuteRM eRM = new ExecuteRM();
        myRM = eRM.getRM();
        String[][] dataRM = new String[myRM.size()][10];
        int i=0;
        for(RekamMedis rm : myRM){
            dataRM[i][0] = ""+rm.getId_rm();
            dataRM[i][1] = ""+rm.getId_registrasi();
            dataRM[i][2] = rm.getTgl_masuk();
            dataRM[i][3] = rm.getTgl_keluar();
            dataRM[i][4] = rm.getRuang();
            dataRM[i][5] = rm.getPoliklinik();
            dataRM[i][6] = rm.getAnamnesa();
            dataRM[i][7] = rm.getDiagnosa();
            dataRM[i][8] = rm.getTerapi();
            dataRM[i][9] = rm.getCara_keluar();
            i++;
        }
        return dataRM;
    }
}
