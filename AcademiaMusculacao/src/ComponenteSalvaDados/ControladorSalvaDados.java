/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteSalvaDados;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author joaov
 */
public class ControladorSalvaDados implements ISalvaDados {
    //Atributos
    
    //Construtor
    
    
    //Metodos
    @Override
    public boolean persistir(Object dado, String nomeDoArquivo) {
        try {
            //Cria um caminho do stream  de dados para um arquivo:
            FileOutputStream caminhoArquivo = new FileOutputStream(nomeDoArquivo);
            //Abre um fluxo para transmitir um objeto:
            ObjectOutputStream fluxoSaidaObjeto = new ObjectOutputStream (caminhoArquivo);
            
            //Grava o objeto no arquivo desejado:
            fluxoSaidaObjeto.writeObject(dado);
            
            //Usar o metodo flush para enviar todos os dados do Buffer, assegurando que o objeto inteiro vai ser enviado:
            fluxoSaidaObjeto.flush();
            caminhoArquivo.flush();
            
            //Fehcar o canal de envio e liberar o arquivo:
            fluxoSaidaObjeto.close();
            caminhoArquivo.flush();
            
            //Liberar o espaço na memoria:
            fluxoSaidaObjeto = null;
            caminhoArquivo = null;

        } catch (FileNotFoundException ex) { //Informa o problema
            System.out.println(ex);
            return false;
        } catch (IOException ex) { //Informa o problema
            System.out.println(ex);
            return false;
        }

        return true;
        
    }

    @Override
    public void carregar(Object dadoCarregar, String nomeDoArquivo) {
        try {
            //Criar um objeto para passar como referencia o nome do Arquivo desejado
            FileInputStream caminhoArquivo = new FileInputStream(nomeDoArquivo);
            //Abrir um fluxo para recuperar os dados do aqruivo:
            ObjectInputStream fluxoEntradaObjeto = new ObjectInputStream(caminhoArquivo);
            
            //Recuperar o Objeto:
            dadoCarregar = fluxoEntradaObjeto.readObject();
            
            //Fehcar o canal de recebimento e liberar o arquivo:
            fluxoEntradaObjeto.close();
            caminhoArquivo.close();
            
            //Liberar memoria:
            fluxoEntradaObjeto = null;
            caminhoArquivo = null;
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
    }
    
}
