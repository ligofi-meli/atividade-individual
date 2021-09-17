package gomes.filipe.exercicio3.test;

import gomes.filipe.exercicio3.domain.Quadrado;
import gomes.filipe.exercicio3.domain.Retangulo;

public class TestQuadrado {
    public static void main(String[] args) {
        System.out.println("--- Piso Quadrado ---");
        Quadrado piso = new Quadrado();
        double pisoArea = piso.calculaArea(0.45);
        piso.calcularDiagonal(0.45);
        piso.calcularPerimetro(0.45);

        System.out.println("\n --- Quarto ---");
        Retangulo quarto = new Retangulo();
        double quartoArea = quarto.calculaArea(4,3);
        double quartoPerimetro = quarto.calcularPerimetro(4, 3);
        quarto.quantidadeDePiso(quartoArea, pisoArea );
        double areaReceberPisos = quarto.areaTotaldoRodapeAReceberLajotas(0.15, 4, 3);
        quarto.quantidadeRodape(areaReceberPisos, pisoArea);
    }
}
