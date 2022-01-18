/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hastaneotomasyonu.anaIslemler;

import com.hastaneotomasyonu.doktor.Doktor;
import com.hastaneotomasyonu.veritabani.VeritabaniIslemleri;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class DoktorEkleme extends javax.swing.JFrame {

    VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();
    AnaIslemler anaIslemler = new AnaIslemler();
    /**
     * Creates new form DoktorEkleme
     */
    DefaultTableModel model;
    public static int doktorNo;

    public DoktorEkleme() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
        model = (DefaultTableModel) DoktorTablosu.getModel();
        doktorGoruntule();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AltPanel = new javax.swing.JPanel();
        UstPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        KapamaTusu = new javax.swing.JLabel();
        EkranAdi = new javax.swing.JLabel();
        tcYazisi = new javax.swing.JLabel();
        AdYazisi = new javax.swing.JLabel();
        TCAlani = new javax.swing.JTextField();
        AdAlani = new javax.swing.JTextField();
        SoyadYazisi = new javax.swing.JLabel();
        SoyadAlani = new javax.swing.JTextField();
        Arama = new javax.swing.JLabel();
        AramaAlani = new javax.swing.JTextField();
        EkleTusu = new javax.swing.JButton();
        GuncelleTusu = new javax.swing.JButton();
        SilTusu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoktorTablosu = new javax.swing.JTable();
        noYazis = new javax.swing.JLabel();
        NoAlani = new javax.swing.JTextField();
        Mesaj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AltPanel.setBackground(new java.awt.Color(0, 0, 153));

        UstPanel.setBackground(new java.awt.Color(0, 102, 204));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-hospital-3-64.png")); // NOI18N

        KapamaTusu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-close-32.png")); // NOI18N
        KapamaTusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KapamaTusuMouseClicked(evt);
            }
        });

        EkranAdi.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        EkranAdi.setForeground(new java.awt.Color(153, 255, 255));
        EkranAdi.setText("DOKTOR EKLEME");

        javax.swing.GroupLayout UstPanelLayout = new javax.swing.GroupLayout(UstPanel);
        UstPanel.setLayout(UstPanelLayout);
        UstPanelLayout.setHorizontalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addComponent(Logo)
                .addGap(18, 18, 18)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KapamaTusu))
        );
        UstPanelLayout.setVerticalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addComponent(KapamaTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tcYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        tcYazisi.setForeground(new java.awt.Color(153, 255, 255));
        tcYazisi.setText("T.C:");

        AdYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        AdYazisi.setForeground(new java.awt.Color(153, 255, 255));
        AdYazisi.setText("Ad:");

        TCAlani.setBackground(new java.awt.Color(0, 102, 204));
        TCAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TCAlani.setForeground(new java.awt.Color(0, 0, 153));
        TCAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TCAlaniKeyTyped(evt);
            }
        });

        AdAlani.setBackground(new java.awt.Color(0, 102, 204));
        AdAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        AdAlani.setForeground(new java.awt.Color(0, 0, 153));

        SoyadYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SoyadYazisi.setForeground(new java.awt.Color(153, 255, 255));
        SoyadYazisi.setText("Soyad:");

        SoyadAlani.setBackground(new java.awt.Color(0, 102, 204));
        SoyadAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SoyadAlani.setForeground(new java.awt.Color(0, 0, 153));

        Arama.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        Arama.setForeground(new java.awt.Color(153, 255, 255));
        Arama.setText("DOKTOR ARAMA:");

        AramaAlani.setBackground(new java.awt.Color(0, 120, 204));
        AramaAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        AramaAlani.setForeground(new java.awt.Color(0, 0, 153));
        AramaAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AramaAlaniKeyReleased(evt);
            }
        });

        EkleTusu.setBackground(new java.awt.Color(0, 102, 204));
        EkleTusu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        EkleTusu.setForeground(new java.awt.Color(0, 0, 153));
        EkleTusu.setText("EKLE");
        EkleTusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleTusuActionPerformed(evt);
            }
        });

        GuncelleTusu.setBackground(new java.awt.Color(0, 102, 204));
        GuncelleTusu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        GuncelleTusu.setForeground(new java.awt.Color(0, 0, 153));
        GuncelleTusu.setText("GÜNCELLE");
        GuncelleTusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuncelleTusuActionPerformed(evt);
            }
        });

        SilTusu.setBackground(new java.awt.Color(0, 102, 204));
        SilTusu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SilTusu.setForeground(new java.awt.Color(0, 0, 153));
        SilTusu.setText("SİL");
        SilTusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilTusuActionPerformed(evt);
            }
        });

        DoktorTablosu.setBackground(new java.awt.Color(0, 102, 204));
        DoktorTablosu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        DoktorTablosu.setForeground(new java.awt.Color(0, 0, 153));
        DoktorTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DOKTOR NO", "T.C KİMLİK NO", "AD SOYAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DoktorTablosu.setSelectionBackground(new java.awt.Color(0, 102, 204));
        DoktorTablosu.setSelectionForeground(new java.awt.Color(0, 0, 153));
        DoktorTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoktorTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DoktorTablosu);

        noYazis.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        noYazis.setForeground(new java.awt.Color(153, 255, 255));
        noYazis.setText("Doktor No:");

        NoAlani.setEditable(false);
        NoAlani.setBackground(new java.awt.Color(0, 102, 204));
        NoAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        NoAlani.setForeground(new java.awt.Color(0, 0, 153));

        Mesaj.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        Mesaj.setForeground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout AltPanelLayout = new javax.swing.GroupLayout(AltPanel);
        AltPanel.setLayout(AltPanelLayout);
        AltPanelLayout.setHorizontalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                    .addComponent(UstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(EkleTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(GuncelleTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(noYazis)
                            .addComponent(AdYazisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addComponent(NoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tcYazisi)
                                .addGap(18, 18, 18)
                                .addComponent(TCAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(SilTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AltPanelLayout.createSequentialGroup()
                                    .addComponent(AdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)
                                    .addComponent(SoyadYazisi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(SoyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Arama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AramaAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AltPanelLayout.setVerticalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addComponent(UstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noYazis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SoyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SoyadYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AramaAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Arama, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EkleTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuncelleTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SilTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(AltPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  public void doktorGoruntule() {
        model.setRowCount(0);

        ArrayList<Doktor> doktor = new ArrayList<>();

        doktor = anaIslemler.DoktorGetir();

        if (doktor != null) {
            for (Doktor dr : doktor) {

                int no = dr.getId();
                String adSoyad = dr.getAd() + " " + dr.getSoyad();
                String tc = dr.getTc();

                Object[] eklenecek = {no, tc, adSoyad};

                model.addRow(eklenecek);

            }

        }  
    }
    private void KapamaTusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapamaTusuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_KapamaTusuMouseClicked
    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        DoktorTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }
    private void AramaAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AramaAlaniKeyReleased
        String ara = AramaAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_AramaAlaniKeyReleased

    private void EkleTusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleTusuActionPerformed
        String tc = TCAlani.getText();
        String ad = AdAlani.getText();
        String soyad = SoyadAlani.getText();
        if (TCAlani.equals("") || AdAlani.equals("") || SoyadAlani.equals("")) {
            JOptionPane.showMessageDialog(this, "Bilgilerinizi eksiksiz giriniz!!!");
        } else {
            int no = anaIslemler.noDoktor();

            anaIslemler.doktorEkle(no, ad, soyad, tc);
            doktorGoruntule();
            doktorNo = no;
            
            JOptionPane.showMessageDialog(this, "Kayıt Başarıyla gerçekleşti :)");
        }
    }//GEN-LAST:event_EkleTusuActionPerformed

    private void GuncelleTusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuncelleTusuActionPerformed
        String tc = TCAlani.getText();
        String ad = AdAlani.getText();
        String soyad = SoyadAlani.getText();

        int selectedRow = DoktorTablosu.getSelectedRow();
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                Mesaj.setText("TABLO BOŞ!!!");
            } else {
                Mesaj.setText("GÜNCELLENECEK KİŞİYİ SEÇİNİZ!");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);

            anaIslemler.doktorGuncelle(id, tc, ad, soyad);
            doktorGoruntule();
            Mesaj.setText("BAŞARIYLA GÜNCELLENDİ :)");

        }
    }//GEN-LAST:event_GuncelleTusuActionPerformed

    private void SilTusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilTusuActionPerformed
        Mesaj.setText(" ");
        int selectedRow = DoktorTablosu.getSelectedRow();
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                Mesaj.setText("TABLO BOŞ!!!");
            } else {
                Mesaj.setText("SİLİNECEK KİŞİYİ SEÇİNİZ!");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);
            anaIslemler.doktorSil(id);
            doktorGoruntule();
            Mesaj.setText("DOKTOR SİLİNDİ :(");
        }
    }//GEN-LAST:event_SilTusuActionPerformed

    private void DoktorTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoktorTablosuMouseClicked
        int selectedRow = DoktorTablosu.getSelectedRow();

        String no = model.getValueAt(selectedRow, 0).toString();
        NoAlani.setText(no);

        String tc = model.getValueAt(selectedRow, 1).toString();
        TCAlani.setText(tc);

        String adSoyad = model.getValueAt(selectedRow, 2).toString();
        String[] dizi = adSoyad.split(" ");
        String ad;
        String soyad;
        switch (dizi.length) {
            case 4:
                ad = dizi[0] + " " + dizi[1];
                soyad = dizi[2] + " " + dizi[3];
                break;
            case 3:
                ad = dizi[0] + " " + dizi[1];
                soyad = dizi[2];
                break;
            default:
                ad = dizi[0];
                soyad = dizi[1];
                break;
        }
        AdAlani.setText(ad);
        SoyadAlani.setText(soyad);

    }//GEN-LAST:event_DoktorTablosuMouseClicked

    private void TCAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TCAlaniKeyTyped
          char c = evt.getKeyChar();
        if (TCAlani.getText().length() >= 11 || (c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TCAlaniKeyTyped

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
            java.util.logging.Logger.getLogger(DoktorEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoktorEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoktorEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoktorEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorEkleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdAlani;
    private javax.swing.JLabel AdYazisi;
    private javax.swing.JPanel AltPanel;
    private javax.swing.JLabel Arama;
    private javax.swing.JTextField AramaAlani;
    private javax.swing.JTable DoktorTablosu;
    private javax.swing.JButton EkleTusu;
    private javax.swing.JLabel EkranAdi;
    private javax.swing.JButton GuncelleTusu;
    private javax.swing.JLabel KapamaTusu;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Mesaj;
    private javax.swing.JTextField NoAlani;
    private javax.swing.JButton SilTusu;
    private javax.swing.JTextField SoyadAlani;
    private javax.swing.JLabel SoyadYazisi;
    private javax.swing.JTextField TCAlani;
    private javax.swing.JPanel UstPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel noYazis;
    private javax.swing.JLabel tcYazisi;
    // End of variables declaration//GEN-END:variables
}
