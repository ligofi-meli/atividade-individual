package gomes.filipe.exercicio3.domain;

import java.text.DecimalFormat;

public class Quadrado {

    DecimalFormat df = new DecimalFormat("0.00");

    public double calculaArea(double lado) {
        double calc = Math.pow(lado,2);
        System.out.println("Área: " + calc + " m²");
        return calc;
    }

    public double calcularDiagonal(double lado) {
        double calc = Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
        System.out.println("Diagonal: " + df.format(calc) + " m");
        return calc;
    }

    public double calcularPerimetro(double lado) {
        double calc = 4 * lado;
        System.out.println("Perímetro: " + df.format(calc) + " m");
        return calc;
    }

    public double quantidadeDePiso(double areaTotalDoPatio, double areaDaLajota) {
        double quantidade = areaTotalDoPatio / areaDaLajota;
        System.out.println("Quantidade de lajotas necessárias: " + df.format(quantidade) + " un.");
        return quantidade;
    }

    public double areaTotaldoRodapeAReceberLajotas(double alturaRodape, double lado) {
        double calc = ((alturaRodape * lado) + (alturaRodape * lado)) * 2;
        System.out.println("Area total do rodapé a receber lajotas: " + df.format(calc) + " m²");
        return calc;
    }

    public double quantidadeRodape(double areaTotaldoRodapeAReceberLajotas, double areaDaLajota) {
        double quantidade = areaTotaldoRodapeAReceberLajotas / areaDaLajota;
        System.out.println("Quantidade de lajotas necessárias para o rodapé: " + df.format(quantidade) + " un.");
        return quantidade;
    }
}
