/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SocialServiceEnterprise;

import BusinessModel.EcoSystem;
import BusinessModel.Employee.Employee;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.HelpProviderOrganization;
import BusinessModel.Organization.HelpSeekerOrganization;
import BusinessModel.Organization.NGOOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.Organization.VolunteerOrganization;
import BusinessModel.Role.HelpProviderAdminRole;
import BusinessModel.Role.HelpSeekerAdminRole;
import BusinessModel.Role.NGOManagerRole;
import BusinessModel.Role.Role;
import BusinessModel.Role.VolunteerAdminRole;
import BusinessModel.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhileshdongre
 */
public class ManageUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccount
     */
    private JPanel downJPanel;
    private Enterprise enterprise;
    public ManageUserAccount(JPanel downJPanel, Enterprise enterprise) {
        initComponents();
        this.downJPanel = downJPanel;
        this.enterprise = enterprise;
        populateOrganizationJComboBox();
         populateData();
    } 
    
    public void populateOrganizationJComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateEmployeeJComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
        }
    }
    
     private void populateRoleComboBox(Enterprise e){
        EmployeeRoleJComboBox.removeAllItems();
        
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if(organization instanceof HelpProviderOrganization){
            EmployeeRoleJComboBox.addItem(new HelpProviderAdminRole());
           
        }else if(organization instanceof HelpSeekerOrganization){
            EmployeeRoleJComboBox.addItem(new HelpSeekerAdminRole());
        }else if(organization instanceof VolunteerOrganization){
            EmployeeRoleJComboBox.addItem(new VolunteerAdminRole());
        }else if(organization instanceof NGOOrganization){
            EmployeeRoleJComboBox.addItem(new NGOManagerRole());
        
        }
        
    }
     
     
     public void populateData() {

        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userTable.getModel()).addRow(row);
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
        backBtn = new javax.swing.JButton();
        EmployeeRoleJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JPasswordField();
        usernameTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        organizationJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setBackground(new java.awt.Color(66, 160, 236));
        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage User Account");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backBtn)
                .addGap(261, 261, 261)
                .addComponent(jLabel1)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(jLabel1))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(EmployeeRoleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 211, 209, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Employee    :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 173, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setText("Password     :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 295, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Employee Role            :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 213, -1, -1));
        add(passwordTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 293, 207, -1));
        add(usernameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 253, 208, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Username    :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 255, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setText("Organization: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 142, -1, -1));

        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 171, 209, -1));

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 142, 209, -1));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 142, 482, 621));

        addBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 333, 207, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeJComboBox(organization);
            populateRoleComboBox(enterprise);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(usernameTxtField.getText().isEmpty()|| passwordTxtField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Any of the above field(s) can't be empty");
        }else{ String userName = usernameTxtField.getText();
            String password = passwordTxtField.getText();
            if(EcoSystem.checkIfUsernameIsUnique(userName)){
                Organization organization = (Organization) organizationJComboBox.getSelectedItem();
                Employee employee = (Employee) employeeJComboBox.getSelectedItem();
                Role role = (Role) EmployeeRoleJComboBox.getSelectedItem();

                organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

                populateData();
                usernameTxtField.setText("");
                passwordTxtField.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,  "Enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
            }}
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
        downJPanel.remove(this);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.previous(downJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox EmployeeRoleJComboBox;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
