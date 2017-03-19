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
    SpaceSectionUI theSpaceSectionUI;
    NavigationCntl parentNavigationCntl;
    OrganizationList theOrganizationList;
    SpaceList theSpaceList;
    OrganizationTableModel theOrganizationTableModel;
    SpaceTableModel theSpaceTableModel;
    
    
    public SpaceAssignCntl()
    {
        System.out.println("Made it to the SpaceAssignCntl");
        this.theSpaceList = new SpaceList();
        this.theOrganizationList = new OrganizationList();
    }
    
    public TableModel getOrganizationTableModel()
    {
        theOrganizationTableModel = new OrganizationTableModel(this.theOrganizationList);
        
        return theOrganizationTableModel;
    }
    
    public TableModel getSpaceTableModel()
    {
        theSpaceTableModel = new SpaceTableModel(this.theSpaceList);
        
        return theSpaceTableModel;
    }
    
    public void updateTableModels()
    {
        //theOrganizationTableModel.setParentOrganizationList();
        theOrganizationTableModel.update();
        
        //theSpaceTableModel.setParentSpaceList();
        theSpaceTableModel.update();
    }
    
    public void requestSpaceSectionUI()
    {
        theSpaceSectionUI = new SpaceSectionUI(this);
        theSpaceSectionUI.pack();
        theSpaceSectionUI.setTitle("Space Assignment");
        theSpaceSectionUI.setSize(810, 630);
        theSpaceSectionUI.setLocationRelativeTo(null);
        theSpaceSectionUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theSpaceSectionUI.setVisible(true);
    }
    /*
    public void setOrganizationListClass()//OrganizationList theOrganizationList)
    {
        this.theOrganizationList = theOrganizationTableModel.getTheOrganizationList();
    }

    public void setSpaceListClass()//SpaceList theSpaceList)
    {
        this.theSpaceList = theSpaceTableModel.getTheSpaceList();
    }
    */
    
    public ArrayList<Organization> getParentOrganizationList()
    {
        return this.theOrganizationList.getParentOrganizationList();
    }
    
    public ArrayList<Space> getParentSpaceList()
    {
        return this.theSpaceList.getParentSpaceList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        parentNavigationCntl = newParentNavigationCntl;
        requestSpaceSectionUI();
    }
}
