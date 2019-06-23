package modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import veiculos.Veiculo;


public class ModeloDeTabelaVeiculo extends AbstractTableModel{
    private final ArrayList<Veiculo> rows;
    private final String columns[];

    public ModeloDeTabelaVeiculo(ArrayList<Veiculo> rows) {
        this.columns = new String[] {"ID","STATUS","TIPO","COMBUSTÍVEL","AUTONOMIA", "CAPACIDADE"};
        this.rows = rows;
    }
    
    public ModeloDeTabelaVeiculo() {
        this.columns = new String[] {"ID","STATUS","TIPO","COMBUSTÍVEL","AUTONOMIA", "CAPACIDADE"};
        this.rows = new ArrayList();
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
            case 0: case 1:case 2:case 3:
                return String.class;
            case 4: 
                return Float.class;
            case 5:
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
        Veiculo veiculo = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        
        switch(atributo){
            case "ID":
                return veiculo.getId();
            case "STATUS":
                return veiculo.getStatus();
            case "TIPO":
                return veiculo.getTipoDeVeiculo();
            case "COMBUSTÍVEL":
                return veiculo.getCombustivel();
            case "AUTONOMIA":
                return veiculo.getAutonomia();
            case "CAPACIDADE":
                return veiculo.getCapacidade();
            default:
                return null;
        }
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex){
    }
}
