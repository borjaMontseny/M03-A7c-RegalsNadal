
public class Llibre {
	String titol;
	String autor;
	int numeroPagines;
	double llarg;
	double ample;
	int paginaActual = 0;

	void setMarcador(int pagina) {
		this.paginaActual = pagina;
	}

	int paginesRestants() {
		return numeroPagines - paginaActual;
	}
}