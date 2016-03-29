package tp.macowins;

public class PrendaInt extends Prenda {

	//Variables
	private double tasaImportacion = 0.3;
	
	//Constructor
	public PrendaInt(TipoPrenda unaPrenda) {
		super(unaPrenda);
	}

	//Metodos
	@Override
	public double precioFinal(){
		return (super.precioFinal() + (super.precioFinal() * tasaImportacion));
	}
}
