/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hastaneotomasyonu.hemsire;


import com.hastaneotomasyonu.veritabani.VeritabaniIslemleri;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class HemsireEkrani extends javax.swing.JFrame {
    VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();
    HemsireIslemleri hemsireIslemleri = new HemsireIslemleri();
    
    /**
     * Creates new form HemsireEkrani
     */
    DefaultTableModel model;
    ArrayList<Sonuc> sonuc = new ArrayList<>();
    public int sonucNo;
    public HemsireEkrani() {
        initComponents();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
        model = (DefaultTableModel) TahlilTablosu.getModel();
        sonucGoruntule();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AltPanel = new javax.swing.JPanel();
        UstPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        EkranAdi = new javax.swing.JLabel();
        KapamaTusu = new javax.swing.JLabel();
        HastaAdYazisi = new javax.swing.JLabel();
        AdAlani = new javax.swing.JTextField();
        GenelDrmYazisi = new javax.swing.JLabel();
        DurumAlani = new javax.swing.JTextField();
        TahlilYazisi = new javax.swing.JLabel();
        Tahlil = new javax.swing.JScrollPane();
        TahlilAlani = new javax.swing.JTextArea();
        TarihYazisi = new javax.swing.JLabel();
        TarihAlani = new javax.swing.JTextField();
        Tablo = new javax.swing.JScrollPane();
        TahlilTablosu = new javax.swing.JTable();
        KaydetTusu = new javax.swing.JButton();
        KimlikYazısı = new javax.swing.JLabel();
        TCAlani = new javax.swing.JTextField();
        sonucAraYazisi = new javax.swing.JLabel();
        SonucArama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SoyadAlani = new javax.swing.JTextField();
        Guncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        AltPanel.setBackground(new java.awt.Color(0, 0, 153));

        UstPanel.setBackground(new java.awt.Color(0, 102, 204));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-hospital-3-64.png")); // NOI18N

        EkranAdi.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        EkranAdi.setForeground(new java.awt.Color(153, 255, 255));
        EkranAdi.setText("HEMŞİRE EKRANI");

        KapamaTusu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-close-32.png")); // NOI18N
        KapamaTusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KapamaTusuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UstPanelLayout = new javax.swing.GroupLayout(UstPanel);
        UstPanel.setLayout(UstPanelLayout);
        UstPanelLayout.setHorizontalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addComponent(Logo)
                .addGap(40, 40, 40)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KapamaTusu))
        );
        UstPanelLayout.setVerticalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addComponent(KapamaTusu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UstPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EkranAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        HastaAdYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        HastaAdYazisi.setForeground(new java.awt.Color(153, 255, 255));
        HastaAdYazisi.setText("Ad:");

        AdAlani.setBackground(new java.awt.Color(0, 102, 204));
        AdAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        AdAlani.setForeground(new java.awt.Color(0, 0, 153));

        GenelDrmYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        GenelDrmYazisi.setForeground(new java.awt.Color(153, 255, 255));
        GenelDrmYazisi.setText("Sonuç Durum:");

        DurumAlani.setBackground(new java.awt.Color(0, 102, 204));
        DurumAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        DurumAlani.setForeground(new java.awt.Color(0, 0, 153));

        TahlilYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TahlilYazisi.setForeground(new java.awt.Color(153, 255, 255));
        TahlilYazisi.setText("Genel Tahliller:");

        TahlilAlani.setBackground(new java.awt.Color(0, 102, 204));
        TahlilAlani.setColumns(20);
        TahlilAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TahlilAlani.setForeground(new java.awt.Color(0, 0, 153));
        TahlilAlani.setRows(5);
        Tahlil.setViewportView(TahlilAlani);

        TarihYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TarihYazisi.setForeground(new java.awt.Color(153, 255, 255));
        TarihYazisi.setText("Tarih:");

        TarihAlani.setBackground(new java.awt.Color(0, 102, 204));
        TarihAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TarihAlani.setForeground(new java.awt.Color(0, 0, 153));

        TahlilTablosu.setBackground(new java.awt.Color(0, 102, 204));
        TahlilTablosu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TahlilTablosu.setForeground(new java.awt.Color(0, 0, 153));
        TahlilTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T.C. KİMLİK NO", "AD SOYAD", "TAHLİLLER", "TARİH", "SONUÇ DURUM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TahlilTablosu.setSelectionBackground(new java.awt.Color(0, 102, 204));
        TahlilTablosu.setSelectionForeground(new java.awt.Color(0, 0, 153));
        TahlilTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TahlilTablosuMouseClicked(evt);
            }
        });
        Tablo.setViewportView(TahlilTablosu);

        KaydetTusu.setBackground(new java.awt.Color(0, 102, 204));
        KaydetTusu.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        KaydetTusu.setForeground(new java.awt.Color(0, 0, 153));
        KaydetTusu.setText("Kaydet");
        KaydetTusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaydetTusuActionPerformed(evt);
            }
        });

        KimlikYazısı.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        KimlikYazısı.setForeground(new java.awt.Color(153, 255, 255));
        KimlikYazısı.setText("T.C. Kimlik No:");

        TCAlani.setBackground(new java.awt.Color(0, 102, 204));
        TCAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        TCAlani.setForeground(new java.awt.Color(0, 0, 153));
        TCAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TCAlaniKeyTyped(evt);
            }
        });

        sonucAraYazisi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        sonucAraYazisi.setForeground(new java.awt.Color(153, 255, 255));
        sonucAraYazisi.setText("Sonuç Ara:");

        SonucArama.setBackground(new java.awt.Color(0, 102, 204));
        SonucArama.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SonucArama.setForeground(new java.awt.Color(0, 0, 153));
        SonucArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SonucAramaKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Soyad:");

        SoyadAlani.setBackground(new java.awt.Color(0, 102, 204));
        SoyadAlani.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SoyadAlani.setForeground(new java.awt.Color(0, 0, 153));

        Guncelle.setBackground(new java.awt.Color(0, 102, 204));
        Guncelle.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        Guncelle.setForeground(new java.awt.Color(0, 0, 153));
        Guncelle.setText("Güncelle");
        Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AltPanelLayout = new javax.swing.GroupLayout(AltPanel);
        AltPanel.setLayout(AltPanelLayout);
        AltPanelLayout.setHorizontalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HastaAdYazisi)
                    .addComponent(GenelDrmYazisi)
                    .addComponent(KimlikYazısı)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AdAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(TCAlani))
                                .addGap(30, 30, 30)
                                .addComponent(TahlilYazisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addComponent(SoyadAlani)
                                .addGap(142, 142, 142)))
                        .addComponent(Tahlil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(TarihYazisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TarihAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(KaydetTusu, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(Guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46))))
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addComponent(DurumAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(sonucAraYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SonucArama, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addComponent(Tablo, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AltPanelLayout.setVerticalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AltPanelLayout.createSequentialGroup()
                .addComponent(UstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Tahlil, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TCAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KimlikYazısı))
                        .addGap(23, 23, 23)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HastaAdYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(SoyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TarihAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TarihYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(KaydetTusu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(TahlilYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DurumAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenelDrmYazisi)))
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SonucArama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sonucAraYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15)
                .addComponent(Tablo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
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

     public void sonucGoruntule() {
        model.setRowCount(0);
        ArrayList<Sonuc> sonuc = new ArrayList<>();
        sonuc = hemsireIslemleri.sonucGoster();
        if (sonuc != null) {
            for (Sonuc sonc : sonuc) {
                int no = sonc.getId();
                String tc = sonc.getTc();
                String adSoyad = sonc.getAd() + " " + sonc.getSoyad();
                String tahlil = sonc.getTahlil();
                String durum = sonc.getDurum();
                String tarih = sonc.getTarih();
                
                Object[] ekleme = {tc, adSoyad, tahlil, tarih, durum};
                
                model.addRow(ekleme);
                
            }
        }
        
    }
    private void KapamaTusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapamaTusuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_KapamaTusuMouseClicked
      private String gununTarihiSQL() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime ldt = LocalDateTime.now();
        return dtf.format(ldt);
    }
    private void KaydetTusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaydetTusuActionPerformed
     model.setRowCount(0);
     ArrayList<Sonuc> sonuc = new ArrayList<>();
     if(sonuc !=  null){
         int no = hemsireIslemleri.noOlustur();
                String tc = TCAlani.getText();
                String ad = AdAlani.getText();
                String soyad =SoyadAlani.getText();
                String tahlil = TahlilAlani.getText();
                String tarih = gununTarihiSQL();
                String durum = DurumAlani.getText();
               
                hemsireIslemleri.sonucEkle(no, tc, ad, soyad, tahlil, tarih, durum);
                sonucGoruntule();
                sonucNo = no;
                JOptionPane.showMessageDialog(this, "Başarıyla Kaydedildi :)");
                
      
              
     }
    }//GEN-LAST:event_KaydetTusuActionPerformed

    private void GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuncelleActionPerformed
      
        if (AdAlani.getText().equals("") || SoyadAlani.getText().equals("") || DurumAlani.getText().equals("")
                || TahlilAlani.getText().equals("") || TarihAlani.getText().equals("")) {
        } else {
            String tc = TCAlani.getText();
            String ad = AdAlani.getText();
            String soyad = SoyadAlani.getText();
            String durum = DurumAlani.getText();
            String tahlil = TahlilAlani.getText();
            String tarih = gununTarihiSQL();
            
            hemsireIslemleri.guncelle(tc, ad, soyad, tahlil, tarih, durum);
          
            sonucGoruntule();
        }
    }//GEN-LAST:event_GuncelleActionPerformed

    private void TahlilTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TahlilTablosuMouseClicked
       int selectedRow = TahlilTablosu.getSelectedRow();

        String tc = model.getValueAt(selectedRow, 0).toString();
        TCAlani.setText(tc);
        String adSoyad = model.getValueAt(selectedRow, 1).toString();
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
        
        String tahlil = model.getValueAt(selectedRow, 2).toString();
        TahlilAlani.setText(tahlil);
        
        String durum = model.getValueAt(selectedRow, 4).toString();
        DurumAlani.setText(durum);

        String tarih = model.getValueAt(selectedRow, 3).toString();
        TarihAlani.setText(tarih);
    }//GEN-LAST:event_TahlilTablosuMouseClicked
      private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        TahlilTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }
    private void SonucAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SonucAramaKeyReleased
        String ara = SonucArama.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_SonucAramaKeyReleased

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
            java.util.logging.Logger.getLogger(HemsireEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HemsireEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HemsireEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HemsireEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HemsireEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdAlani;
    private javax.swing.JPanel AltPanel;
    private javax.swing.JTextField DurumAlani;
    private javax.swing.JLabel EkranAdi;
    private javax.swing.JLabel GenelDrmYazisi;
    private javax.swing.JButton Guncelle;
    private javax.swing.JLabel HastaAdYazisi;
    private javax.swing.JLabel KapamaTusu;
    private javax.swing.JButton KaydetTusu;
    private javax.swing.JLabel KimlikYazısı;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField SonucArama;
    private javax.swing.JTextField SoyadAlani;
    private javax.swing.JTextField TCAlani;
    private javax.swing.JScrollPane Tablo;
    private javax.swing.JScrollPane Tahlil;
    private javax.swing.JTextArea TahlilAlani;
    private javax.swing.JTable TahlilTablosu;
    private javax.swing.JLabel TahlilYazisi;
    private javax.swing.JTextField TarihAlani;
    private javax.swing.JLabel TarihYazisi;
    private javax.swing.JPanel UstPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel sonucAraYazisi;
    // End of variables declaration//GEN-END:variables
}