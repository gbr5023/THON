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
            //printParentOrganizationList();
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
    
    public void printParentOrganizationList()
    {
        for(int i = 0; i < parentOrganizationList.size(); i++)
        {
            System.out.println(parentOrganizationList.get(i).getOrganizationDetails());
        }
        System.out.println(parentOrganizationList.size());
    }
    /*
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
*/
}
