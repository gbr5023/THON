package thon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.Timer;

//Importing the charts API
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Gisward
 */
public class CurrentCapacityUI extends javax.swing.JFrame 
{
    private CurrentCapacityCntl parentCurrentCapacityCntl;
    private String [] days = {"Friday, Saturday, Sunday"};
    /**
     * Creates new form CurrentCapacityUI
     */
    public CurrentCapacityUI(CurrentCapacityCntl newCurrentCapacityCntl) 
    {
        this.parentCurrentCapacityCntl = newCurrentCapacityCntl;
        initComponents();
        chartGraphic();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clockLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        currentCapacityLabel = new javax.swing.JLabel();
        maxCapacityLabel = new javax.swing.JLabel();
        maxCapacityNumber = new javax.swing.JLabel();
        currentCapacityNumber = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            clockLabel.setText("");

            backButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            backButton.setText("Back");
            backButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backButtonActionPerformed(evt);
                }
            });

            exitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            exitButton.setText("Exit");
            exitButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    exitButtonActionPerformed(evt);
                }
            });

            currentCapacityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            currentCapacityLabel.setText("Current Capacity: ");

            maxCapacityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            maxCapacityLabel.setText("Max Capacity:");

            maxCapacityNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            maxCapacityNumber.setText("15261");

            currentCapacityNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            currentCapacityNumber.setText(String.valueOf(parentCurrentCapacityCntl.getCurrentCapacity()));

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jPanel1.setLayout(new java.awt.BorderLayout());

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Friday", "Saturday", "Sunday",}));
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(exitButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clockLabel)
                            .addGap(14, 14, 14))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(maxCapacityLabel)
                                    .addGap(31, 31, 31)
                                    .addComponent(maxCapacityNumber))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(currentCapacityLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(currentCapacityNumber))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(37, Short.MAX_VALUE))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(currentCapacityLabel)
                        .addComponent(currentCapacityNumber))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maxCapacityLabel)
                        .addComponent(maxCapacityNumber))
                    .addGap(18, 18, 18)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backButton)
                        .addComponent(exitButton)
                        .addComponent(clockLabel))
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        this.parentCurrentCapacityCntl.parentNavigationCntl.requestMainMenuUI();
    }//GEN-LAST:event_backButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem().equals("Friday")){
            chartGraphic();
        } else if (jComboBox1.getSelectedItem().equals("Saturday")){
            chartGraphic();
        } else {
            chartGraphic();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void tickTock() 
    {
        clockLabel.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }

    //Chart code!!
    public void chartGraphic(){
        //If Friday is selected, then...
        if (jComboBox1.getSelectedItem().equals("Friday")){
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            data.setValue(2000,"Hour","5");
            data.setValue(2500,"Hour","6");
            data.setValue(3800,"Hour","7");
            data.setValue(4700,"Hour","8");
            data.setValue(5500,"Hour","9");
            data.setValue(6100,"Hour","10");
            data.setValue(7000,"Hour","11");
            data.setValue(7800,"Hour","12");
            JFreeChart chart = ChartFactory.createBarChart("Capacity Graph", "Hour", "People", data, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot barChart = chart.getCategoryPlot();
            barChart.setRangeGridlinePaint(Color.BLUE);
            ChartPanel barPanel = new ChartPanel(chart);
            jPanel1.add(barPanel,BorderLayout.CENTER);
            jPanel1.validate();
        } 
        //If Saturday is selected, then...
        else if (jComboBox1.getSelectedItem().equals("Saturday")){
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            data.setValue(0,"Hour","12");
            data.setValue(0,"Hour","4");
            data.setValue(0,"Hour","8");
            data.setValue(0,"Hour","12");
            data.setValue(0,"Hour","2");
            data.setValue(0,"Hour","6");
            data.setValue(0,"Hour","8");
            data.setValue(0,"Hour","12");
            JFreeChart chart = ChartFactory.createBarChart("Capacity Graph", "Hour", "People", data, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot barChart = chart.getCategoryPlot();
            barChart.setRangeGridlinePaint(Color.BLUE);
            ChartPanel barPanel = new ChartPanel(chart);
            jPanel1.add(barPanel,BorderLayout.CENTER);
            jPanel1.validate();
        } 
        //If Sunday is selected, then...
        else {
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            data.setValue(0,"Hour","12");
            data.setValue(0,"Hour","4");
            data.setValue(0,"Hour","8");
            data.setValue(0,"Hour","12");
            data.setValue(0,"Hour","2");
            data.setValue(0,"Hour","6");
            data.setValue(0,"Hour","8");
            data.setValue(0,"Hour","12");
            JFreeChart chart = ChartFactory.createBarChart("Capacity Graph", "Hour", "People", data, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot barChart = chart.getCategoryPlot();
            barChart.setRangeGridlinePaint(Color.BLUE);
            ChartPanel barPanel = new ChartPanel(chart);
            jPanel1.add(barPanel,BorderLayout.CENTER);
            jPanel1.validate();
        }   
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(CurrentCapacityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentCapacityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentCapacityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentCapacityUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel clockLabel;
    private javax.swing.JLabel currentCapacityLabel;
    private javax.swing.JLabel currentCapacityNumber;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maxCapacityLabel;
    private javax.swing.JLabel maxCapacityNumber;
    // End of variables declaration//GEN-END:variables
}
