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
public class SpaceList 
{
    URL spaceFileURL;
    File spaceFile;
    Scanner in;
    ArrayList<Space> parentSpaceList;
    Space newSpace;
    final String COMMA_DELIMITER = ",";
    
    public SpaceList()
    {
        spaceFileURL = getClass().getResource("SpaceList.csv");
        spaceFile = new File(spaceFileURL.getPath());
        
        if(parentSpaceList == null)
        {
            readSpaceFile();
        }
    }

    public void readSpaceFile() 
    {
        try
        {
            boolean cont = true;
            in = new Scanner(spaceFile);
            parentSpaceList = new ArrayList<>();

            while(cont == true)
            {
                if(in.hasNext())
                {
                    String temp = in.nextLine();
                    String[] newSpa = temp.split(COMMA_DELIMITER);
                    
                    if (newSpa.length > 0) {
                        newSpace = new Space(newSpa[0], newSpa[1], newSpa[2], newSpa[3]);
                        parentSpaceList.add(newSpace);
                    }
                }
                else
                {
                    cont = false;
                }               
            }        
            //printParentSpaceList();
        }
        catch(Exception err)
        {
            
            err.printStackTrace();
        }
    }
    
    public ArrayList<Space> getParentSpaceList()
    {
        return parentSpaceList;
    }
    
    public void printParentSpaceList()
    {
        for(int i = 0; i < parentSpaceList.size(); i++)
        {
            System.out.println(parentSpaceList.get(i).getSpaceDetails());
        }
        System.out.println(parentSpaceList.size());
    }
    /*
    URL spaceFileURL;
    File spaceFile;
    Scanner in;
    ArrayList<Space> parentSpaceList;
    Space newSpace;
    
    public SpaceList()
    {
        spaceFileURL = getClass().getResource("SpaceList.txt");
        spaceFile = new File(spaceFileURL.getPath());
        
        if(parentSpaceList == null)
        {
            readSpaceFile();
        }
    }

    public void readSpaceFile() 
    {
        try
        {
            boolean cont = true;
            in = new Scanner(spaceFile);
            parentSpaceList = new ArrayList<>();

            while(cont == true)
            {
                if(in.hasNext())
                {
                    String newSpa = in.nextLine();
                    newSpace = new Space(newSpa);
                    parentSpaceList.add(newSpace);
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
    
    public ArrayList<Space> getParentSpaceList()
    {
        return parentSpaceList;
    }
*/
}
