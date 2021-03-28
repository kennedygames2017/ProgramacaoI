package Cap03;

import javax.swing.*;

public class Exercicio01{

        public void Produto() {
            String name, aux;
            Float valor_inicio;
            double desconto, valor_final;
            try {
                name = JOptionPane.showInputDialog("Informe o nome do produto");
                aux = JOptionPane.showInputDialog("Informe o valor do produto");
                valor_inicio = Float.parseFloat(aux);
                valor_final = 0;

                if (valor_inicio >= 50 && valor_inicio < 200) {
                    desconto = valor_inicio * 0.05;
                    valor_final = valor_inicio - desconto;
                    JOptionPane.showMessageDialog(null, "Nome do produto: " + name + "\n Valor do produto: "

                } else if (valor_inicio >= 200 && valor_inicio < 500) {
                    desconto = valor_inicio * 0.06;
                    valor_final = valor_inicio - desconto;
                    JOptionPane.showMessageDialog(null, "Nome do produto: " + name + "\n Valor do produto: "
                            + valor_inicio + "\n Valor com desconto: " + valor_final);

                } else if (valor_inicio >= 500 && valor_inicio < 1000) {
                    desconto = valor_inicio * 0.07;
                    valor_final = valor_inicio - desconto;
                    JOptionPane.showMessageDialog(null, "Nome do produto: " + name + "\n Valor do produto: "
                            + valor_inicio + "\n Valor com desconto: " + valor_final);

                } else if (valor_inicio >= 1000) {
                    desconto = valor_inicio * 0.08;
                    valor_final = valor_inicio - desconto;
                    JOptionPane.showMessageDialog(null, "Nome do produto: " + name + "\n Valor do produto: "
                            + valor_inicio + "\n Valor com desconto: " + valor_final);

                } else if (valor_inicio <= 0) {
                    JOptionPane.showMessageDialog(null, "AVISO! \n O valor informado e menor ou igual a 0");
                }

            } finally {


        }
    }
}