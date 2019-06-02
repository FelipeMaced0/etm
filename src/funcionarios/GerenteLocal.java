package funcionarios;

import etm.ETM;

public class GerenteLocal extends Gerente{
    private final String erroBusca = "NÃO ENCONTRADO";
    private final String erroContratacao = "JÁ POSSUE CADASTRO";
    private final String contratado = "CADASTRO EFETUADO COM SUCESSO";
    private final String demitido = "DESCADASTRADO COM SUCESSO";
    
    public GerenteLocal(){
    }
    
    public GerenteLocal(String nome,String cpf, String ctps, String sexo,int idade,int cargaHoraria, float salario){
        super(nome,cpf,ctps,sexo,idade,cargaHoraria,salario);
    }

    public GerenteLocal(String nome, String cpf, ETM etm) {
        super(nome, cpf, etm);
    }

    public static boolean isContratado(Object [] array, Object procurado, int proxPL){
        for(int i=0; i<proxPL; i++){
            if(array[i].equals(procurado)){
                return true;
            }
        }
        return false;
    }
    
    public void  contratarFucionario(Funcionario nFuncionario){
        etm.cadastrarFuncionario(nFuncionario);
    }
    
    public void demitirFuncionario(String cpf){
        Funcionario fun;
        fun = etm.buscarFuncionario(cpf);
        etm.descadastrarFucionario(fun);
    }
    
    public Funcionario buscarFuncionario(String cpf){
        return etm.buscarFuncionario(cpf);
    }
}