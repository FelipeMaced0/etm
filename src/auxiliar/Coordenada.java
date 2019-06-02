package auxiliar;

import java.util.Objects;

public class Coordenada {
    String id;
    double latitude;
    double longitude;
    public Coordenada(){
    }
    public Coordenada(String id){
        this.id = id;
    }
    public Coordenada(double latitude, double longitude, String id){
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = id;
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
    
    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof Coordenada){
                if(((Coordenada)obj).id.equals(this.id)){
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
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    @Override
    public String toString(){
        return "id: "+id+"\nLatitude: "+latitude+"\nLongitude: "+longitude;
    }
}