package thon.controllers;

import javax.swing.JFrame;
import thon.views.LoginUI;
import thon.models.UserList;

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
        boolean authenticated = theUserList.authenticate(usernameToCheck, passwordToCheck);

        return authenticated;
    }
    
    public void setUsername(String theUsername)
    {
        this.theUsername = theUsername;
    }
}
