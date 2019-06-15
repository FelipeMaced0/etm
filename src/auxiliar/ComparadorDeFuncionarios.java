package auxiliar;

import funcionarios.Funcionario;
import java.util.Comparator;


public class ComparadorDeFuncionarios implements Comparator<Funcionario>{

    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        String nome1;
        String nome2;
        int indexInicial1=0;
        int indexFinal1=0;
        int indexInicial2=0;
        int indexFinal2=0;
        
        while(indexFinal1!=o1.getNome().length()-1){
            
            indexFinal1 = o1.getNome().indexOf(" ");
            indexFinal2 = o2.getNome().indexOf(" ");
            if(indexFinal1==-1){
                indexFinal1 = o1.getNome().length()-1;
            }
            if(indexFinal2==-1){
                indexFinal2 = o2.getNome().length()-1;
            }
            
            nome1 = o1.getNome().substring(indexInicial1, indexFinal1);
            nome2 = o2.getNome().substring(indexInicial2, indexFinal2);
            
            for(int i=0;i<nome1.length();i++){
                if(nome1.charAt(i)>nome2.charAt(i)){
                    return 1;
                
                }
                if(nome1.charAt(i)<nome2.charAt(i)){
                     return -1;
                }
            }
            indexInicial1 =  indexFinal1+1;
            indexInicial2 =  indexFinal2+1;
        }
        return 0;
    }
    
}
