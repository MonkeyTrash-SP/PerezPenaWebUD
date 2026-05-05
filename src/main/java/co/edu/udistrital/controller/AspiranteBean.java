package co.edu.udistrital.controller;

import java.io.Serializable;
import java.util.ArrayList;

import co.edu.udistrital.model.AspiranteDTO;
import co.edu.udistrital.model.AspiranteDAO;
import co.edu.udistrital.model.ProgAcad;
import co.edu.udistrital.model.ProgAcadDAO;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("asp")
@RequestScoped
public class AspiranteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AspiranteDTO dto = new AspiranteDTO();
	private ArrayList<AspiranteDTO> listaAs = AspiranteDAO.lista_A;
	private ArrayList<ProgAcad> listaPa = ProgAcadDAO.lista_P;

	public AspiranteBean() {
		ProgAcadDAO.cargaDatos();
	}

	public AspiranteDTO getDto() {
		return dto;
	}

	public void setDto(AspiranteDTO dto) {
		this.dto = dto;
	}

	public ArrayList<AspiranteDTO> getListaAs() {
		return listaAs;
	}

	public void setListaAs(ArrayList<AspiranteDTO> listaAs) {
		this.listaAs = listaAs;
	}

	public ArrayList<ProgAcad> getListaPa() {
		return listaPa;
	}

	public void setListaPa(ArrayList<ProgAcad> listaPa) {
		this.listaPa = listaPa;
	}

	public void registrar() {
		if (dto.getPro_acad().getCod() >= 0 && dto.getPro_acad().getCod() < listaPa.size()) {
			dto.setPro_acad(listaPa.get(dto.getPro_acad().getCod()));
		} else {
			dto.setPro_acad(null);
		}
		listaAs.add(dto);
		System.out.println("Se registro: " + dto.toString());
	}

}
