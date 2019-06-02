package auxiliar;

import funcionarios.Cobrador;
import funcionarios.Motorista;
import java.util.Calendar;

public class Escala {
    Cobrador cobrador;
    Motorista motorista;
    String [] diaString = {"DOMINGO","SEGUNDA-FEIRA","TERÇA-FEIRA","QUARTA-FEIRA","QUINTA-FEIRA","SEXTA-FEIRA","SÁBADO"};
    Calendar [] dias;
    String [] horarios;
    int proxPLd;
    public Escala(){
        dias = new Calendar[7];
        horarios = new String[7];
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public void setCobrador(Cobrador cobrador){
        this.cobrador = cobrador;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public Cobrador getCobrador() {
        return cobrador;
    }
    
    public void adicionarHorario(Calendar data, String nHorario){
        horarios[data.get(Calendar.DAY_OF_WEEK)-1] = nHorario;
        dias[data.get(Calendar.DAY_OF_WEEK)-1] = data;
    }
    
    public void retirarHorario(Calendar data){
        horarios[data.get(Calendar.DAY_OF_WEEK)-1] = "";
    }
    public Calendar [] getDatas(){
        return dias;
    }
    @Override
    public String toString(){
        String diasEhorarios="";
        for(int i=0;i<7;i++){
            if(horarios[i] != null){
                if(!horarios[i].equals("")){
                    diasEhorarios += "DATA: "+dias[i].get(Calendar.DAY_OF_MONTH)+"/"+(dias[i].get(Calendar.MONTH)+1)+"/"+dias[i].get(Calendar.YEAR)+"\nDIA DA SEMANA: "+diaString[dias[i].get(Calendar.DAY_OF_WEEK)-1]+"\nHORÁRIO: "+horarios[i];
                }
            }
            
        }
        return diasEhorarios;
    }
}
