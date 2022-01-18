
package com.hastaneotomasyonu.hasta;


public class Hasta {
    private int id;
    private String ad;
    private String soyad;
    private String tc;
    private String doktor;
    private String telefon;
    private String cinsiyet;
    private String sifre;

    public Hasta(int id, String ad, String soyad, String tc, String doktor, String telefon, String cinsiyet, String sifre) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
        this.doktor = doktor;
        this.telefon = telefon;
        this.cinsiyet = cinsiyet;
        this.sifre = sifre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getDoktor() {
        return doktor;
    }

    public void setDoktor(String doktor) {
        this.doktor = doktor;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    

}