package atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            double resultado = dividir(num1, num2);
            System.out.println("Resultado da divisão: " + resultado);
            
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {
            scanner.close();
        }
    }
    
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return num1 / num2;
    }
}