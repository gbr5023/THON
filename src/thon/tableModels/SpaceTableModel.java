package thon.tableModels;

import thon.models.SpaceList;
import thon.models.Space;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Gisward
 */
public class SpaceTableModel extends AbstractTableModel implements TableModel
{
    SpaceList theSpaceList;
    ArrayList<Space> parentSpaceList;
    String[] columnSpaceNameArray = {"Space","Current Seat Count","Has Org?","Org"};
    
    /*
    single instance of SpaceList class was created through SpaceAssignCntl
    */
    public SpaceTableModel(SpaceList newSpaceList)
    {
        this.theSpaceList = newSpaceList;
        setParentSpaceList();
    }
    
    /*
    single instance of arraylist of spaces was created through the single 
    instance of SpaceList class (created in the SpaceAssignCntl)
    */
    public void setParentSpaceList()
    {
        parentSpaceList = theSpaceList.getParentSpaceList();
    }
    
    public void update() {
        super.fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int column) 
    {
        return columnSpaceNameArray[column];
    }
    
    @Override
    public int getRowCount() 
    {
        return parentSpaceList.size();
    }

    @Override
    public int getColumnCount() 
    {
        return columnSpaceNameArray.length;
    }

    @Override
    public Object getValueAt(int row, int column) 
    {
        Object objectToReturn = new Object();
        switch(column)
        {
            case 0:
                objectToReturn = parentSpaceList.get(row).getSpace();
                break;
            case 1:
                objectToReturn = parentSpaceList.get(row).getCapacity();
                break;
            case 2:
                objectToReturn = parentSpaceList.get(row).getHasOrg();
                break;
            case 3:
                objectToReturn = parentSpaceList.get(row).getOrg();
                break;
            default:
                return null;
        }
        return objectToReturn;
    }
}
