/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HelpSeeker.HelpSeekerUser;
import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.OpenWeb.OpenBrowser;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import BusinessModel.WorkQueue.HelpSeekerWorkReq;
import BusinessModel.WorkQueue.WorkReq;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adhar
 */
public class HelpSeekerUserWorkArea extends javax.swing.JPanel {
     private JPanel downJPanel;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise Enterprise;
    private EcoSystem ESystem;
    /**
     * Creates new form HelpSeekerUserWorkArea
     */
    public HelpSeekerUserWorkArea(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise Enterprise,EcoSystem ESystem) {
        initComponents();
        this.downJPanel=downJPanel;
        this.UserAccount=UserAccount;
        this.org=org;
        this.Enterprise=Enterprise;
        this.ESystem=ESystem;
        populateWorkQueueTable();
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
        requestJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subjectTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        descriptionJTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        locationTextField = new javax.swing.JTextField();
        postRequestBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnOpenWeb = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Help Seeker Work Area");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 994, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 128, 982, 230));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("REQUEST HISTORY ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Subject : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 373, -1, -1));
        add(subjectTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 371, 222, -1));

        descriptionJTextArea.setColumns(20);
        descriptionJTextArea.setRows(5);
        jScrollPane3.setViewportView(descriptionJTextArea);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 411, 222, 54));

        jLabel2.setText("Description :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 411, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setText("Location    :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 474, -1, -1));
        add(locationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 472, 222, -1));

        postRequestBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        postRequestBtn.setText("Post Request");
        postRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postRequestBtnActionPerformed(evt);
            }
        });
        add(postRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 501, 222, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        jLabel5.setText("*Please input \"Hospital\" as subject for Hospital/Doctor related Help. ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 376, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEU Affiliated Hospital", "Hospital List", "NGO List" }));
        jComboBox1.setToolTipText("");
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 173, -1));

        btnOpenWeb.setText("Go");
        btnOpenWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenWebActionPerformed(evt);
            }
        });
        add(btnOpenWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 74, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Helpful Links!");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 140, -1));
    }// </editor-fold>//GEN-END:initComponents
    public void populateWorkQueueTable(){
         DefaultTableModel model = (DefaultTableModel) requestJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : org.getWorkQueue().getWorkRequestList()){
           if(work instanceof HelpSeekerWorkReq){ 
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
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void postRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postRequestBtnActionPerformed
        if(subjectTextField.getText().isEmpty() || descriptionJTextArea.getText().isEmpty() || locationTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Any of the above field(s) can't be Empty");
        }else{

            String subject = subjectTextField.getText();
            String desp = descriptionJTextArea.getText();
            String location = locationTextField.getText();

            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("MM/dd/YY");
            s.format(d);
            if(subject.equals("") || subject.isEmpty() && desp.equals("") || desp.isEmpty() && location.equals("")|| location.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter valid request");
                return;
            }

            HelpSeekerWorkReq request = new HelpSeekerWorkReq();
            request.setSubject(subject);
            request.setDescription(desp);
            request.setLocation(location);
            request.setStatus("Requested");
            request.setSender(UserAccount);
            request.setDateOfRequest(d);
            org.getWorkQueue().getWorkRequestList().add(request);
            UserAccount.getWorkQueue().getWorkRequestList().add(request);
            ESystem.getWorkQueue().getWorkRequestList().add(request);

            populateWorkQueueTable();

            subjectTextField.setText("");
            descriptionJTextArea.setText("");
            locationTextField.setText("");

        }
    }//GEN-LAST:event_postRequestBtnActionPerformed

    private void btnOpenWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenWebActionPerformed
        // TODO add your handling code here:
        String url = (String)jComboBox1.getSelectedItem();
        String urlFinal;
        if(url == "NEU Affiliated Hospital")
        {
            urlFinal = "https://www.google.com/maps/place/Beth+Israel+Deaconess+Medical+Center/@42.3396063,-71.1750198,13z/data=!4m10!1m2!2m1!1sbeth+israel!3m6!1s0x89e3798da35fdbc7:0xcd19c9c853764aa7!8m2!3d42.3396063!4d-71.104982!15sCgtiZXRoIGlzcmFlbJIBDm1lZGljYWxfY2VudGVy4AEA!16s%2Fm%2F04g3n2g";
        }
        else if(url == "Hospital List")
        {
            urlFinal = "https://www.international-health-cover.com/resources/usa/usa-hospital-list.html";
        }
        else
        {
            urlFinal = "https://www.transparenthands.org/list-of-top-ngos-in-usa/";
        }
        
        OpenBrowser.openURL(urlFinal);
    }//GEN-LAST:event_btnOpenWebActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnOpenWeb;
    private javax.swing.JTextArea descriptionJTextArea;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JButton postRequestBtn;
    private javax.swing.JTable requestJTable;
    private javax.swing.JTextField subjectTextField;
    // End of variables declaration//GEN-END:variables
}

