package veiculos;

public class Metro extends VeiculoTrilhos{
    public Metro(){
    }
    
    public Metro(String id, String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia){
       super(id, status, combustivel, tipoDeRota, tipoDeCobranca, capacidade,autonomia);
    }

    public Metro(String status, String combustivel, String tipoDeRota, String tipoDeCobranca, int capacidade, float autonomia, float distanciaDoPercurso) {
        super(status, combustivel, tipoDeRota, tipoDeCobranca, capacidade, autonomia, distanciaDoPercurso);
    }
    
}
