package veiculos;

public class Brt extends VeiculoComPlaca {
    public Brt(){
    
    }

    public Brt(String placa, String id, String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia) {
        super(placa, id, status, combustivel, tipoDeRota, tipoDeCobranca, capacidade, autonomia);
    }
}
