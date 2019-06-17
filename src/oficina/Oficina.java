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
    private ArrayList<Mecanico> mecanicos;
    private ArrayList<Veiculo> veiculos;

    public Oficina() {
    }
    
    public Oficina(String nome, Funcionario encarregado,ETM minhaFrota) {
        this.nome = nome;
        this.encarregado = encarregado;
        this.status = new String[]{"OPERACIONAL","COM DEFEITO","EM MANUTENÇÃO"};
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

    public void cadastrarVeiculo(Veiculo veiculo){
        veiculo.setStatus(status[1]);
        veiculos.add(veiculo);
    }
    
    public void cadastrarMecanico(Mecanico mecanico){
        mecanicos.add(mecanico);
    }
    
    public void descadastrarVeiculo(String id){
        Veiculo veiculo = buscarVeiculo(id);
        if(veiculo != null){
            veiculos.remove(veiculo);
        }
    }
    
    public void descadastrarMecanico(String cpf){
        Mecanico mecanico = buscarMecanico(cpf);
        if(mecanico != null){
            mecanicos.remove(mecanico);
        }
    }
    
    public Veiculo buscarVeiculo(String idVeiculo){
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            if(veiculo.getId().equals(idVeiculo)){
                return veiculo;
            }
        }
        return null;
    }
    
    public Mecanico buscarMecanico(String cpf){
        Iterator<Mecanico> me = mecanicos.iterator();
        Mecanico mecanico;
        while(me.hasNext()){
            mecanico = me.next();
            if(mecanico.getCpf().equals(cpf)){
                return mecanico;
            }
        }
        return null;
    }

    public void agendarNovaRevisão(String idVeiculo, Revisao nRevisao){
        Veiculo veiculo = buscarVeiculo(idVeiculo);
        if(veiculo != null){
            veiculo.cadastrarRevisao(nRevisao);
        }
    }

    public void retirarRevisao(String idVeiculo, String idRevisao){
        Veiculo veiculo = buscarVeiculo(idVeiculo);
        if(veiculo != null){
            veiculo.descadastrarRevisao(idRevisao);
        }
    }
    
    public ArrayList<Veiculo> veiculosEmManutencao(){
        return veiculos;
    }

    public void setCustoEmVeiculo(String idVeiculo, float custo){
        Veiculo veiculo = buscarVeiculo(idVeiculo);
        if(veiculo != null){
            veiculo.setCustoManutencao(custo);
        }
    }
    
    public void mudarStatusVeiculo(String idVeiculo, String status){
        Veiculo veiculo = buscarVeiculo(idVeiculo);
        if(veiculo != null){
            veiculo.setStatus(status);
        }
    }
    
    @Override
    public String toString() {
        return "NOME: "+nome+"\nID: "+id+"ENCARREGADO: "+encarregado.toString();
    }
}