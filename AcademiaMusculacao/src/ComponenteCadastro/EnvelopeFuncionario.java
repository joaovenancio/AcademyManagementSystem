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
class EnvelopeFuncionario {
    //Atributos:
    public String cpf;
    public String rg;
    public int dia;
    public int mes;
    public int ano;
    public String telefone;
    public String endereco;
    public TipoFuncionario tipo;
    public String usuario;
    public String senha;
    
    //Construtor:
    public EnvelopeFuncionario(String cpf, String rg, int dia, int mes, int ano, String telefone, String endereco, TipoFuncionario tipo, String usuario, String senha) {
        this.cpf = cpf;
        this.rg = rg;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipo = tipo;
        this.usuario = usuario;
        this.senha = senha;
    }
    
}
