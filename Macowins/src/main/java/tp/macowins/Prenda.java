package tp.macowins;

public class Prenda {
	
	//Variables
	protected static double ValorFijo = 300;
	protected TipoPrenda tipoPrenda;
	
	//Constructor
	public Prenda(TipoPrenda unaPrenda){
		this.tipoPrenda = unaPrenda;
	}
	
	//Metodo precio final
	public double precioFinal(){
		return (ValorFijo + tipoPrenda.getValorBase());
	}
	
}
