
public class Llibre {

	// PROPIEDADES
	String titol;
	String autor;
	int numeroPagines;
	double llarg;
	double ample;
	int paginaActual = 0;

	// CONSTRUCTORES
	public Llibre(String titol, String autor, int numeroPagines, double llarg, double ample, int paginaActual) {
		this.titol = titol;
		this.autor = autor;
		this.numeroPagines = numeroPagines;
		this.llarg = llarg;
		this.ample = ample;
		this.paginaActual = paginaActual;
	}

	// MÉTODOS

	void setMarcador(int pagina) {
		this.paginaActual = pagina;
	}

	int paginesRestants() {
		return numeroPagines - paginaActual;
	}
}