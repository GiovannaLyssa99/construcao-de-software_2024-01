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
                int numero = scanner.nextInt();
                
                if (numero == 0) {
                    vetor[index++] = numero;
                    break;
                }
                
                vetor[index++] = numero;
                
                if (index == 10) {
                    break;
                }
            }
            
            System.out.println("\nValores inseridos no vetor:");
            for (int i = 0; i < index; i++) {
                System.out.println(vetor[i]);
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Número máximo de valores excedido.");
        } finally {
            scanner.close();
        }
    }
}