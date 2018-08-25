/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteCadastro;

/**
 *
 * @author joaov
 */
public enum TipoFuncionario {
    //Enums:
    /**
     * Esse Funcionario tem controle geral sobre o sistema.
     */
    ADMINISTRADOR(true, "Administrador"),
    
    /**
     * Atendentes podem ver dados sobre Alunos.
     */
    ATENDENTE(false, "Atendente"),
    
    /**
     * Limpeza não possui acoes sobre o sistema.
     */
    LIMPEZA(false, "Limpeza");
    
    //Atributos:
    /**
     * Indica se o tipo de funcionario em questao possui direitos administrativos para manusear o Sistema.
     */
    private final boolean poderAdministrativo;
    private final String nomeTipo;
    
    //Construtor:
    /**
     * Recebe um boolean que indica se esse TipoFuncionario tem poder da Administrador no Sistema.
     * 
     * @param ehAdministrador - true se pode manusear o sistema inteiro, false caso contrario.
     */
    TipoFuncionario (boolean ehAdministrador, String nomeTipo) {
        this.poderAdministrativo = ehAdministrador;
        this.nomeTipo = nomeTipo;
    }
    
    //Metodos:
    /**
     * Retornar um boolean indicando se o funcionario em questao eh um administrador.
     * 
     * @return boolean true se ele eh administrador - boolean false caso nao for um administrador.
     */
    public boolean ehAdministrador () {
        return this.poderAdministrativo;
    }
    
//    @Override
//    public String toString () {
//        return this.nomeTipo;
//    }

}
