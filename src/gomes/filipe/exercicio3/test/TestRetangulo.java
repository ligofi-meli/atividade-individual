package gomes.filipe.exercicio3.test;

import gomes.filipe.exercicio3.domain.Retangulo;

public class TestRetangulo {

    public static void main(String[] args) {
        System.out.println("--- Porcelanato ---");
        Retangulo porcelanato = new Retangulo();
        double porcelanatoArea = porcelanato.calculaArea(0.15, 1.04);
        porcelanato.calcularPerimetro(0.15, 1.04);
        porcelanato.calcularDiagonal(0.15, 1.04);

        System.out.println("\n --- Patio ---");
        Retangulo patio = new Retangulo();
        double patioArea = patio.calculaArea(4, 3);
        double patioPerimetro = patio.calcularPerimetro(4, 3);
        patio.quantidadeDePiso(patioArea, porcelanatoArea);
        double areaReceberPorcelanas = patio.areaTotaldoRodapeAReceberLajotas(0.15, 4, 3);
        patio.quantidadeRodape(areaReceberPorcelanas, porcelanatoArea);
    }
}
