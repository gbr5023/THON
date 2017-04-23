package thon.controllers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import thon.models.Organization;
import thon.models.OrganizationList;
import thon.models.Space;
import thon.models.SpaceList;
import thon.models.THONRaiser;
import thon.models.THONRaiserList;
import thon.models.SerializedData;

public class SerializedDataCntl {
    
    private static SerializedDataCntl serializedDataController;
    //public static String EXTERNAL_DATA_PATH = "//data//";
    
    private SerializedData sdModel;
    
    private SerializedDataCntl(){
        getSerializedDataModel();
    }
    
    public static SerializedDataCntl getSerializedDataCntl(){
        if(serializedDataController == null)
            serializedDataController = new SerializedDataCntl();
        
        return serializedDataController;
    }
    
    public SerializedData getSerializedDataModel(){
        if(sdModel == null)
            sdModel = new SerializedData();
        
        return sdModel;
    }
    
    private void writeFile(String filePath){
        long curTime = System.currentTimeMillis();
        FileOutputStream fos;
        ObjectOutputStream out;
        
        try {
            fos = new FileOutputStream(filePath);
            out = new ObjectOutputStream(fos);
            out.writeObject(sdModel);
            out.close();
            
            System.out.println("Data write to " + filePath + " was successful.");
        } catch(IOException ex) {
            System.out.println("Data write to " + filePath + " failed.");
        }
        
        curTime = System.currentTimeMillis() - curTime;
        System.out.println("Saving took " + curTime + "ms");
    }
    
    private void readFile(String filePath){
        FileInputStream fis;
        ObjectInputStream in;
        
        try {
            fis = new FileInputStream(filePath);
            in = new ObjectInputStream(fis);
            sdModel = (SerializedData)in.readObject();
            System.out.println(sdModel.getList());
        } catch(IOException | ClassNotFoundException ex) {
            sdModel = new SerializedData();
        }
    }
    
    public void setList(ArrayList listToSave, String filePath){
        sdModel.setList(listToSave);
        writeFile(filePath);
    }
    
    private ArrayList getList(String filePath){
        readFile(filePath);
        
        System.out.println("Getting data at " + filePath);
        if(sdModel.isEmpty())
            System.out.println("No data found at " + filePath);
        else
            System.out.println("Data found at " + filePath);
        
        return sdModel.getList();
    }
    
    public ArrayList<THONRaiser> getListOfTHONRaisers()
    {
        return (ArrayList<THONRaiser>)getList(THONRaiserList.STORAGE_FILE_PATH);
    }
    
    public ArrayList<Organization> getListOfOrganizations()
    {
        return (ArrayList<Organization>)getList(OrganizationList.STORAGE_FILE_PATH);
    }

    public ArrayList<Space> getListOfSpaces() 
    {
        return (ArrayList<Space>)getList(SpaceList.STORAGE_FILE_PATH);
    }
}
