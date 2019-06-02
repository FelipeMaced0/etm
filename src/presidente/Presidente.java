package presidente;

import java.util.Objects;


public class Presidente{
    String nome;
    float salario;
    int idade;
    String cpf;
    String sexo;
    
    public void Presidente(){
    }

    public Presidente(String nome, float salario, int idade, String cpf, String sexo) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
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

    public String getSexo() {
        return sexo;
    }

    
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof Presidente){
                if(((Presidente)obj).cpf.equals(this.cpf)){
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
        hash = 83 * hash + Objects.hashCode(this.cpf);
        return hash;
    }
}