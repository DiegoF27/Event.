package br.gov.sp.etesp.event.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class EventoEntity {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)	
	 private Long id;	 
	 private String evento;
	 private LocalDate dtEvento;
	 private LocalDate dtCadatro;
	 private String status;
	 
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public LocalDate getDtEvento() {
		return dtEvento;
	}
	public void setDtEvento(LocalDate dtEvento) {
		this.dtEvento = dtEvento;
	}
	public LocalDate getDtCadatro() {
		return dtCadatro;
	}
	public void setDtCadatro(LocalDate dtCadatro) {
		this.dtCadatro = dtCadatro;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	 
	 

}
