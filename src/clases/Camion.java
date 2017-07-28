package clases;

public final class Camion extends Veiculos {
	
	boolean acopladoDoble;

	
	public Camion (boolean acopladoDoble, int cantRuedas, double cilindrada) {
		super();
		
		this.cantidadPuertas = 2;
		this.acopladoDoble = acopladoDoble;
		this.cantidadRuedas = cantRuedas;
		this.cilindrada = cilindrada;
		
	}
	
	public boolean devuelveAcopladoDoble() {
		return acopladoDoble;}
	

}
