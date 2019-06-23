package auxiliar;


public class Escala{
    String [] diaString = {"DOMINGO","SEGUNDA-FEIRA","TERÇA-FEIRA","QUARTA-FEIRA","QUINTA-FEIRA","SEXTA-FEIRA","SÁBADO"};
    boolean [] dias;

    public Escala(){
        dias = new boolean[7];
    }
    public Escala(boolean dias []){
        this.dias = dias;
    }
    
    public boolean [] getEscala(){
        return dias;
    }
}
