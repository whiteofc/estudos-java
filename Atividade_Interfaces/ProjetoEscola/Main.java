package ProjetoEscola;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();

        JOptionPane.showMessageDialog(null,"Bem vindo a Escola de Cursos UMJ");
        a.setN2(JOptionPane.showInputDialog("Informe seu nome: "));
        a.curso();
        a.materia();
        a.setEscolha_lab(JOptionPane.showInputDialog("1 - Lab 1º andar - Tecnologia Disponivel \n 2 - Lab 2º andar - Tecnologia Disponivel \n 3 - Lab 3º andar - Tecnologia Disponivel \n"));
        a.lab(a.getEscolha_lab());
        JOptionPane.showMessageDialog(null,"Chegado o final do curso informe suas notas: ");
        a.setN2(JOptionPane.showInputDialog("Informe sua 1° nota: "));
        a.setN2(JOptionPane.showInputDialog("Informe sua 2° nota: "));
        a.getMedia();
        a.aprovacao();
    }
}
