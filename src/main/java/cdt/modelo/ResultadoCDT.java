package cdt.modelo;

public class ResultadoCDT {

	private String concepto;
	private double valor;

	public ResultadoCDT(String concepto, double valor) {
		this.concepto = concepto;
		this.valor = valor;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getValor() {
		return valor;
	}
}