package thon.controllers;

import thon.views.SpaceSectionUI;
import thon.models.Organization;
import thon.models.OrganizationList;
import thon.tableModels.OrganizationTableModel;
import thon.models.Space;
import thon.models.SpaceList;
import thon.tableModels.SpaceTableModel;

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
    public NavigationCntl parentNavigationCntl;
    OrganizationList theOrganizationList;
    SpaceList theSpaceList;
    OrganizationTableModel theOrganizationTableModel;
    SpaceTableModel theSpaceTableModel;
    ArrayList<Integer> organizationRowsFound;
    ArrayList<Integer> spaceRowsFound;
    
    /*
    controller classes now have the sole ability to instantiate model classes and
    only one instance of that particular model class.
    (for example -> creation of SpaceList and OrganizationList model classes).
    This ensures that when the table models are updated, the arraylists in those
    model classes are not instantiated another time.
    */
    public SpaceAssignCntl()
    {
        System.out.println("SpaceAssignCntl instantiated");
        this.theSpaceList = new SpaceList();
        this.theOrganizationList = new OrganizationList();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        System.out.println("Made it to the SpaceAssignCntl");
        parentNavigationCntl = newParentNavigationCntl;
        requestSpaceSectionUI();
    }
    
    public void requestSpaceSectionUI()
    {
        theSpaceSectionUI = new SpaceSectionUI(this);
        theSpaceSectionUI.pack();
        theSpaceSectionUI.setTitle("Space Assignment");
        theSpaceSectionUI.setLocationRelativeTo(null);
        theSpaceSectionUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theSpaceSectionUI.setVisible(true);
    }
    
    public void updateTableModels()
    {
        theOrganizationTableModel.update();
        theSpaceTableModel.update();
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
    
    public ArrayList<Organization> getParentOrganizationList()
    {
        return this.theOrganizationList.getParentOrganizationList();
    }
    
    public ArrayList<Space> getParentSpaceList()
    {
        return this.theSpaceList.getParentSpaceList();
    }
    
    public void setListOfOrganizations(ArrayList<Organization> updatedOrganizations) 
    {
        this.theOrganizationList.setListOfOrganizations(updatedOrganizations);
    }

    public void setListOfSpaces(ArrayList<Space> updatedListOfSpaces) 
    {
        this.theSpaceList.setListOfSpaces(updatedListOfSpaces);
    }
    
    public boolean requestSearchOrganizationList(String orgToSearch)
    {
        boolean searchedOrgFound = this.theOrganizationList.requestSearchOrganizationList(orgToSearch);
        return searchedOrgFound;
    }
    
    public boolean requestSearchSpaceList(String spaceToSearch)
    {
        boolean searchedSpaceFound = this.theSpaceList.requestSearchSpaceList(spaceToSearch);
        return searchedSpaceFound;
    }
    
    public ArrayList<Integer> getListOfOrganizationRowsFound()
    {
        this.organizationRowsFound = this.theOrganizationList.getListOfOrganizationRowsFound();
        
        return this.organizationRowsFound;
    }
    
    public ArrayList<Integer> getListOfSpaceRowsFound()
    {
        this.spaceRowsFound = this.theSpaceList.getListOfSpaceRowsFound();
        
        return this.spaceRowsFound;
    }
}
