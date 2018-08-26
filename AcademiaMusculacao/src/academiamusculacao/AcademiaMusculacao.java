/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiamusculacao;

import ComponenteCadastro.Aluno;
import ComponenteCadastro.ControladorComponenteCadastro;
import ComponenteCadastro.Funcionario;
import ComponenteCadastro.IComponenteCadastro;
import ComponenteSalvaDados.ControladorSalvaDados;
import ComponenteSalvaDados.ISalvaDados;
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
    public static void main(String[] args) throws IOException {
//        ISalvaDados salva = ControladorSalvaDados.getInstance();
//        IComponenteCadastro cad = ControladorComponenteCadastro.getInstance();
//        cad.setObjetoDePersistencia(salva);
//        cad.cadastrarAluno();
//        HashMap<String,Aluno> hash;
//        hash = (HashMap<String, Aluno>) salva.carregar("alunos.dso");
//        System.out.println(hash.get("2").getEndereco());
        
        ISalvaDados salva = ControladorSalvaDados.getInstance();
        IComponenteCadastro cad = ControladorComponenteCadastro.getInstance();
        cad.setObjetoDePersistencia(salva);
        cad.cadastrarFuncionario();
        HashMap<String,Funcionario> hash;
        hash = (HashMap<String, Funcionario>) salva.carregar("funcionarios.dso");
        System.out.println(hash.get("4").getTipo() +" " + hash.get("4").getUsuario());
        
    }
    
}
