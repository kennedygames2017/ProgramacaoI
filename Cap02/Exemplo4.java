package cap02;
// Exemplo 2.4 - Conversão de Tipos
public class Exemplo4 {
    public static void main(String[] args) {
        String s1 = "10";
        int v = Integer.parseInt(s1);
        float x = Float.parseFloat(s1);
        double y = Double.parseDouble(s1);
        int w = (int) x;
        int z = (int) y;
        String s2 = String.valueOf(v);
        System.out.println(s2 + w + z);
    }
}