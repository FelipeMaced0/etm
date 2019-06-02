
package usuarios;

import funcionarios.Funcionario;
import java.util.Objects;

public class Usuario {
    private String nickName;
    private String senha;
    private Funcionario funcionario;
    
    public Usuario(){
    }
    
    public Usuario(String nickName, String senha, Funcionario funcionario) {
        this.nickName = nickName;
        this.senha = senha;
        this.funcionario = funcionario;
    }
    
    public Usuario(String nickName, String senha){
        this.nickName = nickName;
        this.senha = senha;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }
    public String getNickName() {
        return nickName;
    }

    public String getSenha() {
        return senha;
    }
    
    public Funcionario getFuncionario(){
        return funcionario;
    }

    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            if(obj instanceof Usuario){
                if(((Usuario)obj).nickName.equals(this.nickName)){
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
        hash = 47 * hash + Objects.hashCode(this.nickName);
        return hash;
    }
}
