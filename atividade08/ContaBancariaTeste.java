package atividade08;

import java.util.Scanner;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(0);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    realizarSaque(conta, scanner);
                    break;
                case 2:
                    realizarDeposito(conta, scanner);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void realizarSaque(ContaBancaria conta, Scanner scanner) {
        boolean saqueConcluido = false;
        while (!saqueConcluido) {
            System.out.print("Digite o valor a ser sacado: ");
            double valorSaque = scanner.nextDouble();

            try {
                conta.sacar(valorSaque);
                saqueConcluido = true;
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro ao sacar: " + e.getMessage());
                System.out.println("Saldo atual: " + conta.getSaldo());
                System.out.println("Deseja tentar novamente? (S/N)");
                String opcao = scanner.next();
                if (!opcao.equalsIgnoreCase("S")) {
                    break;
                }
            }
        }
    }

    private static void realizarDeposito(ContaBancaria conta, Scanner scanner) {
        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
    }
}