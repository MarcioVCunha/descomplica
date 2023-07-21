import javax.swing.JOptionPane;

public class pensar_responder_aula2 {
    public static void main (String args []){
        int i;
        double notas[], media, soma = 0;
        notas = new double[5];

        for (i = 0; i < 5; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
            soma = soma + notas[i];
        }

        media = soma / 5;
        System.out.println("A média das notas é: " + media);
        System.exit(0);
    }
}
