/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiamusculacao;

import ComponenteCadastro.Aluno;
import ComponenteCadastro.ControladorComponenteCadastro;
import ComponenteCadastro.IComponenteCadastro;
import ComponenteSalvaDados.ControladorSalvaDados;
import ComponenteSalvaDados.ISalvaDados;
import java.util.HashMap;

/**
 *
 * @author joaov
 */
public class AcademiaMusculacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ISalvaDados salva = ControladorSalvaDados.getInstance();
        IComponenteCadastro cad = ControladorComponenteCadastro.getInstance();
        cad.setObjetoDePersistencia(salva);
        cad.cadastrarAluno();
        HashMap<String,Aluno> hash;
        hash = (HashMap<String, Aluno>) salva.carregar("alunos.dso");
        System.out.println(hash.get("2").getEndereco());
        
    }
    
}
