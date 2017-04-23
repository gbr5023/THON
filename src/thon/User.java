package thon;

/**
 *
 * @author Gisward
 */
public class User 
{
    private String username;
    private char[] password;
    private String position;
    private String phone;
    // UserTableModel 
    
    public User(String newUsername, char[] newPassword)
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
    
    public char[] getPassword()
    {
        return this.password;
    }
    
    public void setPassword(char[] newPassword)
    {
        this.password = newPassword;
    }
}