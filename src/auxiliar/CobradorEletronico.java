package auxiliar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import passageiro.CartaoMag;
public class CobradorEletronico {
    
    float tarifaCartao;
    ArrayList <CartaoMag> listaDeCartoes;
    Calendar dataAtual;
    float limiteDeIntegracao;
    float valorDegratuidade;
    float custoEstudantes;
    float custoIntegracao;
    float custoIdosos;
    float receita;
    
    public CobradorEletronico(){
    }
    
    public CobradorEletronico(CartaoMag [] listaDeCartoes, float tarifaCartao, float nPassagensGratuitas){
        this.listaDeCartoes = new ArrayList();
        this.tarifaCartao = tarifaCartao;
        valorDegratuidade = nPassagensGratuitas*tarifaCartao;
    }

    public void setTarifaCartao(float tarifaCartao) {
        this.tarifaCartao = tarifaCartao;
    }
    
    public void setValorDeGratuidade(float nPassagensGratuitas) {
        this.valorDegratuidade = nPassagensGratuitas*tarifaCartao;
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
    
    public void setListaDeCartoes(ArrayList listaDeCartoes){
        this.listaDeCartoes = listaDeCartoes;
    }
    
    public float getTarifaCartao() {
        return tarifaCartao;
    }

    public long getDataMilisegundos() {
        return dataAtual.getTimeInMillis();
    }  
    
    public String getDataAtual(){
       return dataAtual.get(Calendar.DAY_OF_MONTH)+"/"+dataAtual.get(Calendar.MONTH)+"/"+dataAtual.get(Calendar.YEAR);
    }

    public float getValorDegratuidade() {
        return valorDegratuidade;
    }

    public float getCustoEstudantes() {
        return custoEstudantes;
    }

    public float getCustoIntegracao() {
        return custoIntegracao;
    }

    public float getCustoIdosos() {
        return custoIdosos;
    }
    
    public float getReceita(){
        return receita;
    }
    
    public  int verificarValidaCreditos(CartaoMag cartao, Calendar dataAtual, long dataUltimoUso){
        if(dataAtual.getTimeInMillis()-dataUltimoUso<2.628e9){
            cartao.setnIntegracoes(0);
            return 1;
        }
        if(dataAtual.getTimeInMillis()-dataUltimoUso<3.6e6&&cartao.getnIntegracoes()<=limiteDeIntegracao){
            cartao.setnIntegracoes(cartao.getnIntegracoes()+1);
            return 2;
        }
        if(dataAtual.get(Calendar.DAY_OF_MONTH) >= 28){
            return 3;
        }
        return 0;
    }
    
    public boolean buscarCartao(String nCartao){
        Iterator<CartaoMag> i = listaDeCartoes.iterator();
        CartaoMag cartao;
        while(i.hasNext()){
            cartao = i.next();
            if(cartao.getnCartao().equals(nCartao)){
                return true;
            }
        }
        return false;
    }
    
    public void zerar(){
        custoEstudantes = 0; 
        custoIntegracao = 0;
        custoIdosos = 0;
        receita = 0;
    }
    
    public boolean cobrar(CartaoMag cartao){
        dataAtual = Calendar.getInstance();
        int val;
        listaDeCartoes.set(listaDeCartoes.indexOf(cartao), cartao);
        if(listaDeCartoes.contains(cartao)&&cartao.isAutorizado()){
            val = verificarValidaCreditos(cartao,dataAtual,cartao.getDataUltimoUsoMilisegundos());
            cartao.setDataUltimoUso(dataAtual);
            switch(cartao.getTipoDeUsuario()){
                case "ESTUDANTE":
                    if(cartao.cobrarPassagem(tarifaCartao)){
                        if(val==1){
                            custoEstudantes += tarifaCartao/2;
                            receita += tarifaCartao/2;
                        }
                        else if (val==2){
                            custoIntegracao += tarifaCartao;
                        }
                        return true;
                    }                      
                case "IDOSO":
                    if(cartao.cobrarPassagem(tarifaCartao)){
                        if(val==1){
                            
                            custoIdosos += tarifaCartao;                               
                        }
                        else if(val==3){
                            cartao.setCreditos(valorDegratuidade);
                        }
                        else{
                            custoIntegracao += tarifaCartao;
                        }
                        return true;
                    } 
                case "NORMAL":
                    if(cartao.cobrarPassagem(tarifaCartao)){
                        if(val==1){
                            receita += tarifaCartao;
                        }
                        else if(val==2){
                            custoIntegracao += tarifaCartao;
                        }
                        return true;
                    }
                default:
                    return false;
            }
        }
        
        return false;
    }  
}