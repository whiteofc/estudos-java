package atividadetrycatch.atv2;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        int mes;

        while(true){

            String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

            try {
                mes = (Integer.parseInt(JOptionPane.showInputDialog("Informe o mês desejado em numeros inteiros (Digite 99 para sair): ")));
                if(mes == 99){
                    break;
                }
                else if(mes < 0 || mes > 12 && mes != 99){
                    JOptionPane.showMessageDialog(null, "Valor digitado não corresponde ao mês");
                }
                else
                    JOptionPane.showMessageDialog(null, meses[mes - 1]);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite numeros inteiros!");
            }
        }
    }
}