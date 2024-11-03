/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.aqul.laundry;

import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;
import okhttp3.*;

/**
 *
 * @author LENOVO
 */
public class EditOrder extends javax.swing.JDialog {
    
    /**
     * Creates new form EditOrder
     * @param parent
     * @param modal
     * @param dataOrder
     */
    public EditOrder(java.awt.Frame parent, boolean modal, String[] dataOrder) {
        super(parent, modal);
        this.setResizable(false);
        this.setLocationRelativeTo(parent);
        this.setTitle("Laundry Application | Edit Order");
        initComponents();
        idTextField.setText(dataOrder[0]);
        tanggalOrderTextField.setText(dataOrder[1]);
        namaTextField.setText(dataOrder[2]);
        noHPTextField.setText(dataOrder[3]);
        layananTextField.setText(dataOrder[4]);
        beratTextField.setText(dataOrder[5]);
        hargaTextField.setText(dataOrder[6]);
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
        idLabel = new javax.swing.JLabel();
        tanggalOrderLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        nomorHPLabel = new javax.swing.JLabel();
        layananLabel = new javax.swing.JLabel();
        beratLabel = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        tanggalOrderTextField = new javax.swing.JTextField();
        namaTextField = new javax.swing.JTextField();
        noHPTextField = new javax.swing.JTextField();
        layananTextField = new javax.swing.JTextField();
        beratTextField = new javax.swing.JTextField();
        hargaTextField = new javax.swing.JTextField();
        doneCheckBox = new javax.swing.JCheckBox();
        sendWACheckBox = new javax.swing.JCheckBox();
        updateButton = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 300));

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idLabel.setText("ID");

        tanggalOrderLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tanggalOrderLabel.setText("Tanggal Order");

        namaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namaLabel.setText("Nama");

        nomorHPLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomorHPLabel.setText("No. HP");

        layananLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        layananLabel.setText("Layanan");

        beratLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        beratLabel.setText("Berat");

        hargaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hargaLabel.setText("Harga");

        statusLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusLabel.setText("Status");

        idTextField.setEditable(false);

        tanggalOrderTextField.setEditable(false);
        tanggalOrderTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalOrderTextFieldActionPerformed(evt);
            }
        });

        namaTextField.setEditable(false);
        namaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextFieldActionPerformed(evt);
            }
        });

        noHPTextField.setEditable(false);
        noHPTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noHPTextFieldActionPerformed(evt);
            }
        });

        layananTextField.setEditable(false);
        layananTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layananTextFieldActionPerformed(evt);
            }
        });

        beratTextField.setEditable(false);
        beratTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beratTextFieldActionPerformed(evt);
            }
        });

        hargaTextField.setEditable(false);
        hargaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaTextFieldActionPerformed(evt);
            }
        });

        doneCheckBox.setText("Done");

        sendWACheckBox.setText("Show notification to WhatsApp");
        sendWACheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendWACheckBoxActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 145, 255));
        updateButton.setText("update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tanggalOrderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(nomorHPLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(layananLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(beratLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(hargaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTextField)
                            .addComponent(tanggalOrderTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(namaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(noHPTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(layananTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(beratTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(hargaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(doneCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sendWACheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalOrderLabel)
                    .addComponent(tanggalOrderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomorHPLabel)
                    .addComponent(noHPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layananLabel)
                    .addComponent(layananTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beratLabel)
                    .addComponent(beratTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaLabel)
                    .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(doneCheckBox)
                        .addComponent(sendWACheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tanggalOrderTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalOrderTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalOrderTextFieldActionPerformed

    private void namaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextFieldActionPerformed

    private void noHPTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noHPTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noHPTextFieldActionPerformed

    private void layananTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layananTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_layananTextFieldActionPerformed

    private void beratTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beratTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beratTextFieldActionPerformed

    private void hargaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaTextFieldActionPerformed

    private void sendWACheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendWACheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendWACheckBoxActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (doneCheckBox.isSelected()) {
            try {
                Statement state = Database.Connect().createStatement();
                String query = "UPDATE orders SET status = 'Completed' WHERE order_id = " + idTextField.getText() + ";";
                System.out.println(query);
                int rowAffected = state.executeUpdate(query);
                
                if (rowAffected > 0) {
                    if (sendWACheckBox.isSelected()) {
                        OkHttpClient client = new OkHttpClient().newBuilder().build();
                        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                            .addFormDataPart("target", noHPTextField.getText())
                            .addFormDataPart("message","Halo " + namaTextField.getText() + "\n\nPesanan laundry anda telah selesai.")
                            .build();
                        Request request = new Request.Builder()
                            .url("https://api.fonnte.com/send")
                            .method("POST", body)
                            .addHeader("Authorization", "SiCsffohwgvQjkeB1Se8")
                            .build();
                        Response response = client.newCall(request).execute();
                        if (!response.isSuccessful()) {
                            JOptionPane.showMessageDialog(this, "Gagal mengirim notifikasi ke Whatsapp", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    JOptionPane.showMessageDialog(this, "Order berhasil diupdate", "Success", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            } catch (SQLException e) {
                System.err.println("SQLException : " + e.getMessage());
            } catch (IOException ex) {
                System.err.println("IOException : " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beratLabel;
    private javax.swing.JTextField beratTextField;
    private javax.swing.JCheckBox doneCheckBox;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel layananLabel;
    private javax.swing.JTextField layananTextField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField noHPTextField;
    private javax.swing.JLabel nomorHPLabel;
    private javax.swing.JCheckBox sendWACheckBox;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel tanggalOrderLabel;
    private javax.swing.JTextField tanggalOrderTextField;
    private rojerusan.RSMaterialButtonRectangle updateButton;
    // End of variables declaration//GEN-END:variables
}