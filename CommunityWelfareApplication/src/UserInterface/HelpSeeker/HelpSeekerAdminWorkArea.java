/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HelpSeeker;

import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author adhar
 */
public class HelpSeekerAdminWorkArea extends javax.swing.JPanel {
    private JPanel downJPanel;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    
    /**
     * Creates new form HelpSeekerAdminWorkArea
     */
    public HelpSeekerAdminWorkArea(JPanel downJPanel, Enterprise enterprise) {
        initComponents();
         this.downJPanel=downJPanel;
        this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageUserAccountBtn = new javax.swing.JButton();
        manageEmployeeBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageUserAccountBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        manageUserAccountBtn.setText("MANAGE USER ACCOUNT");
        manageUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountBtnActionPerformed(evt);
            }
        });
        add(manageUserAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 300, 266, 55));

        manageEmployeeBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        manageEmployeeBtn.setText("MANAGE EMPLOYEE");
        manageEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeBtnActionPerformed(evt);
            }
        });
        add(manageEmployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 227, 266, 55));

        jPanel3.setBackground(new java.awt.Color(66, 160, 236));

        jLabel3.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Help Seeker Organization");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 994, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountBtnActionPerformed
        ManageUserAccount muajp = new ManageUserAccount(downJPanel, enterprise);
        downJPanel.add("HelpProviderManageUserAccount", muajp);

        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_manageUserAccountBtnActionPerformed

    private void manageEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeBtnActionPerformed
        ManageEmployee manageEmployeeJPanel = new ManageEmployee(downJPanel, enterprise.getOrganizationDirectory());
        downJPanel.add("GiverManageEmployee", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_manageEmployeeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton manageEmployeeBtn;
    private javax.swing.JButton manageUserAccountBtn;
    // End of variables declaration//GEN-END:variables
}

