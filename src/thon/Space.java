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
    int capacity;
    boolean hasOrg;
    String org;
    
    public Space(String newSpace, String newCapacity, String newHasOrg, String newOrg)
    {
        this.setSpace(newSpace);
        
        capacity = Integer.valueOf(newCapacity);
        this.setCapacity(capacity);
        
        hasOrg = Boolean.valueOf(newHasOrg);
        this.setHasOrg(hasOrg);
        
        this.setOrg(newOrg);
    }
    
    public void setSpace(String newSpace)
    {
        space = newSpace;
    }
    
    public String getSpace()
    {
        return space;
    }
    
    public void setCapacity(int newCapacity)
    {
        capacity = newCapacity;
    }
    
    public int getCapacity()
    {
        return capacity;
    }
    
    public void setHasOrg(boolean hasNewOrg)
    {
        hasOrg = hasNewOrg;
    }
    
    public boolean getHasOrg()
    {
        return hasOrg;
    }
    
    public void setOrg(String newOrg)
    {
        org = newOrg;
    }
    
    public String getOrg()
    {
        return org;
    }
    
    public String getSpaceDetails()
    {
        String spaceDetails = this.getSpace() + ", " + this.getCapacity()+ 
                              ", " + this.getHasOrg() + ", " + this.getOrg();
        
        return spaceDetails;
    }
    /*
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
*/
}
