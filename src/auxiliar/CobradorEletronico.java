package auxiliar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import passageiro.CartaoMag;
import passageiro.Idoso;
public class CobradorEletronico {
    
    float tarifaCartao;
    ArrayList <CartaoMag> listaDeCartoes;
    Calendar dataAtual;
    float limiteDeIntegracao;
    float valorDegratuidade;
    float custoIntegracao;
    float custoConvencional;
    float custoEstudantes;
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
    
    public  boolean verificarValidaCreditos(CartaoMag cartao, Calendar dataAtual, long dataUltimoUso){
        if(dataAtual.get(Calendar.DAY_OF_MONTH) >= 28){
            if(cartao instanceof Idoso){
                cartao.setCreditos(valorDegratuidade);
            }
        }
        if(dataAtual.getTimeInMillis()-dataUltimoUso<3.6e6&&cartao.getnIntegracoes()<=limiteDeIntegracao){
            cartao.setnIntegracoes(cartao.getnIntegracoes()+1);
            switch(cartao.getTipoDeUsuario()){
                case "ESTUDANTE":
                    custoEstudantes += tarifaCartao;
                    custoIntegracao += tarifaCartao;
                    break;
                case "IDOSO":
                    custoIdosos += tarifaCartao;
                    custoIntegracao += tarifaCartao;
                    break;
                case "CONVENCIONAL":
                    custoConvencional += tarifaCartao;
                    custoIntegracao += tarifaCartao;
                    break;
            }
            return true;
        }
        else{
            
            if(cartao.cobrarPassagem(tarifaCartao)){
                switch(cartao.getTipoDeUsuario()){
                    case "ESTUDANTE":
                        custoEstudantes += tarifaCartao/2;
                        receita += tarifaCartao/2;
                        break;
                    case "IDOSO":
                        custoIdosos += tarifaCartao;
                        break;
                    case "CONVENCIONAL":
                        receita += tarifaCartao;
                        break;
                }
                return true;
            }
            return false;
        }
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
        boolean liberarCatraca;
        liberarCatraca = verificarValidaCreditos(cartao,dataAtual,cartao.getDataUltimoUsoMilisegundos());
        if(listaDeCartoes.contains(cartao)&&liberarCatraca){
            cartao.setDataUltimoUso(dataAtual);
            
        }
        
        return false;
    }  
}