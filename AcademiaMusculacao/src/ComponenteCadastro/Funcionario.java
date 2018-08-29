/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteCadastro;

/**
 *
 * @author joaov
 */
public class Funcionario extends UsuarioAcademia {
    //Atributos:
    protected TipoFuncionario tipo;
    protected String usuario;
    protected String senha;
    
    //Construtor:
    public Funcionario(String nome, String cpf, String rg, int ano, int mes, int dia, String telefone, String endereco, TipoFuncionario tipo, String usuario, String senha) {
        super(nome, cpf, rg, ano, mes, dia, telefone, endereco);
        this.tipo = tipo;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    //Metodos:
    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
