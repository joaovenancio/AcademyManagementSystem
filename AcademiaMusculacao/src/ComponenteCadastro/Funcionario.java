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
    
    //Construtor:
    public Funcionario(String cpf, String rg, int ano, int mes, int dia, String telefone, String endereco, TipoFuncionario tipo) {
        super(cpf, rg, ano, mes, dia, telefone, endereco);
        this.tipo = tipo;
    }
    
    //Metodos:
    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    } 
    
}
