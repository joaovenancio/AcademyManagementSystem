/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteCadastro;

import ComponenteSalvaDados.ISalvaDados;

/**
 *
 * @author joaov
 */
public interface IComponenteCadastro {
    //Metodos:
    /**
     * Metodo que permite cadastrar um Aluno usando uma GUI. Os dados sao persistidos
     * atraves de um arquivo configurado por quem implementou o programa usando o
     * componente.
     */
    public void cadastrarAluno ();
    
    /**
     * Metodo que permite cadastrar um Funcionario usando uma GUI. Os dados sao persistidos
     * atraves de um arquivo configurado por quem implementou o programa usando o
     * componente.
     */
    public void cadastrarFuncionario ();
    
    /**
     * Define o nome do arquivo onde os dados dos Alunos vao ser salvos. Para manusear os alunos,
     * recupere os dados na forma HashMap<String,Aluno> e utilize os metodos do HashMap para recuperar
     * os alunos.
     * 
     * @param nomeArquivoDadosAlunos - Nome do arquivo onde os dados serao salvos.
     */
    public void setNomeArquivoDadosAlunos(String nomeArquivoDadosAlunos);
    
    /**
     * Define o nome do arquivo onde os dados dos Funcionarios vao ser salvos. Para manusear os alunos,
     * recupere os dados na forma HashMap<String,Funcionario> e utilize os metodos do HashMap para recuperar
     * os funcionarios.
     * 
     * @param nomeArquivoDadosFuncionarios - Nome do arquivo onde os dados serao salvos.
     */
    public void setNomeArquivoDadosFuncionarios(String nomeArquivoDadosFuncionarios);
    
    /**
     * Define qual o Objeto responsavel por persistir os dados.
     * 
     * @param objetoDePersistencia - Objeto responsavel por persistir os dados.
     */
    public void setObjetoDePersistencia(ISalvaDados objetoDePersistencia);
}
