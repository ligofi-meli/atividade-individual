package gomes.filipe.exercicio5.test;

import gomes.filipe.exercicio5.domain.Cliente;

import java.util.Scanner;

public class TestCliente {

    public static void main(String[] args) {
        String nome, cpf, endereco, email, telefone;

        Cliente cliente = new Cliente();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();

        System.out.println("Digite seu cpf:");
        cpf = scanner.nextLine();

        System.out.println("Digite seu endereco:");
        endereco = scanner.nextLine();

        System.out.println("Digite seu email:");
        email = scanner.nextLine();

        System.out.println("Digite seu telefone:");
        telefone = scanner.nextLine();

        cliente.cadastraCliente(nome, cpf, endereco, email, telefone);
    }
}
