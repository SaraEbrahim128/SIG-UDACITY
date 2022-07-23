/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MUSLIM
 */
public class INVHEADERTABLEModel extends AbstractTableModel{

    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public int getColumnCount() {
        return 3;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return "Welcome";
    }
    
}
