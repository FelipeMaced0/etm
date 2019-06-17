package modelos;

import auxiliar.Rota;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloDeTabelaRota extends AbstractTableModel{
    private final ArrayList<Rota> rows;
    private final String columns[];

    public ModeloDeTabelaRota(ArrayList<Rota> rows) {
        this.columns = new String[] {"NOME","ID","Nº DE VEÍCULOS","Nº DE PARADAS"};
        this.rows = rows;
    }
    
    @Override
    public int getRowCount(){
        return rows.size();
    } 
    
    @Override
    public int getColumnCount(){
        return columns.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        switch(columnIndex){
            case 0: case 1:case 3:
                return String.class;
            case 2: 
                return Integer.class;
            default:
                return null;
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Rota rota = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        
        switch(atributo){
            case "NOME":
                return rota.getNome();
            case "ID":
                return rota.getId();
            case "Nº DE VEÍCULOS":
                return rota.getnVeiculos();
            case "Nº DE PARADAS":
                return rota.getnParadas();
            default:
                return null;
        }
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex){
        Rota rota = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        
         switch(atributo){
            case "NOME":
                rota.setNome(String.valueOf(value));
                break;
            default:
               break;
        }
        fireTableCellUpdated(rowIndex,columnIndex);
    }
    
}