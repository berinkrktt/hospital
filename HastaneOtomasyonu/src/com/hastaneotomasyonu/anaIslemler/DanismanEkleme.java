/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hastaneotomasyonu.anaIslemler;

import com.hastaneotomasyonu.danisma.Danisma;
import com.hastaneotomasyonu.veritabani.VeritabaniIslemleri;
import java.awt.Color;
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
public class DanismanEkleme extends javax.swing.JFrame {

    VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();
    AnaIslemler anaIslemler = new AnaIslemler();
    /**
     * Creates new form DanismanEkleme
     */

    public static int danismaNo;
    DefaultTableModel model;

    public DanismanEkleme() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        model = (DefaultTableModel) DanismanTablosu.getModel();
        danismaGoruntule();
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
        DanismanTablosu = new javax.swing.JTable();
        NoYazisi = new javax.swing.JLabel();
        NoAlani = new javax.swing.JTextField();
        Mesaj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        EkranAdi.setText("DANIŞMAN EKLEME");

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
        Arama.setText("DANIŞMAN ARAMA:");

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

        DanismanTablosu.setBackground(new java.awt.Color(0, 102, 204));
        DanismanTablosu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        DanismanTablosu.setForeground(new java.awt.Color(0, 0, 153));
        DanismanTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DANIŞMAN NO", "T.C. KİMLİK NO", "AD SOYAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DanismanTablosu.setSelectionBackground(new java.awt.Color(0, 102, 204));
        DanismanTablosu.setSelectionForeground(new java.awt.Color(0, 0, 153));
        DanismanTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanismanTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DanismanTablosu);

        NoYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        NoYazisi.setForeground(new java.awt.Color(153, 255, 255));
        NoYazisi.setText("Danisman No:");

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
            .addComponent(UstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(EkleTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(GuncelleTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SilTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addComponent(Arama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AramaAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltPanelLayout.createSequentialGroup()
                                .addComponent(AdYazisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addComponent(NoYazisi)
                                .addGap(11, 11, 11)))
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NoAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(AdAlani))
                        .addGap(106, 106, 106)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addComponent(tcYazisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TCAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addComponent(SoyadYazisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SoyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(130, 130, 130))))
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Mesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AltPanelLayout.setVerticalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addComponent(UstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SoyadYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SoyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NoYazisi))
                    .addComponent(NoAlani))
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(AdYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TCAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tcYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Arama, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AramaAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EkleTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuncelleTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SilTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mesaj, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AltPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AltPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void danismaGoruntule() {
        model.setRowCount(0);

        ArrayList<Danisma> danisma = new ArrayList<>();

        danisma = anaIslemler.DanismanGetir();

        if (danisma != null) {
            for (Danisma dns : danisma) {

                int no = dns.getId();
                String adSoyad = dns.getAd() + " " + dns.getSoyad();
                String tc = dns.getTc();

                Object[] eklenecek = {no, tc, adSoyad};

                model.addRow(eklenecek);

            }

        }
    }

    private void KapamaTusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapamaTusuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_KapamaTusuMouseClicked

    private void EkleTusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleTusuActionPerformed
        String tc = TCAlani.getText();
        String ad = AdAlani.getText();
        String soyad = SoyadAlani.getText();
        if (TCAlani.equals("") || AdAlani.equals("") || SoyadAlani.equals("")) {
            JOptionPane.showMessageDialog(this, "Bilgilerinizi eksiksiz giriniz!!!");
        } else {
            int no = anaIslemler.noOlustur();

            anaIslemler.danismaEkle(no, ad, soyad, tc);
            danismaGoruntule();
            danismaNo = no;

            JOptionPane.showMessageDialog(this, "Kayıt Başarıyla gerçekleşti :)");
        }
    }//GEN-LAST:event_EkleTusuActionPerformed
    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        DanismanTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }
    private void GuncelleTusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuncelleTusuActionPerformed
        String tc = TCAlani.getText();
        String ad = AdAlani.getText();
        String soyad = SoyadAlani.getText();

        int selectedRow = DanismanTablosu.getSelectedRow();
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                Mesaj.setText("TABLO BOŞ!!!");
            } else {
                Mesaj.setText("GÜNCELLENECEK KİŞİYİ SEÇİNİZ!");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);

            anaIslemler.danismanGuncelle(id, tc, ad, soyad);
            danismaGoruntule();
            Mesaj.setText("BAŞARIYLA GÜNCELLENDİ :)");
        }
    }//GEN-LAST:event_GuncelleTusuActionPerformed

    private void SilTusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilTusuActionPerformed
        Mesaj.setText(" ");
        int selectedRow = DanismanTablosu.getSelectedRow();
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                Mesaj.setText("TABLO BOŞ!!!");
            } else {
                Mesaj.setText("SİLİNECEK KİŞİYİ SEÇİNİZ!");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);
            anaIslemler.danismaSil(id);
            danismaGoruntule();
            Mesaj.setText("DANIŞMAN SİLİNDİ :(");
        }
    }//GEN-LAST:event_SilTusuActionPerformed

    private void AramaAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AramaAlaniKeyReleased
        String ara = AramaAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_AramaAlaniKeyReleased

    private void DanismanTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanismanTablosuMouseClicked
        int selectedRow = DanismanTablosu.getSelectedRow();

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

    }//GEN-LAST:event_DanismanTablosuMouseClicked

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
            java.util.logging.Logger.getLogger(DanismanEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanismanEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanismanEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanismanEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanismanEkleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdAlani;
    private javax.swing.JLabel AdYazisi;
    private javax.swing.JPanel AltPanel;
    private javax.swing.JLabel Arama;
    private javax.swing.JTextField AramaAlani;
    private javax.swing.JTable DanismanTablosu;
    private javax.swing.JButton EkleTusu;
    private javax.swing.JLabel EkranAdi;
    private javax.swing.JButton GuncelleTusu;
    private javax.swing.JLabel KapamaTusu;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Mesaj;
    private javax.swing.JTextField NoAlani;
    private javax.swing.JLabel NoYazisi;
    private javax.swing.JButton SilTusu;
    private javax.swing.JTextField SoyadAlani;
    private javax.swing.JLabel SoyadYazisi;
    private javax.swing.JTextField TCAlani;
    private javax.swing.JPanel UstPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tcYazisi;
    // End of variables declaration//GEN-END:variables
}
