package veiculos;

public class Onibus extends VeiculoComPlaca{
    
    public Onibus(){
    }

    public Onibus(String placa, String id, String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia) {
        super(placa, id, status, combustivel, tipoDeRota, tipoDeCobranca, capacidade, autonomia);
    }

    public Onibus(String placa, String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia) {
        super(placa, status, combustivel, tipoDeRota, tipoDeCobranca, capacidade, autonomia);
    }
}