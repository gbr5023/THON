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

    public THONRaiserList() {
        if (readCount == 0) {
            System.out.println("creating new parent THONRaiser List");
            readTHONRaiserCSVFile();
            readCount++;
        } else {
            System.out.println("already created parent THONRaiser List.. reading");
            getParentTHONRaiserList();
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
                    System.out.println("Reading THONRaiser file done.");
                }
            }
            printParentTHONRaiserList();
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (Exception err) {

            System.out.println(err.getMessage());
        }
    }

    public ArrayList<Integer> getListOfTHONRaiserRowsFound() {
        return this.thonraiserRowsFound;
    }

    public ArrayList<THONRaiser> getParentTHONRaiserList() {
        return parentTHONRaiserList;
    }

    public void printParentTHONRaiserList() {
        for (int i = 0; i < parentTHONRaiserList.size(); i++) {
            System.out.println(parentTHONRaiserList.get(i).getTHONRaiserDetails());
        }
        System.out.println(parentTHONRaiserList.size());
    }
}
