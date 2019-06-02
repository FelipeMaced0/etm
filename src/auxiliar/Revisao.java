package auxiliar;

import java.util.Calendar;
import oficina.Oficina;

public class Revisao {
    Calendar data;
    Oficina oficina;

    public Revisao(Calendar data, Oficina oficina) {
        this.data = data;
        this.oficina = oficina;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public String getData() {
        return data.get(Calendar.DAY_OF_MONTH)+"/"+data.get(Calendar.MONTH)+"/"+data.get(Calendar.YEAR);
    }

    public Oficina getOficina() {
        return oficina;
    }
    
}