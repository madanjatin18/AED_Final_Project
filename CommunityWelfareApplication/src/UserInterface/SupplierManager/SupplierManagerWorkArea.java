/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierManager;
import BusinessModel.Supplier.Supplier;
import BusinessModel.Supplier.Supply;
import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.SupplierOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import BusinessModel.WorkQueue.DonationWorkReq;
import BusinessModel.WorkQueue.NGOSupplyWorkReq;
import BusinessModel.WorkQueue.WorkQueue;
import BusinessModel.WorkQueue.WorkReq;
//import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author adhar
 */
public class SupplierManagerWorkArea extends javax.swing.JPanel {
    private JPanel downJPanel;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise enterprise;
    private EcoSystem ESystem;
    private Supplier s;
    /**
     * Creates new form SupplierManagerWorkArea
     */
    public SupplierManagerWorkArea(JPanel downJPanel, UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.downJPanel=downJPanel;
        this.UserAccount=UserAccount;
        this.org=org;
        this.enterprise=enterprise;
        this.ESystem=ESystem;
        completeBtn.setEnabled(false);
        
   /*    System.out.println("Supplier List size" +((SupplierOrganization) org).getSupplierList().getSupplierList().size());
          for (Supplier supplier : ((SupplierOrganization)org).getSupplierList().getSupplierList()) {
              System.out.println("Supplier List" + supplier.getSupplierName());
            if (UserAccount.getEmployee().getEmpname().equals(supplier.getSupplierName())) {
                 s=supplier;
                System.out.println("Supplier Name" + s.getSupplierName());
            }
        }
//        System.out.println("busi" + s.getWorkQueue().getWorkRequestList().size());
        if (s.getWorkqueue() == null) {
            WorkQueue w = new WorkQueue();
            s.setWorkqueue(w);
        }*/
        
        populateSupplyTable();
       populateCreateTable();
      
        
        
        
         
        
         
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierRequestJTable = new javax.swing.JTable();
        comboReqType = new javax.swing.JComboBox<>();
        assignBtn = new javax.swing.JButton();
        completeBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        reqTxt = new javax.swing.JTextField();
        qtyTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        createJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supplier Work Area");

        backBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289)
                .addComponent(jLabel1)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        supplierRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Requirements", "Quantity", "Status", "Source"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 73, 970, 156));

        comboReqType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Food", "Clothes", "Medicine", "Education", "Furniture" }));
        add(comboReqType, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 327, 213, -1));

        assignBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 236, 145, 35));

        completeBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        completeBtn.setText("Complete");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });
        add(completeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 237, 155, 33));

        addBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addBtn.setText("Request to Donors");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 434, 213, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setText("Requirement: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 366, -1, -1));

        reqTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reqTxtKeyTyped(evt);
            }
        });
        add(reqTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 364, 213, -1));

        qtyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyTxtKeyTyped(evt);
            }
        });
        add(qtyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 399, 213, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Quantity    :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 401, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Request Type: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 329, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel4.setText("AVAILABLE  STOCKS & STATUS : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 300, -1, -1));

        createJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Requirement", "Quantity", "Status", "Donor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(createJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 327, 401, 215));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

    }//GEN-LAST:event_backBtnActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        int selectedRow = supplierRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            NGOSupplyWorkReq nswr = (NGOSupplyWorkReq) supplierRequestJTable.getValueAt(selectedRow, 3);

            nswr.setStatus("Pending");
            nswr.setReciever(UserAccount);

            populateSupplyTable();
            completeBtn.setEnabled(true);

        }

    }//GEN-LAST:event_assignBtnActionPerformed

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed

        int selectedRow = supplierRequestJTable.getSelectedRow();
        int selectedRow1 = createJTable.getSelectedRow();

       

            NGOSupplyWorkReq p = (NGOSupplyWorkReq) supplierRequestJTable.getValueAt(selectedRow, 3);
            DonationWorkReq d = (DonationWorkReq) createJTable.getValueAt(selectedRow1, 3);
            
            if (p.getReqType().equals(d.getRequestType()) && (p.getRequest().equals(d.getRequirements()) && (p.getQuantity() <= d.getQuantity()))&&  (d.getStatus().equalsIgnoreCase("Completed & Available in Stock")))
            {
                 int diff = d.getQuantity()- p.getQuantity();
                d.setQuantity(diff);
                p.setStatus("Complete");
            }
            else
            {
               
               JOptionPane.showMessageDialog(null, "Please", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
                    populateSupplyTable();
                 populateCreateTable();
              completeBtn.setEnabled(false);

        

    }//GEN-LAST:event_completeBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String type = comboReqType.getSelectedItem().toString();
        String req = reqTxt.getText();
        int quantity = Integer.parseInt(qtyTxt.getText());

        if(req.equals("") || req.isEmpty())

        {
            JOptionPane.showMessageDialog(null, "Please create requirement");
            return;
        }

     /*   Supply supply = s.getSupplyDirectory().addSupply();

        supply.setReqType(type);
        supply.setReq(req);
        supply.setQuantity(quantity);
          populateCreateTable();

       // reqTypeTxt.setText("");
        reqTxt.setText("");
        qtyTxt.setText("");*/
        
        DonationWorkReq request = new DonationWorkReq();
                request.setRequestType(type);
                request.setRequirements(req);
                request.setQuantity(quantity);
                request.setStatus("Requested To Donors");
                

                //request.setStatus("Requested");request.setSender(account);
                org.getWorkQueue().getWorkRequestList().add(request);
                UserAccount.getWorkQueue().getWorkRequestList().add(request);
                ESystem.getWorkQueue().getWorkRequestList().add(request);
                populateCreateTable();
                reqTxt.setText("");
                qtyTxt.setText("");
        
        
        

      

    }//GEN-LAST:event_addBtnActionPerformed

    private void reqTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reqTxtKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isAlphabetic(c)) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_reqTxtKeyTyped

    private void qtyTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTxtKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_qtyTxtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> comboReqType;
    private javax.swing.JButton completeBtn;
    private javax.swing.JTable createJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField qtyTxt;
    private javax.swing.JTextField reqTxt;
    private javax.swing.JTable supplierRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateSupplyTable() {
        DefaultTableModel model = (DefaultTableModel) supplierRequestJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : ESystem.getWorkQueue().getWorkRequestList()){
           if(work instanceof NGOSupplyWorkReq){ 
            Object[] row = new Object[10];
            row[0] = ((NGOSupplyWorkReq) work).getReqType();
            row[1] = ((NGOSupplyWorkReq) work).getRequest();
            row[2] = ((NGOSupplyWorkReq) work).getQuantity();
            row[3] = work;
            row[4] = work.getSender();
           
            
            model.addRow(row);
           }
        } //To change body of generated methods, choose Tools | Templates.
    }

    private void populateCreateTable()
    {
    DefaultTableModel model = (DefaultTableModel) createJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : org.getWorkQueue().getWorkRequestList()){
           if(work instanceof DonationWorkReq){ 
            Object[] row = new Object[10];
            row[0] = ((DonationWorkReq) work).getRequestType();
            row[1] = ((DonationWorkReq) work).getRequirements();
          
            row[2] = ((DonationWorkReq) work).getQuantity();
            row[3] = work;
            row[4] = work.getReciever();
            
            model.addRow(row);
           }
        }}
    
    }

