package funcionarios;

import etm.ETM;

public class GerenteRegional extends Gerente{
    
    public GerenteRegional(){
    }
    
    public GerenteRegional(String nome,String cpf, String ctps, String sexo,int idade,int cargaHoraria, float salario, ETM etm){
        super(nome,cpf,ctps,sexo,idade,cargaHoraria,salario,etm);      
    }
    
    public GerenteRegional(String nome, String cpf, ETM etm) {
        super(nome, cpf, etm);
    }
}