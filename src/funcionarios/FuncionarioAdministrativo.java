package funcionarios;

import etm.ETM;

public abstract class FuncionarioAdministrativo extends Funcionario {
    
    protected ETM etm;
    
    public FuncionarioAdministrativo() {
    }

    public FuncionarioAdministrativo(String nome, String cpf, String ctps, String sexo, int idade, int cargaHoraria, float salario, ETM etm) {
        super(nome, cpf, ctps, sexo, idade, cargaHoraria, salario);
        this.etm = etm;
    }

    public FuncionarioAdministrativo(String nome, String cpf, ETM etm) {
        super(nome, cpf);
        this.etm = etm;
    }
    
    public void setEtm(ETM etm){
        this.etm = etm;
    }
    
    public ETM getEtm(){
        return etm;
    }
}
