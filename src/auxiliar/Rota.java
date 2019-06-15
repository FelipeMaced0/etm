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
    private int nVeiculos=0;
    
    public Rota(){
    }
    
    public Rota(String nome, String id){
        this.nome = nome;
        this.id = id;
        paradas = new ArrayList();
        veiculos = new ArrayList();
        coordenadas = new ArrayList();
    }

    public Rota(String nome) {
        this.nome = nome;
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
    
    public ArrayList<Parada> getParadas(){
        return paradas;
    }
    
    public ArrayList<Veiculo> getVeiculos(){
        return veiculos;
    }
    
    public ArrayList<Coordenada> getCoordenadas(){
        return coordenadas;
    }
    
    public void atualizar(Rota rotaAtualizada){
        this.nome = rotaAtualizada.getNome();
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
    
    public void cadastrarVeiculo(Veiculo nVeiculo){
        veiculos.add(nVeiculo);
        nVeiculos += 1;
        atualizarNVeiculosNasParadas(1);
    }
    
    public void atualizarNVeiculosNasParadas(int num){
        Iterator<Parada> p = paradas.iterator();
        Parada parada;
        while(p.hasNext()){
            parada = p.next();
            parada.setnVeiculos(num+parada.getnVeiculos());
        }
    }

    public void subParada(String id){
       paradas.remove(paradas.indexOf(new Parada(id)));
    }
    //resolver e
    public void subCoordenada(String id){
        coordenadas.remove(coordenadas.indexOf(new Coordenada(id)));
    }
    
    public void descadastrarVeiculo(String  idVeiculo){
        Veiculo veiculo = buscarVeiculo(idVeiculo);
        
        if(veiculos.remove(veiculo)){
            nVeiculos--;
            veiculo.setMinhaRota(null);
            atualizarNVeiculosNasParadas(-1);
        }
    } 
    
    public Veiculo buscarVeiculo(String idVeiculo){
        Iterator<Veiculo> i = veiculos.iterator();
        Veiculo veiculo;
        while(i.hasNext()){
            veiculo = i.next();
            if(veiculo.getId().equals(idVeiculo)){
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
    
    public boolean paradaEstaCadastrada(String id){
        return paradas.contains(new Parada(id));
    }
    
    public Coordenada buscarCoordenada(String id){
       return coordenadas.get(coordenadas.indexOf(new Coordenada(id)));
    }
    
    public boolean veiculoEstaCadastrado(String idVeiculo){
        return buscarVeiculo(idVeiculo)!=null;
    }
    
    public void desvincularRotaDeVeiculos(){
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