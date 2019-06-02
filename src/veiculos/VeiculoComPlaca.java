package veiculos;

public class VeiculoComPlaca extends Veiculo{
    String placa;
    public VeiculoComPlaca() {
    }

    public VeiculoComPlaca(String placa, String id,String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia) {
        super(id, status, combustivel, tipoDeRota, tipoDeCobranca, capacidade, autonomia);
        this.placa = placa.toUpperCase();
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
    
    @Override
    public String toString(){
        return "TIPO: "+this.getClass().getSimpleName().toUpperCase()+"\nPLACA: "+placa+"\nID:"+super.id+"\nSTATUS: "+status+"\nCOMBUSTÍVEL: "+combustivel+"\nTIPO DE ROTA: "+tipoDeRota+"\nTIPO DE COBRANÇA: "+tipoDeCobranca+"\nCAPACIDADE: "+capacidade+"\nCUSTO POR QUILÔMETRO: "+autonomia;
    }
}
