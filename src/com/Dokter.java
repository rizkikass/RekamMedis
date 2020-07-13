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
public class Dokter {
    private int id_dokter;
    private String nama_dokter;
    private String spesialis;
    private String gender_dokter;
    private String notlp_dokter;
    private String hari_shift;
    private String mulai_shift;
    private String akhir_shift;

    public Dokter() {
    }

    public Dokter(String nama_dokter, String spesialis, String gender_dokter, String notlp_dokter, String hari_shift, String mulai_shift, String akhir_shift) {
        this.nama_dokter = nama_dokter;
        this.spesialis = spesialis;
        this.gender_dokter = gender_dokter;
        this.notlp_dokter = notlp_dokter;
        this.hari_shift = hari_shift;
        this.mulai_shift = mulai_shift;
        this.akhir_shift = akhir_shift;
    }

    public Dokter(int id_dokter, String nama_dokter, String spesialis, String gender_dokter, String notlp_dokter, String hari_shift, String mulai_shift, String akhir_shift) {
        this.id_dokter = id_dokter;
        this.nama_dokter = nama_dokter;
        this.spesialis = spesialis;
        this.gender_dokter = gender_dokter;
        this.notlp_dokter = notlp_dokter;
        this.hari_shift = hari_shift;
        this.mulai_shift = mulai_shift;
        this.akhir_shift = akhir_shift;
    }

    public Dokter(int id_dokter, String nama_dokter, String hari_shift, String mulai_shift, String akhir_shift) {
        this.id_dokter = id_dokter;
        this.nama_dokter = nama_dokter;
        this.hari_shift = hari_shift;
        this.mulai_shift = mulai_shift;
        this.akhir_shift = akhir_shift;
    }

    public Dokter(String spesialis) {
        this.spesialis = spesialis;
    }
    
    public int getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(int id_dokter) {
        this.id_dokter = id_dokter;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getGender_dokter() {
        return gender_dokter;
    }

    public void setGender_dokter(String gender_dokter) {
        this.gender_dokter = gender_dokter;
    }

    public String getNotlp_dokter() {
        return notlp_dokter;
    }

    public void setNotlp_dokter(String notlp_dokter) {
        this.notlp_dokter = notlp_dokter;
    }

    public String getHari_shift() {
        return hari_shift;
    }

    public void setHari_shift(String hari_shift) {
        this.hari_shift = hari_shift;
    }

    public String getMulai_shift() {
        return mulai_shift;
    }

    public void setMulai_shift(String mulai_shift) {
        this.mulai_shift = mulai_shift;
    }

    public String getAkhir_shift() {
        return akhir_shift;
    }

    public void setAkhir_shift(String akhir_shift) {
        this.akhir_shift = akhir_shift;
    }

    @Override
    public String toString() {
        return "Dokter{" + "id_dokter=" + id_dokter + ", nama_dokter=" + nama_dokter + ", spesialis=" + spesialis + ", gender_dokter=" + gender_dokter + ", notlp_dokter=" + notlp_dokter + ", hari_shift=" + hari_shift + ", mulai_shift=" + mulai_shift + ", akhir_shift=" + akhir_shift + '}';
    }
}
