package gomes.filipe.exercicio2;

import gomes.filipe.exercicio2.domain.ManipulaStrings;

public class Main {

    public static void main(String[] args) {
        ManipulaStrings ms = new ManipulaStrings();

        ms.invertString("filipe");

        ms.palindromo("ovo");
        ms.palindromo("osso");
        ms.palindromo("subi no onibus");
        ms.palindromo("a cera causa sua careca");
        ms.palindromo("a diva avida dadiva a vida");
        ms.palindromo("ame o poema");
        ms.palindromo("ada xzada");
    }
}
