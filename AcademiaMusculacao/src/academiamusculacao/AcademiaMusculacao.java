/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiamusculacao;

import ComponenteAutentica.ControladorAutentica;
import ComponenteCadastro.Aluno;
import ComponenteCadastro.ControladorComponenteCadastro;
import ComponenteCadastro.Funcionario;
import ComponenteCadastro.IComponenteCadastro;
import ComponenteListagem.ControladorComponenteListagem;
import ComponenteListagem.IComponenteListagem;
import ComponenteSalvaDados.ControladorSalvaDados;
import ComponenteSalvaDados.ISalvaDados;
import academiamusculacao.controller.ControladorGeral;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author joaov
 */
public class AcademiaMusculacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, RuntimeException, InterruptedException {
        ISalvaDados salva = ControladorSalvaDados.getInstance();
//        IComponenteCadastro cad = ControladorComponenteCadastro.getInstance();
//        cad.setObjetoDePersistencia(salva);
//        cad.cadastrarAluno();
//        HashMap<String,Aluno> hash;
//        hash = (HashMap<String, Aluno>) salva.carregar("alunos.dso");
//        System.out.println(hash.get("2").getEndereco());
        
//        ISalvaDados salva = ControladorSalvaDados.getInstance();
//        IComponenteCadastro cad = ControladorComponenteCadastro.getInstance();
//        cad.setObjetoDePersistencia(salva);
//        cad.cadastrarFuncionario();
//        HashMap<String,Funcionario> hash;
//        hash = (HashMap<String, Funcionario>) salva.carregar("funcionarios.dso");
//        System.out.println(hash.get("2").getTipo() +" " + hash.get("2").getUsuario());
//        
//        ControladorAutentica autentica = ControladorAutentica.getInstance();
//        autentica.setObjetoSalvaDados(salva);
//        autentica.iniciarTelaAutentica();
//        Funcionario func = autentica.iniciarAutenticacaoDeUsuario();
//        
//        System.out.println(func.getUsuario().toString());
//        
//        
//        if (func != null) {
//            System.out.println("Deu boa");
//            System.out.println(func.getUsuario().toString());
//        }
//        
//        ControladorGeral cont = ControladorGeral.getInstance();
//        cont.getTelaAtendente().iniciar(func.getUsuario(), func.getTipo().toString());
        
        ControladorGeral cont = ControladorGeral.getInstance();
        cont.autenticarUsuarioNoSistema();
        
        IComponenteListagem lista = ControladorComponenteListagem.getInstance();
        lista.setObjetoDePersistencia(salva);
        lista.listarFuncionarios();
        
        
    }
    
}
