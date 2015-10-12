/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploagregacao;

/**
 *
 * @author Avell B155 MAX
 */
public class ExemploAgregacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Primeiramente instanciamos os jogadores
        
        Jogador j1 = new Jogador("Fred", 45, "Atacante");
        Jogador j2 = new Jogador("Ricardo Oliveira", 45, "Atacante");
        Jogador j3 = new Jogador("Kaká", 45, "Meia");
        
        
        // Depois instanciamos o Time
        
        Time selecao = new Time();
        
        
        // Inserimos os jogadores no time
        
        selecao.contrataJogador(j1);
        selecao.contrataJogador(j2);
        selecao.contrataJogador(j3);
        
        
        
    }
    
}
