/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteAutentica;

import ComponenteCadastro.Funcionario;
import ComponenteSalvaDados.ISalvaDados;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author joaov
 */
public class ControladorAutentica {
    //Atributos:
    private static ControladorAutentica instancia;
    private String nomeArquivoFuncionario;
    private int numTentativas;
    private ISalvaDados objetoSalvaDados;
    private TelaAutentica telaAutentica;
    
    //Construtor:
    public ControladorAutentica () {
        this.nomeArquivoFuncionario = "funcionarios.dso";
        this.numTentativas = 5;
        this.objetoSalvaDados = null;
        this.telaAutentica = new TelaAutentica(this);
        ControladorAutentica.instancia = this;
    }
    
    //Metodos:
    public Funcionario autentica (EnvelopeAutenticacao dados) {
        //Recuperar a lista de Funcionarios:
        HashMap<String, Funcionario> funcionarios = (HashMap<String, Funcionario>) this.objetoSalvaDados.carregar(this.nomeArquivoFuncionario);
        //Transformar ela em uma array para percorrer:
        Collection colecaoFuncionarios = funcionarios.values();
        Funcionario[] arrayFuncionarios = (Funcionario[]) colecaoFuncionarios.toArray();
        //Percorrer a array para achar o usuario correspondente:
        for (Funcionario funcionario : arrayFuncionarios) {
            if (funcionario.getUsuario().equals(dados.usuario)) {//Se achou o usuario
                if (funcionario.getSenha().equals(dados.senha)) {//Verificar se a senha eh a certa
                    return funcionario;
                } else {//Retorna nulo caso contrario:
                    return null;
                }
            }
        }
        //Se nao encontrar na lista:
        return null;
        
    }
    
    public void iniciarTelaAutentica(){
        this.telaAutentica.iniciar();
    }
    
    public static ControladorAutentica getInstance() {
        if (ControladorAutentica.instancia == null) {
            ControladorAutentica.instancia = new ControladorAutentica();
        }
        
        return ControladorAutentica.instancia;
        
    }
    
}
