package auxiliar;


public class Teste {

    public Teste() {
    }
    public static void main(String [] args){
        GeradorDeId g = new GeradorDeId();
        g.gerarId();
        g.gerarId();
        g.gerarId();
        g.gerarId();
        System.out.println(g);
    }
}
