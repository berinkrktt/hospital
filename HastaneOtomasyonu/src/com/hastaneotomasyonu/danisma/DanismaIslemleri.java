
package com.hastaneotomasyonu.danisma;


import com.hastaneotomasyonu.hemsire.Sonuc;
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

public class DanismaIslemleri {

    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;

    public ArrayList<Randevu> randevuGoster() {
        ArrayList<Randevu> randevu = new ArrayList<>();

        try {
            statement = connection.createStatement();
            String sorgu = "SELECT * FROM randevu ORDER BY randevu.HastaAd ASC";
            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("Randevuid");
                String tc = result.getString("HastaTC");
                String ad = result.getString("HastaAd");
                String soyad = result.getString("HastaSoyad");
                String brans = result.getString("KlinikAd");
                String doktor = result.getString("DoktorAdSoyad");
                String durum = result.getString("Durum");
                String tarih = result.getString("Tarih");
                String saat = result.getString("Saat");

                randevu.add(new Randevu(no, tc, ad, soyad, brans, doktor, durum, tarih, saat));
            }
            return randevu;
        } catch (SQLException ex) {
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean girisYap(String tc, String sifre) {
        String sorgu = "Select * From danisma where TC = ? and Sifre =?";
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);
            preparedStatement.setString(2, sifre);
            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean isHastaNo(int no) {
        try {
            String sorgu = "SELECT * FROM hasta WHERE Hastaid = ?";
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

    public void kayitYap(int no, String ad, String soyad, String tc, String doktor, String brans, String telefon, String cinsiyet) {
        String sorgu = "INSERT INTO hasta (Hastaid, HastaAd, HastaSoyad, HastaTC, DoktorAdi, BransAdi, Telefon, Cinsiyet)"
               + " VALUES (?,?,?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, soyad);
            preparedStatement.setString(4, tc);
            preparedStatement.setString(5, doktor);
            preparedStatement.setString(6, brans);
            preparedStatement.setString(7, telefon);
            preparedStatement.setString(8, cinsiyet);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void randevuAlma(int no, String tc, String ad, String soyad, String brans, String durum, String tarih, String saat) {
        String sorgu = "INSERT INTO randevu (Randevuid, HastaTC, HastaAd, HastaSoyad, KlinikAd, Durum, Tarih, Saat) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, tc);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(5, brans);
            preparedStatement.setString(6, durum);
            preparedStatement.setString(7, tarih);
            preparedStatement.setString(8, saat);

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
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }
    public boolean isSifreDegistir(String tc) {
        try {
            String sorgu = "SELECT * FROM danisma WHERE TC = ? ";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, tc);
           

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void sifreDegistir(String tc, String sifre) {
        try {
            String sorgu = "UPDATE danisma SET Sifre = ? WHERE TC = ?";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, sifre);
            preparedStatement.setString(2, tc);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DanismaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
