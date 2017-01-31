/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

/**
 *
 * @author Gisward
 */
public class User 
{
    private String username;
    private String password;
    
    public User(String newUsername, String newPassword)
    {
        this.username = newUsername;
        this.password = newPassword;
    }
    
    public String getUsername()
    {
        return this.username;
    }
    
    public void setUsername(String newUsername)
    {
        this.username = newUsername;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public void setPassword(String newPassword)
    {
        this.password = newPassword;
    }
}
