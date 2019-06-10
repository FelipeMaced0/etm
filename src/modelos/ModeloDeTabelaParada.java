package modelos;

import auxiliar.Parada;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloDeTabelaParada extends AbstractTableModel{
    private final ArrayList<Parada> rows;
    private final String columns[];

    public ModeloDeTabelaParada(ArrayList<Parada> rows) {
        this.columns = new String[] {"ENDEREÇO","ID","LATITUDE","LONGITUDE"};
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
            case 0: case 1:
                return String.class;
            case 2: case 3:
                return Float.class;
            default:
                return null;
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return columnIndex != 1;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Parada parada = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        
        switch(atributo){
            case "ENDEREÇO":
                return parada.getEndereco();
            case "ID":
                return parada.getId();
            case "LATITUDE":
                return parada.getLatitude();
            case "LONGITUDE":
                return parada.getLongitude();
            default:
                return null;
        }
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex){
        Parada parada = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        
        switch(atributo){
            case "ENDEREÇO":
                parada.setEndereco(String.valueOf(value));
                break;
            case "ID":
                parada.setId(String.valueOf(value));
                break;
            case "LATITUDE":
                parada.setLatitude(Float.parseFloat((String)value));
                break;
            case "LONGITUDE":
                parada.setLatitude(Float.parseFloat((String)value));
                break;
            default:
                break;
        }
        fireTableCellUpdated(rowIndex,columnIndex);
    }
    
}
