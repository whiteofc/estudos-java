public class Ingresso{
  
    private float valor = 30;
      
      public float getValor() {
          return valor;
      }
  
      public void setValor(float valor) {
          this.valor = valor;
      }
  
    public void ImprimeValor() {
      System.out.print("Valor = ");
          System.out.println(valor);
      }
  }