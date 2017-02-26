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
    private String theUsername;
    private NavigationCntl theNavigationCntl;
    
    public LoginCntl()
    {
        System.out.println("Made it to LoginCntl");
        theUserList = new UserList();
        theLoginUI = new LoginUI(this);
        theLoginUI.setTitle("Technology Control System Login");
        theLoginUI.setLocationRelativeTo(null);
        theLoginUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theLoginUI.setVisible(true);
    }
    
    public void requestNavigationCntl(String theUsername)
    {
        setUsername(theUsername);
        this.theNavigationCntl = new NavigationCntl(this.theUsername);
    }
    
    public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck)
    {
        //theUserList.printUsers(); //for check
        boolean authenticated = theUserList.authenticate(usernameToCheck, passwordToCheck);

        return authenticated;
    }
    
    public void setUsername(String theUsername)
    {
        this.theUsername = theUsername;
    }
}
