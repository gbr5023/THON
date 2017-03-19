/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import javax.swing.JFrame;



/**
 *
 * @author Gisward
 */
public class CurrentCapacityCntl 
{
    NavigationCntl parentNavigationCntl;
    CurrentCapacityUI theCurrentCapacityUI;
    CurrentCapacityUpdater theCurrentCapacityUpdater;
    
    public CurrentCapacityCntl()
    {
        System.out.println("Made it to the CurrentCapacityCntl");
        theCurrentCapacityUpdater = new CurrentCapacityUpdater();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        parentNavigationCntl = newParentNavigationCntl;
        requestCurrentCapacityUI();
    }
    
    public void requestCurrentCapacityUI() {
        theCurrentCapacityUI = new CurrentCapacityUI(this);
        theCurrentCapacityUI.pack();
        theCurrentCapacityUI.setTitle("Space Assignment");
        theCurrentCapacityUI.setLocationRelativeTo(null);
        theCurrentCapacityUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theCurrentCapacityUI.setVisible(true);
    }
    
    /*
    //Chart code
            DefaultCategoryDataset data = new DefaultCategoryDataset();
            data.setValue(2000,"Amount","January");
            data.setValue(2000,"Amount","February");
            data.setValue(2000,"Amount","March");
            JFreeChart chart = ChartFactory.createAreaChart("Contribution", "Monthly", "Amount", data, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot barChart = chart.getCategoryPlot();
            barChart.setRangeGridlinePaint(Color.BLUE);
            ChartPanel barPanel = new ChartPanel(chart);
    */
}
