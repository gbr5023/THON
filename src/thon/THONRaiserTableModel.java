package thon;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Gisward
 */
public class THONRaiserTableModel extends AbstractTableModel implements TableModel
{
    THONRaiserList theTHONRaiserList;
    ArrayList<THONRaiser> parentTHONRaiserList;
    
    String[] columnOrgNameArray = {"Organization","Amount Fundraised"};

    public THONRaiserTableModel(THONRaiserList newTHONRaiserList)
    {
        this.theTHONRaiserList = newTHONRaiserList;
        setParentTHONRaiserList();
    }
    
    public void setParentTHONRaiserList()
    {
        this.parentTHONRaiserList = this.theTHONRaiserList.getParentTHONRaiserList();
    }
    
    /*
    public void setSortedParentOrganizationList()
    {
        
    }
    */  
    
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
        return parentTHONRaiserList.size();
    }
    
    
    public void clear(){
        parentTHONRaiserList.clear();
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
                objectToReturn = parentTHONRaiserList.get(row).getOrgName();
                break;
            case 1:
                objectToReturn = parentTHONRaiserList.get(row).getFundraised();
                break;
            default:
                return null;
        }
        return objectToReturn;
    }   
}
