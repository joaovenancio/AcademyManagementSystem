/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiamusculacao.controller;

import ComponenteCadastro.ControladorComponenteCadastro;
import ComponenteCadastro.IComponenteCadastro;
import ComponenteSalvaDados.*;
import academiamusculacao.view.TelaAtendente;

/**
 *
 * @author joaov
 */
public class ControladorGeral {
    //Atributos:
    private static ControladorGeral instancia;
    private TelaAtendente telaAtendente;
    private ISalvaDados componenteSalvaDados;
    private IComponenteCadastro componenteCadastro;
    
    //Construtor:
    private ControladorGeral () {
        this.telaAtendente = new TelaAtendente(this);
        this.componenteSalvaDados = ControladorSalvaDados.getInstance();
        this.componenteCadastro = ControladorComponenteCadastro.getInstance();
        this.configurarComponenteCadastro();
    }
    
    //Metodos:
    /**
     * Retornar uma instancia desta Classe.
     * 
     * @return ControladorGeral do sistema.
     */
    public static ControladorGeral getInstance() {
        if (ControladorGeral.instancia == null) {
            ControladorGeral.instancia = new ControladorGeral ();
        }
        
        return ControladorGeral.instancia;
        
    }

    public TelaAtendente getTelaAtendente() {
        return telaAtendente;
    }
    
    public void cadastrarAluno () {
        this.componenteCadastro.cadastrarAluno();
    }
    
    private void configurarComponenteCadastro () {
        this.componenteCadastro.setNomeArquivoDadosAlunos("alunos.dso");
        this.componenteCadastro.setNomeArquivoDadosFuncionarios("funcionarios.dso");
        this.componenteCadastro.setObjetoDePersistencia(componenteSalvaDados);
    }

    public void administrarTreinos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cadastrarFuncionario() {
        this.componenteCadastro.cadastrarFuncionario();
    }
    
    
}
