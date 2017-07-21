package clases;

import interfaces.Veiculo;

public abstract class Veiculos implements Veiculo{

	int cantidadPuertas;

	public Veiculos(){
		int ruedas = 4;
	}

	@Override
	public void especificaPuertas(int puertas) {
		// TODO Auto-generated method stub
		this.cantidadPuertas = puertas;
	}

	@Override
	public int devuelve_puertas() {
		// TODO Auto-generated method stub
		return (Integer) cantidadPuertas;
	}
	
	
	
}
