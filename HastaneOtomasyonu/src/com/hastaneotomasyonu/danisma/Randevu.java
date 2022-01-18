
package com.hastaneotomasyonu.danisma;

public class Randevu {
    private int id;
    private String tc;
    private String ad;
    private String soyad;
    private String brans;
    private String doktorAdi;
    private String durum;
    private String tarih;
    private String saat;

    public Randevu(int id, String tc, String ad, String soyad, String brans, String doktorAdi, String durum, String tarih, String saat) {
        this.id = id;
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.doktorAdi = doktorAdi;
        this.durum = durum;
        this.tarih = tarih;
        this.saat = saat;
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

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getDoktorAdi() {
        return doktorAdi;
    }

    public void setDoktorAdi(String doktorAdi) {
        this.doktorAdi = doktorAdi;
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

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }
    
}
