package cap02;
// Exemplo 2.2 - Comentarios
/**
 * Essa classe demonstra a utilização de variáveis em uma classe
 * em Java. São declaradas variáveis do tipo int e double.
 * O exemplo também demonstra como imprimir o conteúdo das variáreis na tela
 */

public class Exemplo2 {
    public static void main(String args[]) {
        int matricula = 1089, idade = 20; // declaração de variáveis do tipo inteiro
        double dolar = 2.62;
        /* As linhas seguintes enviam o conteúdo das variáveis para a tela */
        System.out.println("Matricula: " +matricula+ "\n idade: " +idade+ "\n dolar: " +dolar);
    }
}