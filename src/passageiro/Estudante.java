package passageiro;

import java.util.Calendar;

public class Estudante extends CartaoMag{

    public Estudante() {
    }

    public Estudante(String nome, boolean autorizado, float creditos, int nIntegracoes, Calendar dataUltimoUso) {
        super(nome, autorizado, creditos, nIntegracoes, dataUltimoUso);
    }

    public Estudante(String nome, String nCartao, boolean autorizado) {
        super(nome, nCartao, autorizado);
    }
    
    @Override
    public boolean cobrarPassagem(float tarifa){
        if(autorizado && creditos>=(tarifa/2)){
            creditos -= (tarifa/2);
            return true;
        }
        return false;
    }
}