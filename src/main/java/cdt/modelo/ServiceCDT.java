package cdt.modelo;

public class ServiceCDT {

	private static final double ANIO = 360;

	public double calcularGanancia(double inversion, double interes, double plazo) {
		interes = interes / 100;
		return inversion * (interes * (plazo / ANIO));
	}

	public double calcularImpuesto(double ganancia) {
		return ganancia * 0.04;
	}

	public double calcularValorFinal(double inversion, double ganancia, double impuesto) {
		return inversion + ganancia - impuesto;
	}
}