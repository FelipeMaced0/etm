package auxiliar;

import java.util.Objects;

public class Parada{
    String id;
    String endereco;
    double latitude;
    double longitude;
    int nVeiculos;
    
    public Parada(String endereco,String id, double latitude, double longitude){
        this.id = id;
        this.endereco = endereco.toUpperCase();
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
    
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
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