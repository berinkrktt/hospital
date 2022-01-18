package com;

import com.hastaneotomasyonu.anaIslemler.DanismanEkleme;
import com.hastaneotomasyonu.anaIslemler.DoktorEkleme;
import com.hastaneotomasyonu.anaIslemler.HemsireEkleme;
import com.hastaneotomasyonu.anaIslemler.SekreterEkleme;
import com.hastaneotomasyonu.danisma.DanismaGiris;
import com.hastaneotomasyonu.doktor.DoktorGiris;
import com.hastaneotomasyonu.hasta.HastaGiris;
import com.hastaneotomasyonu.hemsire.HemsireGiris;
import com.hastaneotomasyonu.sekreter.SekreterGiris;
import java.awt.Dimension;
import java.awt.Toolkit;

public class HastaneOtomasyonu extends javax.swing.JFrame {

    public HastaneOtomasyonu() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AltPanel = new javax.swing.JPanel();
        HastaGirisi = new javax.swing.JLabel();
        DoktorGirisi = new javax.swing.JLabel();
        HemsireGirisi = new javax.swing.JLabel();
        DanismaGirisi = new javax.swing.JLabel();
        HastaGirisAdi = new javax.swing.JLabel();
        DoktorGirisAdi = new javax.swing.JLabel();
        HemsireGirisAdi = new javax.swing.JLabel();
        DanismaGirisAdi = new javax.swing.JLabel();
        SekreterGirisi = new javax.swing.JLabel();
        SekreterGirisAdi = new javax.swing.JLabel();
        DoktorEkle = new javax.swing.JLabel();
        SekreterEkle = new javax.swing.JLabel();
        HemsireEkle = new javax.swing.JLabel();
        DanismanEkle = new javax.swing.JLabel();
        UstPanel = new javax.swing.JPanel();
        HastaneAdi = new javax.swing.JLabel();
        HastaneLogo = new javax.swing.JLabel();
        KapamaTusu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AltPanel.setBackground(new java.awt.Color(0, 102, 204));

