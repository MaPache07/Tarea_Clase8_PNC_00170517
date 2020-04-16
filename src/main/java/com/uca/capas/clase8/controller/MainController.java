package com.uca.capas.clase8.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/iAlumno")
	public @ResponseBody String tareaClase8() {
		return "Nombre: Mauricio Pacheco<br>Carnet: 00170517<br>Carrera: Ingenieria Informatica<br>Anio: 4to año ";
	}
	
	@RequestMapping("/pFecha")
	public @ResponseBody String diaClase8(HttpServletRequest request) {
		Integer pDia = Integer.parseInt(request.getParameter("dia"));
		Integer pMes = Integer.parseInt(request.getParameter("mes"));
		Integer pAnio = Integer.parseInt(request.getParameter("anio"));
		Calendar calendar = Calendar.getInstance();
		calendar.set(pAnio, pMes-1, pDia-1);
		String dia = "";
		switch(calendar.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				dia = "lunes";
				break;
			case 2:
				dia = "martes";
				break;
			case 3:
				dia = "miercoles";
				break;
			case 4:
				dia = "jueves";
				break;
			case 5:
				dia = "viernes";
				break;
			case 6:
				dia = "sabado";
				break;
			case 7:
				dia = "domingo";
				break;
		}
		return "El dia es " + dia;
	}
}


