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
public class THONRaiser 
{
    String name;
    int fundraised;
    
    public THONRaiser(String newName, String newFundraised)
    {
        this.setOrgName(newName);
        this.fundraised = Integer.valueOf(newFundraised);
    }
    
    public String getOrgName()
    {
        return this.name;
    }
    
    public void setOrgName(String newName)
    {
        this.name = newName;
    }
    
    public int getFundraised()
    {
        return this.fundraised;
    }
    
    public void setFundraised(int newFundraised)
    {
        this.fundraised = newFundraised;
    }
    
    public String getTHONRaiserDetails()
    {
        String thonraiserDetails = this.getOrgName() + ": $" + this.getFundraised();
        
        return thonraiserDetails;
    }
}
