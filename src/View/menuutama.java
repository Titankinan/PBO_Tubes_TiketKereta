/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerHistory;
import Model.Application;
import View.credit;
import View.faq;
import View.historyframe;
import static java.time.Clock.system;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




// ini yang shiba kalau dihapus error
//import tugasbesar.creditt;
//import tugasbesar.faqq;
//import tugasbesar.petunjukpesan;

/**
 *
 * @author asus
 */

public class menuutama extends javax.swing.JFrame {
    //Application app = new Application();
    /**
     * Creates new form menuutama
     */
    public menuutama() {
        //app = a;
        initComponents();
//        this.setSize(1180, 660);
//        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        faq = new javax.swing.JButton();
        jLabelClose1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        pesantiket = new javax.swing.JButton();
        riwayaatpemesanan = new javax.swing.JButton();
        petunjukpenggunaan = new javax.swing.JButton();
        credit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 1200));
        getContentPane().setLayout(null);

        faq.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        faq.setText("FAQ");
        faq.setMargin(new java.awt.Insets(4, 16, 4, 16));
        faq.setPreferredSize(new java.awt.Dimension(80, 30));
        faq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqMouseClicked(evt);
            }
        });
        faq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqActionPerformed(evt);
            }
        });
        getContentPane().add(faq);
        faq.setBounds(440, 330, 300, 60);

        jLabelClose1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose1.setForeground(new java.awt.Color(51, 0, 51));
        jLabelClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelClose1);
        jLabelClose1.setBounds(940, 40, 0, 0);

        jToggleButton1.setBackground(new java.awt.Color(255, 51, 51));
        jToggleButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Keluar");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(920, 480, 190, 70);

        pesantiket.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pesantiket.setText("Pesan Tiket");
        pesantiket.setMargin(new java.awt.Insets(4, 16, 4, 16));
        pesantiket.setPreferredSize(new java.awt.Dimension(80, 30));
        pesantiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesantiketMouseClicked(evt);
            }
        });
        pesantiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesantiketActionPerformed(evt);
            }
        });
        getContentPane().add(pesantiket);
        pesantiket.setBounds(440, 120, 300, 60);

        riwayaatpemesanan.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        riwayaatpemesanan.setText("Riwayat Pemesanan");
        riwayaatpemesanan.setMargin(new java.awt.Insets(4, 16, 4, 16));
        riwayaatpemesanan.setPreferredSize(new java.awt.Dimension(80, 30));
        riwayaatpemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                riwayaatpemesananMouseClicked(evt);
            }
        });
        riwayaatpemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayaatpemesananActionPerformed(evt);
            }
        });
        getContentPane().add(riwayaatpemesanan);
        riwayaatpemesanan.setBounds(440, 190, 300, 60);

        petunjukpenggunaan.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        petunjukpenggunaan.setText("Petunjuk Penggunaan");
        petunjukpenggunaan.setMargin(new java.awt.Insets(4, 16, 4, 16));
        petunjukpenggunaan.setPreferredSize(new java.awt.Dimension(80, 30));
        petunjukpenggunaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                petunjukpenggunaanMouseClicked(evt);
            }
        });
        petunjukpenggunaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petunjukpenggunaanActionPerformed(evt);
            }
        });
        getContentPane().add(petunjukpenggunaan);
        petunjukpenggunaan.setBounds(440, 260, 300, 60);

        credit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        credit.setText("Credit");
        credit.setMargin(new java.awt.Insets(4, 16, 4, 16));
        credit.setPreferredSize(new java.awt.Dimension(80, 30));
        credit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditMouseClicked(evt);
            }
        });
        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });
        getContentPane().add(credit);
        credit.setBounds(440, 400, 300, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 52)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU UTAMA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 60, 370, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/popo.jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(1200, 680));
        jLabel1.setPreferredSize(new java.awt.Dimension(1200, 680));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1250, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void pesantiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesantiketMouseClicked
        // TODO add your handling code here:
        Tampilan A = new Tampilan();
        A.setVisible(true);
        A.pack();
        A.setSize(1180, 660);
        A.setLocationRelativeTo(null);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pesantiketMouseClicked

    private void riwayaatpemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwayaatpemesananMouseClicked
        // TODO add your handling code here:
        historyframe A = new historyframe();
        A.setVisible(true);
        A.pack();
        A.setSize(1180, 660);
        A.setLocationRelativeTo(null);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_riwayaatpemesananMouseClicked

    private void petunjukpenggunaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petunjukpenggunaanMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_petunjukpenggunaanMouseClicked

    private void faqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqMouseClicked
        // TODO add your handling code here:
        faq A = new faq();
        A.setVisible(true);
        A.pack();
        A.setSize(1180, 660);
        A.setLocationRelativeTo(null);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_faqMouseClicked

    private void faqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faqActionPerformed

    private void creditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditMouseClicked
        // TODO add your handling code here:
        credit A = new credit();
        A.setVisible(true);
        A.pack();
        A.setSize(1180, 660);
        A.setLocationRelativeTo(null);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_creditMouseClicked

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditActionPerformed

    private void petunjukpenggunaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petunjukpenggunaanActionPerformed
        // TODO add your handling code here:
        petunjukguna A = new petunjukguna();
        A.setVisible(true);
        A.pack();
        A.setSize(1180, 660);
        A.setLocationRelativeTo(null);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_petunjukpenggunaanActionPerformed

    private void pesantiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesantiketActionPerformed
        // TODO add your handling code here:
//        Tampilan A = new Tampilan(app);
//        A.setVisible(true);
//        A.pack();
//        A.setSize(1180, 660);
//        A.setLocationRelativeTo(null);
//        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.dispose();
    }//GEN-LAST:event_pesantiketActionPerformed

    private void riwayaatpemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayaatpemesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_riwayaatpemesananActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
        "Apakah anda akan menutup Aplikasi?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
        System.exit(0);
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

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
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new menuutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton credit;
    private javax.swing.JButton faq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton pesantiket;
    private javax.swing.JButton petunjukpenggunaan;
    private javax.swing.JButton riwayaatpemesanan;
    // End of variables declaration//GEN-END:variables
}