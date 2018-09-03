/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteTreino;

import ComponenteCadastro.Aluno;
import ComponenteSalvaDados.ControladorSalvaDados;
import ComponenteSalvaDados.ISalvaDados;
import ComponenteCadastro.ControladorComponenteCadastro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class ControladorTreinos {
    
    private TelaTreino telaTreino;
     private ControladorComponenteCadastro controladorComponente;
     private ISalvaDados componentePersistencia;
     private String nomeArquivoAlunos;
    
    public ControladorTreinos(ControladorComponenteCadastro controladorComponente) {
        this.controladorComponente = controladorComponente;
        this.telaTreino = new TelaTreino(this);
        this.nomeArquivoAlunos = "alunos.dso";
    }
    
    private static ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>(Arrays.asList(new Exercicio("Supino", 15), new Exercicio("Rosca direta", 10), new Exercicio("Desenvolvimento halter",10), new Exercicio("Extensão triceps",10), new Exercicio("Legpress",20), new Exercicio("Extensor",15), new Exercicio("Panturrilha",50), new Exercicio("Elevação Lateral",15), new Exercicio("Rosca alternada",20), new Exercicio("Voador peitoral",20), new Exercicio("Tríceps corda",15), new Exercicio("abdominal",100)));
    
    public static ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    void cadastrarTreino(ArrayList<Exercicio> exerciciosSelecionados, String alunoNome) {
        HashMap<String,Aluno> alunos = (HashMap<String,Aluno>) this.componentePersistencia.carregar(this.nomeArquivoAlunos);
        
    }
    
    public void setNomeArquivoAluno (String nome) {
        this.nomeArquivoAlunos = nome;
    }

    public void iniciarTela() {
        this.telaTreino.iniciar();
    }
    
}
