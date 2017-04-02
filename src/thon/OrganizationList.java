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
    ArrayList<Organization> sortedOrganizationList;
    SpaceSectionUI userInput;
    Organization newOrganization;
    final String COMMA_DELIMITER = ",";
    int readCount = 0;
    
    public OrganizationList()
    {
        if(readCount == 0)
        {
            System.out.println("creating new parent organization list");
            readOrganizationFile();
            readCount++;
        }
        else
        {
            System.out.println("already created parent organization list.. reading");
            getParentOrganizationList();
        }
    }

    public void readOrganizationFile() 
    {
        try
        {
            organizationFileURL = getClass().getResource("THONorganizations.csv");
            organizationFile = new File(organizationFileURL.getPath());
            
            boolean cont = true;
            in = new Scanner(organizationFile);
            parentOrganizationList = new ArrayList<>();

            while(cont == true)
            {
                if(in.hasNext())
                {
                    String temp = in.nextLine();
                    String[] newOrg = temp.split(COMMA_DELIMITER);
                    
                    if (newOrg.length > 0) {
                        newOrganization = new Organization(newOrg[0], newOrg[1], newOrg[2], newOrg[3]);
                        parentOrganizationList.add(newOrganization);
                    }
                }
                else
                {
                    cont = false;
                    System.out.println("Reading org file done.");
                }               
            }
        }
        catch(Exception err)
        {
            
            err.printStackTrace();
        }
    }
    
    public void sortByUserPreference(){
        userInput = new SpaceSectionUI();
        String searchString = userInput.jTextField1.getText().toLowerCase();
    }
    
    public ArrayList<Organization> getParentOrganizationList()
    {
        return parentOrganizationList;
    }
}
