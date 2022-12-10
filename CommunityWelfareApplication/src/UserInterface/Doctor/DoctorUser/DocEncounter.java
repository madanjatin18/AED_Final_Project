/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Doctor.DoctorUser;

import BusinessModel.Doctor.EncounterHistory;
import BusinessModel.Doctor.VitalSigns;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author Guest User
 */
public class DocEncounter extends javax.swing.JPanel {

    /**
     * Creates new form DocEncounter
     */
    EncounterHistory EncList;
    public DocEncounter(JPanel downJPanel) {
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

        doc_id_tf = new java.awt.TextField();
        jLabel56 = new javax.swing.JLabel();
        Patient_Name_tf = new java.awt.TextField();
        Patient_Age_tf = new java.awt.TextField();
        Save_Enc_btn = new javax.swing.JButton();
        btnbackencounter = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        heartRate = new java.awt.TextField();
        doc_name_tf1 = new java.awt.TextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        Temp_tf = new java.awt.TextField();
        pat_id_tf = new java.awt.TextField();
        jLabel59 = new javax.swing.JLabel();
        StartDate = new com.toedter.calendar.JDateChooser();
        jLabel60 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        BP_tf = new java.awt.TextField();

        jLabel56.setText("Temp");

        Save_Enc_btn.setText("SAVE");
        Save_Enc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_Enc_btnActionPerformed(evt);
            }
        });

        btnbackencounter.setText("BACK");
        btnbackencounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackencounterActionPerformed(evt);
            }
        });

        jLabel57.setText("Doctor Id:");

        jLabel65.setText("Patient Id:");

        heartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartRateActionPerformed(evt);
            }
        });

        jLabel58.setText("Patient Name:");

        jLabel66.setText("Doctor Name :");

        Temp_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Temp_tfActionPerformed(evt);
            }
        });

        jLabel59.setText("Patient Age:");

        jLabel60.setText("BP:");

        jLabel64.setText("Date");

        jLabel62.setText("HeartRate");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel63.setText("Doctor's Clinic");

        BP_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BP_tfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pat_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doc_id_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doc_name_tf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel63)
                            .addComponent(jLabel66)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel62))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BP_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Patient_Age_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heartRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Temp_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Patient_Name_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(Save_Enc_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbackencounter)))
                .addContainerGap(466, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel63)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doc_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(doc_name_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pat_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Patient_Name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Patient_Age_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BP_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Temp_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save_Enc_btn)
                    .addComponent(btnbackencounter))
                .addContainerGap(325, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Save_Enc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_Enc_btnActionPerformed
        int doc_id = Integer.parseInt(doc_id_tf.getText());
        String doc_name= doc_name_tf1.getText();
        int pat_id = Integer.parseInt(pat_id_tf.getText());
        String patient_name = Patient_Name_tf.getText();
        int age = Integer.parseInt(Patient_Age_tf.getText());
        int BP =Integer.parseInt( BP_tf.getText());
        double temp = Integer.parseInt(Temp_tf.getText());
        int HeartRate =Integer.parseInt( heartRate.getText());
        Date start_date = StartDate.getDate();

//        VitalSigns vs = EncList.addNewDetails();
//
//        vs.setDoc_name(doc_name);
//        vs.setDoc_id(doc_id);
//        vs.setPat_id(pat_id);
//        vs.setBP(BP);
//        vs.setTemp(temp);
//        vs.setHeartRate(HeartRate);
//        vs.setPatient_name(patient_name);
//        vs.setAge(age);
//        vs.setStart_date(start_date);

        //        ed.setSyst_BP(syst_BP);
        //        ed.setDyst_BP(dyst_BP);
        //        ed.setHeartRate(HeartRate);
        //        ed.setWt(wt);
        //        ed.setHt(ht);
        //
//        populatEncounterdirectory();

        //        ed.setEmail_address(email_address);
        //        ed.setPosition(position);
        //        ed.setImagepath(new ImageIcon(prof_pic));

//        JOptionPane.showMessageDialog(this, "Patient Info Added");

        // TODO add your handling code here:
    }//GEN-LAST:event_Save_Enc_btnActionPerformed

    private void btnbackencounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackencounterActionPerformed
        // TODO add your handling code here:
        //        btnAddCityCommunity.setVisible(false);
//        Option_Panel_Admin.setVisible(true);
//        SplitPane.setRightComponent(Option_Panel_Admin);
//        Option_Panel_Doc.setVisible(false);
//
//        Encounter_Panel.setVisible(false);

    }//GEN-LAST:event_btnbackencounterActionPerformed

    private void heartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heartRateActionPerformed

    private void Temp_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Temp_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Temp_tfActionPerformed

    private void BP_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BP_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BP_tfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField BP_tf;
    private java.awt.TextField Patient_Age_tf;
    private java.awt.TextField Patient_Name_tf;
    private javax.swing.JButton Save_Enc_btn;
    private com.toedter.calendar.JDateChooser StartDate;
    private java.awt.TextField Temp_tf;
    private javax.swing.JButton btnbackencounter;
    private java.awt.TextField doc_id_tf;
    private java.awt.TextField doc_name_tf1;
    private java.awt.TextField heartRate;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private java.awt.TextField pat_id_tf;
    // End of variables declaration//GEN-END:variables
}
