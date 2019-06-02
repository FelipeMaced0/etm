package funcionarios;

import auxiliar.Escala;
import java.util.ArrayList;
import java.util.Iterator;
import veiculos.Veiculo;

public class FuncionarioOperacional extends Funcionario {

    ArrayList<Veiculo> veiculos;
    Escala minhaEscala;

    public FuncionarioOperacional() {
    }

    public FuncionarioOperacional(String nome, String cpf, String ctps, String sexo, int idade, int cargaHoraria, float salario) {
        super(nome, cpf, ctps, sexo, idade, cargaHoraria, salario);
        veiculos = new ArrayList();
    }

    public FuncionarioOperacional(String cpf) {
        super(cpf);
    }

    public void setMinhaEscala(Escala minhaEscala) {
        this.minhaEscala = minhaEscala;
    }

    public Escala getMinhaEscala() {
        return minhaEscala;
    }

    public void cadastrarVeiculo(Veiculo nVeiculo) {
        veiculos.add(nVeiculo);
    }
    //resolver o problema do .equals
    public void descadastrarVeiculo(Object id) {
        veiculos.remove(veiculos.indexOf(id));
    }

    public String mostrarMeusVeiculos() {
        String infoVeiculos = "";
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            infoVeiculos += veiculo.toString() + "\n\n";
        }
        return infoVeiculos;
    }
}