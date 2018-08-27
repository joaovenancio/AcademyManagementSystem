/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteCadastro;

import java.util.HashMap;

/**
 *
 * @author joaov
 */
class ControladorAluno {
    //Atributos:
    private ControladorComponenteCadastro controladorComponente;
    private TelaAluno telaCadastrarAluno;
    
    //Construtor:
    public ControladorAluno(ControladorComponenteCadastro controladorCentral) {
        this.controladorComponente = controladorCentral;
        this.telaCadastrarAluno = new TelaAluno (this);
    }
    
    //Metodos:
    /**
     * Cria um apontador para um HashMap<String, Object> para recupara a lista de Alunos.
     * Depois instancia um novo aluno, coloca ele no HashMap (usando o seu CPF como KEY-String)
     * e persiste o dado.
     * 
     * @param dadosAluno
     * @return true se deu certo o cadastro - false se ocorreu um erro durante o cadastro.
     */
    public boolean cadastraAluno (EnvelopeAluno dadosAluno) {
        HashMap<String, Aluno> alunos;
        
        //Carrega os dados do sistema:
        alunos = (HashMap<String, Aluno>) this.controladorComponente.getObjetoDePersistencia().carregar(this.carregarNomeArquivo());
        //Verificar se alunos nao eh nulo:
        if (alunos == null) {
            alunos = new HashMap<String,Aluno>();
        }
        //Cria o novo aluno:
        Aluno novoAluno = new Aluno(dadosAluno.cpf, dadosAluno.rg, dadosAluno.ano, dadosAluno.mes, dadosAluno.dia, dadosAluno.telefone, dadosAluno.endereco);
        alunos.put(novoAluno.getCpf(), novoAluno);
        //Persiste os dados:
        return this.controladorComponente.getObjetoDePersistencia().persistir(alunos, this.carregarNomeArquivo());
    }
    
    /**
     * Metodo que recupera a String contendo o nome do arquivo para salvar e recuperar os dados dos alunos.
     * 
     * @return String - Contendo o nome do arquivo para ser usado para a persistencia de dados.
     */
    private String carregarNomeArquivo () {
        return this.controladorComponente.getNomeArquivoDadosAlunos();
    }
    
    /**
     * Chama o metodo em TelaAluno para exibir a GUI.
     */
    public void iniciarTelaCadastrarAluno () {
        this.telaCadastrarAluno.iniciar();
    }
    
}
