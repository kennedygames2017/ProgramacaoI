package cap02;

import java.util.Scanner;

// Exemplo 2.7 - Entrada com Scanner
public class Exemplo7 {
    public static void main(String args[]) {
        float largura, comprimento, area, perimetro;
        Scanner sc;
        try {
            System.out.println("Entre com o comprimento");
            sc = new Scanner(System.in);
            comprimento = sc.nextFloat();

            System.out.println("Entre com a largura");
            sc = new Scanner(System.in);
            largura = sc.nextFloat();

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retângulo: " + area);
            System.out.println("Perímetro do retângulo: " + perimetro);
        } catch (NumberFormatException e) {
            System.out.println("Houve erro na conversão, digite apenas caracteres numericos");
        }
    }
}