/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteCadastro;

/**
 * Classe para ser instanciada e enviar todos os dados necessários para o ControladorAluno poder criar um aluno.
 * 
 * @author joaov
 */
class EnvelopeAluno {
    //Atributos:
    public String cpf;
    public String rg;
    public int ano;
    public int mes;
    public int dia;
    public String telefone;
    public String endereco;
    
    //Construtor:
    public EnvelopeAluno(String cpf, String rg, int ano, int mes, int dia, String telefone, String endereco) {
        this.cpf = cpf;
        this.rg = rg;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
}
