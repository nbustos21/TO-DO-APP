package PackageTDA;

import java.util.*;
import PackageTDA.tareas;
import java.io.*;
import java.text.SimpleDateFormat;

public class TareasPendientes {

	public static void TareasPendientes() {
		Scanner sc = new Scanner(System.in);
		Date fecha = new Date();
		tareas Tarea1 = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
			System.out.println("\nAñada Tarea");
			Tarea1 = crearTarea();
			
			try {
				FileWriter fichero = new FileWriter("src\\PackageTDA\\LeerTP.txt",true);
				PrintWriter pw = new PrintWriter(fichero);
				pw.println(Tarea1.getTarea());
				pw.println(dateFormat.format(Tarea1.getFecha(fecha)));
				pw.println("------------------------------------");
				pw.close();
				System.out.println("Tarea Guardada");
				
			} catch (Exception e) {
				System.err.println("Problema para abrir el archivo");
				}
		}
		

	public static tareas crearTarea() {
        Scanner creador =new Scanner (System.in);
        String tarea = creador.nextLine();
        Date fecha = new Date();
        return new tareas(tarea,fecha,false);
}
}
