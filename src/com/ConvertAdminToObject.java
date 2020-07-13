/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.ExecuteAdmin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class ConvertAdminToObject {
    public String[][] getAdm(){
        List<Admin> myAdm = new ArrayList<Admin>();
        ExecuteAdmin eAdm = new ExecuteAdmin();
        myAdm = eAdm.getAdm();
        String[][] dataAdm = new String[myAdm.size()][6];
        int i=0;
        for(Admin adm : myAdm){
            dataAdm[i][0] = ""+adm.getId_admin();
            dataAdm[i][1] = adm.getNama_admin();
            dataAdm[i][2] = adm.getGender_admin();
            dataAdm[i][3] = adm.getNotlp_admin();
            dataAdm[i][4] = adm.getEmail_admin();
            dataAdm[i][5] = adm.getPass_admin();
            i++;
        }
        return dataAdm;
    }
}
