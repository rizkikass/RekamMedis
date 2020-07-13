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
public class Pasien {
    private int id_pasien;
    private String nama_pasien;
    private String dob_pasien;
    private String gender_pasien;
    private String agama_pasien;
    private String kewarganegaraan_pasien;
    private String alamat_pasien;
    private String pekerjaan_pasien;
    private String notlp_pasien;

    public Pasien() {
    }

    public Pasien(String nama_pasien, String dob_pasien, String gender_pasien, String agama_pasien, String kewarganegaraan_pasien, String alamat_pasien, String pekerjaan_pasien, String notlp_pasien) {
        this.nama_pasien = nama_pasien;
        this.dob_pasien = dob_pasien;
        this.gender_pasien = gender_pasien;
        this.agama_pasien = agama_pasien;
        this.kewarganegaraan_pasien = kewarganegaraan_pasien;
        this.alamat_pasien = alamat_pasien;
        this.pekerjaan_pasien = pekerjaan_pasien;
        this.notlp_pasien = notlp_pasien;
    }

    public Pasien(int id_pasien, String nama_pasien, String dob_pasien, String gender_pasien, String agama_pasien, String kewarganegaraan_pasien, String alamat_pasien, String pekerjaan_pasien, String notlp_pasien) {
        this.id_pasien = id_pasien;
        this.nama_pasien = nama_pasien;
        this.dob_pasien = dob_pasien;
        this.gender_pasien = gender_pasien;
        this.agama_pasien = agama_pasien;
        this.kewarganegaraan_pasien = kewarganegaraan_pasien;
        this.alamat_pasien = alamat_pasien;
        this.pekerjaan_pasien = pekerjaan_pasien;
        this.notlp_pasien = notlp_pasien;
    }

    public int getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(int id_pasien) {
        this.id_pasien = id_pasien;
    }

    public String getNama_pasien() {
        return nama_pasien;
    }

    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }

    public String getDob_pasien() {
        return dob_pasien;
    }

    public void setDob_pasien(String dob_pasien) {
        this.dob_pasien = dob_pasien;
    }

    public String getGender_pasien() {
        return gender_pasien;
    }

    public void setGender_pasien(String gender_pasien) {
        this.gender_pasien = gender_pasien;
    }

    public String getAgama_pasien() {
        return agama_pasien;
    }

    public void setAgama_pasien(String agama_pasien) {
        this.agama_pasien = agama_pasien;
    }

    public String getKewarganegaraan_pasien() {
        return kewarganegaraan_pasien;
    }

    public void setKewarganegaraan_pasien(String kewarganegaraan_pasien) {
        this.kewarganegaraan_pasien = kewarganegaraan_pasien;
    }

    public String getAlamat_pasien() {
        return alamat_pasien;
    }

    public void setAlamat_pasien(String alamat_pasien) {
        this.alamat_pasien = alamat_pasien;
    }

    public String getPekerjaan_pasien() {
        return pekerjaan_pasien;
    }

    public void setPekerjaan_pasien(String pekerjaan_pasien) {
        this.pekerjaan_pasien = pekerjaan_pasien;
    }

    public String getNotlp_pasien() {
        return notlp_pasien;
    }

    public void setNotlp_pasien(String notlp_pasien) {
        this.notlp_pasien = notlp_pasien;
    }

    @Override
    public String toString() {
        return "Pasien{" + "id_pasien=" + id_pasien + ", nama_pasien=" + nama_pasien + ", dob_pasien=" + dob_pasien + ", gender_pasien=" + gender_pasien + ", agama_pasien=" + agama_pasien + ", kewarganegaraan_pasien=" + kewarganegaraan_pasien + ", alamat_pasien=" + alamat_pasien + ", pekerjaan_pasien=" + pekerjaan_pasien + ", notlp_pasien=" + notlp_pasien + '}';
    }
}
