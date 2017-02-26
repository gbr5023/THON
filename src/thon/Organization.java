/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

/**
 *
 * @author Gisward
 */
public class Organization 
{
    String name;
    boolean hasSpace;
    String space;
    
    public Organization(String newName)
    {
        name = newName;
        hasSpace = false;
        space = "--";
    }
    
    public void setOrgName(String newOrgName)
    {
        name = newOrgName;
    }
    
    public String getOrgName()
    {
        return name;
    }
    
    public void setOrgSpace(String newOrgSpace)
    {
        space = newOrgSpace;
    }
    
    public String getOrgSpace()
    {
        return space;
    }
    
    public void setHasSpace(boolean newHasSpaceStatus)
    {
        hasSpace = newHasSpaceStatus;
    }
    
    public boolean getHasSpace()
    {
        return hasSpace;
    }
}
