/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hastaneotomasyonu.sekreter;

import com.HastaneOtomasyonu;
import com.hastaneotomasyonu.hasta.HastaEkrani;
import static com.hastaneotomasyonu.hasta.HastaGiris.hashPassword;
import com.hastaneotomasyonu.uyarilar.UyariEkrani;
import com.hastaneotomasyonu.veritabani.VeritabaniIslemleri;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class SekreterGiris extends javax.swing.JFrame {
     VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();
     SekreterIslemleri sekreterIslemleri = new SekreterIslemleri();
    /**
     * Creates new form HemsireGiris
     */
    public SekreterGiris() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
        
    }
    public static String hashPassword(String sifre) {
        try {
            MessageDigest hash = MessageDigest.getInstance("SHA-256");
            hash.update(sifre.getBytes());
            byte[] sonuc = hash.digest();

            return new BigInteger(sonuc).toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AltPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        EkranAdi = new javax.swing.JLabel();
        KapamaTusu = new javax.swing.JLabel();
        TCAlani = new javax.swing.JTextField();
        GirisTusu = new javax.swing.JButton();
        TCyazisi = new javax.swing.JLabel();
        SifreYazisi = new javax.swing.JLabel();
        SifreAlani = new javax.swing.JPasswordField();
        SifreAlmaTusu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        AltPanel.setBackground(new java.awt.Color(0, 0, 153));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-hospital-3-64.png")); // NOI18N

        EkranAdi.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        EkranAdi.setForeground(new java.awt.Color(153, 255, 255));
        EkranAdi.setText("Sekreter Girişi");

        KapamaTusu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-close-32.png")); // NOI18N
        KapamaTusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KapamaTusuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Logo)
                .addGap(27, 27, 27)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KapamaTusu))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(KapamaTusu)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TCAlani.setBackground(new java.awt.Color(0, 102, 204));
        TCAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TCAlani.setForeground(new java.awt.Color(0, 0, 153));
        TCAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TCAlaniKeyTyped(evt);
            }
        });

        GirisTusu.setBackground(new java.awt.Color(0, 102, 204));
        GirisTusu.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        GirisTusu.setForeground(new java.awt.Color(0, 0, 153));
        GirisTusu.setText("Giriş Yap");
        GirisTusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirisTusuActionPerformed(evt);
            }
        });

        TCyazisi.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        TCyazisi.setForeground(new java.awt.Color(153, 255, 255));
        TCyazisi.setText("T.C. No:");

        SifreYazisi.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        SifreYazisi.setForeground(new java.awt.Color(153, 255, 255));
        SifreYazisi.setText("Şifre:");

        SifreAlani.setBackground(new java.awt.Color(0, 102, 204));
        SifreAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SifreAlani.setForeground(new java.awt.Color(0, 0, 153));
        SifreAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SifreAlaniKeyTyped(evt);
            }
        });

        SifreAlmaTusu.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        SifreAlmaTusu.setForeground(new java.awt.Color(153, 255, 255));
        SifreAlmaTusu.setText("ŞİFRE ALMA");
        SifreAlmaTusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SifreAlmaTusuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AltPanelLayout = new javax.swing.GroupLayout(AltPanel);
        AltPanel.setLayout(AltPanelLayout);
        AltPanelLayout.setHorizontalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltPanelLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltPanelLayout.createSequentialGroup()
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addComponent(SifreYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SifreAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addComponent(TCyazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TCAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltPanelLayout.createSequentialGroup()
                        .addComponent(GirisTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addComponent(SifreAlmaTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AltPanelLayout.setVerticalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCyazisi))
                .addGap(24, 24, 24)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SifreAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SifreYazisi))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(GirisTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SifreAlmaTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AltPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AltPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KapamaTusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapamaTusuMouseClicked
         HastaneOtomasyonu hastaneOtomasyonu = new HastaneOtomasyonu();
         hastaneOtomasyonu.setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_KapamaTusuMouseClicked

    private void GirisTusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirisTusuActionPerformed
     
        boolean giris = sekreterIslemleri.girisYap(TCAlani.getText(), hashPassword(new String(SifreAlani.getPassword())));
        if(giris){
         SekreterEkrani sekreterEkrani = new SekreterEkrani();
         sekreterEkrani.setVisible(true);
         setVisible(false);
        }
        else{
             UyariEkrani uyariEkrani = new UyariEkrani();
             uyariEkrani.setVisible(true);
        }      
    }//GEN-LAST:event_GirisTusuActionPerformed

    private void SifreAlmaTusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SifreAlmaTusuMouseClicked
        SifreAlma sifreAlma = new SifreAlma();
        sifreAlma.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_SifreAlmaTusuMouseClicked

    private void TCAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TCAlaniKeyTyped
        char c = evt.getKeyChar();
        if (TCAlani.getText().length() >= 11 || (c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TCAlaniKeyTyped

    private void SifreAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SifreAlaniKeyTyped
        char c = evt.getKeyChar();
        if ((c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_SifreAlaniKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SekreterGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SekreterGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SekreterGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SekreterGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SekreterGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AltPanel;
    private javax.swing.JLabel EkranAdi;
    private javax.swing.JButton GirisTusu;
    private javax.swing.JLabel KapamaTusu;
    private javax.swing.JLabel Logo;
    private javax.swing.JPasswordField SifreAlani;
    private javax.swing.JLabel SifreAlmaTusu;
    private javax.swing.JLabel SifreYazisi;
    private javax.swing.JTextField TCAlani;
    private javax.swing.JLabel TCyazisi;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
