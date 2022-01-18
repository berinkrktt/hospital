
package com.hastaneotomasyonu.doktor;


import com.hastaneotomasyonu.danisma.DanismaIslemleri;
import com.hastaneotomasyonu.hasta.Hasta;
import com.hastaneotomasyonu.hemsire.Sonuc;
import com.hastaneotomasyonu.veritabani.VeritabaniIslemleri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DoktorIslemleri {
    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<Hasta> hastaGoster(){
    ArrayList<Hasta> hasta = new ArrayList<>();
    
        try {
            statement = connection.createStatement();
            String sorgu = "SELECT * FROM hasta ORDER BY hasta.HastaAd ASC";
             ResultSet rs = statement.executeQuery(sorgu);
             
             while(rs.next()){
                int no = rs.getInt("Hastaid");
                String tc = rs.getString("HastaTC");
                String ad = rs.getString("HastaAd");
                String soyad = rs.getString("HastaSoyad");
                String doktor = rs.getString("DoktorAdi");
               
                
                hasta.add(new Hasta(no, ad, soyad, tc, doktor, doktor, soyad, soyad));
             }
             return hasta;
            
        } catch (SQLException ex) {
            Logger.getLogger(DoktorIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    
    }
     public ArrayList<Sonuc> sonucGoster() {
        ArrayList<Sonuc> sonuc = new ArrayList<>();
        try {
            statement = connection.createStatement();
            String sorgu = "SELECT * FROM laboratuvar ORDER BY laboratuvar.HastaAd ASC";
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int no = rs.getInt("Labid");
                String tc = rs.getString("HastaTC");
                String ad = rs.getString("HastaAd");
                String soyad = rs.getString("HastaSoyad");
                String tahlil = rs.getString("Tahliller");
                String durum = rs.getString("SonucDurum");
                String tarih = rs.getString("Tarih");

                sonuc.add(new Sonuc(no, tc, ad, soyad, tahlil, durum, tarih));

            }
            return sonuc;

        } catch (SQLException ex) {
            Logger.getLogger(DoktorIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    
    public boolean girisYap(String tc,String sifre){
    String sorgu ="Select * From doktor where TC = ? and Sifre =?";
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, sifre);  
            ResultSet rs = preparedStatement.executeQuery();
          
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(DoktorIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;      
        }
    
    }
    
    public void Guncelle(String no, String durum){
    String sorgu = "UPDATE randevu SET Durum = ? WHERE HastaTC = ?";
    
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, durum);
            preparedStatement.setString(2, no);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DoktorIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
      public boolean isSifreDegistir(String tc) {
        try {
            String sorgu = "SELECT * FROM doktor WHERE TC = ? ";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, tc);
           

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(DoktorIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void sifreDegistir(String tc, String sifre) {
        try {
            String sorgu = "UPDATE doktor SET Sifre = ? WHERE TC = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, sifre);
            preparedStatement.setString(2, tc);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoktorIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
