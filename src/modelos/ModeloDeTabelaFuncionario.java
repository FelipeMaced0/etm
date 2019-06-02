package modelos;

import funcionarios.Funcionario;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;


public class ModeloDeTabelaFuncionario extends AbstractTableModel{
    private final ArrayList<Funcionario> rows;
    private final String [] columns = new String [] {"NOME","CPF","CTPS","SALÁRIO"};
    public ModeloDeTabelaFuncionario(ArrayList<Funcionario> funcionarios) {
        this.rows = funcionarios;
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
            case 0:case 1:case 2:
                return String.class;
            case 3:
                return Float.class;
                
        }
        return null;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Funcionario fun = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        switch(atributo){
            case "NOME":
                return fun.getNome();
            case "CPF":
                return fun.getCpf();
            case "CTPS":
                return fun.getCtps();
            case "SALÁRIO":
                return fun.getSalario();
            default:
                return "NÃO ENCONTRADO";
        }
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex){
        Funcionario fun = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        switch(atributo){
            case "NOME":
                fun.setNome(String.valueOf(value));
                break;
            case "CPF":
                fun.setCpf(String.valueOf(value));
                break;
            case "CTPS":
                fun.setCtps(String.valueOf(value));
            case "SALÁRIO":
                if(value instanceof Float){
                    fun.setSalario(Float.parseFloat(atributo));
                }
                break;
            default:
                break;
        }
        fireTableCellUpdated(rowIndex,columnIndex);
        
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}