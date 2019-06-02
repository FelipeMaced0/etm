package funcionarios;

import auxiliar.ComparaParadas;
import auxiliar.Parada;
import auxiliar.Rota;
import etm.ETM;
import veiculos.Onibus;

public class teste {
    public static void main(String [] args){
        Onibus o = new Onibus("123-asd","123","OPERACIONAL","DISEL","FLEXIVEL","MISTA",50,(float)2.56);
        Motorista m = new Motorista("Ruan","000.333.666-69","2131243124","masculino",45,40,(float)1590.90);

        ETM etm = new ETM("joão doido","123");
        GerenteLocal  gl = new GerenteLocal();
        GestorDeFrota gf = new GestorDeFrota();
        Rota ro = new Rota("MEU CA","2321");
        Parada p1 =  new Parada("Terminal central-ifba","123",123231,123123);
        Parada p2 =  new Parada("Terminal central-Hospital clériston","123",123121,23323);
        Parada p3 =  new Parada("Terminal central-Getúlio","123",23441,123112);
        Parada p4 =  new Parada("Terminal central-Câmara de vereadores","123",123231,123123);
        gf.setEtm(etm);
        gl.setEtm(etm);
        
        gl.contratarFucionario(m);
        gf.cadastrarVeiculo(o);
        gf.cadastrarRota(ro);
        gf.cadastrarVeiculoEmRota(ro.getId(), o);
        
        gf.cadastrarParada(p1);
        gf.cadastrarParada(p2);
        gf.cadastrarParada(p3);
        gf.cadastrarParada(p4);
        
        gf.cadastrarParadaEmRota(ro.getId(), p1);
        gf.cadastrarParadaEmRota(ro.getId(), p2);
        gf.cadastrarParadaEmRota(ro.getId(), p3);
        gf.cadastrarParadaEmRota(ro.getId(), p4);
        
        ComparaParadas c = new ComparaParadas();
        System.out.println(c.compare(p1, p2));
    }
}