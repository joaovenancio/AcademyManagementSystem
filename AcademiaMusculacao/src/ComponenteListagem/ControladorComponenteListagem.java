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
public class ControladorComponenteListagem implements IComponenteListagem {
    //Atributos:
    private static ControladorComponenteListagem instancia;
    private ISalvaDados objetoDePersistenciaDeDados;
    private String nomeArquivoAlunos;
    private String nomeArquivoFuncionarios;
    
    
    //Construtor:
    private ControladorComponenteListagem () {
        ControladorComponenteListagem.instancia = this;
        this.objetoDePersistenciaDeDados = null;
        this.nomeArquivoAlunos = "alunos.dso";
        this.nomeArquivoFuncionarios = "funcionarios.dso";
    }
    
    //Metodos:
    public ControladorComponenteListagem getInstance() {
        if (ControladorComponenteListagem.instancia == null) {
            ControladorComponenteListagem.instancia = new ControladorComponenteListagem();
        }
        
        return ControladorComponenteListagem.instancia;
        
    }

    @Override
    public void listarAlunos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listaFuncionarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNomeArquivoAlunos(String nomeArquivo) {
        this.nomeArquivoAlunos = nomeArquivo;
    }

    @Override
    public void setNomeArquivoFuncionarios(String nomeArquivo) {
        this.nomeArquivoFuncionarios = nomeArquivo;
    }

    @Override
    public void setObjetoDePersistencia(ISalvaDados objetoDePersistencia) {
        this.objetoDePersistenciaDeDados = objetoDePersistencia;
    }
    
}
