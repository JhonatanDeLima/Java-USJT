import javax.swing.JOptionPane;

public class TesteFatorial {
    public static void main(String[] args) {
        // Entrada de dados
        String sN = JOptionPane.showInputDialog("Digite o valor de N");
        int iN = Integer.parseInt(sN);

        // Verifica se o número é negativo
        if(iN < 0) {
            JOptionPane.showMessageDialog(null, "Não existe fatorial para números negativos.");
        } else {    
            // Calcula o fatorial
            long lNFat = calculaFatorial(iN);
            JOptionPane.showMessageDialog(null, "Para N = " + iN + ", o fatorial de N é " + lNFat);
        }
        
        System.exit(0);
    }

    // Função para calcular o fatorial
    public static long calculaFatorial(int iN) {
        long lNFat = 1; // Inicializa o fatorial como 1
        while(iN > 0) {
            lNFat = lNFat * iN;
            iN--;
        }
        return lNFat;
    }
}
