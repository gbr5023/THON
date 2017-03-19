/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Gisward
 */
public class MainMenuUI extends javax.swing.JFrame 
{
    private NavigationCntl parentNavigationCntl;
    
    public MainMenuUI(NavigationCntl newParentNavigationCntl) {
        this.parentNavigationCntl = newParentNavigationCntl;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     * initComponents() creates the JFrame's components (radioButton Group,
     * radio buttons, labels, and text fields), it sets up the components (sets text,
     * sets font, sets the size, and adds an action listener to a component if specified
     * from the Java GUI)
     * 
     * For the radioButton group, it adds all the radio buttons to the button group
     * so that only one radio button can be chosen at a time
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButtonGroup = new javax.swing.ButtonGroup();
        spaceAssignRadioButton = new javax.swing.JRadioButton();
        currentCapacityRadioButton = new javax.swing.JRadioButton();
        thonraiserRadioButton = new javax.swing.JRadioButton();
        thonpassRadioButton = new javax.swing.JRadioButton();
        userIconLabel = new javax.swing.JLabel();
        chooseLabel = new javax.swing.JLabel();
        userTitleLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        goButton = new javax.swing.JButton();
        userTitleLabel1 = new javax.swing.JLabel();
        userTitleLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        userTitleLabel3 = new javax.swing.JLabel();
        exitButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        clockLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radioButtonGroup.add(spaceAssignRadioButton);
        spaceAssignRadioButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        spaceAssignRadioButton.setText("Space Assignment");
        spaceAssignRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceAssignRadioButtonActionPerformed(evt);
            }
        });

        radioButtonGroup.add(currentCapacityRadioButton);
        currentCapacityRadioButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        currentCapacityRadioButton.setText("Current THON Capacity");

        radioButtonGroup.add(thonraiserRadioButton);
        thonraiserRadioButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        thonraiserRadioButton.setText("THONraiser");

        radioButtonGroup.add(thonpassRadioButton);
        thonpassRadioButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        thonpassRadioButton.setText("THONPass");

        userIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thon/myimage/user-alt-128.png"))); // NOI18N

        chooseLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chooseLabel.setText("Tasks:");

        userTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userTitleLabel.setText("User:");

        exitButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        goButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        userTitleLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        userTitleLabel1.setText("Position:");

        userTitleLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        userTitleLabel2.setText("Shifts:");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        userTitleLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        userTitleLabel3.setText("Contact:");

        exitButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        exitButton1.setText("Edit");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText(parentNavigationCntl.getUsername());

        clockLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        tickTock();
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(userTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(exitButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(108, 108, 108))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(userTitleLabel2)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(userTitleLabel1)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(userTitleLabel3)
                                                        .addGap(4, 4, 4)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(userIconLabel))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(exitButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(goButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(currentCapacityRadioButton)
                                .addComponent(thonpassRadioButton)
                                .addComponent(thonraiserRadioButton))
                            .addComponent(spaceAssignRadioButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clockLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTitleLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userIconLabel)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(userTitleLabel1)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(userTitleLabel3)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userTitleLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(chooseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spaceAssignRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currentCapacityRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thonpassRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thonraiserRadioButton)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitButton)
                            .addComponent(goButton)
                            .addComponent(exitButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(clockLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tickTock() {
        clockLabel.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }
    
    // spaceAssignRadioButtonActionPerformed() not used
    private void spaceAssignRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceAssignRadioButtonActionPerformed

    }//GEN-LAST:event_spaceAssignRadioButtonActionPerformed

    // exitButtonActionPerformed() calls System.exit command which ends the program
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * goButtonActionPerformed(): deals with all the user-entered menu options.
     * It takes an ActionEvent object as a parameter (so basically if go is clicked,
     * then it evaluates where to send the user based on which radio button was 
     * selected, as seen by the boolean variables for each of the 4 menu options
     * 
     * using if-else if-else statements to evaluate the value of each boolean, the user
     * will be taken to each menu option's respective controller (i.e, SpaceAssignCntl 
     * for the spaceAssignRadioButton)
     * 
     * @param evt 
     */
    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        
        boolean spaceAssignSelected = spaceAssignRadioButton.isSelected();
        boolean currentCapacitySelected = currentCapacityRadioButton.isSelected();
        boolean thonpassSelected = thonpassRadioButton.isSelected();
        boolean thonraiserSelected = thonraiserRadioButton.isSelected();
        
        if(spaceAssignSelected == true)
        {
            this.setVisible(false);
            parentNavigationCntl.requestSpaceAssignCntl();
        }
        else if(currentCapacitySelected == true)
        {
            this.setVisible(false);
            parentNavigationCntl.requestCurrentCapacityCntl();
        }
        else if(thonpassSelected == true)
        {
            
        }
        else if(thonraiserSelected == true)
        {
            
        }
        else
        {
            System.err.println("Choose a menu option.");
        }
    }//GEN-LAST:event_goButtonActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MainMenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseLabel;
    private javax.swing.JLabel clockLabel;
    private javax.swing.JRadioButton currentCapacityRadioButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JRadioButton spaceAssignRadioButton;
    private javax.swing.JRadioButton thonpassRadioButton;
    private javax.swing.JRadioButton thonraiserRadioButton;
    private javax.swing.JLabel userIconLabel;
    private javax.swing.JLabel userTitleLabel;
    private javax.swing.JLabel userTitleLabel1;
    private javax.swing.JLabel userTitleLabel2;
    private javax.swing.JLabel userTitleLabel3;
    // End of variables declaration//GEN-END:variables
}
