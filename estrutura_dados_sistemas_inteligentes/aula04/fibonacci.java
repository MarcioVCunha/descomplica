import javax.swing.JOptionPane;

public class fibonacci {
    public static void achar_fib(int valor, int soma) {
        if (valor != 0) {
            soma += valor;
            achar_fib(valor - 1, soma);
        } else {
            System.out.println("O valor do Fibonacci é: " + soma);
        }
    }

    public static void main(String args[]) {
        int valor;

        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja calcular o Fibonacci"));
        if (valor <= 1) {
            System.out.println("O valor do Fibonacci é " + valor);
        } else {
            achar_fib(valor, 0);
        }
    }
}
