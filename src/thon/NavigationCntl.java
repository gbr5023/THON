/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

/**
 *
 * @author Gisward
 */
public class NavigationCntl 
{
    public NavigationCntl()
    {
        System.out.println("Made it to NavigationCntl");
        
    }
    
    public void requestMainMenuUI()
    {
        MainMenuUI theMainMenu = new MainMenuUI();
        theMainMenu.setVisible(true);
    }
}
