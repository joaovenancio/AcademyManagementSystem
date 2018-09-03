/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteTreino;

/**
 *
 * @author ferna
 */
public class Exercicio {
    
    private String nome;
    private int quantidade;
    
    /**
     *
     * @param nome
     * @param quantidade
     */
    public Exercicio (String nome,int quantidade){
        super();
        this.nome = nome;
        this.quantidade = quantidade;
          
}

    

  
    
    //Metodos:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
