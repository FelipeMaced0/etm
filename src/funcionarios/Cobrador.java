package funcionarios;

import auxiliar.Escala;

public class Cobrador extends FuncionarioOperacional{
    int passageirosAtendidos;
    float tarifaNormal;
    
    public void Cobrador(){
    }

    public Cobrador(String nome, String cpf, String ctps, String sexo, int idade, int cargaHoraria, float salario) {
        super(nome, cpf, ctps, sexo, idade, cargaHoraria, salario);
    }
    
    public Cobrador(String nome,String cpf, String ctps, String sexo,int idade,int cargaHoraria, float salario, Escala escala){
        super(nome,cpf,ctps,sexo,idade,cargaHoraria,salario,escala);
    }
    
    public Cobrador(String cpf) {
        super(cpf);
    }

    public void setPassageirosAtendidos(int passageirosAtendidos) {
        this.passageirosAtendidos = passageirosAtendidos;
    }
    public void setTarifaNormal(float tarifaNormal){
        this.tarifaNormal = tarifaNormal;
    }
    public int getPassageirosAtendidos() {
        return passageirosAtendidos;
    }  

    public float getTarifaNormal() {
        return tarifaNormal;
    }
    
    public float getReceita(){
        return passageirosAtendidos*tarifaNormal;
    }
    
    public void zerar(){
        passageirosAtendidos = 0;
    }
}
