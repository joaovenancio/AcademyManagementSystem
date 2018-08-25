/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteCadastro;

import ComponenteSalvaDados.ISalvaDados;
import javax.swing.JOptionPane;

/**
 *
 * @author joaov
 */
public class ControladorComponenteCadastro implements IComponenteCadastro {
    //Atributos:
    private static ControladorComponenteCadastro instancia;
    private String nomeArquivoDadosAlunos;
    private String nomeArquivoDadosFuncionarios;
    private ISalvaDados objetoDePersistencia;
    private ControladorFuncionario controladorFuncionario;
    private ControladorAluno controladorAluno;
    
    //Construtor:
    private ControladorComponenteCadastro () {
        this.nomeArquivoDadosAlunos = "alunos.dso";
        this.nomeArquivoDadosFuncionarios = "funcionarios.dso";
        this.objetoDePersistencia = null;
        this.controladorFuncionario = new ControladorFuncionario(this);
        this.controladorAluno = new ControladorAluno(this);
        ControladorComponenteCadastro.instancia = this;
    }
    
    //Metodos:
    /**
     * Metodo que permite cadastrar um Aluno usando uma GUI. Os dados sao persistidos
     * atraves de um arquivo configurado por quem implementou o programa usando o
     * componente.
     */
    public void cadastrarAluno () {
        try {
            this.controladorAluno.iniciarTelaCadastrarAluno();
        } catch (NullPointerException ex) {
            JOptionPane.showConfirmDialog(null, ex.getMessage() + "\n Cliquem em OK para delsligar o sistema e evitar mais problemas.");
            System.exit(0);
        }
        
    }
    
    /**
     * Metodo que permite cadastrar um Funcionario usando uma GUI. Os dados sao persistidos
     * atraves de um arquivo configurado por quem implementou o programa usando o
     * componente.
     */
    public void cadastrarFuncionario () {
        try {
            this.controladorFuncionario.iniciarTelaCadastrarFuncionario();
        } catch (NullPointerException ex) {
            JOptionPane.showConfirmDialog(null, ex.getMessage() + "\n Cliquem em OK para delsligar o sistema e evitar mais problemas.");
            System.exit(0);
        }
        
    }
    
    public ISalvaDados getObjetoDePersistencia() {
        return objetoDePersistencia;
    }

    public void setObjetoDePersistencia(ISalvaDados objetoDePersistencia) {
        this.objetoDePersistencia = objetoDePersistencia;
    }
    
    public String getNomeArquivoDadosAlunos() {
        return nomeArquivoDadosAlunos;
    }

    /**
     * Define o nome do arquivo onde os dados dos Alunos vao ser salvos. Para manusear os alunos,
     * recupere os dados na forma HashMap<String,Aluno> e utilize os metodos do HashMap para recuperar
     * os alunos.
     * 
     * @param nomeArquivoDadosAlunos - Nome do arquivo onde os dados serao salvos.
     */
    public void setNomeArquivoDadosAlunos(String nomeArquivoDadosAlunos) {
        this.nomeArquivoDadosAlunos = nomeArquivoDadosAlunos;
    }

    public String getNomeArquivoDadosFuncionarios() {
        return nomeArquivoDadosFuncionarios;
    }
    
    /**
     * Define o nome do arquivo onde os dados dos Funcionarios vao ser salvos. Para manusear os alunos,
     * recupere os dados na forma HashMap<String,Funcionario> e utilize os metodos do HashMap para recuperar
     * os funcionarios.
     * 
     * @param nomeArquivoDadosFuncionarios - Nome do arquivo onde os dados serao salvos.
     */
    public void setNomeArquivoDadosFuncionarios(String nomeArquivoDadosFuncionarios) {
        this.nomeArquivoDadosFuncionarios = nomeArquivoDadosFuncionarios;
    }
    
    /**
     * Retorna uma instancia do ControladorComponenteCadastro. IMPORTANTE: deve ser configurado
     * o nome do arquivo de alunos (default: alunos.dso), nome do aqruivo dos funcionarios (default: funcionarios.dso)
     * e objetoDePersistencia para fazer a persistencia de dados. Use os sets disponíveis para fazer isso.
     * 
     * @return ControladorComponenteCadastro.
     */
    public static ControladorComponenteCadastro getInstance () {
        if (ControladorComponenteCadastro.instancia == null) {
            ControladorComponenteCadastro.instancia = new ControladorComponenteCadastro();
        }
        
        return ControladorComponenteCadastro.instancia;
        
    }
    
    
}
