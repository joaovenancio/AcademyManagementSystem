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
public class ControladorComponenteCadastro {
    //Atributos:
    private static ControladorComponenteCadastro instancia;
    private String nomeArquivoDadosAlunos;
    private String nomeArquivoDadosFuncionarios;
    private ISalvaDados objetoDePersistencia;
    
    //Construtor:
    private ControladorComponenteCadastro () {
        this.nomeArquivoDadosAlunos = "alunos.dso";
        this.nomeArquivoDadosFuncionarios = "funcionarios.dso";
        this.objetoDePersistencia = null;
        ControladorComponenteCadastro.instancia = this;
    }
    
    //Metodos:
    public ISalvaDados getObjetoDePersistencia() {
        return objetoDePersistencia;
    }

    public void setObjetoDePersistencia(ISalvaDados objetoDePersistencia) {
        this.objetoDePersistencia = objetoDePersistencia;
    }
    
    public String getNomeArquivoDadosAlunos() {
        return nomeArquivoDadosAlunos;
    }

    public void setNomeArquivoDadosAlunos(String nomeArquivoDadosAlunos) {
        this.nomeArquivoDadosAlunos = nomeArquivoDadosAlunos;
    }

    public String getNomeArquivoDadosFuncionarios() {
        return nomeArquivoDadosFuncionarios;
    }

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
