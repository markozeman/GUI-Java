/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dn02;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.html.CSS;

/**
 *
 * @author student
 */
public class Urejevalnik_besedila extends javax.swing.JFrame {

    /**
     * Creates new form Urejevalnik_besedila
     */
    public Urejevalnik_besedila() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Statusna_vrstica = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        OdpriB = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ShraniB = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        Najdi_vseB = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        Zamenjaj_vseB = new javax.swing.JButton();
        iskalni_niz = new javax.swing.JTextField();
        zamenjaj_z = new javax.swing.JTextField();
        Iskalni_niz = new javax.swing.JLabel();
        Zamenjaj_z = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Besedilo_datoteke = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Datoteka = new javax.swing.JMenu();
        Odpri = new javax.swing.JMenuItem();
        Shrani = new javax.swing.JMenuItem();
        Izhod = new javax.swing.JMenuItem();
        Iskanje = new javax.swing.JMenu();
        Najdi_vse = new javax.swing.JMenuItem();
        Zamenjaj_vse = new javax.swing.JMenuItem();
        Barve = new javax.swing.JMenu();
        Besedilo = new javax.swing.JMenuItem();
        Podlaga = new javax.swing.JMenuItem();
        Pomoč = new javax.swing.JMenu();
        Avtor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Urejevalnik besedila");

        Statusna_vrstica.setText(" ...");

        jToolBar1.setRollover(true);

