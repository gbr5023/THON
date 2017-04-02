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
    int memberCnt;
    boolean hasSpace;
    String space;
    
    public Organization(String newName, String newMemberCnt, String newHasSpace, String newSpace)
    {
        this.setOrgName(newName);
        
        memberCnt = Integer.valueOf(newMemberCnt);
        this.setOrgMemberCnt(memberCnt);
        
        hasSpace = Boolean.valueOf(newHasSpace);
        this.setHasSpace(hasSpace);
        
        this.space = newSpace;
    }
    
    public void setOrgName(String newOrgName)
    {
        name = newOrgName;
    }
    
    public String getOrgName()
    {
        return name;
    }
    
    public void setOrgMemberCnt(int newMemberCnt)
    {
        memberCnt = newMemberCnt;
    }
    
    public int getMemberCnt()
    {
        return memberCnt;
    }
    
    public void setHasSpace(boolean newHasSpaceStatus)
    {
        hasSpace = newHasSpaceStatus;
    }
    
    public boolean getHasSpace()
    {
        return hasSpace;
    }
    
    public void setOrgSpace(String newOrgSpace)
    {
        if(space.equals("---"))
        {
            space = newOrgSpace;
        }
        else
        {
            space = space + ", " + newOrgSpace;
        }
    }
    
    public String getOrgSpace()
    {
        return space;
    }
    
    public String getOrganizationDetails()
    {
        String organizationDetails = this.getOrgName() + ", " + this.getMemberCnt()+ 
                              ", " + this.getHasSpace() + ", " + this.getOrgSpace();
        
        return organizationDetails;
    }
}
