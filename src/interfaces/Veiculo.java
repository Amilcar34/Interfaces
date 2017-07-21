package interfaces;

public interface Veiculo {
	
	String si = "si";
	String no = "no";

	void especificaPuertas(int puertas);
	int devuelve_puertas();
	
	void especificaRuedas (int ruedas);
	int devuelveRuedas ();
}
