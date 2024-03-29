package funcionarios;

import auxiliar.Parada;
import Relatorios.RelatorioPorPeriodo;
import Relatorios.RelatorioRota;
import Relatorios.RelatorioVeiculo;
import auxiliar.Rota;
import etm.ETM;
import java.util.ArrayList;
import java.util.Calendar;
import veiculos.Veiculo;

public class GestorDeFrota extends FuncionarioAdministrativo{
    
    public GestorDeFrota(){ 
    }
    
    public GestorDeFrota(String nome,String cpf, String ctps, String sexo,int idade,int cargaHoraria, float salario, ETM etm){
        super(nome,cpf,ctps,sexo,idade,cargaHoraria,salario,etm);
    }

    public GestorDeFrota(String nome, String cpf, ETM etm) {
        super(nome, cpf, etm);
    }
    
    public void cadastrarVeiculo(Veiculo nVeiculo){
        etm.cadastrarVeiculo(nVeiculo);
    }
    
    public void cadastrarRota(Rota nRota){
       etm.cadastrarRota(nRota);
    }
    
    public void cadastrarParada(Parada nParada){
        etm.cadastrarParada(nParada);
    }
    
    public void cadastrarVeiculoEmRota(String idRota, String idVeiculo){
        etm.alocarVeiculo(idRota, idVeiculo);
    }
    
    public void cadastrarParadaEmRota(String idrota, String idParada){
        etm.alocarParada(idrota, idParada);
    }
    
    public void descadastrarVeiculo(String id){
        etm.descadastrarVeiculo(id);
    }   
    
    public void descadastrarRota(String id){
        etm.descadastrarRota(id);
    }

    public void descadastrarParada(String id){
        etm.descadastrarParada(id);
    }
    
    public Object buscarVeiculo(String id){
       return etm.buscarVeiculo(id);
    }
    
    public Object buscarRota(String id){
        return etm.buscarRota(id);
    }
    
    public Object buscarFuncionario(String id){
        return etm.buscarFuncionario(id);
    }

    public ArrayList getVeiculosCadastrados(){
        return etm.getVeiculosCadastrados();
    }
    
    public ArrayList getRotasCadastradas(){
        return etm.getRotasCadastradas();
    }
    
    public Rota getEnderecos(String idRota){
        return etm.getEnderecos(idRota);
    }
    
    public ArrayList gerarRelatorioFuncionario(String sexo, String funcao,int idade, int cargaHoraria, float renda){
        
        return etm.gerarRelatorioFuncionario(sexo, funcao, idade, cargaHoraria, renda);
    }
    
    public RelatorioVeiculo gerarRelatorioDeCustoVeiculo(String idVeiculo){
        return etm.gerarRelatorioDeCustoVeiculo(idVeiculo);
    }
    
    public RelatorioRota gerarRelatorioDeCustoRota(String idRota){
        return etm.gerarRelatorioDeCustoRota(idRota);
    }
    
    public void balancoDoDia(){
        etm.BalancoDodia();
    }
    
    public RelatorioPorPeriodo relatorioPorPeriodoFuncionarios(Calendar dataInicial, Calendar dataFinal){
        return etm.relatorioPorPeriodoFuncionarios(dataInicial, dataFinal);
    }
    
    public String calcularTarifaIdeal(float percentDeLucro, String tipoDeVeiculo){
        return etm.calcularTarifaIdeal(percentDeLucro,tipoDeVeiculo);
    }
    
    public String calcularTarifaIdealTveiculos(float percentDeLucro){
        return etm.calcularTarifaIdealTveiculos(percentDeLucro);
    }
    
    public ArrayList<Parada> getUsoDosPontos(int ordem){
        return etm.getUsoDosPontos(ordem);
    }
    
    public double calcularDistancia(String idP1, String idP2){
        return etm.calcularDistancia(idP1, idP2);
    }
}