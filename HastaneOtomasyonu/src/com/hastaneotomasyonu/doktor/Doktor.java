
package com.hastaneotomasyonu.doktor;

public class Doktor {
    private int id;
    private String ad;
    private String soyad;
    private String tc;

    public Doktor(int id, String ad, String soyad, String tc) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
       
        this.tc = tc;
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
   

   
   
}
