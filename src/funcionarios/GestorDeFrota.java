package funcionarios;

import auxiliar.Parada;
import auxiliar.RelatorioPorPeriodo;
import auxiliar.Rota;
import etm.ETM;
import java.util.ArrayList;
import java.util.Calendar;
import veiculos.Veiculo;

public class GestorDeFrota extends FuncionarioAdministrativo{
    
    public GestorDeFrota(){ 
    }
    
    public GestorDeFrota(String nome,String cpf, String ctps, String sexo,int idade,int cargaHoraria, float salario){
        super(nome,cpf,ctps,sexo,idade,cargaHoraria,salario);
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
    
    public void cadastrarVeiculoEmRota(String idRota, Veiculo veiculo){
        etm.cadastrarVeiculoEmRota(idRota, veiculo);
    }
    
    public void cadastrarParadaEmRota(String idrota, Parada parada){
        etm.cadastrarParadaEmRota(idrota, parada);
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
    
    public ArrayList gerarRelatorioFuncionario(String sexo,int idade,float cargaHoraria, float renda){
        
        return etm.gerarRelatorioFuncionario(sexo,idade, cargaHoraria, renda);
    }
    
    public String gerarRelatorioDeCustoVeiculo(String idVeiculo){
        return etm.gerarRelatorioDeCustoVeiculo(idVeiculo);
    }
    
    public String gerarRelatorioDeCustoRota(String idRota){
        return etm.gerarRelatorioDeCustoRota(idRota);
    }
    
    public void balancoDoDia(){
        etm.BalancoDodia();
    }
    
    public String mostrarRelatoriosDiarios(){
        return etm.mostrarRelatoriosDiarios();
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
    
    public String getUsoDosPontos(int ordem){
        return etm.getUsoDosPontos(ordem);
    }
    
    public double calcularDistancia(String idRota,Parada p1, Parada p2){
        return etm.calcularDistancia(idRota, p1, p2);
    }
}