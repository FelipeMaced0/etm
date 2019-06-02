package passageiro;

import java.util.Calendar;

public class Estundate extends CartaoMag{

    public Estundate() {
    }

    public Estundate(String nome, String nCartao, boolean autorizado, float creditos, int nIntegracoes, Calendar dataUltimoUso) {
        super(nome, nCartao, autorizado, creditos, nIntegracoes, dataUltimoUso);
    }
    
    @Override
    public boolean cobrarPassagem(float tarifa){
        if(autorizado && creditos>=tarifa/2){
            creditos -= tarifa/2;
            return true;
        }
        return false;
    }
}