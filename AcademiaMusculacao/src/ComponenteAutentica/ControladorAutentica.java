/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteAutentica;

import ComponenteCadastro.Funcionario;
import ComponenteCadastro.TipoFuncionario;
import ComponenteSalvaDados.ISalvaDados;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author joaov
 */
public class ControladorAutentica implements IAutentica {
    //Atributos:
    private static ControladorAutentica instancia;
    private String nomeArquivoFuncionario;
    private int numMaxTentativas;
    private ISalvaDados objetoSalvaDados;
    private TelaAutentica telaAutentica;
    private boolean autenticado; //Variavel para controle do metodo iniciarAutenticacaoDeUsuario()
    private Funcionario funcionarioAutenticado;
    private int tentativa = 0;
    
    //Construtor:
    public ControladorAutentica () {
        this.nomeArquivoFuncionario = "funcionarios.dso";
        this.numMaxTentativas = 5;
        this.objetoSalvaDados = null;
        this.telaAutentica = new TelaAutentica(this);
        ControladorAutentica.instancia = this;
        this.autenticado = false;
        this.funcionarioAutenticado = null;
        this.tentativa = 0;
    }
    
    //Metodos:
    @Override
    public Funcionario iniciarAutenticacaoDeUsuario () throws RuntimeException, InterruptedException {
        this.autenticado = false; //Reinicializar o atributo
        this.iniciarTelaAutentica(); //Mostra a tela para input de dados. Vai ocorrer concorrentemente. O a tela vai chamar metodos do controlador para isso.
        while (!autenticado ) { //Parar a execucao desse metodo ateh que o usuario seja autenticado no sistema
            //Nada
            Thread.sleep(0); //Fazer a tread perder a CPU
        }
        //Se for autenticado:
        this.tentativa = 0; //Reinicializar o numero de tentativa
        if (this.funcionarioAutenticado == null) { //Se passar do numero limite de tentativas, joga uma execao para parar o sistema e impedir invasores
            throw new RuntimeException ("O usuário excedeu o número limite de chances para autenticar"); //Quebrar o sistema para nao permitir o acesso da pessoa nao autorizada ou ainda, usar da execao para quem implemente faça alguma medida para bloquear
        } else { //Caso nao passar e a senha estiver correta, retornar quem coseguiu efetuar a autenticacao no sistema:
            return this.funcionarioAutenticado;
        }
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public void setFuncionarioAutenticado(Funcionario funcionarioAutenticado) {
        this.funcionarioAutenticado = funcionarioAutenticado;
    }
    
    public Funcionario autentica (EnvelopeAutenticacao dados) {
        //Recuperar a lista de Funcionarios:
        HashMap<String, Funcionario> funcionarios = new HashMap();
        funcionarios = (HashMap<String, Funcionario>) this.objetoSalvaDados.carregar(this.nomeArquivoFuncionario);
        //Transformar ela em uma array para percorrer:
        Collection<Funcionario> colecaoFuncionarios = (Collection<Funcionario>) funcionarios.values();
        Object[] arrayFuncionarios = colecaoFuncionarios.toArray();
        //Percorrer a array para achar o usuario correspondente:
        for (Object funcionario : arrayFuncionarios) {
            Funcionario fun = (Funcionario) funcionario;
            if (fun.getUsuario().equals(dados.usuario)) {//Se achou o usuario
                if (fun.getSenha().equals(dados.senha)) {//Verificar se a senha eh a certa
                    return fun;
                } else {//Retorna nulo caso contrario:
                    return null;
                }
            }
        }
        //Se nao encontrar na lista:
        return null;
        
    }
    
    /**
     * Aumenta mais um no valor do atributo tentiva. Se a pessoa inserir as credenciais erradas,
     * contabilizar nesse Objeto as tentativas, assim, quando ela chegar no numero maximo permitido
     * de tentativas, o sistema cai.
     */
    public void contabilzarErroNoLogin () {
        this.tentativa++;
    }
    
    public void iniciarTelaAutentica(){
        this.telaAutentica.iniciar();
    }
    
    public static ControladorAutentica getInstance() {
        if (ControladorAutentica.instancia == null) {
            ControladorAutentica.instancia = new ControladorAutentica();
        }
        
        return ControladorAutentica.instancia;
        
    }

    @Override
    public void setObjetoSalvaDados(ISalvaDados objetoSalvaDados) {
        this.objetoSalvaDados = objetoSalvaDados;
    }

    public void setNumMaxTentativas(int numMaxTentativas) {
        this.numMaxTentativas = numMaxTentativas;
    }

    public int getNumMaxTentativas() {
        return numMaxTentativas;
    }

    public int getTentativa() {
        return tentativa;
    }

    @Override
    public void setArquivoFuncionarios(String nomeDoArquivo) {
        this.nomeArquivoFuncionario = nomeDoArquivo;
    }

    @Override
    public void setNumTentativas(int num) {
        this.numMaxTentativas = num;
    }
    
    
    
}
