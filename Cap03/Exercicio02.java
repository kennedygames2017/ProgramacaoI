package Cap03;

import javax.swing.*;

public class Exercicio02 {
    public  void Resistencia (){
        float a, b, c, d, maior, menor, re;
        String aux;

        aux = JOptionPane.showInputDialog("Informe a primeira resistencia.");
        a = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Informe a primeira resistencia.");
        b = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Informe a primeira resistencia.");
        c = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Informe a primeira resistencia.");
        d = Float.parseFloat(aux);

        re = a+b+c+d;

        maior = a;
        menor = a;

        if (b > maior) {
            maior = b ;
        }
        if (c > maior) {
            maior = c ;
        }
        if (d > maior) {
            maior = d ;
        }
        if (b < menor) {
            menor = b ;
        }

        if (c < menor) {
            menor = c ;
        }

        if (d < menor) {
            menor = d ;
        }
        JOptionPane.showMessageDialog(null, "Resistências fornecidas: " +a+"  "+b+"  "+c+"  "+d+
                "\nA resistência equivalente: "+re+"\nA maior resistência: "+maior+"\nA menor resistência: "+menor);
    }
}