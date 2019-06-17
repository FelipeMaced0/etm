package Relatorios;

import java.util.Objects;

public class Relatorio {
    private int nRelatorio;
    private String id;
    
    public Relatorio(){
    } 
    
    public Relatorio(int nRelatorio){
        this.nRelatorio = nRelatorio;
    }
    
    public Relatorio(int nRelatorio, String id){
        this.nRelatorio = nRelatorio;
        this.id = id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setnRelatorio(int nRelatorio) {
        this.nRelatorio = nRelatorio;
    }
    
    public String getId() {
        return id;
    }
    
    public int getnRelatorio() {
        return nRelatorio;
    }

    
    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof Relatorio){
                if(((Relatorio)obj).id.equals(this.id)){
                    return true;
                }
                
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        return hash;
    }
}
