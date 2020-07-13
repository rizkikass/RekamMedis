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
public class Registrasi {
    private int id_registrasi, id_pasien, id_admin, id_dokter;
    private String tgl_regis, cara_pembayaran, cara_masuk, poliklinik, triase;

    public Registrasi() {
    }

    public Registrasi(int id_registrasi, int id_pasien, int id_admin, int id_dokter, String tgl_regis, String cara_pembayaran, String cara_masuk, String poliklinik, String triase) {
        this.id_registrasi = id_registrasi;
        this.id_pasien = id_pasien;
        this.id_admin = id_admin;
        this.id_dokter = id_dokter;
        this.tgl_regis = tgl_regis;
        this.cara_pembayaran = cara_pembayaran;
        this.cara_masuk = cara_masuk;
        this.poliklinik = poliklinik;
        this.triase = triase;
    }

    public Registrasi(int id_pasien, int id_admin, int id_dokter, String tgl_regis, String cara_pembayaran, String cara_masuk, String poliklinik, String triase) {
        this.id_pasien = id_pasien;
        this.id_admin = id_admin;
        this.id_dokter = id_dokter;
        this.tgl_regis = tgl_regis;
        this.cara_pembayaran = cara_pembayaran;
        this.cara_masuk = cara_masuk;
        this.poliklinik = poliklinik;
        this.triase = triase;
    }
    
    public int getId_registrasi() {
        return id_registrasi;
    }

    public void setId_registrasi(int id_registrasi) {
        this.id_registrasi = id_registrasi;
    }

    public int getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(int id_pasien) {
        this.id_pasien = id_pasien;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getTgl_regis() {
        return tgl_regis;
    }

    public void setTgl_regis(String tgl_regis) {
        this.tgl_regis = tgl_regis;
    }

    public String getCara_pembayaran() {
        return cara_pembayaran;
    }

    public void setCara_pembayaran(String cara_pembayaran) {
        this.cara_pembayaran = cara_pembayaran;
    }

    public String getCara_masuk() {
        return cara_masuk;
    }

    public void setCara_masuk(String cara_masuk) {
        this.cara_masuk = cara_masuk;
    }

    public String getPoliklinik() {
        return poliklinik;
    }

    public void setPoliklinik(String poliklinik) {
        this.poliklinik = poliklinik;
    }

    public String getTriase() {
        return triase;
    }

    public void setTriase(String triase) {
        this.triase = triase;
    }

    public int getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(int id_dokter) {
        this.id_dokter = id_dokter;
    }
    
    @Override
    public String toString() {
        return "Registrasi{" + "id_registrasi=" + id_registrasi + ", id_pasien=" + id_pasien + ", id_admin=" + id_admin + ", tgl_regis=" + tgl_regis + ", cara_pembayaran=" + cara_pembayaran + ", cara_masuk=" + cara_masuk + ", poliklinik=" + poliklinik + ", triase=" + triase + '}';
    }
}
