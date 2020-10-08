package proceso;

public class Tarea {

	private Proceso proceso;
	private Fase fase;
	private Actividad actividad;

	public Tarea(Proceso proceso, Fase fase, Actividad actividad) {
		this.proceso = proceso;
		this.fase = fase;
		this.actividad = actividad;
	}

	public Proceso getProceso() {
		return proceso;
	}

	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
}