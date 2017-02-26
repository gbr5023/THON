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
public class SpaceTableModel extends AbstractTableModel implements TableModel
{
    SpaceAssignCntl parentSpaceAssignCntl;
    SpaceList theSpaceList;
    ArrayList<Space> parentSpaceList;
    String columnSpaceNameArray;
    
    public SpaceTableModel()
    {
        parentSpaceAssignCntl = new SpaceAssignCntl();
        theSpaceList = new SpaceList();
        parentSpaceList = theSpaceList.getParentSpaceList();
        columnSpaceNameArray = "Spaces";
        parentSpaceAssignCntl.setSpaceListClass(theSpaceList);       
    }
    
    @Override
    public String getColumnName(int column) 
    {
        return columnSpaceNameArray;
    }
    
    @Override
    public int getRowCount() 
    {
        return parentSpaceList.size();
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
                objectToReturn = parentSpaceList.get(row).getSpace();
                break;
            default:
                return null;
        }
        
        return objectToReturn;
    }
}
