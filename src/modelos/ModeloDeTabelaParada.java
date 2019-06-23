package modelos;

import auxiliar.Parada;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloDeTabelaParada extends AbstractTableModel{
    private final ArrayList<Parada> rows;
    private final String columns[];

    public ModeloDeTabelaParada(ArrayList<Parada> rows) {
        this.columns = new String[] {"ENDEREÇO","ID","QNT. DE VEÍCULOS","LATITUDE","LONGITUDE"};
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
            case 2: 
                return Integer.class;
            case 3:case 4:
                return Float.class;
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
        Parada parada = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        
        switch(atributo){
            case "ENDEREÇO":
                return parada.getEndereco();
            case "ID":
                return parada.getId();
            case "QNT. DE VEÍCULOS":
                return parada.getnVeiculos();
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
            case "LATITUDE":
                parada.setLatitude(tratarErroFloat(parada.getLatitude(),value));
                break;
            case "LONGITUDE":
                parada.setLongitude(tratarErroFloat(parada.getLongitude(),value));
                break;
            default:
                break;
        }
        fireTableCellUpdated(rowIndex,columnIndex);
    }
    
    public float tratarErroFloat(float valorAnterior, Object value){
        try{
            return Float.parseFloat(String.valueOf(value));
        }catch(NumberFormatException e){
            return valorAnterior;
        }
    }
}
