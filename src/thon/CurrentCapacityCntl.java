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
    
    public CurrentCapacityCntl()
    {
        System.out.println("Made it to the CurrentCapacityCntl");
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
        //theCurrentCapacityUI.setSize(800, 600);
        theCurrentCapacityUI.setLocationRelativeTo(null);
        theCurrentCapacityUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theCurrentCapacityUI.setVisible(true);
    }
}
