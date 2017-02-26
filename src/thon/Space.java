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
public class Space 
{
    String space;
    boolean hasOrg;
    String org;
    
    public Space(String newSpace)
    {
        space = newSpace;
        hasOrg = false;
    }
    
    public void setSpace(String newSpace)
    {
        space = newSpace;
    }
    
    public String getSpace()
    {
        return space;
    }
    
    public void setOrg(String newOrg)
    {
        org = newOrg;
    }
    
    public String getOrg()
    {
        return org;
    }
    
    public void setHasOrg(boolean hasNewOrg)
    {
        hasOrg = hasNewOrg;
    }
    
    public boolean getHasOrg()
    {
        return hasOrg;
    }
}
