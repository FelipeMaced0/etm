package Relatorios;

import java.util.Calendar;

public class RelatorioPorPeriodo extends RelatorioCustoDiario{
    Calendar dataInicial;
    Calendar dataFinal;
    public RelatorioPorPeriodo() {
    }

    public RelatorioPorPeriodo(Calendar dataInicial, Calendar dataFinal, String id, String rasaoRelatada, int nRelatorio, float custoCombustivel, float custoFuncionarios, float custoManutencao, float custoIdosos, float custoIntegracao, float custoEstudantes, float receita, int nPassageiros) {
        super(id, rasaoRelatada, nRelatorio, custoCombustivel, custoFuncionarios, custoManutencao, custoIdosos, custoIntegracao, custoEstudantes, receita, nPassageiros);
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }    

    public RelatorioPorPeriodo(Calendar dataInicial, Calendar dataFinal, String id, String rasaoRelatada, Calendar data, int nRelatorio, float custoTotal, float receita) {
        super(id, rasaoRelatada, data, nRelatorio, custoTotal, receita);
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public static String mostrarDatas(Calendar data){
        return data.get(Calendar.DAY_OF_MONTH)+"/"+(data.get(Calendar.MONTH)+1)+"/"+data.get(Calendar.YEAR);
    }
    
    @Override
    public String toString() {
        String relatorio = "PERÍODO: "+mostrarDatas(dataInicial) + " - " + mostrarDatas(dataFinal)+"\n\n";
        if(custoCombustivel>0){
            relatorio += "COMBUSTÍVEL: "+custoCombustivel;
        }
        else if(custoFuncionarios>0){
            relatorio += "FUNCIONÁRIOS: "+custoFuncionarios;
        }
        else if(custoManutencao>0){
            relatorio += "MANUTENÇÃO: "+custoManutencao;
        }
        else if(custoIdosos>0){
            relatorio += "GRATUIDADE PARA IDOSOS: "+custoIdosos;
        }
        else if(custoIntegracao>0){
            relatorio += "INTEGRAÇÃO: "+custoIntegracao;
        }
        else if(custoEstudantes>0){
            relatorio += "GRATUIDADE PARA ESTUDANTES: "+custoIntegracao;
        }
        else if(receita>0){
            relatorio += "RECEITA: "+receita;
        }
        else if(receita>0&&custoTotal>0){
            if(receita>custoTotal){
                relatorio += "LUCRO: "+(receita-custoTotal);
            }
            else if(receita<custoTotal){
                relatorio += "PREJUÍZO: "+(custoTotal-receita);
            }
            
        }
        return relatorio;
    }
    
}