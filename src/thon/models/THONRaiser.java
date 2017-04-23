package thon.models;

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
