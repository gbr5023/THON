package thon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javafx.scene.input.DataFormat;
import javax.swing.Timer;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELCHOCO
 */
public class SpaceSectionUI extends javax.swing.JFrame 
{
    SpaceAssignCntl parentSpaceAssignCntl;
    Organization newOrg;
    OrganizationList orgList;
    OrganizationTableModel tableModel;
    ArrayList <Organization> sortedOrgs;
    
    public SpaceSectionUI(SpaceAssignCntl newParentSpaceAssignCntl) 
    {
        this.parentSpaceAssignCntl = newParentSpaceAssignCntl;
        this.orgList = new OrganizationList();
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spaceMap = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        assignButton = new javax.swing.JButton();
        spaceSectionScrollPane = new javax.swing.JScrollPane();
        spaceTable = new javax.swing.JTable();
        organizationScrollPane = new javax.swing.JScrollPane();
        organizationTable = new javax.swing.JTable();
        searchOrgsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        statusJLabel = new javax.swing.JLabel();
        searchSpacesButton = new javax.swing.JButton();
        searchOrgsTextField = new javax.swing.JTextField();
        searchSpacesTextField = new javax.swing.JTextField();
        clockLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spaceMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thon/myimage/BJCMap.png"))); // NOI18N

        backButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        assignButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        assignButton.setText("Assign");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        spaceTable.setModel(parentSpaceAssignCntl.getSpaceTableModel());
        spaceSectionScrollPane.setViewportView(spaceTable);

        organizationTable.setModel(parentSpaceAssignCntl.getOrganizationTableModel());
        organizationTable.setColumnSelectionAllowed(true);
        organizationTable.setRowSelectionAllowed(true);
        organizationTable.setCellSelectionEnabled(false);
        organizationScrollPane.setViewportView(organizationTable);
        organizationTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        organizationTable.getAccessibleContext().setAccessibleName("");

        searchOrgsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchOrgsButton.setText("Search Organizations");
        searchOrgsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOrgsButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        statusLabel.setText("Assign Status:");

        statusJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchSpacesButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchSpacesButton.setText("Search Spaces");
        searchSpacesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSpacesButtonActionPerformed(evt);
            }
        });

        searchOrgsTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchOrgsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOrgsTextFieldActionPerformed(evt);
            }
        });

        clockLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        tickTock();

        Timer timer = new Timer(500, new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    tickTock();
                }
            });

            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.setInitialDelay(0);
            timer.start();
            clockLabel.setText("");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(searchOrgsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchOrgsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(organizationScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spaceSectionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(searchSpacesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchSpacesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(assignButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(exitButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel)
                            .addComponent(spaceMap, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(clockLabel))
                    .addContainerGap(36, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(spaceMap, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(backButton)
                                .addComponent(assignButton)
                                .addComponent(exitButton))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statusLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(statusJLabel)
                            .addGap(26, 26, 26)
                            .addComponent(clockLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(organizationScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchOrgsButton)
                                .addComponent(searchOrgsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(spaceSectionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchSpacesButton)
                                .addComponent(searchSpacesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(10, 10, 10))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public void tickTock() 
    {
        clockLabel.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        this.parentSpaceAssignCntl.parentNavigationCntl.requestMainMenuUI();
    }//GEN-LAST:event_backButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        int rowOrg = organizationTable.getSelectedRow();
        int rowSpace = spaceTable.getSelectedRow();
        
        Organization currentOrg = parentSpaceAssignCntl.getParentOrganizationList().get(rowOrg);
        Space currentSpace = parentSpaceAssignCntl.getParentSpaceList().get(rowSpace);
        
        currentOrg.setOrgSpace(currentSpace.getSpace());
        currentOrg.setHasSpace(true);
        String newStatus = (currentOrg.getOrgName() + ", Has Space? " + currentOrg.getHasSpace() + ": " + currentOrg.getOrgSpace());
        this.statusJLabel.setText(newStatus);
        
        currentSpace.setOrg(currentOrg.getOrgName());
        currentSpace.setHasOrg(true);
        currentSpace.setCapacity(currentSpace.getCapacity() - currentOrg.getMemberCnt());
        System.out.println(currentSpace.getSpace() + ", Has Org? " + currentSpace.getHasOrg() + ": " + currentSpace.getOrg());
        
        this.parentSpaceAssignCntl.updateTableModels();
    }//GEN-LAST:event_assignButtonActionPerformed
    

    private void searchOrgsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        String searchOrgsQuery = this.searchOrgsTextField.getText();
        boolean searchedOrgFound = this.parentSpaceAssignCntl.requestSearchOrganizationList(searchOrgsQuery);
        
        if(searchedOrgFound == true)
        {
            ArrayList<Integer> organizationsFound = this.parentSpaceAssignCntl.getListOfOrganizationRowsFound();
            
            for(int i = 0; i < organizationsFound.size(); i++)
            {
                // this will automatically set the view of the scroll in the location of the value
                this.organizationTable.scrollRectToVisible(this.organizationTable.getCellRect(organizationsFound.get(i), organizationsFound.get(i), true));

                // this will automatically set the focus of the searched/selected row/value
                // currently only sets the focus of the last searched/selected row/value
                this.organizationTable.setRowSelectionInterval(organizationsFound.get(i), organizationsFound.get(i));
                    
                for (int j = 0; j < this.organizationTable.getColumnCount(); j++) 
                {
                    this.organizationTable.getColumnModel().getColumn(j).setCellRenderer(new SearchHighlightRenderer());
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No organization found matching the search term.");
        }
    }
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void searchSpacesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSpacesButtonActionPerformed
        String searchSpacesQuery = this.searchSpacesTextField.getText();
        boolean searchedSpaceFound = this.parentSpaceAssignCntl.requestSearchSpaceList(searchSpacesQuery);
        
        if(searchedSpaceFound == true)
        {
            ArrayList<Integer> spacesFound = this.parentSpaceAssignCntl.getListOfSpaceRowsFound();
            
            for(int i = 0; i < spacesFound.size(); i++)
            {
                // this will automatically set the view of the scroll in the location of the value
                this.spaceTable.scrollRectToVisible(this.spaceTable.getCellRect(spacesFound.get(i), spacesFound.get(i), true));

                // this will automatically set the focus of the searched/selected row/value
                // currently only sets the focus of the last searched/selected row/value
                this.spaceTable.setRowSelectionInterval(spacesFound.get(i), spacesFound.get(i));
                    
                for (int j = 0; j < this.spaceTable.getColumnCount(); j++) 
                {
                    this.spaceTable.getColumnModel().getColumn(j).setCellRenderer(new SearchHighlightRenderer());
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No space found matching the search term.");
        }
    }//GEN-LAST:event_searchSpacesButtonActionPerformed

    private void searchOrgsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                           
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SpaceSectionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpaceSectionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpaceSectionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpaceSectionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel clockLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane organizationScrollPane;
    private javax.swing.JTable organizationTable;
    public javax.swing.JButton searchOrgsButton;
    public javax.swing.JTextField searchOrgsTextField;
    private javax.swing.JButton searchSpacesButton;
    private javax.swing.JTextField searchSpacesTextField;
    private javax.swing.JLabel spaceMap;
    private javax.swing.JScrollPane spaceSectionScrollPane;
    private javax.swing.JTable spaceTable;
    private javax.swing.JLabel statusJLabel;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
