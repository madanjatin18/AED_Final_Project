/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierEnterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.Organization.Organization.Type;
import BusinessModel.Organization.OrganizationDirectory;
//import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyEvent;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author akhileshdongre
 */
public class ManageOrganization extends javax.swing.JPanel {
    private OrganizationDirectory organizationDirectory;
    private JPanel downJPanel;
    /**
     * Creates new form ManageOrganization
     */
    public ManageOrganization(JPanel downJPanel, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.downJPanel = downJPanel;
       this.organizationDirectory = organizationDirectory;
       
        populateJComboBox();
       populateJTable();
    }
    
    
    private void populateJComboBox(){
        organizationJComboBox.removeAllItems();
      //  for (Type type : Organization.Type.values()){
       //     if (!type.getValue().equals(Type.Clinic.getValue()))
                //for(Organization.Type type:Organization.Type.values()){
                  //  if(!type.getValue().equals(Organization.Type.ChangeMaker.getValue())){
                        organizationJComboBox.addItem(Organization.Type.Supplier);
                    //}
                    //else if(!type.getValue().equals(Organization.Type.ChangeSeeker.getValue())){
                        organizationJComboBox.addItem(Organization.Type.Donor);
//                        organizationJComboBox.addItem(Organization.Type.NGO);
//                        organizationJComboBox.addItem(Organization.Type.Volunteer);
                   // }
               // }
                
      //  }
    }
    
    private void populateJTable(){
        DefaultTableModel model = (DefaultTableModel) organizationTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : organizationDirectory.getOrganizationList()){
            Object[] row = new Object[3];
            row[2] = organization.getOrganizationCode();
            row[0] = organization.getOrganizationName();
            row[1]=  organization.getName();
            model.addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        nameTextField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Type of Organization: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 97, -1, -1));

        jLabel3.setText("Name: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 132, -1, -1));

        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 94, 207, -1));
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 129, 207, -1));

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 163, 207, -1));

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Organization");

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
                .addGap(27, 27, 27)
                .addComponent(backBtn)
                .addGap(273, 273, 273)
                .addComponent(jLabel1)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        organizationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type pf Organization", "ID"
            }
        ));
        jScrollPane1.setViewportView(organizationTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 94, 339, 669));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(nameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Text Field Cannot be Empty");
        }else{
            Type type = (Type) organizationJComboBox.getSelectedItem();
            organizationDirectory.createOrganization(type,nameTextField.getText());
            populateJTable();
            nameTextField.setText("");}
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        downJPanel.remove(this);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.previous(downJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationTable;
    // End of variables declaration//GEN-END:variables
}
