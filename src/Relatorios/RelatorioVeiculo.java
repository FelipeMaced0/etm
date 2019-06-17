package Relatorios;

import veiculos.Veiculo;

public class RelatorioVeiculo extends Relatorio {
    
    private float custoFuncionario;
    private float custoCombustivel;
    private float custoIntegracao;
    private float custoEstudante;
    private float custoIdosos;
    private float custoConvencional;
    private float custoManutencao;
    private final Veiculo veiculo;
    
    public RelatorioVeiculo(int nRelatorio, Veiculo veiculo, float custoFuncionario, float custoCombustivel, float custoIntegracao, float custoEstudante, float custoIdosos, float custoConvencional) {
        super(nRelatorio);
        this.veiculo = veiculo;
        this.custoFuncionario = custoFuncionario;
        this.custoCombustivel = custoCombustivel;
        this.custoIntegracao = custoIntegracao;
        this.custoEstudante = custoEstudante;
        this.custoIdosos = custoIdosos;
        this.custoConvencional = custoConvencional;
    }
    
    public RelatorioVeiculo(Veiculo veiculo, float custoFuncionario, float custoCombustivel) {
        super();
        this.veiculo = veiculo;
        this.custoFuncionario = custoFuncionario;
        this.custoCombustivel = custoCombustivel;
    }

    public void setCustoFuncionario(float custoFuncionario) {
        this.custoFuncionario = custoFuncionario;
    }

    public void setCustoCombustivel(float custoCombustivel) {
        this.custoCombustivel = custoCombustivel;
    }

    public void setCustoIntegracao(float custoIntegracao) {
        this.custoIntegracao = custoIntegracao;
    }

    public void setCustoEstudante(float custoEstudante) {
        this.custoEstudante = custoEstudante;
    }

    public void setCustoIdosos(float custoIdosos) {
        this.custoIdosos = custoIdosos;
    }

    public void setCustoConvencional(float custoConvencional) {
        this.custoConvencional = custoConvencional;
    }

    public void setCustoManutencao(float custoManutencao) {
        this.custoManutencao = custoManutencao;
    }

    public float getCustoFuncionario() {
        return custoFuncionario;
    }

    public float getCustoCombustivel() {
        return custoCombustivel;
    }

    public float getCustoIntegracao() {
        return custoIntegracao;
    }

    public float getCustoEstudante() {
        return custoEstudante;
    }

    public float getCustoIdosos() {
        return custoIdosos;
    }

    public float getCustoConvencional() {
        return custoConvencional;
    }

    public float getCustoManutencao() {
        return custoManutencao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

}