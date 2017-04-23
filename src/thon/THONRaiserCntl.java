package thon;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.TableModel;
/**
 *
 * @author Gisward
 */
public class THONRaiserCntl 
{
    THONRaiserUI theTHONRaiserUI;
    NavigationCntl parentNavigationCntl;
    THONRaiserList theTHONRaiserList;
    THONRaiserTableModel theTHONRaiserTableModel;
    ArrayList<Integer> thonraiserRowsFound;

    /*
    controller classes now have the sole ability to instantiate model classes and
    only one instance of that particular model class.
    (for example -> creation of THONRaiserList model classes).
    This ensures that when the table models are updated, the arraylists in those
    model classes are not instantiated another time.
     */
    public THONRaiserCntl() 
    {
        System.out.println("THONRaiserCntl instantiated");
        this.theTHONRaiserList = new THONRaiserList();
    }

    public void setNavigationCntl(NavigationCntl newParentNavigationCntl) {
        System.out.println("Made it to the THONRaiserCntl");
        parentNavigationCntl = newParentNavigationCntl;
        requestTHONRaiserUI();
    }

    public void requestTHONRaiserUI() {
        this.theTHONRaiserUI = new THONRaiserUI(this);
        this.theTHONRaiserUI.pack();
        this.theTHONRaiserUI.setTitle("Space Assignment");
        //this.theTHONRaiserUI.setSize(405, 374);
        this.theTHONRaiserUI.setLocationRelativeTo(null);
        this.theTHONRaiserUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.theTHONRaiserUI.setVisible(true);
    }

    public TableModel getTHONRaiserTableModel() {
        this.theTHONRaiserTableModel = new THONRaiserTableModel(this.theTHONRaiserList);

        return theTHONRaiserTableModel;
    }

    public ArrayList<THONRaiser> getParentTHONRaiserList() {
        return this.theTHONRaiserList.getParentTHONRaiserList();
    }

    /*
    public boolean requestSearchTHONRaiserList(String orgToSearch) {
        boolean searchedOrgFound = this.theOrganizationList.requestSearchOrganizationList(orgToSearch);
        return searchedOrgFound;
    }
*/

    public ArrayList<Integer> getListOfTHONRaiserRowsFound() {
        this.thonraiserRowsFound = this.theTHONRaiserList.getListOfTHONRaiserRowsFound();

        return this.thonraiserRowsFound;
    }
}