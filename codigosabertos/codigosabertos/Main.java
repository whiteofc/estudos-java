package codigosabertos;

import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        Set<String> cpf = new HashSet<>();

        for(int i = 0; i < 10; i++){
            cpf.add(JOptionPane.showInputDialog("Informe seu " + (i + 1) + "º CPF"));
        }
        for(String s : cpf){
            JOptionPane.showMessageDialog(null, s);
        }
    }
}