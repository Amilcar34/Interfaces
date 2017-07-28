package clases;

public class Main {

	public static void main(String[] args) {

		Auto auto1 = new Auto();
		
		auto1.especificaPuertas(5);
		auto1.especificaMotor(1.4);
		
		System.out.println(auto1.devuelve_puertas() + " " + auto1.cantidadRuedas + " " + auto1.devuelveMotor());
	
	
		Camion camion1 = new Camion(true, 16, 3.4);
	
		System.out.println(camion1.devuelveAcopladoDoble() + " " + camion1.devuelveRuedas() + " " + camion1.devuelveMotor() + " " + camion1.devuelve_puertas());
	
	
	
	}
}
