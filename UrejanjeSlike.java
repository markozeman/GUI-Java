/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dn05;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;


/**
 *
 * @author student
 */
public class UrejanjeSlike extends javax.swing.JFrame {

	/**
	 * Creates new form UrejanjeSlike
	 */
	public UrejanjeSlike() {
		initComponents();
	}

	private File save = null;
	
	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jSplitPane1 = new javax.swing.JSplitPane();
                levo = new dn05.Urejanje_plosca();
                desno = new dn05.Urejanje_plosca();
                status = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jMenuBar1 = new javax.swing.JMenuBar();
                datoteka = new javax.swing.JMenu();
                odpri = new javax.swing.JMenuItem();
                shrani = new javax.swing.JMenuItem();
                izhod = new javax.swing.JMenuItem();
                uredi = new javax.swing.JMenu();
                glajenje = new javax.swing.JMenuItem();
                ostrenje = new javax.swing.JMenuItem();
                robovi = new javax.swing.JMenuItem();
                original = new javax.swing.JMenuItem();
                kanali = new javax.swing.JMenu();
                rdeca = new javax.swing.JCheckBoxMenuItem();
                zelena = new javax.swing.JCheckBoxMenuItem();
                modra = new javax.swing.JCheckBoxMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Urejevalnik slik");

