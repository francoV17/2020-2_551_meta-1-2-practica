package proceso;

import java.util.*;

public class Fase {

	private Proceso proceso;
	private ArrayList<Tarea> tareas;

	public Fase(Proceso proceso, ArrayList<Tarea> tareas) {
		this.proceso = proceso;
		this.tareas = tareas;
	}

	public Proceso getProceso() {
		return proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}
}