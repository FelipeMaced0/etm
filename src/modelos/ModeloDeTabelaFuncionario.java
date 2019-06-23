package modelos;

import funcionarios.Funcionario;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloDeTabelaFuncionario extends AbstractTableModel{
    private final ArrayList<Funcionario> rows;
    private final String [] columns;
    
    public ModeloDeTabelaFuncionario(ArrayList<Funcionario> funcionarios) {
        this.rows = funcionarios;
        columns = new String [] {"NOME","IDADE","FUNÇÃO","CPF","CTPS","SALÁRIO"};
    }
    public ModeloDeTabelaFuncionario() {
        this.rows = new ArrayList();
        columns = new String [] {"NOME","IDADE","FUNÇÃO","CPF","CTPS","SALÁRIO"};
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
            case 0: case 2: case 3: case 4:
                return String.class;
            case 1:
                return Integer.class;
            case 5:
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
        Funcionario fun = rows.get(rowIndex);
        String atributo = columns[columnIndex];
        switch(atributo){
            case "NOME":
                return fun.getNome();
            case "IDADE":
                return fun.getIdade();
            case "FUNÇÃO":
                return fun.getFuncao();
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
            case "IDADE":
                fun.setIdade(tratarErroInt(fun.getIdade(), value));
                break;
            case "FUNÇÃO":
                break;
            case "CPF":
                fun.setCpf(String.valueOf(value));
                break;
            case "CTPS":
                fun.setCtps(String.valueOf(value));
            case "SALÁRIO":
                fun.setSalario(tratarErroFloat(fun.getSalario(), value));
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
    
    public int tratarErroInt(int valorAnterior, Object value){
        try{
            return Integer.parseInt(String.valueOf(value));
        }catch(NumberFormatException e){
            return valorAnterior;
        }
    }
}