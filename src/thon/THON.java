package thon;

import thon.controllers.LoginCntl;

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
    }
}
