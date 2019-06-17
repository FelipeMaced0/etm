package Relatorios;

import auxiliar.Rota;
import java.util.ArrayList;
import java.util.Iterator;

public class RelatorioRota extends Relatorio{
    private ArrayList<RelatorioVeiculo> relatorios;
    private Rota rota;
    private float custoFuncionario;
    private float custoCombustivel;
    private float custoConvencional;
    private float custoIdosos;
    private float custoEstudantes;
    private float custoManutencao;
    private float custoIntegracao;
    
    public RelatorioRota() {
    }

    public RelatorioRota(Rota rota, float custoFuncionario, float custoCombustivel) {
        this.custoFuncionario = custoFuncionario;
        this.custoCombustivel = custoCombustivel;
        this.rota = rota;
    }
    
    public RelatorioRota(Rota rota, int nRelatorio, String id, float custoFuncionario, float custoCombustivel) {
        super(nRelatorio, id);
        this.custoFuncionario = custoFuncionario;
        this.custoCombustivel = custoCombustivel;
        this.rota = rota;
    }

    public ArrayList<RelatorioVeiculo> getRelatorios() {
        return relatorios;
    }

    public Rota getRota() {
        return rota;
    }

    public float getCustoFuncionario() {
        return custoFuncionario;
    }

    public float getCustoCombustivel() {
        return custoCombustivel;
    }

    public float getCustoConvencional() {
        return custoConvencional;
    }

    public float getCustoIdosos() {
        return custoIdosos;
    }

    public float getCustoEstudantes() {
        return custoEstudantes;
    }

    public float getCustoManutencao() {
        return custoManutencao;
    }

    public float getCustoIntegracao() {
        return custoIntegracao;
    }
    
    
    public void setCustos(RelatorioVeiculo relatorio){
        custoFuncionario = relatorio.getCustoFuncionario();
        custoCombustivel = relatorio.getCustoCombustivel();
        custoConvencional = relatorio.getCustoConvencional();
        custoIdosos = relatorio.getCustoIdosos();
        custoEstudantes = relatorio.getCustoEstudante();
        custoManutencao = relatorio.getCustoManutencao();
        custoIntegracao = relatorio.getCustoIntegracao();
    }
    
    public void cadastrarRelatorio(RelatorioVeiculo relatorio){
        
        if(relatorios.add(relatorio)){
            setCustos(relatorio);
        }
    }
     
    public void descadastrarRelatorio(String idRelatorio){
        RelatorioVeiculo relatorio = buscarRelatorio(idRelatorio);
        if(relatorio != null){
            relatorios.remove(relatorio);
        }
    }
    
    public RelatorioVeiculo buscarRelatorio(String idRelatorio){
        Iterator<RelatorioVeiculo> i = relatorios.iterator();
        RelatorioVeiculo relatorio;
        while(i.hasNext()){
            relatorio = i.next();
            if(relatorio.getId().equals(idRelatorio)){
                return relatorio;
            }
        }
        return null;
    }
}
