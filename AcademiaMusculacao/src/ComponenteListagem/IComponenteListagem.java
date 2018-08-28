/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteListagem;

import ComponenteSalvaDados.ISalvaDados;

/**
 *
 * @author joaov
 */
public interface IComponenteListagem {
    //Metodos:
    /**
     * Lista todos os alunos contidos em um HashMap<String,Alunos> do arquivo de Alunos (usar o metodo setNomeArquivoAlunos para definir).
     */
    public void listarAlunos ();
    
    /**
     * Lista todos os alunos contidos em um HashMap<String,Funcionario> do arquivo de Funcionarios (usar o metodo setNomeArquivoFuncionarios para definir).
     */
    public void listaFuncionarios();
    
    //Metodos de configuracao do componente:
    /**
     * Define o nome do arquivo de aluno para o componente listar.
     * 
     * @param nomeArquivo para ele recuperar os dados.
     */
    public void setNomeArquivoAlunos(String nomeArquivo);
    
    /**
     * Define o nome do arquivo de funcionarios para o componente listar.
     * 
     * @param nomeArquivo para ele recuperar os dados.
     */
    public void setNomeArquivoFuncionarios (String nomeArquivo);
    
    /**
     * Define o objeto responsavel por fazer a persistencia de dados.
     * 
     * @param objetoDePersistencia.
     */
    public void setObjetoDePersistencia(ISalvaDados objetoDePersistencia);
}
