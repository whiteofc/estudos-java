package ProjetoEscola;
import javax.swing.*;
public class Aluno implements Coordenacao, Sala, Professor{

    private String nome;
    private String lab;
    private String escolha;
    private String escolha_lab;
    private String materia = "Desenvolvimento em Linguagem C";
    private String freq = "80%";
    private String curso = "Informática";
    private double media = 0;
    private double n1;
    private double n2;
    private int qtd_pc = 20;

    public String getFreq() {
        return freq;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN1() {
        return n1;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getN2() {
        return n2;
    }
    public double setN1(String string) {
        return this.n1 = Double.parseDouble(string);
     }
    public double setN2(String string) {
         return this.n2 = Double.parseDouble(string);
     } 
    public void setEscolha_lab(String escolha_lab) {
        this.escolha_lab = escolha_lab;
    }
    public String getEscolha_lab() {
        return escolha_lab;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public double getMedia() {
        media = (this.n1 + this.n2) / 2;
        return media;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getMateria() {
        return materia;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }
    public String getEscolha() {
        return escolha;
    }

    @Override
    public void materia() {
        JOptionPane.showMessageDialog(null, "Escolha sua matéria: \n"); 
        setEscolha(JOptionPane.showInputDialog("1 - Lógica de Programação \n 2 - Desenvolvimento Web \n 3 - Desenvolvimento em Linguagem C \n 4 - Desenvolvimento em Linguaguem Java "));

            if(escolha.equals("1")){
            JOptionPane.showMessageDialog(null, "Você escolheu: Lógica de Programação");
            this.materia = "Lógica de Programação";
            }
            else if(escolha.equals("2")){
            JOptionPane.showMessageDialog(null, "Você escolheu: Desenvolvimento Web com Html, css & Js");
            this.materia = "Desenvolvimento Web com Html, css & Js";
            }
            else if(escolha.equals("3")){
            JOptionPane.showMessageDialog(null, "Você escolheu: Desenvolvimento em Linguagem C");
            this.materia = "Desenvolvimento em Linguagem C";
            }
            else if(escolha.equals("4")){
            JOptionPane.showMessageDialog(null, "Você escolheu: Desenvolvimento em Linguagem Java");
            this.materia = "Desenvolvimento em Java";
            }
        //JOptionPane.showMessageDialog(null,"A Matéria que você escolheu foi: " + materia);
        }
    @Override
    public double nota1() {
        this.media += n1;
        return media;
    }
    @Override
    public double nota2() {
        this.media += n2;
        return media;
    }
    public void setLab(String lab) {
        this.lab = lab;
    }
    public String getLab() {
        return this.lab;
    }
    public void lab(String lab_escolha) {
        if(escolha_lab.equals("1")){
        this.lab = "Lab 1º andar - Tecnologia";
        }
        else if(escolha_lab.equals("2")){
        this.lab = "Lab 2º andar - Tecnologia";
        }
        else if(escolha_lab.equals("3")){
        this.lab = "Lab 3º andar - Tecnologia";
        }
    }
    @Override
    public void qtd_pcs() {
        JOptionPane.showMessageDialog(null, qtd_pc);
    }
    @Override
    public double media() {
        media = this.n1 / this.n2;
        return media;
    }
    @Override
    public void curso() {
        JOptionPane.showMessageDialog(null, "Você será matriculado no curso de: " + curso);
    }
    @Override
    public void frequencia() {
        JOptionPane.showMessageDialog(null, freq);
    }
    @Override
    public void aprovacao() {
            JOptionPane.showMessageDialog(null, "Aluno: " + getNome() + "\nTurma: " + curso + "\n" + "Matéria: " + "Sua frequência foi de: " + getFreq() + "\n" + getMateria() + "\n" + "Seu laboratorio é: " + lab + "\n" + "1° Nota = " + n1 + "\n" + "2° Nota = " + n2 + "\n" + "Média final: " + getMedia());
            if(media >= 7){
                JOptionPane.showMessageDialog(null, "Você foi APROVADO!");
            }
            else
                JOptionPane.showMessageDialog(null, "Você foi REPROVADO!");
    }
}
