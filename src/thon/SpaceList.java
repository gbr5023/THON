/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import java.io.File;
import java.io.FileNotFoundException;
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
    ArrayList<Integer> spaceRowsFound;
    final String COMMA_DELIMITER = ",";
    int readCount = 0;
    
    public SpaceList()
    {
        if(readCount == 0)
        {
            System.out.println("creating new parent space list");
            readSpaceFile();
            readCount++;
        }
        else
        {
            System.out.println("already created parent space list.. reading");
            getParentSpaceList();
        }
    }

    public void readSpaceFile() 
    {
        try
        {
            spaceFileURL = getClass().getResource("SpaceList.csv");
            spaceFile = new File(spaceFileURL.getPath());
            
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
                    System.out.println("Reading space file done.");
                }               
            }        
            //printParentSpaceList();
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println(fnfe.getMessage());
        }
        catch(Exception err)
        {
            
            System.out.println(err.getMessage());
        }
    }
    
    public boolean requestSearchSpaceList(String spaceToSearch)
    {
        boolean searchedSpaceFound;
        int spacesFound = 0;        
        this.spaceRowsFound = new ArrayList();
        spaceToSearch = spaceToSearch.toLowerCase();
        
        for(int i = 0; i < this.parentSpaceList.size(); i++)
        {
            String spaceName = this.parentSpaceList.get(i).getSpace().toLowerCase();
            
            if(spaceName.contains(spaceToSearch) || spaceName.equalsIgnoreCase(spaceToSearch))
            {
                spacesFound++;
                this.spaceRowsFound.add(i);
            }
        }    
        
        searchedSpaceFound = spacesFound > 0;
        
        return searchedSpaceFound;
    }
    
    public ArrayList<Integer> getListOfSpaceRowsFound()
    {
        return this.spaceRowsFound;
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
}
