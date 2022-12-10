/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierEnterprise;
import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author akhileshdongre
 */
public class SupplierAdministratorWorkArea extends javax.swing.JPanel {
    private JPanel downJPanel;
    private EcoSystem ecosystem;
    private Enterprise enterprise;
    private Organization org;
    private UserAccount UserAccount;
    /**
     * Creates new form SupplierAdministratorWorkArea
     */
    public SupplierAdministratorWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.downJPanel = downJPanel;
        this.ecosystem = ESystem;
        this.enterprise = enterprise;
        this.UserAccount = UserAccount;
        this.org = org;
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
        mngOrganisationBtn = new javax.swing.JButton();
        mngEmployeeBtn = new javax.swing.JButton();
        mngUserAccountBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supplier Enterprise");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel1)
                .addContainerGap(414, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 994, -1));

        mngOrganisationBtn.setText("Manage Organization");
        mngOrganisationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngOrganisationBtnActionPerformed(evt);
            }
        });
        add(mngOrganisationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 278, 213, 55));

        mngEmployeeBtn.setText("Manage Organization Employee");
        mngEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngEmployeeBtnActionPerformed(evt);
            }
        });
        add(mngEmployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 340, -1, 52));

        mngUserAccountBtn.setText("Manage User Account");
        mngUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngUserAccountBtnActionPerformed(evt);
            }
        });
        add(mngUserAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 405, 213, 53));
    }// </editor-fold>//GEN-END:initComponents

    private void mngOrganisationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngOrganisationBtnActionPerformed
        // TODO add your handling code here:
        ManageOrganization mng = new ManageOrganization(downJPanel, enterprise.getOrganizationDirectory());
        downJPanel.add("ManageOrganization", mng);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_mngOrganisationBtnActionPerformed

    private void mngEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngEmployeeBtnActionPerformed
        // TODO add your handling code here:
        ManageOrganizationEmployee mng = new ManageOrganizationEmployee(downJPanel, enterprise.getOrganizationDirectory());
        downJPanel.add("ManageEmployee", mng);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_mngEmployeeBtnActionPerformed

    private void mngUserAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngUserAccountBtnActionPerformed
        // TODO add your handling code here:
        ManageUserAccount mng = new ManageUserAccount(downJPanel, enterprise);
        downJPanel.add("ManageUserAccount", mng);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.next(downJPanel);
    }//GEN-LAST:event_mngUserAccountBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mngEmployeeBtn;
    private javax.swing.JButton mngOrganisationBtn;
    private javax.swing.JButton mngUserAccountBtn;
    // End of variables declaration//GEN-END:variables
}

