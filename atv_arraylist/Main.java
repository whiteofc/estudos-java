import java.util.ArrayList;
import javax.swing.*;
public class Main{

    public static void main(String[] args) {

        ArrayList <String> lista = new ArrayList<>();
        ArrayList <String> lista2 = new ArrayList<>();

        int count = 0;

        JOptionPane.showMessageDialog(null, "Informe 10 palavras!");
        for(int i = 0; i < 10;i++){
        lista.add(JOptionPane.showInputDialog("Insira a " + (i + 1) + "º palavra"));
            if(lista.get(count).length() < 3){
                lista2.add(lista.get(count));
                lista.remove(lista.get(count));
                count--;            
            }
            count++;
        }

    JOptionPane.showConfirmDialog(null,"Palavras da lista 1 = " + lista);
    JOptionPane.showMessageDialog(null,"Tamanho da Lista 1, de 10 restou = " + lista.size());
    JOptionPane.showMessageDialog(null, "Palavras da lista 2 = " + lista2);
    JOptionPane.showMessageDialog(null," Tamanho da Lista 2 = " + lista2.size());
    }
}
