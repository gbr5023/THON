/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class LoginCntl 
{
    private UserList theUserList;
    private LoginUI theLoginUI;
    //private LoginUIv2 theLoginUIv2;
    private NavigationCntl theNavigationCntl;
    
    public LoginCntl()
    {
        System.out.println("Made it to LoginCntl");
        theUserList = new UserList();
        theLoginUI = new LoginUI(this);
        theLoginUI.setVisible(true);
    }
    
    public void requestNavigationCntl()
    {
        this.theNavigationCntl = new NavigationCntl();
    }
    
    public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck)
    {
        //theUserList.printUsers(); //for check
        boolean authenticated = theUserList.authenticate(usernameToCheck, passwordToCheck);

        return authenticated;
    }
}
