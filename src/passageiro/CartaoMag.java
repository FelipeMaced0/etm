package passageiro;
import java.util.Calendar;
import java.util.Objects;
public abstract class CartaoMag {
    
    protected String nome;
    protected String nCartao;
    protected boolean autorizado;
    protected float creditos;
    protected int nIntegracoes;
    protected Calendar dataUltimoUso;
    
    public CartaoMag(){ 
    }
    
    public CartaoMag(String nome, String nCartao, boolean autorizado,float creditos, int nIntegracoes,Calendar dataUltimoUso){
        this.nome = nome.toUpperCase();
        this.nCartao = nCartao;
        this.autorizado = autorizado;
        this.creditos = creditos;
        this.nIntegracoes = nIntegracoes;
        this.dataUltimoUso = dataUltimoUso;
    }

    public CartaoMag(String nome, String nCartao, boolean autorizado) {
        this.nome = nome;
        this.nCartao = nCartao;
        this.autorizado = autorizado;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setnCartao(String nCartao) {
        this.nCartao = nCartao;
    }
    
    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public void setCreditos(float creditos) {
        this.creditos = creditos;
    }

    public void setnIntegracoes(int nIntegracoes) {
        this.nIntegracoes = nIntegracoes;
    }

    public void setDataUltimoUso(Calendar dataUltimoUso) {
        this.dataUltimoUso = dataUltimoUso;
    }

    public String getNome() {
        return nome;
    }

    public String getnCartao() {
        return nCartao;
    }

    public String getTipoDeUsuario() {
        return this.getClass().getSimpleName().toUpperCase();
    }

    public float getCreditos() {
        return creditos;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public int getnIntegracoes() {
        return nIntegracoes;
    }
    
    public long getDataUltimoUsoMilisegundos() {
        return dataUltimoUso.getTimeInMillis();
    }   
    
    public String getDataUltimoUso(){
       return dataUltimoUso.get(Calendar.DAY_OF_MONTH)+"/"+dataUltimoUso.get(Calendar.MONTH)+"/"+dataUltimoUso.get(Calendar.YEAR);
    }
    
    public abstract boolean cobrarPassagem(float tarifa);
    
     @Override
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof CartaoMag){
                if(((CartaoMag)obj).nCartao.equals(this.nCartao)){
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
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nCartao);
        return hash;
    }
}