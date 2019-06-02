package oficina;

import etm.ETM;
import funcionarios.Funcionario;
import funcionarios.Mecanico;
import veiculos.Veiculo;
import auxiliar.Revisao;
import java.util.ArrayList;
import java.util.Iterator;

public class Oficina {
    private String id;
    private String nome;
    private Funcionario encarregado;
    private ETM etm;
    
    private String [] status;
    private ArrayList<Funcionario> mecanicos;
    private ArrayList<Veiculo> veiculos;

    public Oficina() {
    }
    
    public Oficina(String nome, Funcionario encarregado,ETM minhaFrota) {
        this.nome = nome;
        this.encarregado = encarregado;
        this.status = new String[]{"EM MANUTENÇÃO", "NORMAL"};
        mecanicos = new ArrayList();
        veiculos = new ArrayList();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEncarregado(Funcionario encarregado) {
        this.encarregado = encarregado;
    }
    
    public void setEtm(ETM etm){
        this.etm = etm;
    }
    
    public String getId() {
        return id;
    }
    
    public Funcionario getEncarregado() {
        return encarregado;
    }

    public void cadatrarVeiculo(Veiculo veiculo){
        veiculo.setStatus(status[0]);
        veiculos.add(veiculo);
    }
    
    public void cadastrarMecanico(Mecanico mecanico){
        mecanicos.add(encarregado);
    }
    
    //Resolver problema do .equals
    public void descadatrarVeiculo(String id){
        veiculos.remove(veiculos.indexOf(id));
    }
    //Resolver problema do .equals
    public void descadastrarMecanico(String cpf){
       mecanicos.remove(mecanicos.indexOf(new Mecanico(cpf)));
    }
    //Resolver problema do .equals
    public void agendarNovaRevisão(String idVeiculo, Revisao nRevisao){
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            if(veiculo.equals(idVeiculo)){
                   veiculo.cadastrarRevisao(nRevisao);
               }
        }
    }
    //Resolver problema do .equals
    public void retirarRevisao(String idVeiculo, String idRevisao){
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            if(veiculo.equals(idVeiculo)){
               veiculo.descadastrarRevisao(idRevisao);
            }
        }
    }
    
    public String veiculosEmManutencao(){
        String info="";
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            info += veiculo.toString()+"\n\n";
        }
        return info;
    }
    //Resolver problema do .equals
    public void setCustoEmVeiculo(String id, float custo){
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            if(veiculo.equals(id)){
                veiculo.setCustoManutencao(custo);
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        return "NOME: "+nome+"\nID: "+id+"ENCARREGADO: "+encarregado.toString();
    }
    
}