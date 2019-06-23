package modelos;

import Relatorios.RelatorioRota;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloDeTabelaRelatorioRota extends AbstractTableModel{
    private final ArrayList<RelatorioRota> rows;
    private final String  columns [];

    public ModeloDeTabelaRelatorioRota(ArrayList<RelatorioRota> rows) {
        this.rows = rows;
        columns = new String [] {"ID ROTA", "FUNCIONÁRIOS", "COMBUSTÍVEL",
            "INTEGRAÇÃO", "IDOSOS", "ESTUDANTES", "CONVENCIONAL"};
    }
    
    public ModeloDeTabelaRelatorioRota() {
        this.rows = new ArrayList();
        columns = new String [] {"ID ROTA", "FUNCIONÁRIOS", "COMBUSTÍVEL",
            "INTEGRAÇÃO", "IDOSOS", "ESTUDANTES", "CONVENCIONAL"};
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
        RelatorioRota relatorio = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        switch(atributo){
            case "ID VEÍCULO":
                return relatorio.getRota().getId();
            case "FUNCIONÁRIOS":
                return relatorio.getCustoFuncionario();
            case "COMBUSTÍVEL":
                return relatorio.getCustoCombustivel();
            case "INTEGRAÇÃO":
                return relatorio.getCustoIntegracao();
            case "IDOSOS":
                return relatorio.getCustoIdosos();
            case "ESTUDANTES":
                return relatorio.getCustoEstudantes();
            case "CONVENCIONAL":
                return relatorio.getCustoConvencional();
            default:
                return "NÃO ENCONTRADO";
        }
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex){
    }
}
