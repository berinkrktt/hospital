
package com.hastaneotomasyonu.sekreter;


import com.hastaneotomasyonu.danisma.DanismaIslemleri;
import com.hastaneotomasyonu.hasta.Hasta;
import com.hastaneotomasyonu.hemsire.HemsireIslemleri;
import com.hastaneotomasyonu.veritabani.VeritabaniIslemleri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SekreterIslemleri {
    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    
    public boolean girisYap(String tc,String sifre){
    String sorgu ="Select * From sekreter where TC = ? and Sifre =?";
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, sifre);  
            ResultSet rs = preparedStatement.executeQuery();
          
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(SekreterIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;      
        }
    
    }

   
        public ArrayList<Hasta> sonucGoster() {
        ArrayList<Hasta> sonuc = new ArrayList<>();
        try {
            statement = connection.createStatement();
            String sorgu = "SELECT * FROM hasta ORDER BY hasta.HastaAd ASC";
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int no = rs.getInt("Labid");
                String tc = rs.getString("HastaTC");
                String ad = rs.getString("HastaAd");
                String soyad = rs.getString("HastaSoyad");
                String tahlil = rs.getString("Tahliller");
                String durum = rs.getString("SonucDurum");
                String tarih = rs.getString("Tarih");

            sonuc.add(new Hasta(no, ad, soyad, tc, durum, tarih, tahlil, soyad));
 
            }
            return sonuc;

        } catch (SQLException ex) {
            Logger.getLogger(SekreterIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    public ArrayList<Rect> receteGoster(){
     ArrayList<Rect> recete = new ArrayList<>();
        try {
            statement = connection.createStatement();
             String sorgu = "SELECT * FROM recete ORDER BY recete.HastaAd ASC";
     
             ResultSet result = statement.executeQuery(sorgu);
             
             while(result.next()){
               int no = result.getInt("Receteid");
               String tc = result.getString("HastaTC");
               String ad = result.getString("HastaAd");
               String soyad = result.getString("HastaSoyad");
               String ilac = result.getString("DoktorAciklama");
               
               recete.add(new Rect(no, tc, ad, soyad, ilac));
               
             }
             return recete;
        } catch (SQLException ex) {
            Logger.getLogger(SekreterIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     
    
    }
     public void guncelle(String no, String ad) {
        String sorgu = "UPDATE recete SET DoktorAciklama = ? WHERE HastaTC = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, no);
 
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HemsireIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public int noOlustur() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(99998);

            if (isHastaNo(no) == false) {
                return no;
            }
        }
    }
      public boolean isHastaNo(int no) {
        try {
            String sorgu = "SELECT * FROM recete WHERE Receteid = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(SekreterIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
  public void receteYaz(int no, String ad, String soyad, String ilac, String tc) {
        String sorgu = "INSERT INTO Recete (Receteid, HastaTC, HastaAd, HastaSoyad, DoktorAciklama) VALUES (?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, tc);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(5, ilac);
           

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SekreterIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public boolean isSifreDegistir(String tc) {
        try {
            String sorgu = "SELECT * FROM sekreter WHERE TC = ? ";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, tc);
           

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(SekreterIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void sifreDegistir(String tc, String sifre) {
        try {
            String sorgu = "UPDATE sekreter SET Sifre = ? WHERE TC = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, sifre);
            preparedStatement.setString(2, tc);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SekreterIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
