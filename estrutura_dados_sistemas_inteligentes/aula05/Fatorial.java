import javax.swing.JOptionPane;

public class Fatorial {
    static int fat(int n){
        int f;

        if(n == 0){
            return 1;
        } else {
            f = n * fat(n-1);
            return f;
        }
    }

    public static void main (String args[]){
        int f, nro;

        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja calcular o fatorial"));

        if(nro < 0){
            System.out.println("Valor inválido para o calculo");
            System.exit(0);
        } else {
            f = fat(nro);
            System.out.println("O faotrial de " + nro + " é " + f);
        }

        System.exit(0);
    }
}
