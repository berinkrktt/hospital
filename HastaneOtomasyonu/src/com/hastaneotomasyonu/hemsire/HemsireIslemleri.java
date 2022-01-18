
package com.hastaneotomasyonu.hemsire;

import com.hastaneotomasyonu.danisma.DanismaIslemleri;
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


public class HemsireIslemleri {
    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    
    public boolean girisYap(String tc,String sifre){
    String sorgu ="Select * From hemsire where TC = ? and Sifre =?";
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, sifre);  
            ResultSet rs = preparedStatement.executeQuery();
          
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(HemsireIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;      
        }
    
    }
      public void sonucEkle(int no, String tc, String ad, String soyad, String tahlil, String tarih, String durum) {
        String sorgu = "INSERT INTO laboratuvar (Labid, HastaTC, HastaAd, HastaSoyad, Tahliller, Tarih, SonucDurum) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, tc);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(5, tahlil);
            preparedStatement.setString(6, tarih);
            preparedStatement.setString(7, durum);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public boolean isHastaNo(int no) {
        try {
            String sorgu = "SELECT * FROM laboratuvar WHERE Labid = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noOlustur() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(9999998);

            if (isHastaNo(no) == false) {
                return no;
            }
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
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
     public void guncelle(String no, String ad, String soyad, String tahlil, String tarih, String durum) {
        String sorgu = "UPDATE laboratuvar SET HastaAd = ? , HastaSoyad = ? , Tahliller = ? , Tarih = ? , SonucDurum = ? WHERE HastaTc = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tahlil);
            preparedStatement.setString(4, tarih);
            preparedStatement.setString(5, durum);
            preparedStatement.setString(6, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HemsireIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public boolean isSifreDegistir(String tc) {
        try {
            String sorgu = "SELECT * FROM hemsire WHERE TC = ? ";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, tc);
           

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(HemsireIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void sifreDegistir(String tc, String sifre) {
        try {
            String sorgu = "UPDATE hemsire SET Sifre = ? WHERE TC = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, sifre);
            preparedStatement.setString(2, tc);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HemsireIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
