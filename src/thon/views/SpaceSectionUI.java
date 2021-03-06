package thon.views;

import thon.controllers.SpaceAssignCntl;
import thon.models.Organization;
import thon.models.Space;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

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
    TableRowSorter<TableModel> rowSorterOrganization;
    TableRowSorter<TableModel> rowSorterSpace;
    int rowOrg;
    int rowSpace;
    
    public SpaceSectionUI(SpaceAssignCntl newParentSpaceAssignCntl) 
    {
        this.parentSpaceAssignCntl = newParentSpaceAssignCntl;
        initComponents();
        rowSorterOrganization = new TableRowSorter<>(organizationTable.getModel());
        rowSorterSpace = new TableRowSorter<>(spaceTable.getModel());
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
        setResizable(false);

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
        organizationTable.setColumnSelectionAllowed(false);
        organizationScrollPane.setViewportView(organizationTable);
        organizationTable.getAccessibleContext().setAccessibleName("");

        searchOrgsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchOrgsButton.setText("Search Organizations / Refresh Table");
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

        statusLabel.setText("Most Recent Space Assignment Status:");

        statusJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchSpacesButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchSpacesButton.setText("Search Spaces / Refresh Table");
        searchSpacesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSpacesButtonActionPerformed(evt);
            }
        });

        searchOrgsTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(organizationScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(searchSpacesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchSpacesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(spaceSectionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(searchOrgsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchOrgsButton)))))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(backButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(assignButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(exitButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(137, 137, 137)
                                    .addComponent(clockLabel)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(statusLabel)
                                    .addComponent(spaceMap, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(statusJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(spaceMap, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(backButton)
                                .addComponent(assignButton)
                                .addComponent(exitButton))
                            .addGap(18, 18, 18)
                            .addComponent(statusLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(statusJLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        try
        {
            this.rowOrg = this.organizationTable.convertRowIndexToModel(this.organizationTable.getSelectedRow());
            this.rowSpace = this.spaceTable.convertRowIndexToModel(this.spaceTable.getSelectedRow());

            Organization currentOrg = parentSpaceAssignCntl.getParentOrganizationList().get(rowOrg);
            Space currentSpace = parentSpaceAssignCntl.getParentSpaceList().get(rowSpace);

            if(!currentOrg.getHasSpace())
            {
                if (currentOrg.memberCnt <= currentSpace.getCapacity()) {
                    currentOrg.setOrgSpace(currentSpace.getSpace());
                    currentOrg.setHasSpace(true);
                    String newStatus = (currentOrg.getOrgName() + ": " + currentOrg.getOrgSpace());
                    this.statusJLabel.setText(newStatus);

                    currentSpace.setOrg(currentOrg.getOrgName());
                    currentSpace.setHasOrg(true);
                    currentSpace.setCapacity(currentSpace.getCapacity() - currentOrg.getMemberCnt());
                    
                    /*
                    ArrayList<Organization> updatedOrgs = this.parentSpaceAssignCntl.getParentOrganizationList();
                    this.parentSpaceAssignCntl.setListOfOrganizations(updatedOrgs);
                    ArrayList<Space> updatedSpaces = this.parentSpaceAssignCntl.getParentSpaceList();
                    this.parentSpaceAssignCntl.setListOfSpaces(updatedSpaces);
                    */
                    JOptionPane.showMessageDialog(null, currentOrg.getOrgName() + " assignment successful.");
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Space capacity is not enough. Choose another space.");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This organization has a space assigned already.");
            }
            
            this.parentSpaceAssignCntl.updateTableModels();
        }
        catch(ArrayIndexOutOfBoundsException err)
        {
            System.err.println("Choose an organization and a space to assign to it.");
            JOptionPane.showMessageDialog(null, "Choose an organization and a space in the tables.");
        }
    }//GEN-LAST:event_assignButtonActionPerformed
    

    private void searchOrgsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        this.organizationTable.setRowSorter(rowSorterOrganization);
        String searchedWord = searchOrgsTextField.getText();
        
        if (searchedWord.trim().length() == 0)
        {
            rowSorterOrganization.setRowFilter(null);
        }
        else 
        {
            rowSorterOrganization.setRowFilter(RowFilter.regexFilter("(?i)" + searchedWord));
        }
    }
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void searchSpacesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSpacesButtonActionPerformed
        this.spaceTable.setRowSorter(rowSorterSpace);
        String searchedWord = searchSpacesTextField.getText();
        
        if (searchedWord.trim().length() == 0)
        {
            rowSorterSpace.setRowFilter(null);
        }
        else 
        {
            rowSorterSpace.setRowFilter(RowFilter.regexFilter("(?i)" + searchedWord));
        }
    }//GEN-LAST:event_searchSpacesButtonActionPerformed
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
