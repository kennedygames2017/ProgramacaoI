package Cap03;

import javax.swing.*;

public class Exercicio04 {
    public  void Tabuada(){

        String aux;
        int numero;

        aux = JOptionPane.showInputDialog("Informe o valor da tabuada");
        numero = Integer.parseInt(aux);

        JOptionPane.showMessageDialog(null, numero+"x1 ="+(numero*1)+"\n"
                +numero+"x2 ="+(numero*2)+"\n"
                +numero+"x3 ="+(numero*3)+"\n"
                +numero+"x4 ="+(numero*4)+"\n"
                +numero+"x5 ="+(numero*5)+"\n"
                +numero+"x6 ="+(numero*6)+"\n"
                +numero+"x7 ="+(numero*7)+"\n"
                +numero+"x8 ="+(numero*8)+"\n"
                +numero+"x9 ="+(numero*9)+"\n"
                +numero+"x10 ="+(numero*10)+"\n");


    }
}