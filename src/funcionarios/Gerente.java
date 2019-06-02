package funcionarios;

import etm.ETM;

public class Gerente extends FuncionarioAdministrativo {
    
    public Gerente(){
    }
    
    public Gerente(String nome,String cpf, String ctps, String sexo,int idade,int cargaHoraria, float salario){
        super(nome,cpf,ctps,sexo,idade,cargaHoraria,salario);
        
    }

    public Gerente(String nome, String cpf, ETM etm) {
        super(nome, cpf, etm);
    }
    
    
}