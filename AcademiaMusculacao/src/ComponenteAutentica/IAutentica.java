/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteAutentica;

import ComponenteSalvaDados.ISalvaDados;

/**
 *
 * @author joaov
 */
public interface IAutentica {
    //Metodos:
    public void setObjetoSalvaDados(ISalvaDados objetoSalvaDados);
    
    public void setArquivoFuncionarios (String nomeDoAqruivo);
    
    public void setNumTentativas (int num);
    
    public boolean autenticar();
}
