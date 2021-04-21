/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentRole;

import Business.EcoSystem;
import Business.Hospital.Hospital;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineProduct;
import Business.WorkQueue.WorkRequest;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rikinparekh
 */
public class GovernmentAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount ua;
    
    /**
     * Creates new form GovernmentAreaJPanel
     */
    

    public GovernmentAreaJPanel(JPanel userProcessContainer, EcoSystem business, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = business;
        this.ua = account;
        populateHospitalWorkRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccineAvailabilityTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        checkStatus = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Government Work Area");

        hospTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hospital ID", "Hospital Name"
            }
        ));
        jScrollPane1.setViewportView(hospTable);

        vaccineAvailabilityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Vaccine ID", "Vaccine Type"
            }
        ));
        jScrollPane2.setViewportView(vaccineAvailabilityTable);

        jLabel2.setText("Check Hospital Inventory Status:");

        jLabel3.setText("Select Hospital:");

        jLabel4.setText("Available Vaccine List:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Vaccine ID", "Vaccine Type"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel5.setText("Government Inventory:");

        checkStatus.setText("Check Status");
        checkStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStatusActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkStatus)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkStatus))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkStatusActionPerformed
        // TODO add your handling code here:
        int selectedHospitalRow = hospTable.getSelectedRow();
        Hospital selectedHospital = (Hospital) hospTable.getValueAt(selectedHospitalRow, 1);
        
        populateVaccineAvailablityTable(selectedHospital);
        
//        Iterator<VaccineProduct> itr = selectedHospital.getVaccineDirectory().getVaccineProductList().iterator();
//        while(itr.hasNext()){
//            if(selectedHospital.getUserAccount().getUsername().equals(ua.getUsername())){
//                VaccineProduct v = itr.next();
//                
//            }
//        }
        
    }//GEN-LAST:event_checkStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkStatus;
    private javax.swing.JTable hospTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable vaccineAvailabilityTable;
    // End of variables declaration//GEN-END:variables

    private void populateHospitalWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) hospTable.getModel();
        
        model.setRowCount(0);
        
        for(Hospital h : system.getHospitalDirectory().getHospitalList()) {
            for (WorkRequest wr: ua.getWorkQueue().getWorkRequestList()) {
                if (wr.getSender().equals(h.getUserAccount().getWorkQueue().getWorkRequestList().get(0).getSender())) {
                    Object[] row = new Object[2];
                    row[0] = h.getUserAccount();
                    row[1] = h;
                    model.addRow(row);  
                }
            }       
        }  
        
//        for(Hospital h : system.getHospitalDirectory().getHospitalList()) {
//            for (WorkRequest wr : h.getWorkQueue().getWorkRequestList()) {
//                if (wr.getReceiver().getUsername().equals(ua.getUsername())) {
//                    Object[] row = new Object[2];
//                    row[0] = h.getHospitalID();
//                    row[1] = h;
//                    model.addRow(row);  
//                }
//            }     
//        }
    }

    

    private void populateVaccineAvailablityTable(Hospital h) {
        DefaultTableModel model = (DefaultTableModel) hospTable.getModel();
        
        model.setRowCount(0);
        
        
        
        
            for (WorkRequest wr : h.getWorkQueue().getWorkRequestList()) {
                if (wr.getReceiver().getUsername().equals(ua.getUsername())) {
                    for(VaccineProduct v : h.getVaccineDirectory().getVaccineProductList()){
                        Object[] row = new Object[2];
                        row[0] = v.getId();
                        row[1] = h;
                        model.addRow(row);  
                    }
                }
            }     
        
    }
}