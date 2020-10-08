package proceso;

import java.util.*;

public class Proceso {

	private ArrayList<Tarea> tareas;
	private ArrayList<Fase> fases;
	private ArrayList<Actividad> actividades;

	public Proceso(ArrayList<Tarea> tareas, ArrayList<Fase> fases, ArrayList<Actividad> actividades) {
		this.tareas = tareas;
		this.fases = fases;
		this.actividades = actividades;
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}

	public ArrayList<Fase> getFases() {
		return fases;
	}

	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}

	public ArrayList<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<Actividad> actividades) {
		this.actividades = actividades;
	}
}