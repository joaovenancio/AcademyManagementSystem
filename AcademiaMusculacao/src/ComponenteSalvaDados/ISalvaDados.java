/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalvaDados.controller;

/**
 *
 * @author joaov
 */
public interface ISalvaDados {
    //Metodos:
    public boolean persistir (Object dado, String nomeDoArquivo);
    
    public void carregar (Object dadoCarregar, String nomeDoArquivo);
}
