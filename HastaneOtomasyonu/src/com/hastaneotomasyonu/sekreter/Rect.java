
package com.hastaneotomasyonu.sekreter;


public class Rect {
    private int no;
    private String tc;
    private String ad;
    private String soyad;
    private String ilacAd;

    public Rect(int no, String tc, String ad, String soyad, String ilacAd) {
        this.no = no;
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.ilacAd = ilacAd;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public String getIlacAd() {
        return ilacAd;
    }

    public void setIlacAd(String ilacAd) {
        this.ilacAd = ilacAd;
    }

    
}
