package tp.macowins;

public class Test {

	public static void main(String[] args) {
		
		Macowins macowins = new Macowins();
		
		Pantalon pantalon = new Pantalon();
		Camisa camisa = new Camisa();
		Saco saco = new Saco();
				
		Prenda unPantalon = new Prenda (pantalon);
		Prenda unSaco = new Prenda (saco);
		Prenda unaCamisa = new Prenda (camisa);
	
		PrendaInt unPantalonInt = new PrendaInt(pantalon);
		PrendaInt unSacoInt = new PrendaInt(saco);
		PrendaInt unaCamisaInt = new PrendaInt(camisa);

		System.out.println("El pantalon nacional vale: " + unPantalon.precioFinal());
		System.out.println("El pantalon internacional vale: " + unPantalonInt.precioFinal());
			
		System.out.println("El saco nacional vale: " + unSaco.precioFinal());
		System.out.println("El saco internacional vale: " + unSacoInt.precioFinal());
		
		System.out.println("La camisa nacional vale: " + unaCamisa.precioFinal());
		System.out.println("La camisa internacional vale: " + unaCamisaInt.precioFinal());

		Venta unaVenta = new Venta(unPantalon, 25, 3, 2016, 3);

		
	}

}
