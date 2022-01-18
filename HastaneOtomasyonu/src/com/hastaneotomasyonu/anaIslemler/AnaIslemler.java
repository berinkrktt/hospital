package com.hastaneotomasyonu.anaIslemler;

import com.hastaneotomasyonu.danisma.Danisma;
import com.hastaneotomasyonu.doktor.Doktor;
import com.hastaneotomasyonu.hemsire.Hemsire;
import com.hastaneotomasyonu.sekreter.Sekreter;
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

public class AnaIslemler {

    private final Connection connection = VeritabaniIslemleri.connection;
    private Statement statement;
    private PreparedStatement preparedStatement = null;

    public ArrayList<Danisma> DanismanGetir() {
        ArrayList<Danisma> list = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM danisma ORDER BY danisma.Ad ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("Danismaid");
                String ad = result.getString("Ad");
                String soyad = result.getString("Soyad");
                String tc = result.getString("TC");

                list.add(new Danisma(no, ad, soyad, tc, soyad));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Doktor> DoktorGetir() {
        ArrayList<Doktor> list = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM doktor ORDER BY doktor.Ad ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("Doktorid");
                String ad = result.getString("Ad");
                String soyad = result.getString("Soyad");
                String tc = result.getString("TC");

                list.add(new Doktor(no, ad, soyad, tc));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Hemsire> HemsireGetir() {
        ArrayList<Hemsire> list = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM hemsire ORDER BY hemsire.Ad ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("Hemsireid");
                String ad = result.getString("Ad");
                String soyad = result.getString("Soyad");
                String tc = result.getString("TC");

                list.add(new Hemsire(no, ad, soyad, tc));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Sekreter> SekreterGetir() {
        ArrayList<Sekreter> list = new ArrayList<>();

        try {
            statement = connection.createStatement();

            String sorgu = "SELECT * FROM sekreter ORDER BY sekreter.Ad ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int no = result.getInt("Sekreterid");
                String ad = result.getString("Ad");
                String soyad = result.getString("Soyad");
                String tc = result.getString("TC");

                list.add(new Sekreter(no, ad, soyad, tc));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void danismaEkle(int danisman, String tc, String ad, String soyad) {
        String sorgu = "INSERT INTO danisma (Danismaid, Ad, Soyad, TC) VALUES (?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, danisman);
            preparedStatement.setString(2, tc);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void danismanGuncelle(int no, String tc, String ad, String soyad) {
        String sorgu = "UPDATE danisma SET Ad = ?, Soyad = ?, TC = ? where Danismaid = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tc);
            preparedStatement.setInt(4, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void danismaSil(int no) {
        String sorgu = "DELETE FROM danisma WHERE Danismaid = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isNo(int no) {
        try {
            String sorgu = "SELECT * FROM danisma WHERE Danismaid = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noOlustur() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(99998);

            if (isNo(no) == false) {
                return no;
            }
        }
    }

    public void doktorEkle(int no, String tc, String ad, String soyad) {
        String sorgu = "INSERT INTO doktor (Doktorid, Ad, Soyad, TC) VALUES (?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, tc);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void doktorGuncelle(int no, String tc, String ad, String soyad) {
        String sorgu = "UPDATE doktor SET Ad = ?, Soyad = ?, TC = ? where Doktorid = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tc);
            preparedStatement.setInt(4, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void doktorSil(int no) {
        String sorgu = "DELETE FROM doktor WHERE Doktorid = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isdoktorNo(int no) {
        try {
            String sorgu = "SELECT * FROM doktor WHERE Doktorid = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noDoktor() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(9998);

            if (isdoktorNo(no) == false) {
                return no;
            }
        }
    }

    public void hemsireEkle(int no, String tc, String ad, String soyad) {
        String sorgu = "INSERT INTO hemsire (Hemsireid, Ad, Soyad, TC) VALUES (?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, tc);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void hemsireGuncelle(int no, String tc, String ad, String soyad) {
        String sorgu = "UPDATE hemsire SET Ad = ?, Soyad = ?, TC = ? where Hemsireid = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tc);
            preparedStatement.setInt(4, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void hemsireSil(int no) {
        String sorgu = "DELETE FROM hemsire WHERE Hemsireid = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean ishemsireNo(int no) {
        try {
            String sorgu = "SELECT * FROM hemsire WHERE Hemsireid = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noHemsire() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(999998);

            if (ishemsireNo(no) == false) {
                return no;
            }
        }
    }

    public void sekreterEkle(int no, String tc, String ad, String soyad) {
        String sorgu = "INSERT INTO sekreter (Sekreterid, Ad, Soyad, TC) VALUES (?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);
            preparedStatement.setString(2, tc);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sekreterGuncelle(int no, String tc, String ad, String soyad) {
        String sorgu = "UPDATE sekreter SET Ad = ?, Soyad = ?, TC = ? where Sekreterid = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tc);
            preparedStatement.setInt(4, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sekreterSil(int no) {
        String sorgu = "DELETE FROM sekreter WHERE Sekreterid = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean issekreterNo(int no) {
        try {
            String sorgu = "SELECT * FROM sekreter WHERE Sekreterid = ?";
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(AnaIslemler.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noSekreter() {
        Random random = new Random();
        while (true) {
            int no = 1 + random.nextInt(999998);

            if (ishemsireNo(no) == false) {
                return no;
            }
        }
    }
}
