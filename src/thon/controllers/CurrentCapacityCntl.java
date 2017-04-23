package thon.controllers;

import javax.swing.JFrame;
import thon.views.CurrentCapacityUI;
import thon.models.CurrentCapacityUpdater;

/**
 *
 * @author Gisward
 */
public class CurrentCapacityCntl 
{
    public NavigationCntl parentNavigationCntl;
    CurrentCapacityUI theCurrentCapacityUI;
    CurrentCapacityUpdater theCurrentCapacityUpdater;
    int currentCapacity;
    
    public CurrentCapacityCntl()
    {
        System.out.println("CurrentCapacityCntl instantiated");
        theCurrentCapacityUpdater = new CurrentCapacityUpdater();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        System.out.println("Made it to the CurrentCapacityCntl");
        this.parentNavigationCntl = newParentNavigationCntl;
        this.requestCurrentCapacityUI();
    }
    
    public void requestCurrentCapacityUI() 
    {
        theCurrentCapacityUI = new CurrentCapacityUI(this);
        theCurrentCapacityUI.pack();
        theCurrentCapacityUI.setTitle("Current THON Capacity");
        theCurrentCapacityUI.setLocationRelativeTo(null);
        theCurrentCapacityUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theCurrentCapacityUI.setVisible(true);
    }
    
    public int getCurrentCapacity()
    {
        currentCapacity = theCurrentCapacityUpdater.getCurrentCapacity();
        return currentCapacity;
    }
    
    /*
    //Chart code ti implement for the future
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
