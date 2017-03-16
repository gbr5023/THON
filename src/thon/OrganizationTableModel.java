/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Gisward
 */
public class OrganizationTableModel extends AbstractTableModel implements TableModel
{
    //SpaceAssignCntl parentSpaceAssignCntl;
    OrganizationList theOrganizationList;
    ArrayList<Organization> parentOrganizationList;
    String[] columnOrgNameArray = {"Organization","Member Count","Has Space?","Space"};

    public OrganizationTableModel()
    {
        //parentSpaceAssignCntl = new SpaceAssignCntl();
        theOrganizationList = new OrganizationList();
        parentOrganizationList = theOrganizationList.getParentOrganizationList();
        //columnOrgNameArray = "Organization";
        //parentSpaceAssignCntl.setOrganizationListClass(theOrganizationList);
    }
    
    public OrganizationList getTheOrganizationList()
    {
        return this.theOrganizationList;
    }
    
    @Override //must override original abstract method from AbstractTableModel
    public String getColumnName(int column) 
    {
        return columnOrgNameArray[column];
    }
    
    @Override
    public int getRowCount() 
    {
        return parentOrganizationList.size();
    }

    @Override
    public int getColumnCount() 
    {
        return columnOrgNameArray.length;
    }

    @Override
    public Object getValueAt(int row, int column) 
    {
        Object objectToReturn = new Object();
        switch(column)
        {
            case 0:
                objectToReturn = parentOrganizationList.get(row).getOrgName();
                break;
            case 1:
                objectToReturn = parentOrganizationList.get(row).getMemberCnt();
                break;
            case 2:
                objectToReturn = parentOrganizationList.get(row).getHasSpace();
                break;
            case 3:
                objectToReturn = parentOrganizationList.get(row).getOrgSpace();
                break;
            default:
                return null;
        }
        return objectToReturn;
    }
}
