package auxiliar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class GeradorDeId {
    ArrayList<String> idsEmUso;
    final int NUMPOSSIBILIDADES;
    public GeradorDeId() {
        NUMPOSSIBILIDADES = 1757600;
        idsEmUso = new ArrayList();
    }
    
    public String gerarId(){
        String nId="";
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
        Random nRandomico = new Random();
        while(idsEmUso.size()<NUMPOSSIBILIDADES){
            for(int j=0;j<5;j++){
                if(j<3){
                    nId += alfabeto.charAt(nRandomico.nextInt(26));
                    
                }
                else{
                    if(j<4){
                        nId += "-";
                    }
                    nId += nRandomico.nextInt(10);
                }
            }
            if(idsEmUso.contains(nId)){
            }
            else{
                adicionarId(nId);
                return nId;
            }
        }
        return null;
    }
    
    public String buscarId(String id){
        return idsEmUso.get(idsEmUso.indexOf(id));
    }
    
    public void adicionarId(String nId){
        idsEmUso.add(nId);
    }
    
    public void removerId(String id){
       idsEmUso.remove(id);
    }
    
    @Override
    public String toString(){
        String ids="[";
        Iterator<String> i = idsEmUso.iterator();
        String id;
        while(i.hasNext()){
            id = i.next();
            ids += id+", ";
        }
        ids += "]";
        return ids;
    }   
    
    public static void main(String [] args){
        GeradorDeId i = new GeradorDeId();
        String d;
        i.adicionarId(i.gerarId());
        i.adicionarId(i.gerarId());
        i.adicionarId(i.gerarId());
        System.out.println(i.toString());
    }
}