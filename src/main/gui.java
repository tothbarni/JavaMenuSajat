/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;

public class gui extends javax.swing.JFrame {

    public gui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNev = new javax.swing.JTextField();
        lblNev = new javax.swing.JLabel();
        chkHirlevel = new javax.swing.JCheckBox();
        cmbSzak = new javax.swing.JComboBox<>();
        lblSzak = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuPrgMentes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuPrgKilepes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menü gyakorlása");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblNev.setText("Név:");

        chkHirlevel.setText("hírlevél:");

        cmbSzak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-== Kiválasztott szak ==-", "-== Szoftverfejlesztő ==-", "-== Rendszergazda ==-", " " }));

        lblSzak.setText("Szak:");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jMenu1.setText("Program");

        jMenuItem1.setText("Betöltés...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mnuPrgMentes.setText("Mentés...");
        mnuPrgMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrgMentesActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPrgMentes);
        jMenu1.add(jSeparator1);

        mnuPrgKilepes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuPrgKilepes.setText("Kilépés...");
        mnuPrgKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrgKilepesActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPrgKilepes);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbSzak, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSzak)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNev, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset)
                    .addComponent(chkHirlevel))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNev)
                    .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSzak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSzak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkHirlevel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPrgKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrgKilepesActionPerformed
        kilepes();
    }//GEN-LAST:event_mnuPrgKilepesActionPerformed

    private String tartalom(){
        String nev = txtNev.getText();
        String szak = (String) cmbSzak.getSelectedItem();
        boolean hirlevel = chkHirlevel.isSelected();
        
        return nev+"\n"+szak+"\n"+hirlevel;
    }
    
    private void kilepes() {
        int msgTip = JOptionPane.YES_NO_OPTION;
        int gomb = JOptionPane.showConfirmDialog(null, "Biztosan kilépsz?", "Kilépés", msgTip);
        if (gomb == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing

    private void mnuPrgMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrgMentesActionPerformed
        JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
        int gomb = jfc.showSaveDialog(this);
        if (gomb==JFileChooser.APPROVE_OPTION) {
            File kivalasztottFajl = jfc.getSelectedFile();
            String fajlElerese = kivalasztottFajl.getAbsolutePath();
            Path path = Path.of(fajlElerese);
            try {
                Files.writeString(path, tartalom());
            } catch (IOException ex) {
                Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
                String msg = "IO hiba!\n" + ex.getMessage();
                JOptionPane.showMessageDialog(rootPane, msg);
            }    
        }
        
//    | Fájlba írás:
//    |_____________
//        Path path = Path.of("Kimenet.txt");
//        byte[] bytes = jTextField1.getText().getBytes();
//        try {
//            Files.write(path, bytes);
//        } catch (IOException ex) {
//            Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_mnuPrgMentesActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtNev.setText("");
        cmbSzak.setSelectedIndex(0);
        chkHirlevel.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
        int valasztas = jfc.showOpenDialog(this);
        if (valasztas == JFileChooser.APPROVE_OPTION) {
            try {
                List<String> sorok = Files.readAllLines(jfc.getSelectedFile().toPath());
                System.out.println(sorok);
                if (sorok.size() == 3) {
                    txtNev.setText(sorok.get(0));
                    cmbSzak.setSelectedItem(sorok.get(1));
                    chkHirlevel.setSelected(Boolean.parseBoolean(sorok.get(2)));
                } else {
                    JOptionPane.showMessageDialog(this, "Nem megfelelő fájl tartalom!");
                }
            } catch (IOException ex) {
                Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
                String msg = "IO hiba!\n" + ex.getMessage();
                JOptionPane.showMessageDialog(rootPane, msg);
            }
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String[] args) {
        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Nem sikerült beállítani a FlatLaf stílust.");
        }

        java.awt.EventQueue.invokeLater(() -> {
            new gui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chkHirlevel;
    private javax.swing.JComboBox<String> cmbSzak;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblNev;
    private javax.swing.JLabel lblSzak;
    private javax.swing.JMenuItem mnuPrgKilepes;
    private javax.swing.JMenuItem mnuPrgMentes;
    private javax.swing.JTextField txtNev;
    // End of variables declaration//GEN-END:variables
}
