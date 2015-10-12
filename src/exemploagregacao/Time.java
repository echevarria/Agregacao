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
public class Time {
    
    private String nomeTime;
    private String tecnico;
    private Jogador jogadores[];
    private int totalJogadores;
    
    Time() {
        this.jogadores = new Jogador[30];
        totalJogadores = 0;
    }
    
    public void contrataJogador(Jogador jogador) {
        this.jogadores[this.totalJogadores] = jogador;
        totalJogadores++;
    }
    
}
