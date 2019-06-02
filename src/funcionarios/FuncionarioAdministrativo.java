package funcionarios;

import etm.ETM;

public class FuncionarioAdministrativo extends Funcionario {
    protected ETM etm;
    
    public FuncionarioAdministrativo() {
    }

    public FuncionarioAdministrativo(String nome, String cpf, String ctps, String sexo, int idade, int cargaHoraria, float salario) {
        super(nome, cpf, ctps, sexo, idade, cargaHoraria, salario);
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
