package cdt.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import cdt.modelo.ModeloCDT;
import cdt.modelo.ResultadoCDT;
import cdt.modelo.ServiceCDT;

@Named("cdt")
@ViewScoped
public class BeanCDT implements Serializable {

	private static final long serialVersionUID = 1L;

	private double inversion;
	private double interes;
	private double plazo;
	private double ganancia;
	private double impuesto;
	private double valorFinal;
	private List<ResultadoCDT> resultados = new ArrayList<>();

	private ServiceCDT service = new ServiceCDT();

	public void calcular() {

		System.out.println("CALCULAR EJECUTADO");
		System.out.println("Inversion: " + inversion);
		System.out.println("Interes: " + interes);
		System.out.println("Plazo: " + plazo);
		resultados.clear();

		ModeloCDT modelo = new ModeloCDT(inversion, interes, plazo);

		ganancia = service.calcularGanancia(modelo.getInversion(), modelo.getInteres(), modelo.getPlazo());

		impuesto = service.calcularImpuesto(ganancia);

		valorFinal = service.calcularValorFinal(modelo.getInversion(), ganancia, impuesto);

		resultados.add(new ResultadoCDT("Ganancia", ganancia));
		resultados.add(new ResultadoCDT("Impuesto (4%)", impuesto));
		resultados.add(new ResultadoCDT("Valor Final", valorFinal));
	}

	public void limpiar() {
		inversion = 0;
		interes = 0;
		plazo = 0;
		ganancia = 0;
		impuesto = 0;
		valorFinal = 0;
		resultados.clear();
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
		this.inversion = inversion;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getPlazo() {
		return plazo;
	}

	public void setPlazo(double plazo) {
		this.plazo = plazo;
	}

	public double getGanancia() {
		return ganancia;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public List<ResultadoCDT> getResultados() {
		return resultados;
	}
}