                javax.swing.GroupLayout levoLayout = new javax.swing.GroupLayout(levo);
                levo.setLayout(levoLayout);
                levoLayout.setHorizontalGroup(
                        levoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 246, Short.MAX_VALUE)
                );
                levoLayout.setVerticalGroup(
                        levoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 496, Short.MAX_VALUE)
                );

                jSplitPane1.setLeftComponent(levo);

                javax.swing.GroupLayout desnoLayout = new javax.swing.GroupLayout(desno);
                desno.setLayout(desnoLayout);
                desnoLayout.setHorizontalGroup(
                        desnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 496, Short.MAX_VALUE)
                );
                desnoLayout.setVerticalGroup(
                        desnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 496, Short.MAX_VALUE)
                );

                jSplitPane1.setRightComponent(desno);

                status.setText("Status: ");

                datoteka.setMnemonic(KeyEvent.VK_D);
                datoteka.setText("Datoteka");

                odpri.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
                odpri.setMnemonic(KeyEvent.VK_O);
                odpri.setText("Odpri");
                odpri.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                odpriActionPerformed(evt);
                        }
                });
                datoteka.add(odpri);

                shrani.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
                shrani.setMnemonic(KeyEvent.VK_S);
                shrani.setText("Shrani");
                shrani.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                shraniSliko(evt);
                        }
                });
                datoteka.add(shrani);

                izhod.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
                izhod.setMnemonic(KeyEvent.VK_I);
                izhod.setText("Izhod");
                izhod.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                izhodActionPerformed(evt);
                        }
                });
                datoteka.add(izhod);

                jMenuBar1.add(datoteka);

                uredi.setMnemonic(KeyEvent.VK_U);
                uredi.setText("Uredi");

                glajenje.setMnemonic(KeyEvent.VK_G);
                glajenje.setText("Glajenje");
                glajenje.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                glajenjeActionPerformed(evt);
                        }
                });
                uredi.add(glajenje);

                ostrenje.setMnemonic(KeyEvent.VK_O);
                ostrenje.setText("Ostrenje");
                ostrenje.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ostrenjeActionPerformed(evt);
                        }
                });
                uredi.add(ostrenje);

                robovi.setMnemonic(KeyEvent.VK_R);
                robovi.setText("Robovi");
                robovi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                roboviActionPerformed(evt);
                        }
                });
                uredi.add(robovi);

                original.setMnemonic(KeyEvent.VK_O);
                original.setText("Original");
                original.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                originalActionPerformed(evt);
                        }
                });
                uredi.add(original);

                jMenuBar1.add(uredi);

                kanali.setMnemonic(KeyEvent.
                        VK_K);
                kanali.setText("Kanali");

                rdeca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
                rdeca.setMnemonic(KeyEvent.VK_R);
                rdeca.setText("Rdeča");
                rdeca.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rdecaActionPerformed(evt);
                        }
                });
                kanali.add(rdeca);

                zelena.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK));
                zelena.setMnemonic(KeyEvent.VK_Z);
                zelena.setText("Zelena");
                zelena.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rdecaActionPerformed(evt);
                        }
                });
                kanali.add(zelena);

                modra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
                modra.setMnemonic(KeyEvent.VK_M);
                modra.setText("Modra");
                modra.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rdecaActionPerformed(evt);
                        }
                });
                kanali.add(modra);

                jMenuBar1.add(kanali);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1)
                        .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSplitPane1)
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status)
                                .addGap(1, 1, 1))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void odpriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odpriActionPerformed
		
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			levo.odpriSliko(jfc.getSelectedFile());
			desno.odpriSliko(jfc.getSelectedFile());
			
			String path = jfc.getSelectedFile().getName();
			status.setText("Status: Odpiram sliko " + path);
		}
        }//GEN-LAST:event_odpriActionPerformed

        private void originalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originalActionPerformed
                desno.original();
		status.setText("Status: Slika ponastavljena ...");
        }//GEN-LAST:event_originalActionPerformed

        private void izhodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izhodActionPerformed
		System.exit(0);
        }//GEN-LAST:event_izhodActionPerformed

        private void shraniSliko(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shraniSliko
                if(save == null){
			JFileChooser jfc = new JFileChooser();
			if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			    save = jfc.getSelectedFile();
			}
		}
	    
		try {
			desno.shraniSliko(save, save.getName());
		} catch (IOException ex) {
			Logger.getLogger(UrejanjeSlike.class.getName()).log(Level.SEVERE, null, ex);
		}
        }//GEN-LAST:event_shraniSliko

        private void glajenjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glajenjeActionPerformed
                status.setText("Status: Glajenje slike ...");
		desno.glajenjeSlike();
        }//GEN-LAST:event_glajenjeActionPerformed

        private void ostrenjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ostrenjeActionPerformed
                status.setText("Status: Ostrenje slike ...");
		desno.ostrenjeSlike();
        }//GEN-LAST:event_ostrenjeActionPerformed

        private void roboviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roboviActionPerformed
                status.setText("Status: Odkrivanje robov slike ...");
		desno.roboviSlike();
        }//GEN-LAST:event_roboviActionPerformed

        private void rdecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdecaActionPerformed
                boolean r = false;
		boolean g = false;
		boolean b = false;
		
		if (rdeca.isSelected()) r = true;
		if (zelena.isSelected()) g = true;
		if (modra.isSelected()) b = true;
		
		desno.menjajRGB(r, g, b);
        }//GEN-LAST:event_rdecaActionPerformed

	
	
	
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
			java.util.logging.Logger.getLogger(UrejanjeSlike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(UrejanjeSlike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(UrejanjeSlike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(UrejanjeSlike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UrejanjeSlike().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JMenu datoteka;
        private dn05.Urejanje_plosca desno;
        private javax.swing.JMenuItem glajenje;
        private javax.swing.JMenuItem izhod;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSplitPane jSplitPane1;
        private javax.swing.JMenu kanali;
        private dn05.Urejanje_plosca levo;
        private javax.swing.JCheckBoxMenuItem modra;
        private javax.swing.JMenuItem odpri;
        private javax.swing.JMenuItem original;
        private javax.swing.JMenuItem ostrenje;
        private javax.swing.JCheckBoxMenuItem rdeca;
        private javax.swing.JMenuItem robovi;
        private javax.swing.JMenuItem shrani;
        private javax.swing.JLabel status;
        private javax.swing.JMenu uredi;
        private javax.swing.JCheckBoxMenuItem zelena;
        // End of variables declaration//GEN-END:variables
}
