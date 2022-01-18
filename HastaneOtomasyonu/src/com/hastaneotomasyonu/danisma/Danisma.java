
package com.hastaneotomasyonu.danisma;

public class Danisma {
    private int id;
    private String Ad;
    private String Soyad;
    private String Tc;
    private String Sifre;
    
    
    public Danisma(int id, String Ad, String Soyad, String Tc, String Sifre) {
        this.id = id;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Tc = Tc;
        this.Sifre = Sifre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public String getTc() {
        return Tc;
    }

    public void setTc(String Tc) {
        this.Tc = Tc;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String Sifre) {
        this.Sifre = Sifre;
    }
    
}
