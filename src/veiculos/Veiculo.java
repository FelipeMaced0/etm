package veiculos;
import auxiliar.CobradorEletronico;
import funcionarios.FuncionarioOperacional;
import auxiliar.Revisao;
import java.util.Calendar;
import auxiliar.Rota;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import passageiro.CartaoMag;

public abstract class Veiculo {
    
    protected String id;
    protected String status;
    protected String combustivel;
    protected String tipoDeRota;
    protected String tipoDeCobranca;
    protected int capacidade;
    private int nPassageirosAtendidos;
    protected float autonomia;
    private float distanciaDoPercurso;
    private float custoManutencao;
    private float custoIdosos;
    private float custoIntegracao;
    private float custoEstudantes;
    private float receita;
    private int nVezesFezPercurso;
    private Rota  minhaRota;
    private CobradorEletronico ce;
    
    private ArrayList<FuncionarioOperacional> funcionarios;
    private ArrayList<Revisao> revisoes;

    public Veiculo(){ 
        funcionarios = new ArrayList();
        revisoes = new ArrayList();
    }
    
    public Veiculo(String id, String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia){
        this.id = id.toUpperCase();
        this.status = status.toUpperCase();
        this.combustivel = combustivel.toUpperCase();
        this.tipoDeRota = tipoDeRota.toUpperCase();
        this.tipoDeCobranca = tipoDeCobranca.toUpperCase();
        this.capacidade = capacidade;
        this.autonomia = autonomia;
        funcionarios = new ArrayList();
        revisoes = new ArrayList();
        if(this.tipoDeCobranca.equals("MISTA")||this.tipoDeCobranca.equals("ELETRONICA")){
            ce = new CobradorEletronico();
        }
    }
    
    public Veiculo(String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia){
        this.status = status.toUpperCase();
        this.combustivel = combustivel.toUpperCase();
        this.tipoDeRota = tipoDeRota.toUpperCase();
        this.tipoDeCobranca = tipoDeCobranca.toUpperCase();
        this.capacidade = capacidade;
        this.autonomia = autonomia;
        funcionarios = new ArrayList();
        revisoes = new ArrayList();
        if(this.tipoDeCobranca.equals("MISTA")||this.tipoDeCobranca.equals("ELETRONICA")){
            ce = new CobradorEletronico();
        }
    }
    
    public Veiculo(String id){
        this.id = id;
    }
    public void setId(String id) {
        this.id = id.toUpperCase();
    }

    public void setStatus(String status) {
        this.status = status.toUpperCase();
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel.toUpperCase();
    }

    public void setTipoDeRota(String tipoDeRota) {
        this.tipoDeRota = tipoDeRota.toUpperCase();
    }

    public void setTipoDeCobranca(String tipoDeCobranca) {
        this.tipoDeCobranca = tipoDeCobranca.toUpperCase();
    }
    
    public void setCapaciadade(int capacidade){
        this.capacidade = capacidade;
    }
    
