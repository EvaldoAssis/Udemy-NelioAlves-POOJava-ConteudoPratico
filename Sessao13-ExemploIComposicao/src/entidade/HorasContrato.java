package entidade;

import java.util.Date;

public class HorasContrato {
	
	private Date date;
	private Double valorPorHora;
	private Integer qntHoras;
	
	public HorasContrato() {
		
	}
	
	public HorasContrato(Date date, Double valorPorHora, Integer qntHoras) {
		this.date = date;
		this.valorPorHora = valorPorHora;
		this.qntHoras = qntHoras;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getQntHoras() {
		return qntHoras;
	}

	public void setQntHoras(Integer qntHoras) {
		this.qntHoras = qntHoras;
	}	
	
	public double valorTotal() {
		return valorPorHora * qntHoras;
	}
}
