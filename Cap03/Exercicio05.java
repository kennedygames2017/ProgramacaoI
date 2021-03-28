package Cap03;

import javax.swing.*;

public class Exercicio05 {
    public static void main(String args[]){
        String aux;
        int exercicio;



        aux = JOptionPane.showInputDialog("Digite uma opção:\n1-Exercicio 01\n2-Exercicio 02\n3-Exercicio 03\n4-Exercicio 04");
        exercicio = Integer.parseInt(aux);

        if (exercicio == 1){
            Exercicio01 nome_do_objeto = new Exercicio01();
            nome_do_objeto.Produto();
        }
        if (exercicio == 2){
            Exercicio02 nome_do_objeto = new Exercicio02();
            nome_do_objeto.Resistencia();
        }
        if (exercicio == 3){
            Exercicio03 nome_do_objeto = new Exercicio03();
            nome_do_objeto.Login();
        }
        if (exercicio == 4){
            Exercicio04 nome_do_objeto = new Exercicio04();
            nome_do_objeto.Tabuada();
        }

        if (exercicio != 1 && exercicio != 2 && exercicio != 3 && exercicio != 4){
            JOptionPane.showMessageDialog(null, "Opção invalida!");
        }
    }
}