        HastaGirisi.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-being-sick-100.png")); // NOI18N
        HastaGirisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HastaGirisiMouseClicked(evt);
            }
        });

        DoktorGirisi.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-medical-doctor-100.png")); // NOI18N
        DoktorGirisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoktorGirisiMouseClicked(evt);
            }
        });

        HemsireGirisi.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-nurse-100.png")); // NOI18N
        HemsireGirisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HemsireGirisiMouseClicked(evt);
            }
        });

        DanismaGirisi.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-reception-100.png")); // NOI18N
        DanismaGirisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanismaGirisiMouseClicked(evt);
            }
        });

        HastaGirisAdi.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        HastaGirisAdi.setForeground(new java.awt.Color(255, 255, 255));
        HastaGirisAdi.setText("Hasta Girişi");

        DoktorGirisAdi.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        DoktorGirisAdi.setForeground(new java.awt.Color(255, 255, 255));
        DoktorGirisAdi.setText("Doktor Girişi");

        HemsireGirisAdi.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        HemsireGirisAdi.setForeground(new java.awt.Color(255, 255, 255));
        HemsireGirisAdi.setText("Hemşire Girişi");

        DanismaGirisAdi.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        DanismaGirisAdi.setForeground(new java.awt.Color(255, 255, 255));
        DanismaGirisAdi.setText("Danışman Girişi");

        SekreterGirisi.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-technical-support-100.png")); // NOI18N
        SekreterGirisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SekreterGirisiMouseClicked(evt);
            }
        });

        SekreterGirisAdi.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SekreterGirisAdi.setForeground(new java.awt.Color(238, 238, 238));
        SekreterGirisAdi.setText("Sekreter Girişi");

        DoktorEkle.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        DoktorEkle.setForeground(new java.awt.Color(153, 255, 255));
        DoktorEkle.setText("DOKTOR EKLEME ");
        DoktorEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoktorEkleMouseClicked(evt);
            }
        });

        SekreterEkle.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        SekreterEkle.setForeground(new java.awt.Color(153, 255, 255));
        SekreterEkle.setText("SEKRETER EKLEME");
        SekreterEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SekreterEkleMouseClicked(evt);
            }
        });

        HemsireEkle.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        HemsireEkle.setForeground(new java.awt.Color(153, 255, 255));
        HemsireEkle.setText("HEMŞİRE EKLEME");
        HemsireEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HemsireEkleMouseClicked(evt);
            }
        });

        DanismanEkle.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        DanismanEkle.setForeground(new java.awt.Color(153, 255, 255));
        DanismanEkle.setText("DANIŞMAN EKLEME");
        DanismanEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanismanEkleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AltPanelLayout = new javax.swing.GroupLayout(AltPanel);
        AltPanel.setLayout(AltPanelLayout);
        AltPanelLayout.setHorizontalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HastaGirisi)
                            .addComponent(HastaGirisAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(DoktorEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoktorGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoktorGirisAdi))
                        .addGap(45, 45, 45)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HemsireGirisi)
                            .addComponent(HemsireGirisAdi)))
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(SekreterEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AltPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addComponent(DanismaGirisAdi)
                                .addGap(227, 227, 227))
                            .addGroup(AltPanelLayout.createSequentialGroup()
                                .addComponent(HemsireEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(DanismanEkle)
                                .addGap(51, 51, 51))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AltPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(DanismaGirisi)
                        .addGap(73, 73, 73)
                        .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SekreterGirisAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SekreterGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        AltPanelLayout.setVerticalGroup(
            AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AltPanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SekreterGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoktorGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HemsireGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DanismaGirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SekreterGirisAdi)
                        .addComponent(HastaGirisAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DoktorGirisAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(DanismaGirisAdi)
                    .addComponent(HemsireGirisAdi))
                .addGap(68, 68, 68)
                .addGroup(AltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SekreterEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DanismanEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HemsireEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoktorEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(AltPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 830, 320));

        UstPanel.setBackground(new java.awt.Color(0, 0, 153));
        UstPanel.setToolTipText("");

        HastaneAdi.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        HastaneAdi.setForeground(new java.awt.Color(153, 255, 255));
        HastaneAdi.setText("SAĞLIK HASTANESİ");
        HastaneAdi.setToolTipText("");
        HastaneAdi.setPreferredSize(new java.awt.Dimension(104, 16));

        HastaneLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-hospital-3-96.png")); // NOI18N

        KapamaTusu.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\HastaneOtomasyonu\\src\\com\\hastaneotomasyonu\\images\\icons8-close-window-32.png")); // NOI18N
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
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(HastaneAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(HastaneLogo)
                .addGap(92, 92, 92)
                .addComponent(KapamaTusu))
        );
        UstPanelLayout.setVerticalGroup(
            UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UstPanelLayout.createSequentialGroup()
                .addGroup(UstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UstPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(HastaneAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(KapamaTusu)
                    .addGroup(UstPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(HastaneLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(UstPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HastaGirisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HastaGirisiMouseClicked
        HastaGiris hastaGirisi = new HastaGiris();
        hastaGirisi.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HastaGirisiMouseClicked

    private void DoktorGirisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoktorGirisiMouseClicked
        DoktorGiris doktorGiris = new DoktorGiris();
        doktorGiris.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_DoktorGirisiMouseClicked

    private void HemsireGirisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HemsireGirisiMouseClicked
        HemsireGiris hemsireGiris = new HemsireGiris();
        hemsireGiris.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HemsireGirisiMouseClicked

    private void DanismaGirisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanismaGirisiMouseClicked
        DanismaGiris danismaGiris = new DanismaGiris();
        danismaGiris.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_DanismaGirisiMouseClicked

    private void KapamaTusuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KapamaTusuMouseClicked
        System.exit(0);
    }//GEN-LAST:event_KapamaTusuMouseClicked

    private void SekreterGirisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SekreterGirisiMouseClicked
        SekreterGiris sekreterGiris = new SekreterGiris();
        sekreterGiris.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_SekreterGirisiMouseClicked

    private void DoktorEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoktorEkleMouseClicked
        DoktorEkleme doktorEkleme = new DoktorEkleme();
        doktorEkleme.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_DoktorEkleMouseClicked

    private void SekreterEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SekreterEkleMouseClicked
        SekreterEkleme sekreterEkleme = new SekreterEkleme();
        sekreterEkleme.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_SekreterEkleMouseClicked

    private void HemsireEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HemsireEkleMouseClicked
        HemsireEkleme hemsireEkleme = new HemsireEkleme();
        hemsireEkleme.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HemsireEkleMouseClicked

    private void DanismanEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanismanEkleMouseClicked
        DanismanEkleme danismaEkleme = new DanismanEkleme();
        danismaEkleme.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_DanismanEkleMouseClicked

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
            java.util.logging.Logger.getLogger(HastaneOtomasyonu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaneOtomasyonu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaneOtomasyonu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaneOtomasyonu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaneOtomasyonu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AltPanel;
    private javax.swing.JLabel DanismaGirisAdi;
    private javax.swing.JLabel DanismaGirisi;
    private javax.swing.JLabel DanismanEkle;
    private javax.swing.JLabel DoktorEkle;
    private javax.swing.JLabel DoktorGirisAdi;
    private javax.swing.JLabel DoktorGirisi;
    private javax.swing.JLabel HastaGirisAdi;
    private javax.swing.JLabel HastaGirisi;
    private javax.swing.JLabel HastaneAdi;
    private javax.swing.JLabel HastaneLogo;
    private javax.swing.JLabel HemsireEkle;
    private javax.swing.JLabel HemsireGirisAdi;
    private javax.swing.JLabel HemsireGirisi;
    private javax.swing.JLabel KapamaTusu;
    private javax.swing.JLabel SekreterEkle;
    private javax.swing.JLabel SekreterGirisAdi;
    private javax.swing.JLabel SekreterGirisi;
    private javax.swing.JPanel UstPanel;
    // End of variables declaration//GEN-END:variables
}
