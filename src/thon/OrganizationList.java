/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gisward
 */
public class OrganizationList 
{
    URL organizationFileURL;
    File organizationFile;
    Scanner in;
    ArrayList<Organization> parentOrganizationList;
    Organization newOrganization;
    
    public OrganizationList()
    {
        organizationFileURL = getClass().getResource("THONorganizations.txt");
        organizationFile = new File(organizationFileURL.getPath());
        
        if(parentOrganizationList == null)
        {
            readOrganizationFile();
        }
    }
    
    public void readOrganizationFile()
    {
        try
        {
            boolean cont = true;
            in = new Scanner(organizationFile);
            parentOrganizationList = new ArrayList<>();

            while(cont == true)
            {
                if(in.hasNext())
                {
                    String newOrg = in.nextLine();
                    newOrganization = new Organization(newOrg);
                    parentOrganizationList.add(newOrganization);
                }
                else
                {
                    cont = false;
                }               
            }
            
        }
        catch(Exception err)
        {
            
            err.printStackTrace();
        }    
    }
    
    public ArrayList<Organization> getParentOrganizationList()
    {
        return parentOrganizationList;
    }
}
