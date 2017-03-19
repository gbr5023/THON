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
}
