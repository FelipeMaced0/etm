package auxiliar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import veiculos.Veiculo;
public class Rota {
    private String nome;
    private String id;
    private ArrayList<Coordenada> coordenadas;
    private ArrayList<Parada> paradas;
    private ArrayList<Veiculo> veiculos;
    private int nVeiculos;
    
    public Rota(){
    }
    
    public Rota(String nome, String id){
        this.nome = nome;
        this.id = id;
        paradas = new ArrayList();
        veiculos = new ArrayList();
        coordenadas = new ArrayList();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public int getnVeiculos(){
        return nVeiculos;
    }

    public void addParada(Parada novaParada){
        paradas.add(novaParada);
        novaParada.setnVeiculos(nVeiculos+novaParada.getnVeiculos());
    }
    
    public void addCoordenada(Coordenada novaCoordenada){
        coordenadas.add(novaCoordenada);
    }
    
    public void atualizarNVeiculosNasParadas(int num){
        Iterator<Parada> p = paradas.iterator();
        Parada parada;
        while(p.hasNext()){
            parada = p.next();
            parada.setnVeiculos(num+parada.getnVeiculos());
        }
    }
    
    public void cadastrarVeiculo(Veiculo nVeiculo){
        veiculos.add(nVeiculo);
        nVeiculos += 1;
        atualizarNVeiculosNasParadas(1);
    }

    public void subParada(String id){
       paradas.remove(paradas.indexOf(new Parada(id)));
    }
    //resolver e
    public void subCoordenada(String id){
        coordenadas.remove(coordenadas.indexOf(new Coordenada(id)));
    }
    
    public void descadastrarVeiculo(Veiculo veiculo){
        if(veiculos.remove(veiculo)){
            nVeiculos--;
            atualizarNVeiculosNasParadas(-1);
        }
    } 
    
    public Veiculo buscarVeiculo(String idVeiculo){
        Iterator<Veiculo> i = veiculos.iterator();
        Veiculo veiculo;
        while(i.hasNext()){
            veiculo = i.next();
            if(veiculo.getId().equals(id)){
                return veiculo;
            }
        }
        return null;
    }
    
    public float getCustoComCombustivel(){
        float custoComCombustivel=0;
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            custoComCombustivel +=   veiculo.getCustoComCombustivel();
        }
        return custoComCombustivel;
    }
    
    public float getCustoComFuncionarios(){
        float custoComSalario=0;
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            custoComSalario +=  veiculo.getCustoComFuncionarios();
        }
        return custoComSalario;
    }
    
    public Parada buscarParada(String id){
        return paradas.get(paradas.indexOf(new Parada(id)));
    }
    
    public boolean buscarParadaBoolean(String id){
        return paradas.contains(new Parada(id));
    }
    
    public Coordenada buscarCoordenada(String id){
       return coordenadas.get(coordenadas.indexOf(new Coordenada(id)));
    }
    
    public void descadastrarRotaDeVeiculos(){
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            veiculo.setMinhaRota(null);
        }
    }
    
    public void atualizarRotaEmVeiculos(){
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            veiculo.setMinhaRota(this);
        }
    }
    //verificar se o veículo está contido em veículos
    public void atualizarVeiculoEmRota(Veiculo veiculo){
        veiculos.set(paradas.indexOf(veiculo), veiculo);
    }
    //verificar se o veículo está contido em veículos
    public void atualizarParada(Parada paradaAtualizada){
        paradas.set(paradas.indexOf(paradaAtualizada), paradaAtualizada);
    }
    
    public String getEnderecos(){
        String enderecos="\n\nPONTOS:\n";
        Iterator<Parada> p = paradas.iterator();
        Parada parada;
        while(p.hasNext()){
            parada = p.next();
            enderecos += "\n"+parada.getEndereco();
        }
        return enderecos;
    }
         
    public String getCoordenadasString(){
        String enderecos="";
        Iterator<Coordenada> coo = coordenadas.iterator();
        Coordenada coordenada;
        while(coo.hasNext()){
            coordenada = coo.next();
            enderecos += "\n"+coordenada.toString()+"\n";
        }
        return enderecos;
    }
    
    public String getMeusVeiculosString(){
        String info ="";
        Iterator<Veiculo> ve = veiculos.iterator();
        Veiculo veiculo;
        while(ve.hasNext()){
            veiculo = ve.next();
            info += veiculo.toString()+"\n\n";
        }
        return info;
    }
    
    public static double paraRadianos(double num){
        return num*Math.PI/180;
    }
    
    public static double Distancia(Coordenada p1, Coordenada p2){
        double Rterra = 6317000;
        double distancia;
        double latDist = paraRadianos(p1.getLatitude()-p2.getLatitude());
        double longDist = paraRadianos(p1.getLongitude()-p2.getLongitude());
        double d1 = Math.sin(latDist/2)*Math.sin(latDist/2)+Math.cos(p1.getLatitude())*Math.cos(p2.getLatitude())*Math.sin(longDist/2)*Math.sin(longDist/2);
        distancia = 2*Rterra*Math.asin(Math.sqrt(d1));
        return distancia;
    }
    
    //resolver problema com o equals
    public double calcularDistancia(Parada p1, Parada p2){
        double dis=0;
        boolean achei=false;
        Iterator<Coordenada> coo = coordenadas.iterator();
        Coordenada coordenada;
        while(coo.hasNext()){
            coordenada = coo.next();
            if(coordenada.getId().equals(p1.getId())||achei){
                achei=true;
                if(coordenada.getId().equals(p2.getId())){
                        break;
                }
                else{
                    dis += Distancia(coordenada,coo.next());
                }
            }
        }
        return dis;
    }
        
    @Override
    public String toString(){
        return "Nome: "+nome;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof Rota){
                if(((Rota)obj).id.equals(this.id)){
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }
}