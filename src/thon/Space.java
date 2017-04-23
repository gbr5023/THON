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
        
        org = newOrg;
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
        if(org.equals("---"))
        {
            org = newOrg;
        }
        else
        {
            org = org + ", " + newOrg;
        }
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
}
