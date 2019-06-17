package Relatorios;

import auxiliar.Rota;
import java.util.ArrayList;
import java.util.Iterator;

public class RelatorioRota extends Relatorio{
    ArrayList<RelatorioVeiculo> relatorios;
    Rota rota;
    float custoFuncionario;
    float custoCombustivel;

    public RelatorioRota() {
    }

    public RelatorioRota(float custoFuncionario, float custoCombustivel, Rota rota, int nRelatorio, String id) {
        super(nRelatorio, id);
        this.custoFuncionario = custoFuncionario;
        this.custoCombustivel = custoCombustivel;
        this.rota = rota;
    }
    
    public void cadastrarRelatorio(RelatorioVeiculo relatorio){
        custoFuncionario = relatorio.getCustoFuncionario();
        custoCombustivel = relatorio.getCustoCombustivel();
        relatorios.add(relatorio);
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
