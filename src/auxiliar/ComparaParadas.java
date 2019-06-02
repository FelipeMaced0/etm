package auxiliar;

import java.util.Comparator;

public class ComparaParadas implements Comparator{

    @Override
    public int compare(Object obj1, Object obj2){
       if(((Parada)obj1).getnVeiculos()<((Parada)obj2).getnVeiculos()){
            return 1;
        }
        if(((Parada)obj1).getnVeiculos()>((Parada)obj2).getnVeiculos()){
            return -1;
        }
        return 0;
    }
}