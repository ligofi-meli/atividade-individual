package gomes.filipe.exercicio2.domain;

public class ManipulaStrings {

    public String invertString(String nome) {
        String reverse = new StringBuilder(nome.toUpperCase()).reverse().toString();
        System.out.println(reverse);
        return reverse;
    }

    public void palindromo(String letras) {
        letras = letras.replaceAll("\\s+", "");
        String reverse = new StringBuilder(letras.toUpperCase()).reverse().toString();

        if (letras.equals(reverse))
            System.out.println(letras + " é um palindromo");
        else
            System.out.println(letras + " não é um palindromo");
    }
}
