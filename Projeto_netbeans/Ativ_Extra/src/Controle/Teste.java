package Controle;

import Modelo.JogoDez;

public class Teste {
    public static void main(String[] args) {
        JogoDez jogo = new JogoDez(12,8);
        Handler h = new Handler(jogo);
    }
}
