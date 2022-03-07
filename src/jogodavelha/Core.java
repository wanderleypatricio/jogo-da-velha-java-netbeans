/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author Wanderley Patrício
 */
public class Core {
 
    public static String verificaBotao(String botao){
        if(botao.equals("X") || botao.equals("O")){
            return "Esse botão já foi clicado, escolha um que ainda esteja vazio!";
        }else{
            
        }
        return null;
    }
}
