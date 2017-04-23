package thon;

import javax.swing.JFrame;

/**
 *
 * @author Gisward
 */
public class THONPassCntl 
{
    THONPassUI theTHONPassUI;
    NavigationCntl parentNavigationCntl;
    CurrentCapacityUpdater theCurrentCapacityUpdater;
    int currentCapacity;
    
    /*
    controller classes now have the sole ability to instantiate model classes and
    only one instance of that particular model class.
    (for example -> creation of SpaceList and OrganizationList model classes).
    This ensures that when the table models are updated, the arraylists in those
    model classes are not instantiated another time.
    */
    public THONPassCntl()
    {
        System.out.println("THONPassCntl instantiated");
        theCurrentCapacityUpdater = new CurrentCapacityUpdater();
    }
    
    public void setNavigationCntl(NavigationCntl newParentNavigationCntl)
    {
        System.out.println("Made it to the THONPassCntl");
        parentNavigationCntl = newParentNavigationCntl;
        this.requestTHONPassUI();
    }
    
    public void requestTHONPassUI()
    {
        theTHONPassUI = new THONPassUI(this);
        theTHONPassUI.pack();
        theTHONPassUI.setTitle("THONPass");
        theTHONPassUI.setLocationRelativeTo(null);
        theTHONPassUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theTHONPassUI.setVisible(true);
    }
    
    public int getCurrentCapacity()
    {
        currentCapacity = theCurrentCapacityUpdater.getCurrentCapacity();
        return currentCapacity;
    }
}
