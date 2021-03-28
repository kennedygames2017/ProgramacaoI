package Cap03;

import javax.swing.*;

public class Exercicio03 {
    public  void Login(){
        String login, senha, verifLogin, verifSenha;
        int contador;


        contador = 3;

        while (contador != 0) {
            verifLogin = JOptionPane.showInputDialog("Forneça o Login: ");
            verifSenha = JOptionPane.showInputDialog("Forneça a senha: ");

            login = "java8";
            senha = "java8";

            if (verifLogin.equals(login)  && verifSenha.equals(senha) ) {
                contador = 0;
                JOptionPane.showMessageDialog(null, "Login e senha aceitos!");
            }

            else if (verifLogin != login || verifSenha != senha) {
                contador = contador - 1;
                JOptionPane.showMessageDialog(null, "Verifique o login e a senha!\n" +
                        "Você tem mais " + contador + " tentativas");
            }
        }

    }
}