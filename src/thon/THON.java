/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import javax.swing.UIManager;
    import javax.swing.UnsupportedLookAndFeelException;

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
        long currentTimeMin= System.currentTimeMillis() / 60000;
        //int currentTimeMin = (int) currentTime;
        long fromTimeMin = 24829680;
        System.out.println(currentTimeMin - fromTimeMin );
    }

}
