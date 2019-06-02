package veiculos;

public class Vlt extends VeiculoTrilhos{
    public Vlt(){
    
    }
    
    public Vlt(String id, String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia) {
        super(id, status, combustivel, tipoDeRota, tipoDeCobranca, capacidade, autonomia);
    }
}