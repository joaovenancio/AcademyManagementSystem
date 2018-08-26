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
public class ControladorFuncionario {
    //Atributos:
    private ControladorComponenteCadastro controladorComponente;
    private TelaFuncionario telaCadastrarFuncionario;
    
    //Construtor:
    public ControladorFuncionario (ControladorComponenteCadastro controladorGeral) {
        this.controladorComponente = controladorGeral;
        this.telaCadastrarFuncionario = new TelaFuncionario(this);
    }
    
    //Metodos:
    /**
     * Cria um apontador para um HashMap<String, Object> para recupara a lista de funcionarios
     * em um arquivo e persistir uma nova instancia de funcionario nele. Depois instancia um novo
     * funcionario, coloca ele no HashMap (usando o seu CPF como KEY-String) e persiste o dado.
     * 
     * @param dadoFuncionario - Envelope contendo todas as informacoes necessarias para cirar um novo funcionario.
     * @return true se deu tudo certo na criacao e persistencia - false caso contrario.
     */
    public boolean cadastrarFuncionario (EnvelopeFuncionario dadoFuncionario) {
        //Recuperar os dados dos funcionarios:
         HashMap<String, Funcionario> funcionarios = new HashMap(); //Criar novo objeto para passar por referência
       
        //Carrega os dados do sistema:
        funcionarios = (HashMap<String, Funcionario>) this.controladorComponente.getObjetoDePersistencia().carregar( this.carregarNomeArquivo());
        //Cria o novo funcionario:
        Funcionario novoFuncionario = new Funcionario (dadoFuncionario.cpf, dadoFuncionario.rg, dadoFuncionario.ano,
                dadoFuncionario.mes, dadoFuncionario.dia, dadoFuncionario.telefone, dadoFuncionario.endereco, dadoFuncionario.tipo,
                dadoFuncionario.usuario, dadoFuncionario.senha);
        funcionarios.put(novoFuncionario.getCpf(), novoFuncionario);
        //Persiste os dados:
        return this.controladorComponente.getObjetoDePersistencia().persistir(funcionarios, this.carregarNomeArquivo());
        
    }
    
    /**
     * Metodo que recupera a String contendo o nome do arquivo para salvar e recuperar os dados dos funcionarios.
     * 
     * @return String - Contendo o nome do arquivo para ser usado para a persistencia de dados.
     */
    private String carregarNomeArquivo () {
        return this.controladorComponente.getNomeArquivoDadosFuncionarios();
    }
    
     /**
     * Chama o metodo em TelaFuncionario para exibir a GUI.
     */
    public void iniciarTelaCadastrarFuncionario() {
        this.telaCadastrarFuncionario.iniciar();
    }
    
}
