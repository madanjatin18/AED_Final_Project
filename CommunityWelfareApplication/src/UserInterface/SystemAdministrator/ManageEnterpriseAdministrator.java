/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdministrator;



import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.HospitalAdminRole;
import Business.Role.SocialServiceAdminRole;
import Business.Role.SupplierAdminRole;
import Business.Role.NGOAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhileshdongre
 */
public class ManageEnterpriseAdministrator extends javax.swing.JPanel {

     private JPanel downJPanel;
     private EcoSystem ecosystem;
    /**
     * Creates new form ManageEnterpriseAdministrator
     */
    public ManageEnterpriseAdministrator(JPanel downJPanel, EcoSystem ecosystem) {
        initComponents();
        this.downJPanel = downJPanel;
        this.ecosystem = ecosystem;
        populateJTable();
        populateNetworkJComboBox();
        UpdtBtn.setVisible(false);
        
    }

    
    private void populateJTable() 
    {
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminJTable.getModel();

        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList())
        {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
            {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList())
                {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getNetworkname();
                    row[2] = userAccount;

                    model.addRow(row);
                }
            }
        }
    }
    
    private void populateNetworkJComboBox() 
    {
        networkJComboBox.removeAllItems();

        for (Network network : ecosystem.getNetworkList()) 
        {
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network) 
    {
        enterpriseTypeJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
        {
            enterpriseTypeJComboBox.addItem(enterprise);
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
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseAdminJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        nameTxtField = new javax.swing.JTextField();
        usernameTxtField = new javax.swing.JTextField();
        passwordTxtField = new javax.swing.JPasswordField();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        View = new javax.swing.JButton();
        UpdtBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Enterprise Administrator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(backBtn)
                .addGap(280, 280, 280)
                .addComponent(jLabel1)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        enterpriseAdminJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network Name", "Enterprise Admin Username "
            }
        ));
        jScrollPane1.setViewportView(enterpriseAdminJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 126, 562, 637));

        jLabel2.setText("Network Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 129, -1, -1));

        jLabel3.setText("Enterprise Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 172, -1, -1));

        jLabel4.setText("Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 215, -1, -1));

        jLabel5.setText("Username:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 259, -1, -1));

        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 306, -1, -1));

        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 126, 231, -1));

        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 169, 231, -1));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 212, 231, -1));
        add(usernameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 256, 231, -1));
        add(passwordTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 303, 231, -1));

        addBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 362, 112, 28));

        deleteBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 362, 112, 28));

        View.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 110, 30));

        UpdtBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        UpdtBtn.setText("Update");
        UpdtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdtBtnActionPerformed(evt);
            }
        });
        add(UpdtBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Enterprise enterprise = (Enterprise) enterpriseTypeJComboBox.getSelectedItem();

        String username = usernameTxtField.getText();
        String password = String.valueOf(passwordTxtField.getPassword());
        String name = nameTxtField.getText();
        
        if(name.equals("")|| username.equals("")|| password.equals("") ){
            JOptionPane.showMessageDialog(null, "Any of the above field(s) can't be empty");
                return;
        }
        else{

        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        if (EcoSystem.checkIfUsernameIsUnique(username)) {
            UserAccount account = null;
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.SocialService) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new SocialServiceAdminRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Supplier) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new SupplierAdminRole());

            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.NGO) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new NGOAdminRole());
            }
            else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Hospital) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
            }

            populateJTable();
            usernameTxtField.setText("");
            passwordTxtField.setText("");
            nameTxtField.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter a unique username!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseAdminJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {

            UserAccount p = (UserAccount) enterpriseAdminJTable.getValueAt(selectedRow, 2);

            for (Network network : ecosystem.getNetworkList()) 
            {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
                {
                    for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList())
                    {
                        if (p == userAccount) {
                            enterprise.getUserAccountDirectory().getUserAccountList().remove(p);
                            break;
                        }

                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Account successfully deleted!");
            populateJTable();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        downJPanel.remove(this);
        Component[] componentArray = downJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        SystemAdministratorWorkArea sysAdminwjp = (SystemAdministratorWorkArea) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.previous(downJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
//        Per_Update_Save_Btn.setVisible(false);
        int selectedRowIndex = enterpriseAdminJTable.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please Select a Row to View.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminJTable.getModel();
        
        UserAccount selectedPersonDetails = (UserAccount) model.getValueAt(selectedRowIndex, 2);
        usernameTxtField.setText(selectedPersonDetails.getUsername());
        passwordTxtField.setText(selectedPersonDetails.getPassword());
        JOptionPane.showMessageDialog(null, "You can Only Change Password");
        usernameTxtField.setEditable(false);
        nameTxtField.setEditable(false);
        UpdtBtn.setVisible(true);
        
//        nameTxtField.setText(selectedPersonDetails.getRole());
        
        
    }//GEN-LAST:event_ViewActionPerformed

    private void UpdtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdtBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = enterpriseAdminJTable.getSelectedRow();
        String pass = String.valueOf(passwordTxtField.getPassword());
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminJTable.getModel();
        UserAccount selectedPersonDetails = (UserAccount) model.getValueAt(selectedRowIndex, 2);
        
        if(pass.equals("")){
            JOptionPane.showMessageDialog(null, "Password cannot be empty");
                return;
        }
        else{
        
        selectedPersonDetails.setPassword(pass);
        }
    }//GEN-LAST:event_UpdtBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdtBtn;
    private javax.swing.JButton View;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable enterpriseAdminJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}
