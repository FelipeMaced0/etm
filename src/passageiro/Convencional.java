package passageiro;

import java.util.Calendar;

public class Convencional extends CartaoMag{

    public Convencional() {
    }

    public Convencional(String nome, String nCartao, boolean autorizado, float creditos, int nIntegracoes, Calendar dataUltimoUso) {
        super(nome, nCartao, autorizado, creditos, nIntegracoes, dataUltimoUso);
    }

    public Convencional(String nome, String nCartao, boolean autorizado) {
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