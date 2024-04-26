package atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            double num1, num2;
            while (true) {
                try {
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Valor informado não é numérico. Digite novamente.");
                    scanner.next();
                }
            }
            
            while (true) {
                try {
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        break;
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida. Digite outro valor.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Valor informado não é numérico. Digite novamente.");
                    scanner.next();
                }
            }
            
            double resultado = dividir(num1, num2);
            System.out.println("Resultado da divisão: " + resultado);
            
        } finally {
            scanner.close();
        }
    }
    
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}