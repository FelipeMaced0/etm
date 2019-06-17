package modelos;

import Relatorios.RelatorioVeiculo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloDeTabelaRelatorioVeiculo extends AbstractTableModel{
    private final ArrayList<RelatorioVeiculo> rows;
    private final String  columns [];

    public ModeloDeTabelaRelatorioVeiculo(ArrayList<RelatorioVeiculo> rows) {
        this.rows = rows;
        columns = new String [] {"ID VEÍCULO", "CUSTO FUNCIONÁRIOS", "CUSTO COMBUSTÍVEL",
            "CUSTO INTEGRAÇÃO", "CUSTO IDOSOS", "CUSTO ESTUDANTES", "CUSTO CONVENCIONAL"};
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
            case 0: 
                return String.class;
            case 1: case 2: case 3: case 4:case 5:case 6:
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
        RelatorioVeiculo relatorio = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        switch(atributo){
            case "ID VEÍCULO":
                return relatorio.getVeiculo().getId();
            case "CUSTO FUNCIONÁRIOS":
                return relatorio.getCustoFuncionario();
            case "CUSTO COMBUSTÍVEL":
                return relatorio.getCustoCombustivel();
            case "CUSTO INTEGRAÇÃO":
                return relatorio.getCustoIntegracao();
            case "CUSTO IDOSOS":
                return relatorio.getCustoIdosos();
            case "CUSTO ESTUDANTES":
                return relatorio.getCustoEstudante();
            case "CUSTO CONVENCIONAL":
                return relatorio.getCustoConvencional();
            default:
                return "NÃO ENCONTRADO";
        }
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex){
    }
}
