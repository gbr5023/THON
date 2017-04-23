package thon.models;

import thon.controllers.SerializedDataCntl;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Gisward
 */
public class THONRaiserList 
{
    URL thonraiserFileURL;
    File thonraiserFile;
    Scanner in;
    ArrayList<THONRaiser> parentTHONRaiserList;
    THONRaiser newTHONRaiser;
    ArrayList<Integer> thonraiserRowsFound;
    final String COMMA_DELIMITER = ",";
    int readCount = 0;
    public static String STORAGE_FILE_PATH = SerializedDataCntl.EXTERNAL_DATA_PATH + "thonraisers.ser";

    public THONRaiserList() {
        this.parentTHONRaiserList = SerializedDataCntl.getSerializedDataCntl().getListOfTHONRaisers();
        if (this.parentTHONRaiserList.isEmpty()) {
            readTHONRaiserCSVFile();
        }
    }

    public void readTHONRaiserCSVFile() {
        try {
            thonraiserFileURL = getClass().getResource("THONRaiser.csv");
            thonraiserFile = new File(thonraiserFileURL.getPath());

            boolean cont = true;
            in = new Scanner(thonraiserFile);
            parentTHONRaiserList = new ArrayList<>();

            while (cont == true) {
                if (in.hasNext()) {
                    String temp = in.nextLine();
                    String[] newTHR = temp.split(COMMA_DELIMITER);

                    if (newTHR.length > 0) {
                        newTHONRaiser = new THONRaiser(newTHR[0], newTHR[1]);
                        parentTHONRaiserList.add(newTHONRaiser);
                    }
                } else {
                    cont = false;
                    SerializedDataCntl.getSerializedDataCntl().setList(this.parentTHONRaiserList, STORAGE_FILE_PATH);
                    System.out.println("Reading THONRaiser file done.");
                }
            }
            
            //printParentTHONRaiserList();
        } 
        catch (FileNotFoundException fnfe) 
        {
            System.out.println(fnfe.getMessage());
        } 
        catch (Exception err) 
        {

            System.out.println(err.getMessage());
        }
        SerializedDataCntl.getSerializedDataCntl().setList(this.parentTHONRaiserList, STORAGE_FILE_PATH);
    }

    public ArrayList<Integer> getListOfTHONRaiserRowsFound() 
    {
        return this.thonraiserRowsFound;
    }

    public ArrayList<THONRaiser> getParentTHONRaiserList() 
    {
        if(this.parentTHONRaiserList == null)
        {
            this.readTHONRaiserCSVFile();
        }
        
        return parentTHONRaiserList;
    }
    
    public void setListOfTHONRaisers(ArrayList<THONRaiser> theListOfTHONRaisers)
    {
        this.parentTHONRaiserList = theListOfTHONRaisers;
    }

    public void printParentTHONRaiserList() {
        for (int i = 0; i < parentTHONRaiserList.size(); i++) {
            System.out.println(parentTHONRaiserList.get(i).getTHONRaiserDetails());
        }
        System.out.println(parentTHONRaiserList.size());
    }
}
