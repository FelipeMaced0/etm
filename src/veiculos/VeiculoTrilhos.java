package veiculos;

public abstract class VeiculoTrilhos extends Veiculo {

    public VeiculoTrilhos() {
    }

    public VeiculoTrilhos(String id, String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia) {
        super(id, status, combustivel, tipoDeRota, tipoDeCobranca, capacidade, autonomia);
    }

    public VeiculoTrilhos(String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia, float distanciaDoPercurso) {
        super(status, combustivel, tipoDeRota, tipoDeCobranca, capacidade, autonomia, distanciaDoPercurso);
    }
    
}