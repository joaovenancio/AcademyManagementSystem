/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiamusculacao.controller;

import ComponenteAutentica.ControladorAutentica;
import ComponenteAutentica.IAutentica;
import ComponenteCadastro.ControladorComponenteCadastro;
import ComponenteCadastro.Funcionario;
import ComponenteCadastro.IComponenteCadastro;
import ComponenteSalvaDados.*;
import academiamusculacao.view.TelaAdministrador;
import academiamusculacao.view.TelaAtendente;
import academiamusculacao.view.TelaProfessor;
import javax.swing.JOptionPane;

/**
 *
 * @author joaov
 */
public class ControladorGeral {
    //Atributos:
    private static ControladorGeral instancia;
    private TelaAtendente telaAtendente;
    private TelaAdministrador telaAdministrador;
    private TelaProfessor telaProfessor;
    private ISalvaDados componenteSalvaDados;
    private IComponenteCadastro componenteCadastro;
    private IAutentica componenteAutentica;
    
    //Construtor:
    private ControladorGeral () {
        this.telaAtendente = new TelaAtendente(this);
        this.telaAdministrador = new TelaAdministrador(this);
        this.telaProfessor = new TelaProfessor(this);
        this.componenteSalvaDados = ControladorSalvaDados.getInstance();
        this.componenteCadastro = ControladorComponenteCadastro.getInstance();
        this.configurarComponenteCadastro();
        this.componenteAutentica = ControladorAutentica.getInstance();
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
    
    public void autenticarUsuarioNoSistema () throws RuntimeException, InterruptedException {
        Funcionario funcionarioAutenticado = this.componenteAutentica.iniciarAutenticacaoDeUsuario();
        
        switch (funcionarioAutenticado.getTipo()){
            case ADMINISTRADOR:
                this.telaAdministrador.iniciar(funcionarioAutenticado.getUsuario(), funcionarioAutenticado.getTipo().toString());
                break;
            case PROFESSOR:
                this.telaProfessor.iniciar(funcionarioAutenticado.getUsuario(), funcionarioAutenticado.getTipo().toString());
                break;
            case ATENDENTE:
                this.telaAtendente.iniciar(funcionarioAutenticado.getUsuario(), funcionarioAutenticado.getTipo().toString());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Esse tipo de Funcionario não tem acesso ao clinete: Desligando a aplicação...");
                System.exit(0);
        }
        
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
