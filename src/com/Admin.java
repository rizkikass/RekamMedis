/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author asus
 */
public class Admin {
    private int id_admin;
    private String nama_admin;
    private String gender_admin;
    private String notlp_admin;
    private String email_admin;
    private String pass_admin;

    public Admin() {
    }

    public Admin(String nama_admin, String gender_admin, String notlp_admin, String email_admin, String pass_admin) {
        this.nama_admin = nama_admin;
        this.gender_admin = gender_admin;
        this.notlp_admin = notlp_admin;
        this.email_admin = email_admin;
        this.pass_admin = pass_admin;
    }

    public Admin(int id_admin, String nama_admin, String gender_admin, String notlp_admin, String email_admin, String pass_admin) {
        this.id_admin = id_admin;
        this.nama_admin = nama_admin;
        this.gender_admin = gender_admin;
        this.notlp_admin = notlp_admin;
        this.email_admin = email_admin;
        this.pass_admin = pass_admin;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNama_admin() {
        return nama_admin;
    }

    public void setNama_admin(String nama_admin) {
        this.nama_admin = nama_admin;
    }

    public String getGender_admin() {
        return gender_admin;
    }

    public void setGender_admin(String gender_admin) {
        this.gender_admin = gender_admin;
    }

    public String getNotlp_admin() {
        return notlp_admin;
    }

    public void setNotlp_admin(String notlp_admin) {
        this.notlp_admin = notlp_admin;
    }

    public String getEmail_admin() {
        return email_admin;
    }

    public void setEmail_admin(String email_admin) {
        this.email_admin = email_admin;
    }

    public String getPass_admin() {
        return pass_admin;
    }

    public void setPass_admin(String pass_admin) {
        this.pass_admin = pass_admin;
    }

    @Override
    public String toString() {
        return "Admin{" + "id_admin=" + id_admin + ", nama_admin=" + nama_admin + ", gender_admin=" + gender_admin + ", notlp_admin=" + notlp_admin + ", email_admin=" + email_admin + ", pass_admin=" + pass_admin + '}';
    }
}
