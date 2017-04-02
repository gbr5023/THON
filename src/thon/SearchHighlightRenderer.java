/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thon;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gisward
 */
public class SearchHighlightRenderer extends DefaultTableCellRenderer
{
    @Override
    public Component getTableCellRendererComponent(JTable organizationTable, Object orgToHighlight, boolean isSelected, boolean hasFocus, int row, int column) {

        // everything as usual
        super.getTableCellRendererComponent(organizationTable, orgToHighlight, isSelected, hasFocus, row, column);

        // added behavior
        if (row == organizationTable.getSelectedRow()) {

            // this will customize that kind of border that will be use to highlight a row
            setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, Color.BLACK));
        }

        return this;
    }
}
