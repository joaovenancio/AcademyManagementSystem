/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteCadastro;

import academiamusculacao.model.Treino;
import java.util.ArrayList;

/**
 *
 * @author joaov
 */
public class Aluno extends UsuarioAcademia {
    //Atributos:
    protected ArrayList<Treino> treino;
    
    
    //Construtor:
    public Aluno(String cpf, String rg, int ano, int mes, int dia, String telefone, String endereco) {
        super(cpf, rg, ano, mes, dia, telefone, endereco);
        this.treino = new ArrayList<Treino>();
    }
    
    //Metodos:
    public ArrayList<Treino> getTreino() {
        return treino;
    }

    public void setTreino(ArrayList<Treino> treino) {
        this.treino = treino;
    }
    
}
