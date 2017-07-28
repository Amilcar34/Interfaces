package clases;

import interfaces.Veiculo;

public abstract class Veiculos implements Veiculo{

	protected int cantidadPuertas;
	protected int cantidadRuedas;
	protected double cilindrada;
	

	public Veiculos(){
		
	}

	@Override
	public void especificaPuertas(int puertas) {
		this.cantidadPuertas = puertas;}

	@Override
	public int devuelve_puertas() {
		return (Integer) cantidadPuertas;}
	
	@Override
	public void especificaRuedas (int ruedas) {
		this.cantidadRuedas = ruedas;}
	
	@Override
	public int devuelveRuedas(){
		return cantidadRuedas;}
	
	@Override
	public void especificaMotor(double cilindrada) {
		this.cilindrada = cilindrada;}

	@Override
	public double devuelveMotor() {
		return cilindrada;}
	
	
	
}
