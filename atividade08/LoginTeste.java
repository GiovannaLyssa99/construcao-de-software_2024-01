package atividade08;

import java.util.Scanner;

public class LoginTeste {
    public static void main(String[] args) {
        Login login = new Login("UsuarioTeste", "SenhaTeste");

        Scanner scanner = new Scanner(System.in);
        boolean loginSucesso = false;

        while (!loginSucesso) {
            System.out.print("Digite o usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            try {
                loginSucesso = login.fazerLogin(usuario, senha);
                if (loginSucesso) {
                    System.out.println("Login realizado com sucesso");
                }
            } catch (LoginInvalidoException e) {
                System.out.println("Erro ao fazer login: " + e.getMessage());
            }
        }

        scanner.close();
    }
}