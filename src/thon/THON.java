/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import java.io.File;
import java.net.URL;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import thon.LoginCntl;

/**
 *
 * @author Gisward
 */
public class THON 
{

    public static void main(String[] args) 
    {
        try 
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            System.out.println(ex.getMessage());
        }
        
        LoginCntl theLoginCntl = new LoginCntl();
    }

}
