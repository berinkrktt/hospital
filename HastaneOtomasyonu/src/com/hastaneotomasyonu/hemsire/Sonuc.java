
package com.hastaneotomasyonu.hemsire;

public class Sonuc {
    private int id;
    private String tc;
    private String ad;
    private String soyad; 
    private String tahlil;
    private String durum;
    private String tarih;

    public Sonuc(int id, String tc, String ad, String soyad, String tahlil, String durum, String tarih) {
        this.id = id;
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.tahlil = tahlil;
        this.durum = durum;
        this.tarih = tarih;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
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

    public String getTahlil() {
        return tahlil;
    }

    public void setTahlil(String tahlil) {
        this.tahlil = tahlil;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    
}
