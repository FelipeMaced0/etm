package veiculos;

public class Van extends VeiculoComPlaca{
    public Van(){
    
    }

    public Van(String placa, String id, String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia) {
        super(placa, id, status, combustivel, tipoDeRota, tipoDeCobranca, capacidade, autonomia);
    }
}