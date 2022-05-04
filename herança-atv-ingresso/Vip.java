public class Vip extends Ingresso{
	
	float valor_ad = 10;

	public float getValor_ad() {
		return valor_ad;
	}

	public void setValor_ad(float valor_ad) {
		this.valor_ad = valor_ad;
	}
	
	public float ValorAdicional(float valorAd) {
		
		valorAd += getValor();
		
		return valorAd;
	}
}
