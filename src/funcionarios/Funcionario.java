package funcionarios;

import java.util.Objects;


public abstract class Funcionario {
    private String nome;
    private int cargaHoraria;
    private float salario;
    private int idade;
    private String cpf;
    private String ctps;
    private String sexo;
    
    public Funcionario(){
    }
    
    public Funcionario(String nome,String cpf, String ctps, String sexo, int idade,int cargaHoraria, float salario){
        this.nome = nome.toUpperCase();
        this.idade = idade;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.cpf = cpf;
        this.ctps = ctps;
        this.sexo = sexo.toUpperCase();
    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public Funcionario(String cpf) {
        this.cpf = cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public float getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCtps() {
        return ctps;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFuncao() {
        return this.getClass().getSimpleName();
    }
    
    @Override
    public String toString(){
        return "FUNÇÃO: "+this.getClass().getSimpleName()+"\nNOME: "+nome+"\nSEXO: "+sexo+"\nIDADE: "+idade+"\nCARGA HORÁRIA: "+cargaHoraria+" H"+"\nSALÁRIO: "+salario+"\nCPF: "+cpf+"\nCTPS: "+ctps+"\n\n";
    }
    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof Funcionario){
                if(((Funcionario)obj).cpf.equals(this.cpf)){
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
        hash = 41 * hash + Objects.hashCode(this.cpf);
        return hash;
    }
}
