import javax.swing.JOptionPane;

public class FatorialP {
    static void fatP(int n, int x, int f){
        if(x <= 1){
            System.out.println("O fatorial de " + n + " é " + f);
        } else {
            fatP(n, x-1, f*x);
        }
    }

    public static void main(String args[]){
        int nro;
        nro = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que quer calcular o faotiral"));
        if(nro < 0){
            System.out.println("Valor inválido para o calculo de fatoria, o valor precisa ser maior que 0");
            System.exit(0);
        } else {
            fatP(nro, nro, 1);
        }
        System.exit(0);
    }
}
