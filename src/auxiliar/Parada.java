package auxiliar;

import java.util.Objects;

public class Parada{
    String id;
    String endereco;
    float latitude;
    float longitude;
    int nVeiculos;
    
    public Parada(String endereco,float latitude, float longitude){
        this.endereco = endereco.toUpperCase();
        this.latitude = latitude;
        this.longitude = longitude;
        nVeiculos = 0;
    }
    
    public Parada(String endereco, String id,float latitude, float longitude){
        this.endereco = endereco.toUpperCase();
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        nVeiculos = 0;
    }
    public Parada(String id){
        this.id = id;
    }
    
    public void setnVeiculos(int nVeiculos){
        this.nVeiculos = nVeiculos;
    }
    
    public void setEndereco(String nome) {
        this.endereco = nome.toUpperCase();
    }
    
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void atualizar(Parada parada){
        endereco = parada.getEndereco();
        latitude = parada.getLatitude();
        longitude = parada.getLongitude();
    }
    
    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getId() {
        return id;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public int getnVeiculos() {
        return nVeiculos;
    }

    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof Parada){
                if(((Parada)obj).id.equals(this.id)){
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
        hash = 13 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public String toString(){
        return "Endereço: "+endereco+"\nid: "+id+"\nLatitude: "+latitude+"\nLongitude: "+longitude;
    }
}