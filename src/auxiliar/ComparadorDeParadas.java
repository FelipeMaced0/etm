package auxiliar;

import java.util.Comparator;

public class ComparadorDeParadas implements Comparator<Parada>{

    public ComparadorDeParadas() {
    }
    
    @Override
    public int compare(Parada p1, Parada p2){
       if(p1.getnVeiculos()>p2.getnVeiculos()){
            return 1;
        }
        if(p1.getnVeiculos()<p2.getnVeiculos()){
            return -1;
        }
        return 0;
    }
}