/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author Gisward
 */
public class SpaceAssignCntl 
{
    SpaceSectionUI theSpaceSection;
    NavigationCntl parentNavigationCntl;
    OrganizationList parentOrganizationList;
    
    
    public SpaceAssignCntl()
    {
        System.out.println("Made it to the SpaceAssignCntl");
    }
    
    public TableModel getOrganizationTableModel()
    {
        OrganizationTableModel theOrganizationTableModel = new OrganizationTableModel();
        
        return theOrganizationTableModel;
    }
    
    public TableModel getSpaceTableModel()
    {
        SpaceTableModel theSpaceTableModel = new SpaceTableModel();
        
        return theSpaceTableModel;
    }
    
    public void requestSpaceSectionUI()
    {
        theSpaceSection = new SpaceSectionUI(this);
        theSpaceSection.pack();
        theSpaceSection.setTitle("Space Assignment");
        theSpaceSection.setSize(800, 700);
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
