
package com.hastaneotomasyonu.hemsire;

public class Hemsire {
    private int id;
    private String Ad;
    private String Soyad;
    private String Tc;
    

    public Hemsire(int id, String Ad, String Soyad, String Tc) {
        this.id = id;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Tc = Tc;
   
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

   
    
}
