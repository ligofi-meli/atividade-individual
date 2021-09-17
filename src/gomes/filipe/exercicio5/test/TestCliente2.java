package gomes.filipe.exercicio5.test;

import gomes.filipe.exercicio5.domain.Cliente;

public class TestCliente2 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(
                "Catarina II da Rússia",
                "11122233344",
                "Castelo dos Czares",
                "catqueen@foobar.com",
                "01990988011");

        System.out.println("--- Cliente 1 ----");
        System.out.println("Id: "+ cliente1.getId());
        System.out.println("Nome válido: " + cliente1.nomeValido(cliente1.getNome()));
        System.out.println("Cpf válido: " + cliente1.cpfValido(cliente1.getCpf()));
        System.out.println("Email válido:" + cliente1.emailValido(cliente1.getEmail()));
        System.out.println("Telefone válido: "+ cliente1.telefoneValido(cliente1.getTelefone()));

        Cliente cliente2 = new Cliente(
                "Ayrton Senna",
                "0001114449",
                "Autrodomo de Interlagos",
                "senna.com",
                "01900000120"
        );

        System.out.println("--- Cliente 2 ----");
        System.out.println("Id: "+ cliente2.getId());
        System.out.println("Nome válido: " + cliente2.nomeValido(cliente2.getNome()));
        System.out.println("Cpf válido: " + cliente2.cpfValido(cliente2.getCpf()));
        System.out.println("Email válido:" + cliente2.emailValido(cliente2.getEmail()));
        System.out.println("Telefone válido: "+ cliente2.telefoneValido(cliente2.getTelefone()));
    }
}
