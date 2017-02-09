/*
 * Visit: www.homeandlearn.co.uk/java/connecting_to_a_database_table.html
 */

package thon;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; // need in order to execute SQL statement on the THONUSER table
import java.sql.ResultSet;
import java.util.Arrays;

/**
 *
 * @author Gisward
 */
public class UserList 
{
    private ArrayList<User> theListOfUsers;
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    
    public UserList()
    {
        // Do this if there are no real users
        if(theListOfUsers == null)
        {
            buildTestUserList();
        }
    }
    
    public ArrayList<User> getListOfUsers()
    {
        if(theListOfUsers == null)
        {
            buildTestUserList();
        }
        return theListOfUsers;
    }
    
    public void buildTestUserList()
    {
        theListOfUsers = new ArrayList();
        
        String host = "jdbc:derby://localhost:1527/THON";
        String username = "thon";
        String password = "123";
           
        try
        {
            this.conn = DriverManager.getConnection(host, username, password); // sets up a connection to the database
            this.stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY); // needs a Connection object, with createStatement() method
            
            // ResultSet.TYPE_FORWARD_ONLY = default type, reads data from beginning to end
            // ResultSet.CONCUR_READ_ONLY = it will read only, NOT UPDATE
            
            String thonUserSQL = "SELECT * FROM THONUSER";
            this.rs =  stmt.executeQuery(thonUserSQL); // executeQuery() returns all records in an object, ResultSet
            // ResultSet holds all the records from the database table that we query
            
            while(rs.next())
            {
                String thonUsername = rs.getString("USER_NAME");
                char[] thonPassword = rs.getString("USER_PASSWORD").toCharArray();
                this.theListOfUsers.add(new User(thonUsername, thonPassword));
            }  
        }
        catch(SQLException err)
        {
            System.err.println(err.getMessage());
        }
        
        // check ArrayList<User> was successful
        
        System.out.println();
        System.out.println("FOR TESTING USE. USERNAMES + \" \" + PASSWORD ARE PRINTED.");
        
        for(int i = 0; i < this.theListOfUsers.size(); i++)
        {
            String testUsername = this.theListOfUsers.get(i).getUsername();
            String testPassword = String.valueOf(this.theListOfUsers.get(i).getPassword());
            System.out.println(testUsername + " " + testPassword);
        }
        
    }
    
    public boolean authenticate(String usernameToCheck, char[] passwordToCheck)
    {
        boolean authenticated = false;
        boolean nameMatch = false;
        boolean passwordMatch = false;
        for(int i = 0; i < theListOfUsers.size(); i++)
        {
            nameMatch = usernameToCheck.equals(theListOfUsers.get(i).getUsername());
            passwordMatch = String.valueOf(passwordToCheck).equals(String.valueOf(theListOfUsers.get(i).getPassword()));
            if(nameMatch && passwordMatch)
            {
                authenticated = true;
                break;
            }
        }
        return authenticated;
    }
}