package passageiro;

import java.util.Calendar;

public class Normal extends CartaoMag{

    public Normal() {
    }

    public Normal(String nome, String nCartao, boolean autorizado, float creditos, int nIntegracoes, Calendar dataUltimoUso) {
        super(nome, nCartao, autorizado, creditos, nIntegracoes, dataUltimoUso);
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