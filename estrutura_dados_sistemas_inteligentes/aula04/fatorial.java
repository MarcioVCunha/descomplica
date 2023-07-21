import javax.swing.JOptionPane;

public class fatorial {
    public static void fat(int valor, int mult) {
        if (valor > 1) {
            mult *= valor;
            fat(valor - 1, mult);
        } else {
            System.out.println("O valor do fatorial é " + mult);
        }
    }

    public static void main(String args[]) {
        int valor;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja calcular o fatorial"));
        if (valor <= 0) {
            System.out.println("O valor do fatorial é 1");
        } else {
            fat(valor, 1);
        }
    }
}
