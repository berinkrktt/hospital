
package com.hastaneotomasyonu.hasta;


import com.hastaneotomasyonu.danisma.DanismaIslemleri;
import com.hastaneotomasyonu.veritabani.VeritabaniIslemleri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HastaIslemleri {
    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    public static Hasta girisYapanHasta;

    public HastaIslemleri() {
        try {
            statement = connection.createStatement();
            
            String sorgu = "SELECT * FROM hasta WHERE HastaTC ";
            
            ResultSet result = statement.executeQuery(sorgu);
            
            while(result.next()){
                int no = result.getInt("Hastaid");
                String Tc = result.getString("HastaTC");  
                String ad = result.getString("HastaAd");
                String soyad = result.getString("HastaSoyad");
                String sifre = result.getString("Sifre");
                String telefon = result.getString("Telefon");
                String cinsiyet = result.getString("Cinsiyet");
             
                girisYapanHasta = new Hasta(no, ad, soyad, Tc, soyad, telefon, cinsiyet, sifre);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean girisYap(String tc,String sifre){
    String sorgu ="Select * From hasta where HastaTC = ? and Sifre =?";
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, sifre);  
            ResultSet rs = preparedStatement.executeQuery();
          
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;      
        }
    
    }
public void guncelle(String tc, String ad, String soyad, String telefon){
   String sorgu = "UPDATE hasta SET HastaAd = ? , HastaSoyad = ? , Telefon = ? WHERE HastaTC = ?";
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, telefon);
            
            preparedStatement.setString(4, tc);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    public int randevuNo() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(9998);

            if (isRandevuNo(no) == false) {
                return no;
            }
        }
    }

    public boolean isRandevuNo(int no) {
        try {
            String sorgu = "SELECT * FROM randevu WHERE Randevuid = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     public void randevuAlma(int no, String tc, String ad, String soyad, String brans, String tarih, String saat) {
        String sorgu = "INSERT INTO randevu (Randevuid, HastaTC, HastaAd, HastaSoyad, KlinikAd ,Tarih, Saat) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, tc);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(5, brans);
            preparedStatement.setString(6, tarih);
            preparedStatement.setString(7, saat);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
      public int klinikSec(int klinikNo) {
        switch (klinikNo) {
            case 543123:
                return 1;
            case 741988:
                return 2;
            case 3444521:
                return 3;
            case 3452167:
                return 4;
            case 4195365:
                return 5;
            case 4332778:
                return 6;
            case 5265478:
                return 7;
            case 5674321:
                return 8;
            case 6547125:
                return 9;
            case 7895263:
                return 10;
            case 9512334:
                return 11;
            case 12396584:
                return 12;
            case 14785296:
                return 13;
            case 15975326:
                return 14;
            case 23454312:
                return 15;
            case 25874169:
                return 16;
            case 45678912:
                return 17;
            case 75412368:
                return 18;
            case 78895142:
                return 19;
            case 87634512:
                return 20;
            case 95125487:
                return 21;
            
        }
        return 0;
    }

    public int klinikNoSec(int kategoriSecimi) {
        switch (kategoriSecimi) {
            case 1:
                return 543123;
            case 2:
                return 741988;
            case 3:
                return 3444521;
            case 4:
                return 3452167;
            case 5:
                return 4195365;
            case 6:
                return 4332778;
            case 7:
                return 5265478;
            case 8:
                return 5674321;
            case 9:
                return 6547125;
            case 10:
                return 7895263;
            case 11:
                return 9512334;
            case 12:
                return 12396584;
            case 13:
                return 14785296;
            case 14:
                return 15975326;
            case 15:
                return 23454312;
            case 16:
                return 25874169;
            case 17:
                return 45678912;
            case 18:
                return 75412368;
            case 19:
                return 78895142;
            case 20:
                return 87634512;
            case 21:
                return 95125487;

        }
        return 0;
    }

    public String klinikAdiBul(int klinikNo) {
        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM klinik WHERE Klinikid = " + klinikNo;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String klinikAdi = result.getString("KlinikAd");
                return klinikAdi;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    
    public boolean isSifreDegistir(String tc) {
        try {
            String sorgu = "SELECT * FROM hasta WHERE HastaTC = ? ";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, tc);
           

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void sifreDegistir(String tc, String sifre) {
        try {
            String sorgu = "UPDATE hasta SET Sifre = ? WHERE HastaTC = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, sifre);
            preparedStatement.setString(2, tc);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HastaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
