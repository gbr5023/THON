package thon.tableModels;

import thon.models.Organization;
import thon.models.OrganizationList;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Gisward
 */
public class OrganizationTableModel extends AbstractTableModel implements TableModel
{
    OrganizationList theOrganizationList;
    ArrayList<Organization> parentOrganizationList;
    ArrayList<Organization> sortedOrganizationList;
    
    String[] columnOrgNameArray = {"Organization","Member Count","Has Space?","Space"};

    /*
    single instance of OrganizationList class was created through SpaceAssignCntl
    */
    public OrganizationTableModel(OrganizationList newOrganizationList)
    {
        this.theOrganizationList = newOrganizationList;
        setParentOrganizationList();
    }
        
    /*
    Single instance of arraylist of organizations was created through the single 
    instance of OrganizationList class (created in the SpaceAssignCntl)
    */
    public void setParentOrganizationList()
    {
        parentOrganizationList = theOrganizationList.getParentOrganizationList();
    }
        
    public void update() {
        super.fireTableDataChanged();
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
    
    public void clear(){
        parentOrganizationList.clear();
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
