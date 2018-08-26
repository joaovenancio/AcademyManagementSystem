/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteAutentica;

/**
 *
 * @author joaov
 */
public class EnvelopeAutenticacao {
    //Atributos:
    public String usuario;
    public String senha;
    
    //Construtor:
    public EnvelopeAutenticacao (String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
}
