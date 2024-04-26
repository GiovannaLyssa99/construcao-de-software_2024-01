package atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PreenchimentoVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int index = 0;
        
        try {
            while (true) {
                System.out.print("Digite um número inteiro (0 para parar): ");
                try {
                    int numero = scanner.nextInt();
                    
                    if (numero == 0) {
                        vetor[index++] = numero;
                        break;
                    }
                    
                    vetor[index++] = numero;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Valor informado não é numérico. Ignorando valor...");
                    scanner.next(); // Limpa o buffer do scanner
                }
            }
            
            System.out.println("\nValores inseridos no vetor:");
            int imprimirQuantidade = Math.min(index, vetor.length);
            for (int i = 0; i < imprimirQuantidade; i++) {
                System.out.println(vetor[i]);
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Número máximo de valores excedido. Imprimindo os 10 primeiros valores:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }
        } finally {
            scanner.close();
        }
    }
}