    public void setnPassageirosAtendidos(int nPassageirosAtendidos) {
        this.nPassageirosAtendidos = nPassageirosAtendidos;
    }

    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }

    public void setDistanciaDoPercurso(float distanciaDoPercurso) {
        this.distanciaDoPercurso = distanciaDoPercurso;
    }

    public void setCustoManutencao(float custoManutencao) {
        this.custoManutencao = custoManutencao;
    }

    public void setCustoIdosos(float custoIdosos) {
        ce.setCustoIdosos(custoIdosos);
    }

    public void setCustoIntegracao(float custoIntegracao) {
        ce.setCustoIntegracao(custoIntegracao);
    }

    public void setCustoEstudantes(float custoEstudantes) {
        ce.setCustoEstudantes(custoEstudantes);
    }

    public void setnVezesFezPercurso(int nVezesFezPercurso) {
        this.nVezesFezPercurso = nVezesFezPercurso;
    }

    public void setMinhaRota(Rota minhaRota) {
        this.minhaRota = minhaRota;
    }

    public String getId() {
        return id;
    }

    public String getTipoDeVeiculo() {
        switch(this.getClass().getSimpleName()){
            case "Onibus":
                return"ÔNIBUS";
            case "Metro":
                return "METRÔ";
            case "MicroOnibus":
                return "MICRO-ÔNIBUS";
            default:
               return this.getClass().getSimpleName().toUpperCase();
        }
    }
    
    public String getTipoDeCobranca() {
        return tipoDeCobranca;
    }
    
    public String getTipoDeRota(){
        return tipoDeRota;
    }
    
    public String getStatus() {
        return status;
    }

    public String getCombustivel() {
        return combustivel;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
    
    public int getnPassageirosAtendidos() {
        if(nPassageirosAtendidos==0){
            return capacidade*nVezesFezPercurso;
        }
        return nPassageirosAtendidos;
    }

    public float getAutonomia() {
        return autonomia;
    }

    public float getDistanciaDoPercurso() {
        return distanciaDoPercurso;
    }

    public float getCustoIdosos() {
        return ce.getCustoIdosos();
    }

    public float getCustoIntegracao() {
        return ce.getCustoIntegracao();
    }

    public float getCustoEstudantes() {
        return ce.getCustoEstudantes();
    }

    public int getnVezesFezPercurso() {
        return nVezesFezPercurso;
    }
    
    public Rota getMinhaRota() {
        return minhaRota;
    }
    
    public float getCustoComFuncionarios(){
        float custoComSalario=0;
        Iterator<FuncionarioOperacional> fun = funcionarios.iterator();
        FuncionarioOperacional funcionario;
        while(fun.hasNext()){
            funcionario = fun.next();
            custoComSalario +=  funcionario.getSalario();
        }
        custoComSalario /= 30;
        return custoComSalario;
    }
    
    public float getCustoComCombustivel(){
        return autonomia*distanciaDoPercurso*nVezesFezPercurso;
    }
    
    public float getCustoManutencao(){
        return custoManutencao;
    }
    
    public static int diaDaSemana(){
        Date dataAtual = new Date();
        Calendar dataCalendario = Calendar.getInstance();
        dataCalendario.setTime(dataAtual);
        return dataCalendario.get(Calendar.DAY_OF_WEEK);
    }
    
    /*
    public float getReceita(){
        int diaDasemana;
        Cobrador cobrador;
        diaDasemana = diaDaSemana()-1;
        if(ce!=null){
            receita += ce.getReceita();
            ce.zerar();
        }
        if(escalaCobradores[diaDasemana] != null){
            cobrador = escalaCobradores[diaDasemana].getCobrador();
            receita += cobrador.getReceita();
            cobrador.zerar();
        }
        
        return receita;
    }
    */
    
    public void cadastrarFuncionario(FuncionarioOperacional funcionario){
        funcionarios.add(funcionario);
    } 

    public void cadastrarRevisao(Revisao nRevisao){
        revisoes.add(nRevisao);
    }
    
    
    public void descadastrarFuncionario(String cpf){
        funcionarios.remove(funcionarios.indexOf(cpf));
    }
   
    public void descadastrarRevisao(String id){
        revisoes.remove(revisoes.indexOf(id));
    }

    public FuncionarioOperacional buscarFuncionario(String cpf){
        Iterator<FuncionarioOperacional> i = funcionarios.iterator();
        FuncionarioOperacional fun;
        while(i.hasNext()){
            fun = i.next();
            if(fun.getCpf().equals(cpf)){
                return fun;
            }
        }
        return null;
    }
    
    public boolean funcionarioEstaCadastrado(String cpf){
        return buscarFuncionario(cpf).getCpf().equals(cpf);
    }

    public static String get(ArrayList lista, String nomeClasse){
        String info="";
        Iterator i = lista.iterator();
        Object procurado;
        while(i.hasNext()){
            procurado =i.next();
            if(procurado.getClass().getSimpleName().equals(nomeClasse)){
                info += procurado.toString();
            }
            
        }
        return info;
    }
    
    public String getMotoristas(){
        return "MOTORISTAS CADASTRADOS:\n\n"+get(funcionarios,"Motorista");
    }
    
    public String getCobradores(){
        return "COBRADORES CADASTRADOS:\n\n"+get(funcionarios,"Cobrador");
    }
    
    public String getFuncionarios(){
        return "FUNCIONÁRIOS CADASTRADOS: "+get(funcionarios,"FuncionarioOperacional");
    }
    
    public boolean cobrarPassagemEletronica(CartaoMag cartao){
        return ce.cobrar(cartao);
    }
    
    public void zerar(){
        custoManutencao = 0;
        distanciaDoPercurso = 0;
        custoManutencao = 0;
        custoIdosos = 0;
        custoIntegracao = 0;
        custoEstudantes = 0;
        nPassageirosAtendidos = 0;
    }
    
    public void descadastrarVeiculoDeFuncionarios(){
        Iterator<FuncionarioOperacional> fun = funcionarios.iterator();
        FuncionarioOperacional funcionario;
        while(fun.hasNext()){
            funcionario = fun.next();
            funcionario.descadastrarVeiculo(this);
            this.descadastrarFuncionario(funcionario.getCpf());
        }
    }
    
    @Override
    public String toString(){
        return "TIPO: "+this.getClass().getSimpleName().toUpperCase()+"\nID:"+id+"\nSTATUS: "+status+"\nCOMBUSTÍVEL: "+combustivel+"\nTIPO DE ROTA: "+tipoDeRota+"\nTIPO DE COBRANÇA: "+tipoDeCobranca+"\nCAPACIDADE: "+capacidade+"\nCUSTO POR QUILÔMETRO: "+autonomia;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof Veiculo){
                 if(((Veiculo)obj).id.equals(this.id)){
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }
}