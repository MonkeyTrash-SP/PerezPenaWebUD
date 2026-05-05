package cdt.modelo;

public class ModeloCDT {

	private double inversion;
	private double interes;
	private double plazo;

	public ModeloCDT(double inversion, double interes, double plazo) {
		this.inversion = inversion;
		this.interes = interes;
		this.plazo = plazo;
	}

	public double getInversion() {
		return inversion;
	}

	public double getInteres() {
		return interes;
	}

	public double getPlazo() {
		return plazo;
	}
}