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
    SpaceAssignCntl parentSpaceAssignCntl;
    OrganizationList theOrganizationList;
    ArrayList<Organization> parentOrganizationList;
    String columnOrgNameArray;

    public OrganizationTableModel()
    {
        parentSpaceAssignCntl = new SpaceAssignCntl();
        theOrganizationList = new OrganizationList();
        parentOrganizationList = theOrganizationList.getParentOrganizationList();
        columnOrgNameArray = "Organization";
        parentSpaceAssignCntl.setOrganizationListClass(theOrganizationList);
    }
    
    @Override //must override original abstract method from AbstractTableModel
    public String getColumnName(int column) 
    {
        return columnOrgNameArray;
    }
    
    @Override
    public int getRowCount() 
    {
        return parentOrganizationList.size();
    }

    @Override
    public int getColumnCount() 
    {
        return 1;
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
            default:
                return null;
        }
        
        return objectToReturn;
    }
}
