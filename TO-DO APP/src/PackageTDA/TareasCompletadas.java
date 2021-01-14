package PackageTDA;

import java.util.*;
import java.io.*;
import PackageTDA.tareas;

public class TareasCompletadas {

	public static void TareasCompletadas() {
		Scanner TC = new Scanner(System.in);
		tareas Tarea1 = null;
		Tarea1 = crearTarea();
		
		Hashtable tablaincompleta = new Hashtable ();
		Hashtable tablacompleta = new Hashtable ();
		
		try {
			System.out.println("Dime el titulo de la tarea a completar");
			String completada = TC.next();
						
			FileWriter fichero = new FileWriter("src\\PackageTDA\\TDA.txt", true);
			PrintWriter pw = new PrintWriter(fichero);
			
			tablaincompleta.get (completada);
			
			tablaincompleta.remove(Tarea1);
			System.out.println(tablaincompleta);
			tablacompleta.put(Tarea1, true);
			pw.print(tablaincompleta);
			pw.print(tablacompleta);
			}catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
		}

	}
	public static tareas crearTarea() {
		Scanner creador = new Scanner(System.in);
		String tarea = creador.nextLine();
		Date fecha = new Date();
		return new tareas(tarea, fecha, false);
	}

}
