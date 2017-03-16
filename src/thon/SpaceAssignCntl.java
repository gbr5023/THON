/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import java.util.ArrayList;
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
    OrganizationList theOrganizationList;
    SpaceList theSpaceList;
    OrganizationTableModel theOrganizationTableModel;
    SpaceTableModel theSpaceTableModel;
    
    
    public SpaceAssignCntl()
    {
        System.out.println("Made it to the SpaceAssignCntl");
    }
    
    public TableModel getOrganizationTableModel()
    {
        theOrganizationTableModel = new OrganizationTableModel();
        
        return theOrganizationTableModel;
    }
    
    public TableModel getSpaceTableModel()
    {
        theSpaceTableModel = new SpaceTableModel();
        
        return theSpaceTableModel;
    }
    
    public void updateTableModels()
    {
        theOrganizationTableModel.update();
        theSpaceTableModel.update();
    }
    
    public void requestSpaceSectionUI()
    {
        theSpaceSection = new SpaceSectionUI(this);
        theSpaceSection.pack();
        theSpaceSection.setTitle("Space Assignment");
        theSpaceSection.setSize(800, 600);
        theSpaceSection.setLocationRelativeTo(null);
        theSpaceSection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theSpaceSection.setVisible(true);
    }
    
    public void setOrganizationListClass()//OrganizationList theOrganizationList)
    {
        this.theOrganizationList = theOrganizationTableModel.getTheOrganizationList();
    }

    public void setSpaceListClass()//SpaceList theSpaceList)
    {
        this.theSpaceList = theSpaceTableModel.getTheSpaceList();
    }
    
    public ArrayList<Organization> getParentOrganizationList()
    {
        theOrganizationList = new OrganizationList();
        return theOrganizationList.getParentOrganizationList();
    }
    
    public ArrayList<Space> getParentSpaceList()
    {
        theSpaceList = new SpaceList();
        return theSpaceList.getParentSpaceList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        parentNavigationCntl = newParentNavigationCntl;
        requestSpaceSectionUI();
    }
}
