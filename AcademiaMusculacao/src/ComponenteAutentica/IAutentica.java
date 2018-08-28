/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteAutentica;

import ComponenteCadastro.Funcionario;
import ComponenteSalvaDados.ISalvaDados;

/**
 *
 * @author joaov
 */
public interface IAutentica {
    //Metodos:
    public void setObjetoSalvaDados(ISalvaDados objetoSalvaDados);
    
    public void setArquivoFuncionarios (String nomeDoArquivo);
    
    public void setNumTentativas (int num);
    
    public Funcionario iniciarAutenticacaoDeUsuario() throws RuntimeException, InterruptedException;
}
