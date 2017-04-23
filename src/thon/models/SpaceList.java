package thon.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import thon.controllers.SerializedDataCntl;

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
    
    public static String STORAGE_FILE_PATH = "data/spaces.ser";
    
    public SpaceList()
    {
        this.parentSpaceList = SerializedDataCntl.getSerializedDataCntl().getListOfSpaces();
        if (this.parentSpaceList.isEmpty()) {
            readSpaceFile();
        }
    }

    public void readSpaceFile() 
    {
        parentSpaceList = new ArrayList<>();
        
        try
        {
            spaceFileURL = getClass().getResource("SpaceList.csv");
            spaceFile = new File(spaceFileURL.getPath());
            
            boolean cont = true;
            in = new Scanner(spaceFile);

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
            SerializedDataCntl.getSerializedDataCntl().setList(this.parentSpaceList, STORAGE_FILE_PATH);
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
        if(this.parentSpaceList == null)
        {
            this.readSpaceFile();
        }
        
        return parentSpaceList;
    }
    
    public void setListOfSpaces(ArrayList<Space> theListOfSpaces) 
    {
        this.parentSpaceList = theListOfSpaces;
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
