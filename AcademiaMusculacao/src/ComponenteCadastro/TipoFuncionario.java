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
    ADMINISTRADOR(),
    
    /**
     * Atendentes podem ver dados sobre Alunos.
     */
    ATENDENTE(),
    
    /**
     * Limpeza não possui acoes sobre o sistema.
     */
    LIMPEZA();

}
