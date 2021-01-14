package PackageTDA;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class tareas {

	private String Tarea;
	private Date Fecha;
	private boolean TareaCompletada;
	
	public tareas(String tarea, Date fecha, boolean TareaCompletada){
		this.Tarea = tarea;
		this.Fecha = fecha;
		this.TareaCompletada = false;
	}
	
	public String getTarea() {
		   return Tarea;
	}
	public void setTarea(String tarea) { 
			Tarea = tarea;          
    }
	
	public Date getFecha(Date fecha) {
		return Fecha;
	}
	public void setFecha(Date fecha) {
			Fecha = fecha;
	}
	
	public boolean getTareaCompletada() {
		return TareaCompletada;
	}
	public void setTareaCompletada(boolean tc) {
		TareaCompletada = tc;
	}
}
