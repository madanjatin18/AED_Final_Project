/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor.DoctorUser;

import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;

import BusinessModel.Organization.Organization;


import BusinessModel.UserAccount.UserAccount;

import BusinessModel.WorkQueue.HelpSeekerWorkReq;

import BusinessModel.WorkQueue.WorkReq;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author madanjatin
 */
public class DoctorUserWorkArea extends javax.swing.JPanel {
    private JPanel downJPanel;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise Enterprise;
    private EcoSystem ESystem;
    /**
     * Creates new form DoctorUserWorkArea
     */
    public DoctorUserWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.downJPanel=downJPanel;
        this.UserAccount=UserAccount;
        this.org=org;
        this.Enterprise=enterprise;
        this.ESystem=ESystem;
        
        populateWorkQueueTable();
    }
    public void populateWorkQueueTable(){
    DefaultTableModel model = (DefaultTableModel) requestJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : ESystem.getWorkQueue().getWorkRequestList()){
           if((work instanceof HelpSeekerWorkReq)&& (work.getSubject().equalsIgnoreCase("Hospital")))
               {
                   
               
            Object[] row = new Object[10];
            row[0] = work.getSender().getEmployee().getEmpname();
            row[1] = work.getSubject();
            row[2] = ((HelpSeekerWorkReq) work).getDescription();
            row[3] = ((HelpSeekerWorkReq) work).getLocation();
            row[4] = work.getDateOfRequest();
            row[5] = work;
            row[6] = work.getReciever();
            
            model.addRow(row);
           }
        }
        
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestJTable = new javax.swing.JTable();
        completeWorkBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctor User Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(390, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(373, 373, 373))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        requestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Subject", "Description", "Location", "Date", "Status", "Help Provider"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 133, 757, 230));

        completeWorkBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        completeWorkBtn.setText("COMPLETE");
        completeWorkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeWorkBtnActionPerformed(evt);
            }
        });
        add(completeWorkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 370, 757, 36));

        jButton1.setText("Record Vital Signs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void completeWorkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeWorkBtnActionPerformed
        int selectedRow = requestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please first select a row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else

        {

            HelpSeekerWorkReq hs = (HelpSeekerWorkReq) requestJTable.getValueAt(selectedRow, 5);

            hs.setStatus("Complete");
            hs.setReciever(UserAccount);
            JOptionPane.showMessageDialog(null, "The request has been completed successfully");
            populateWorkQueueTable();

        }
    }//GEN-LAST:event_completeWorkBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       // downJPanel.removeAll();
    DocEncounter DocEncounterJPanel= new DocEncounter(downJPanel);
    downJPanel.add("DocEncounter",DocEncounterJPanel);
    CardLayout crdLyt=(CardLayout)downJPanel.getLayout();
    crdLyt.next(downJPanel);
    //db4outil.storeSystem(ecosystem);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeWorkBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestJTable;
    // End of variables declaration//GEN-END:variables
}

