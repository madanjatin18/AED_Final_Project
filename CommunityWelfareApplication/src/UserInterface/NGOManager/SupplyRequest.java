/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NGOManager;
import BusinessModel.Supplier.Supplier;
import BusinessModel.EcoSystem;
import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import BusinessModel.WorkQueue.NGOSupplyWorkReq;
import BusinessModel.WorkQueue.WorkReq;
//import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyEvent;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author adhar
 */
public class SupplyRequest extends javax.swing.JPanel {
    private JPanel downJPanel;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise enterprise;
    private EcoSystem ESystem;
    private Supplier s;
    /**
     * Creates new form SupplyRequest
     */
    public SupplyRequest(JPanel downJPanel, UserAccount UserAccount, Organization org, Enterprise enterprise, EcoSystem ESystem) {
        initComponents();
        this.downJPanel=downJPanel;
        this.UserAccount=UserAccount;
        this.org=(Organization)org;
        this.enterprise=enterprise;
        this.ESystem=ESystem;
        populateSupplyTable();
    }

    public void populateSupplyTable()
    {
      DefaultTableModel model = (DefaultTableModel) ngoReqTbl.getModel();
        
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ngoReqTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        reqTxt = new javax.swing.JTextField();
        qtyTxt = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        comboReqType = new javax.swing.JComboBox<>();
        barChartBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Supply Request");

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
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269)
                .addComponent(jLabel1)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 945, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel2.setText("SUPPLY REQUEST: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 134, -1, -1));

        ngoReqTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ngoReqTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 172, 912, 116));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Request Type: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 346, 141, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Quantity of Materials: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 404, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Requirements: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 375, 141, -1));

        reqTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reqTxtKeyTyped(evt);
            }
        });
        add(reqTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 373, 162, -1));

        qtyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyTxtKeyTyped(evt);
            }
        });
        add(qtyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 402, 162, -1));

        submitBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 442, 87, 34));

        comboReqType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Food", "Clothes", "Medicine", "Education", "Furniture" }));
        comboReqType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReqTypeActionPerformed(evt);
            }
        });
        add(comboReqType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 344, 162, -1));

        barChartBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        barChartBtn.setText("See Bar Chart");
        barChartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barChartBtnActionPerformed(evt);
            }
        });
        add(barChartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 80, 171, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        downJPanel.remove(this);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.previous(downJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

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
            evt.consume();}
    }//GEN-LAST:event_qtyTxtKeyTyped

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        try{
            String rType = comboReqType.getSelectedItem().toString();
            String req =   reqTxt.getText();
            int quantity = Integer.parseInt(qtyTxt.getText());
            if(rType.equals("") || rType.isEmpty() && req.equals("") || req.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Any of the above field(s) can't be empty");
                return;
            }
            
            try{
                Integer.parseInt(qtyTxt.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Quantity has to be number");    
            }

            NGOSupplyWorkReq request = new NGOSupplyWorkReq();

            request.setReqType(rType);
            request.setRequest(req);
            request.setQuantity(quantity);
            request.setStatus("Requested");
            request.setSender(UserAccount);
            // s.getWorkQueue().getWorkRequestList().add(request);
            org.getWorkQueue().getWorkRequestList().add(request);
            UserAccount.getWorkQueue().getWorkRequestList().add(request);
            ESystem.getWorkQueue().getWorkRequestList().add(request);

            populateSupplyTable();

            reqTxt.setText("");
            //requestTypeTxt.setText("");
            qtyTxt.setText("");
        }

        catch(NumberFormatException e){}

    }//GEN-LAST:event_submitBtnActionPerformed

    private void comboReqTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReqTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboReqTypeActionPerformed

    private void barChartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barChartBtnActionPerformed
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        int a=0;
        int b=0;
        int c=0;
        int m=0;
        int n=0;
        for (WorkReq work : org.getWorkQueue().getWorkRequestList()){
            if(work instanceof NGOSupplyWorkReq)
            {
                if(((NGOSupplyWorkReq) work).getReqType().equals("Furniture")){
                    a=a+1;
                }
                if(((NGOSupplyWorkReq) work).getReqType().equals("Food")){
                    b=b+1;
                }
                if(((NGOSupplyWorkReq) work).getReqType().equals("Clothes")){
                    c=c+1;
                }
                if(((NGOSupplyWorkReq) work).getReqType().equals("Medicine")){
                    m=m+1;
                }
                if(((NGOSupplyWorkReq) work).getReqType().equals("Education")){
                    n=n+1;
                }
            }
        }
        d.setValue(b, "Request Type","Food");
        d.setValue(c, "Request Type","Clothes");
        d.setValue(m, "Request Type","Medicine");
        d.setValue(n, "Request Type","Education");
        d.setValue(a, "Request Type","Furniture");

        JFreeChart chart = ChartFactory.createBarChart("Request Fulfilled", "Request Type", "type", d, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        ChartFrame f = new ChartFrame("Request Analysis",chart);
        f.setVisible(true);
        f.setSize(500,400);

    }//GEN-LAST:event_barChartBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton barChartBtn;
    private javax.swing.JComboBox<String> comboReqType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ngoReqTbl;
    private javax.swing.JTextField qtyTxt;
    private javax.swing.JTextField reqTxt;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}

