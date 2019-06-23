package funcionarios;

import auxiliar.Escala;

public class Motorista extends FuncionarioOperacional{
    float distanciaPercorrida;
    
    public Motorista(){   
    }

    public Motorista(String nome, String cpf, String ctps, String sexo, int idade, int cargaHoraria, float salario) {
        super(nome, cpf, ctps, sexo, idade, cargaHoraria, salario);
    }
    
    public Motorista(String nome,String cpf, String ctps, String sexo,int idade,int cargaHoraria, float salario, Escala escala){
        super(nome,cpf,ctps,sexo,idade,cargaHoraria,salario,escala);
    }
    
    public Motorista(String cpf) {
        super(cpf);
    }
    
    public void setDistanciaPercorrida(float distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
    
    
}