        OdpriB.setText("Odpri");
        OdpriB.setFocusable(false);
        OdpriB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OdpriB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        OdpriB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdpriActionPerformed(evt);
            }
        });
        jToolBar1.add(OdpriB);
        jToolBar1.add(jSeparator1);

        ShraniB.setText("Shrani");
        ShraniB.setFocusable(false);
        ShraniB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ShraniB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ShraniB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShraniActionPerformed(evt);
            }
        });
        jToolBar1.add(ShraniB);
        jToolBar1.add(jSeparator2);

        Najdi_vseB.setText("Najdi vse");
        Najdi_vseB.setFocusable(false);
        Najdi_vseB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Najdi_vseB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Najdi_vseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Najdi_vseActionPerformed(evt);
            }
        });
        jToolBar1.add(Najdi_vseB);
        jToolBar1.add(jSeparator3);

        Zamenjaj_vseB.setText("Zamenjaj vse");
        Zamenjaj_vseB.setFocusable(false);
        Zamenjaj_vseB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Zamenjaj_vseB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Zamenjaj_vseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zamenjaj_vseActionPerformed(evt);
            }
        });
        jToolBar1.add(Zamenjaj_vseB);

        Iskalni_niz.setText("Iskalni niz: ");

        Zamenjaj_z.setText("Zamenjaj z: ");

        jScrollPane1.setViewportView(Besedilo_datoteke);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Zamenjaj_z, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(Iskalni_niz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iskalni_niz)
                            .addComponent(zamenjaj_z))
                        .addGap(87, 87, 87))
                    .addComponent(Statusna_vrstica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iskalni_niz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Iskalni_niz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zamenjaj_z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Zamenjaj_z))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Statusna_vrstica))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        Datoteka.setMnemonic(KeyEvent.VK_D);
        Datoteka.setText("Datoteka");

        Odpri.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Odpri.setMnemonic(KeyEvent.VK_O);
        Odpri.setText("Odpri");
        Odpri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdpriActionPerformed(evt);
            }
        });
        Datoteka.add(Odpri);

        Shrani.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Shrani.setMnemonic(KeyEvent.VK_S);
        Shrani.setText("Shrani");
        Shrani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShraniActionPerformed(evt);
            }
        });
        Datoteka.add(Shrani);

        Izhod.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Izhod.setMnemonic(KeyEvent.VK_I);
        Izhod.setText("Izhod");
        Izhod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzhodActionPerformed(evt);
            }
        });
        Datoteka.add(Izhod);

        jMenuBar1.add(Datoteka);

        Iskanje.setMnemonic(KeyEvent.VK_I);
        Iskanje.setText("Iskanje");

        Najdi_vse.setMnemonic(KeyEvent.VK_N);
        Najdi_vse.setText("Najdi vse");
        Najdi_vse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Najdi_vseActionPerformed(evt);
            }
        });
        Iskanje.add(Najdi_vse);

        Zamenjaj_vse.setMnemonic(KeyEvent.VK_Z);
        Zamenjaj_vse.setText("Zamenjaj vse");
        Zamenjaj_vse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zamenjaj_vseActionPerformed(evt);
            }
        });
        Iskanje.add(Zamenjaj_vse);

        jMenuBar1.add(Iskanje);

        Barve.setMnemonic(KeyEvent.VK_B);
        Barve.setText("Barve");

        Besedilo.setMnemonic(KeyEvent.VK_B);
        Besedilo.setText("Besedilo");
        Besedilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BesediloActionPerformed(evt);
            }
        });
        Barve.add(Besedilo);

        Podlaga.setMnemonic(KeyEvent.VK_P);
        Podlaga.setText("Podlaga");
        Podlaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PodlagaActionPerformed(evt);
            }
        });
        Barve.add(Podlaga);

        jMenuBar1.add(Barve);

        Pomoč.setMnemonic(KeyEvent.VK_P);
        Pomoč.setText("Pomoč");

        Avtor.setMnemonic(KeyEvent.VK_A);
        Avtor.setText("Avtor");
        Avtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvtorActionPerformed(evt);
            }
        });
        Pomoč.add(Avtor);

        jMenuBar1.add(Pomoč);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void AvtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvtorActionPerformed
        // TODO add your handling code here:
        Statusna_vrstica.setText("Avtor programa: Marko Zeman");
    }//GEN-LAST:event_AvtorActionPerformed

    private void IzhodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzhodActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_IzhodActionPerformed

    private void OdpriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdpriActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser ("./");
        jfc.setDialogTitle("Odpri");
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = jfc.getSelectedFile();
            long velikost = f.length();
            Statusna_vrstica.setText("Odprta datoteka: " + f.getName() + " || Velikost datoteke: " + velikost + " B");
            try {
                Besedilo_datoteke.read(new FileReader (f), null);
            }
            catch (IOException e) {
                Statusna_vrstica.setText("Napaka pri odpiranju datoteke: " + f.getName());
           }
        }
    }//GEN-LAST:event_OdpriActionPerformed

    private void ShraniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShraniActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser("./");
        jfc.setDialogTitle("Shrani kot");
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = jfc.getSelectedFile();
            Statusna_vrstica.setText("Izbrana datoteka: " + f.getName());
            try {
                Besedilo_datoteke.write(new FileWriter(f));
            }
            catch (IOException e) {
                Statusna_vrstica.setText("Napaka pri shranjevanju datoteke: " + f.getName());
            }
        }
    }//GEN-LAST:event_ShraniActionPerformed

    private void Najdi_vseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Najdi_vseActionPerformed
        // TODO add your handling code here:
        String najdi = iskalni_niz.getText();
        if (najdi.length() == 0) {
            Statusna_vrstica.setText("Vnesi iskalni niz");
            return;
        }
        int i=0;
        try {
            i = Besedilo_datoteke.getText().indexOf(najdi, 0);
        }
        catch (NullPointerException e) {
            Statusna_vrstica.setText("Ni najdene te besede");
        }
        
        Besedilo_datoteke.select(i, i+najdi.length());
        Style s = Besedilo_datoteke.addStyle("Text Background", null);
        StyleConstants.setBackground(s, Color.yellow);
        StyledDocument d = Besedilo_datoteke.getStyledDocument();
        d.setCharacterAttributes(i, najdi.length(), s, false);
        Besedilo_datoteke.moveCaretPosition(i);
        Besedilo_datoteke.grabFocus();
        
    }//GEN-LAST:event_Najdi_vseActionPerformed

    private void Zamenjaj_vseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zamenjaj_vseActionPerformed
        // TODO add your handling code here:
        String najdi = iskalni_niz.getText();
        String zamenjava = zamenjaj_z.getText();
        if (zamenjava.length() == 0 || najdi.length() == 0) {
            Statusna_vrstica.setText("Vnesi oba niza");
            return;
        }
        int i=0;
        try {
            i = Besedilo_datoteke.getText().indexOf(najdi, 0);
        }
        catch (NullPointerException e) {
            Statusna_vrstica.setText("Ni najdene te besede");
        }
        Besedilo_datoteke.select(i, i+najdi.length());
        Besedilo_datoteke.replaceSelection(zamenjava);
        Style s = Besedilo_datoteke.addStyle("Text Background", null);
        StyleConstants.setBackground(s, Color.yellow);
        StyledDocument d = Besedilo_datoteke.getStyledDocument();
        d.setCharacterAttributes(i, najdi.length(), s, false);
       // Besedilo_datoteke.moveCaretPosition(i);
        Besedilo_datoteke.grabFocus();
    }//GEN-LAST:event_Zamenjaj_vseActionPerformed

    private void PodlagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PodlagaActionPerformed
        // TODO add your handling code here:
        Color c = JColorChooser.showDialog(this, "Izberi barvo: ", Color.yellow);
        if (Besedilo_datoteke.getSelectedText() == null){
            Statusna_vrstica.setText("Besedilo ni bilo označeno");
            return;
        }
        if(c == null){
            Statusna_vrstica.setText("Barva ni bila izbrana");
            return;
        }
        Style s = Besedilo_datoteke.addStyle("TextBackground", null);
        StyleConstants.setBackground(s, c);
        StyledDocument doc = Besedilo_datoteke.getStyledDocument();
        doc.setCharacterAttributes(Besedilo_datoteke.getSelectionStart(), Besedilo_datoteke.getSelectionEnd() - Besedilo_datoteke.getSelectionStart(), s, false);
        
        Statusna_vrstica.setText("Podlaga izbranega besedila pobarvana");
    }//GEN-LAST:event_PodlagaActionPerformed

    private void BesediloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BesediloActionPerformed
        // TODO add your handling code here:
        Color c = JColorChooser.showDialog(this, "Izberi barvo: ", Color.red);
        if (Besedilo_datoteke.getSelectedText() == null){
            Statusna_vrstica.setText("Besedilo ni bilo označeno");
            return;
        }
        if(c == null){
            Statusna_vrstica.setText("Barva ni bila izbrana");
            return;
        }
        
        Style s = Besedilo_datoteke.addStyle("TextForeground", null);
        StyleConstants.setForeground(s, c);
        StyledDocument doc = Besedilo_datoteke.getStyledDocument();
        doc.setCharacterAttributes(Besedilo_datoteke.getSelectionStart(), Besedilo_datoteke.getSelectionEnd() - Besedilo_datoteke.getSelectionStart(), s, false);
        
        Statusna_vrstica.setText("Izbrano besedilo obarvano");
    }//GEN-LAST:event_BesediloActionPerformed

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
            java.util.logging.Logger.getLogger(Urejevalnik_besedila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Urejevalnik_besedila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Urejevalnik_besedila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Urejevalnik_besedila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Urejevalnik_besedila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Avtor;
    private javax.swing.JMenu Barve;
    private javax.swing.JMenuItem Besedilo;
    private javax.swing.JTextPane Besedilo_datoteke;
    private javax.swing.JMenu Datoteka;
    private javax.swing.JLabel Iskalni_niz;
    private javax.swing.JMenu Iskanje;
    private javax.swing.JMenuItem Izhod;
    private javax.swing.JMenuItem Najdi_vse;
    private javax.swing.JButton Najdi_vseB;
    private javax.swing.JMenuItem Odpri;
    private javax.swing.JButton OdpriB;
    private javax.swing.JMenuItem Podlaga;
    private javax.swing.JMenu Pomoč;
    private javax.swing.JMenuItem Shrani;
    private javax.swing.JButton ShraniB;
    private javax.swing.JLabel Statusna_vrstica;
    private javax.swing.JMenuItem Zamenjaj_vse;
    private javax.swing.JButton Zamenjaj_vseB;
    private javax.swing.JLabel Zamenjaj_z;
    private javax.swing.JTextField iskalni_niz;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField zamenjaj_z;
    // End of variables declaration//GEN-END:variables
}
