/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteCadastro;

/**
 *
 * @author joaov
 */
public class ControladorFuncionario {
    //Atributos:
    private ControladorComponenteCadastro controladorComponente;
    private TelaFuncionario telaCadastrarFuncionario;
    
    //Construtor:
    public ControladorFuncionario (ControladorComponenteCadastro controladorGeral) {
        this.controladorComponente = controladorGeral;
        this.telaCadastrarFuncionario = new TelaFuncionario(this);
    }
    
    //Metodos:
    
}
