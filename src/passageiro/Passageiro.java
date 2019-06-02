package passageiro;

public class Passageiro {
    String nome;
    String nCartaoMag;
    float valorPagoEmDin;
    public Passageiro(){
    }
    public Passageiro(String nome, String nCartaoMag, float valorPagoEmDin){
        this.nome = nome;
        this.nCartaoMag = nCartaoMag;
        this.valorPagoEmDin = valorPagoEmDin;
    }

    public String getnCartaoMag() {
        return nCartaoMag;
    }  
}