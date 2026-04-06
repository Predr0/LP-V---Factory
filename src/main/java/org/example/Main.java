package org.example;

public class Main {
    public static void main(String[] args) {
        PlayerMusica playerNaHome = PlayerMusica.getInstance();
        PlayerMusica playerNoPerfil = PlayerMusica.getInstance();

        playerNaHome.setMusicaAtual("Não Uso Sapato - CBJR");

        System.out.println("Música acessada pela Home: " + playerNaHome.getMusicaAtual());
        System.out.println("Música acessada pelo Perfil: " + playerNoPerfil.getMusicaAtual());

        if (playerNaHome == playerNoPerfil) {
            System.out.println("\n[SUCESSO] playerNaHome e playerNoPerfil apontam para a mesma instância!");
        } else {
            System.out.println("\n[ERRO] Existem instâncias diferentes na memória.");
        }
    }
}