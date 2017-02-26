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
    
    public NavigationCntl()
    {
        System.out.println("Made it to NavigationCntl");
        requestMainMenuUI();
        //MainMenu 
    }
    
    public NavigationCntl(String theUsername)
    {
        System.out.println("Made it to NavigationCntl");
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
        theSpaceAssignCntl = new SpaceAssignCntl();
        theSpaceAssignCntl.setNavigationCntl(this);
    }
    
    public String getUsername()
    {
        return this.theUsername;
    }
}
