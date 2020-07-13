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
public class RekamMedis {
    private int id_rm, id_registrasi;
    private String tgl_masuk, tgl_keluar, ruang, poliklinik, anamnesa, diagnosa, terapi, cara_keluar;

    public RekamMedis() {
    }

    public RekamMedis(int id_rm, int id_registrasi, String tgl_masuk, String tgl_keluar, String ruang, String poliklinik, String anamnesa, String diagnosa, String terapi, String cara_keluar) {
        this.id_rm = id_rm;
        this.id_registrasi = id_registrasi;
        this.tgl_masuk = tgl_masuk;
        this.tgl_keluar = tgl_keluar;
        this.ruang = ruang;
        this.poliklinik = poliklinik;
        this.anamnesa = anamnesa;
        this.diagnosa = diagnosa;
        this.terapi = terapi;
        this.cara_keluar = cara_keluar;
    }

    public RekamMedis(int id_registrasi, String tgl_masuk, String tgl_keluar, String ruang, String poliklinik, String anamnesa, String diagnosa, String terapi, String cara_keluar) {
        this.id_registrasi = id_registrasi;
        this.tgl_masuk = tgl_masuk;
        this.tgl_keluar = tgl_keluar;
        this.ruang = ruang;
        this.poliklinik = poliklinik;
        this.anamnesa = anamnesa;
        this.diagnosa = diagnosa;
        this.terapi = terapi;
        this.cara_keluar = cara_keluar;
    }

    public int getId_rm() {
        return id_rm;
    }

    public void setId_rm(int id_rm) {
        this.id_rm = id_rm;
    }

    public int getId_registrasi() {
        return id_registrasi;
    }

    public void setId_registrasi(int id_registrasi) {
        this.id_registrasi = id_registrasi;
    }

    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public String getTgl_keluar() {
        return tgl_keluar;
    }

    public void setTgl_keluar(String tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
    }

    public String getRuang() {
        return ruang;
    }

    public void setRuang(String ruang) {
        this.ruang = ruang;
    }

    public String getPoliklinik() {
        return poliklinik;
    }

    public void setPoliklinik(String poliklinik) {
        this.poliklinik = poliklinik;
    }

    public String getAnamnesa() {
        return anamnesa;
    }

    public void setAnamnesa(String anamnesa) {
        this.anamnesa = anamnesa;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public String getTerapi() {
        return terapi;
    }

    public void setTerapi(String terapi) {
        this.terapi = terapi;
    }

    public String getCara_keluar() {
        return cara_keluar;
    }

    public void setCara_keluar(String cara_keluar) {
        this.cara_keluar = cara_keluar;
    }

    @Override
    public String toString() {
        return "RekamMedis{" + "id_rm=" + id_rm + ", id_registrasi=" + id_registrasi + ", tgl_masuk=" + tgl_masuk + ", tgl_keluar=" + tgl_keluar + ", ruang=" + ruang + ", poliklinik=" + poliklinik + ", anamnesa=" + anamnesa + ", diagnosa=" + diagnosa + ", terapi=" + terapi + ", cara_keluar=" + cara_keluar + '}';
    }
}
