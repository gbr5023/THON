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
public class NavigationCntl 
{
    String theUsername;
    MainMenuUI theMainMenu;
    SpaceAssignCntl theSpaceAssignCntl;
    CurrentCapacityCntl theCurrentCapacityCntl;

    public NavigationCntl(String theUsername)
    {
        System.out.println("Made it to NavigationCntl");
        this.theSpaceAssignCntl = new SpaceAssignCntl();
        this.theCurrentCapacityCntl = new CurrentCapacityCntl();
        this.theUsername = theUsername;
        requestMainMenuUI();
        
    }
    
    public Object getParentNavigationCntl()
    {
        return this;
    }
    
    public void requestMainMenuUI()
    {
        theMainMenu = new MainMenuUI(this);
        theMainMenu.pack();
        theMainMenu.setTitle("Main Menu");
        theMainMenu.setLocationRelativeTo(null);
        theMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theMainMenu.setVisible(true);
    }
    
    public void requestSpaceAssignCntl()
    {
        this.theSpaceAssignCntl.setNavigationCntl(this);
    }
    
    public void requestCurrentCapacityCntl()
    {
        this.theCurrentCapacityCntl.setNavigationCntl(this);
    }
    
    public String getUsername()
    {
        return this.theUsername;
    }
}
