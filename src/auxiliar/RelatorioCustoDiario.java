package auxiliar;
import java.util.Calendar;
import java.util.Objects;
public class RelatorioCustoDiario{
    
    String id;
    String rasaoRelatada;
    Calendar data;
    int nRelatorio;
    float custoCombustivel;
    float custoFuncionarios;
    float custoManutencao;
    float custoIdosos;
    float custoIntegracao;
    float custoEstudantes;
    float custoTotal;
    float receita;
    int nPassageirosAtendidos;
    public RelatorioCustoDiario(){
    }

    public RelatorioCustoDiario(String id, String rasaoRelatada,int nRelatorio, float custoCombustivel, float custoFuncionarios, float custoManutencao, float custoIdosos, float custoIntegracao, float custoEstudantes, float receita, int nPassageirosAtendidos) {
        this.id = id;
        this.rasaoRelatada = rasaoRelatada;
        this.data = Calendar.getInstance();
        this.nRelatorio = nRelatorio;
        this.custoCombustivel = custoCombustivel;
        this.custoFuncionarios = custoFuncionarios;
        this.custoManutencao = custoManutencao;
        this.custoIdosos = custoIdosos;
        this.custoIntegracao = custoIntegracao;
        this.custoEstudantes = custoEstudantes;
        this.receita = receita;
        this.nPassageirosAtendidos = nPassageirosAtendidos;
        custoTotal = custoCombustivel+custoFuncionarios+custoManutencao+custoIdosos+custoIntegracao+custoEstudantes;
    }

    public RelatorioCustoDiario(String id, String rasaoRelatada, Calendar data, int nRelatorio, float custoTotal, float receita) {
        this.id = id;
        this.rasaoRelatada = rasaoRelatada;
        this.data = data;
        this.nRelatorio = nRelatorio;
        this.custoTotal = custoTotal;
        this.receita = receita;
    }
 
    public void setId(String id) {
        this.id = id;
    }

    public void setRasaoRelatada(String nRota) {
        this.rasaoRelatada = nRota;
    }

    public void setData(Calendar data) {
        this.data= data;
    }

    public void setnRelatorio(int nRelatorio) {
        this.nRelatorio = nRelatorio;
    }

    public void setCustoCombustivel(float custoCombustivel) {
        this.custoCombustivel = custoCombustivel;
    }

    public void setCustoFuncionarios(float custoFuncionarios) {
        this.custoFuncionarios = custoFuncionarios;
    }

    public void setCustoManutencao(float custoManutencao) {
        this.custoManutencao = custoManutencao;
    }

    public void setCustoIdosos(float custoIdosos) {
        this.custoIdosos = custoIdosos;
    }

    public void setCustoIntegracao(float custoIntegracao) {
        this.custoIntegracao = custoIntegracao;
    }

    public void setCustoEstudantes(float custoEstudantes) {
        this.custoEstudantes = custoEstudantes;
    }

    public void setCustoTotal(float custoTotal) {
        this.custoTotal = custoTotal;
    }

    public void setReceita(float receita) {
        this.receita = receita;
    }

    public void setnPassageiros(int nPassageirosAtendidos) {
        this.nPassageirosAtendidos = nPassageirosAtendidos;
    }
    
    public String getId() {
        return id;
    }

    public String getRasaoRelatada() {
        return rasaoRelatada;
    }

    public int getnRelatorio() {
        return nRelatorio;
    }

    public float getCustoCombustivel() {
        return custoCombustivel;
    }

    public float getCustoFuncionarios() {
        return custoFuncionarios;
    }

    public float getCustoManutencao() {
        return custoManutencao;
    }

    public float getCustoIdosos() {
        return custoIdosos;
    }

    public float getCustoIntegracao() {
        return custoIntegracao;
    }

    public float getCustoEstudantes() {
        return custoEstudantes;
    }
    
    public long getDataEmMilisegundos(){
        return data.getTimeInMillis();
    }
    
    public String getData() {
        return "DATA: "+data.get(Calendar.DAY_OF_MONTH)+"/"+(data.get(Calendar.MONTH)+1)+"/"+data.get(Calendar.YEAR);
    }
    
    public String getInfoEconomia(){
        String informativo="LUCRO: ";
        if(receita<custoTotal){
            informativo = "PREJUÍZO: ";
        }
        return informativo;
    }
    
    public float getEconomia(){
        return receita-custoTotal;
    }
    
    public float getCustoTotal(){
        return custoTotal;
    }
    
    public float getReceita(){
        return receita;
    }

    public int getnPassageirosAtendidos() {
        return nPassageirosAtendidos;
    }
    
    @Override
    public String toString() {
        return "RELATÓRIO Nº: " + nRelatorio +"\nTIPO DE RELATÓRIO: "+rasaoRelatada+"\nID: " + id + "\nDATA: " + data.get(Calendar.DAY_OF_MONTH) + "/" + (data.get(Calendar.MONTH)+1) + "/" 
                +data.get(Calendar.YEAR) + "\nCUSTO COM COMBUSTÍVEL:" + custoCombustivel + "\nCUSTO COM FUNCIONÁRIOS: " + custoFuncionarios+"\nCUSTO COM MANUTENÇÃO: "+custoManutencao+"\nCUSTO COM ESTUDANTES: "
                +custoEstudantes+"CUSTO COM INTEGRAÇÃO"+custoIntegracao+"\nRECEITA: "+receita+"\nNº DE PASSAGEIROS ATENDIDOS";
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof RelatorioCustoDiario){
                if(((RelatorioCustoDiario)obj).id.equals(this.id)){
                    return true;
                }
                else if (obj.equals(id)){
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }
}