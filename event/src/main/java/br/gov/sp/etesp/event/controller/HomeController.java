package br.gov.sp.etesp.event.controller;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etesp.event.model.EventoEntity;
import br.gov.sp.etesp.event.repository.EventoRepository;
import br.gov.sp.etesp.event.util.Status;



@Controller
public class HomeController {
	List<EventoEntity> eventos = new ArrayList<>();
	
	@Autowired
	EventoRepository repository;
	
	@GetMapping("/")
	public String abrirHome() {		
		return "home";
	}
	
	@PostMapping("/adicionar")	
	public ModelAndView adicionarEvento(EventoEntity evento) {		
		evento.setDtCadatro(LocalDate.now());
		evento.setStatus(Status.ABERTO.name());
		repository.save(evento);		
		eventos = repository.findAll();
		ModelAndView view = new ModelAndView("home");
		view.addObject("eventos",eventos);			
		return view;		
	}

}
