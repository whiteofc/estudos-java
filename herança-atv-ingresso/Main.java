import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  Scanner ler = new Scanner(System.in);
    Vip v = new Vip();
    Normal n = new Normal();
    Ingresso i = new Ingresso();
    CamaroteSuperior cs = new CamaroteSuperior();
    CamaroteInferior ci = new CamaroteInferior();

    
  int ing,auxVip;
  
  System.out.println("Digite qual ingresso você deseja ");
  System.out.println("1 - Ingresso Normal" + "\n" + "2 - Ingresso Vip");

  ing = ler.nextInt();

  switch(ing){
    case 1:
      if(ing == 1){
        n.Impressao();
        i.ImprimeValor();
      }
    case 2:
      if(ing == 2){
        System.out.println("Digite 1 para camarote superior" + "\n" + "Digite 2 para camarote inferior");
        auxVip = ler.nextInt();
        if(auxVip == 1){
          System.out.println("Ingresso VIP Camarote Superior! valor = " + ci.ValorAdicional(ci.valor_ad));
        }
        else if(auxVip == 2){
          System.out.println("Ingresso VIP CamaroteInferior valor = " + ci.ValorAdicional(ci.valor_ad));
        }
      }
  } 
  }
}