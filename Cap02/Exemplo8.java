package cap02;
// Exemplo 2.8 - Entrada com JOptionPane

import javax.swing.*;

public class Exemplo8 {
    public static void main(String args[]) {
        String aux;
        float largura, comprimento, area, perimetro;
        try {
            aux = JOptionPane.showInputDialog("Entre com o comprimento");
            comprimento = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com a largura");
            largura = Float.parseFloat(aux);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            JOptionPane.showMessageDialog(null, "Área: " + area + ", Perímetro: " + perimetro);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite " +
                    "apenas caracteres numericos" +erro.toString());
        }
        System.exit(0);
    }
}