
public class Perfum {

	// PROPIEDADES
	String nom;
	String marca;
	double mililitres;
	double altura;
	String olor;
	double mililitresRestants = mililitres;

	// CONSTRUCTORES
	public Perfum(String nom, String marca, double mililitres, double altura, String olor, double mililitresRestants) {
		this.nom = nom;
		this.marca = marca;
		this.mililitres = mililitres;
		this.altura = altura;
		this.olor = olor;
		this.mililitresRestants = mililitresRestants;
	}

	// MÉTODOS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getMililitres() {
		return mililitres;
	}

	public void setMililitres(double mililitres) {
		this.mililitres = mililitres;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getOlor() {
		return olor;
	}

	public void setOlor(String olor) {
		this.olor = olor;
	}

	public double getMililitresRestants() {
		return mililitresRestants;
	}

	public void setMililitresRestants(double mililitresRestants) {
		this.mililitresRestants = mililitresRestants;
	}

	void perfumar() {
		this.mililitresRestants -= 0.1;
	}
}