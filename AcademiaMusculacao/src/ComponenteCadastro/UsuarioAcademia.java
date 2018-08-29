/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteCadastro;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author joaov
 */
public abstract class UsuarioAcademia implements Serializable{
    //Atributos:
    private static final long serialVersionUID = 1L;
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Calendar dataNascimento;
    protected String telefone;
    protected String endereco;
    
    //Construtor:
    public UsuarioAcademia(String nome, String cpf, String rg,int ano, int mes, int dia, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = Calendar.getInstance();
        dataNascimento.clear();
        this.dataNascimento.set(ano, mes, dia);
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    //Metodos:
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int ano, int mes, int dia) {
        this.dataNascimento.clear();
        this.dataNascimento.set(ano, mes, dia);
    }
    
    @Override
    public String toString() {
        return this.nome;
    }
    
    
    
}
