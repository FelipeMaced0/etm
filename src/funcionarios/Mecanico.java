package funcionarios;

public class Mecanico extends Funcionario{
    int veiculosAtendidos;
    public Mecanico(){
    }
    public Mecanico(String nome,String cpf, String ctps, String sexo,int idade,int cargaHoraria, float salario, int veiculosAtendidos){
        super(nome,cpf,ctps,sexo,idade,cargaHoraria,salario);
        this.veiculosAtendidos = veiculosAtendidos;
    }

    public Mecanico(String cpf) {
        super(cpf);
    }
    
    public void setVeiculosAtendidos(int veiculosAtendidos) {
        this.veiculosAtendidos = veiculosAtendidos;
    }

    public int getVeiculosAtendidos() {
        return veiculosAtendidos;
    } 
}
