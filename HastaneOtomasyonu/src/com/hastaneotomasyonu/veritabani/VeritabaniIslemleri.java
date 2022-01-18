
package com.hastaneotomasyonu.veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeritabaniIslemleri {
    public static Connection connection = null;
    private static PreparedStatement preparedStatement = null;

    public VeritabaniIslemleri() {
        String url = "jdbc:mysql://" + Veritabani.host + ":" + Veritabani.port + "/" + 
                Veritabani.name + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver bulunamadı!");
        }

        try {
            connection = DriverManager.getConnection(url, Veritabani.username, Veritabani.password);
            System.out.println("Bağlantı Başarılı.");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız!");
        }
    }
  
}
