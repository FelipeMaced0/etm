package passageiro;

import java.util.Calendar;

public class Idoso extends CartaoMag{

    public Idoso() {
    }

    public Idoso(String nome,  boolean autorizado, float creditos, int nIntegracoes, Calendar dataUltimoUso) {
        super(nome, autorizado, creditos, nIntegracoes, dataUltimoUso);
    }

    public Idoso(String nome, String nCartao, boolean autorizado) {
        super(nome, nCartao, autorizado);
    }
    
    @Override
    public boolean cobrarPassagem(float tarifa){
        if(autorizado && creditos>=tarifa){
            creditos -= tarifa;
            return true;
        }
        return false;
    }
}