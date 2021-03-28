package cap02;
// Exemplo 2.6 - Entrada Com BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplo6 {
    public static void main(String args[]) {
        String s;
        float largura, comprimento, area, perimetro;
        BufferedReader dado;
        try {
            System.out.println("Entre com o comprimento");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.println("Entre com a largura");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            largura = Float.parseFloat(s);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;
            System.out.println("Área do retângulo: " + area);
            System.out.println("Perímetro do retângulo: " + perimetro);
        } catch (IOException erro) {
            System.out.println("Houve erro na entrada de dados" + erro.toString());
        } catch (NumberFormatException erro) {
            System.out.println("Houve erro na conversão, digite apenas caracteres numericos" + erro.toString());
        }
    }
}