package tp.macowins;

import java.util.Date;
import java.util.GregorianCalendar;

public class Venta {
	
	//Variables
	private Prenda prenda;
	private Date fechaDeVenta;
	private int cantidad;
	
	//Constructor
	public Venta (Prenda unaPrenda, int unDia, int unMes, int unAno, int cantPrendas){
		
		this.prenda = unaPrenda;
		this.cantidad = cantPrendas;
		
		GregorianCalendar miCalendario = new GregorianCalendar(unAno, (unMes-1), unDia);
		
		this.fechaDeVenta = miCalendario.getTime();
	}
	
	//Metodos
	public double precioTotalVenta(){
		return (prenda.precioFinal()*this.cantidad);
	}
}
