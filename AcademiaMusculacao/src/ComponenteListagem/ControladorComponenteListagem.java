/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteListagem;

import ComponenteCadastro.Aluno;
import ComponenteCadastro.Funcionario;
import ComponenteSalvaDados.ISalvaDados;
import java.util.Collection;
import java.util.HashMap;

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
    private TelaListagemAlunos telaListagemAlunos;
    private TelaListagemFuncionarios telaListagemFuncionarios;
    
    //Construtor:
    private ControladorComponenteListagem () {
        ControladorComponenteListagem.instancia = this;
        this.objetoDePersistenciaDeDados = null;
        this.nomeArquivoAlunos = "alunos.dso";
        this.nomeArquivoFuncionarios = "funcionarios.dso";
        this.telaListagemAlunos = new TelaListagemAlunos(this);
        this.telaListagemFuncionarios = new TelaListagemFuncionarios(this);
    }
    
    //Metodos:
    public static ControladorComponenteListagem getInstance() {
        if (ControladorComponenteListagem.instancia == null) {
            ControladorComponenteListagem.instancia = new ControladorComponenteListagem();
        }
        
        return ControladorComponenteListagem.instancia;
        
    }

    @Override
    public void listarAlunos() {
        HashMap<String,Aluno> alunos = (HashMap<String,Aluno>) this.objetoDePersistenciaDeDados.carregar(this.nomeArquivoAlunos);
        Collection<Aluno> colecaoAlunos = (Collection<Aluno>) alunos.values();
        Object[] arrayAlunos = colecaoAlunos.toArray();
        this.telaListagemAlunos.iniciar(arrayAlunos);
    }

    @Override
    public void listarFuncionarios() {
        HashMap<String,Funcionario> funcionarios = (HashMap<String,Funcionario>) this.objetoDePersistenciaDeDados.carregar(this.nomeArquivoFuncionarios);
        Collection<Funcionario> colecaoFuncionarios = funcionarios.values();
        Object[] arrayFuncionarios = colecaoFuncionarios.toArray();
        this.telaListagemFuncionarios.iniciar(arrayFuncionarios);
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
