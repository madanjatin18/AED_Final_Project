/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalEnterPrise;
import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author madanjatin
 */
public class HospitalAdminWorkArea extends javax.swing.JPanel {
    private JPanel downJPanel;
    private EcoSystem ESystem;
    private Enterprise enterprise;
    private Organization org;
    private UserAccount UserAccount;
    /**
     * Creates new form HospitalAdminWorkArea
     */
    public HospitalAdminWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.downJPanel = downJPanel;
        this.ESystem = ESystem;
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
        jLabel5 = new javax.swing.JLabel();
        mngOrganisationBtn = new javax.swing.JButton();
        mngEmployeeBtn = new javax.swing.JButton();
        mngUserAccountBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(146, 199, 213));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hospital Enterprise");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transistor-hospital-building-jar-of-pills-stethoscope-and-heart-with-a-cardiogram.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(414, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        mngOrganisationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/juicy-workflow.png"))); // NOI18N
        mngOrganisationBtn.setText("Manage Organization");
        mngOrganisationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngOrganisationBtnActionPerformed(evt);
            }
        });
        add(mngOrganisationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 241, 220));

        mngEmployeeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shine-hr-manager-is-searching-for-a-resume-of-employee-1.png"))); // NOI18N
        mngEmployeeBtn.setText("Manage Organization Employee");
        mngEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngEmployeeBtnActionPerformed(evt);
            }
        });
        add(mngEmployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 241, 220));

        mngUserAccountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sammy-line-41.png"))); // NOI18N
        mngUserAccountBtn.setText("Manage User Account");
        mngUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngUserAccountBtnActionPerformed(evt);
            }
        });
        add(mngUserAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 241, 220));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Manage User Account");
        jLabel2.setToolTipText("");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Manage Organization");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Manage Employee");
        jLabel4.setToolTipText("");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mngEmployeeBtn;
    private javax.swing.JButton mngOrganisationBtn;
    private javax.swing.JButton mngUserAccountBtn;
    // End of variables declaration//GEN-END:variables
}

