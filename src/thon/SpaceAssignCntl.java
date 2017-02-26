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
public class SpaceAssignCntl 
{
    SpaceSectionUI theSpaceSection;
    NavigationCntl parentNavigationCntl;
    
    public SpaceAssignCntl()
    {
        System.out.println("Made it to the SpaceAssignCntl");     
    }
    
    public void requestSpaceSectionUI()
    {
        theSpaceSection = new SpaceSectionUI(this);
        theSpaceSection.pack();
        theSpaceSection.setTitle("Space Assignment");
        theSpaceSection.setSize(780, 720);
        theSpaceSection.setLocationRelativeTo(null);
        theSpaceSection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theSpaceSection.setVisible(true);
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        parentNavigationCntl = newParentNavigationCntl;
        requestSpaceSectionUI();
    }
}
