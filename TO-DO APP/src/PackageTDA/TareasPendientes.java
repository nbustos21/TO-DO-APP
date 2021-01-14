package PackageTDA;

import java.util.*;
import PackageTDA.tareas;
import java.io.*;
import java.text.SimpleDateFormat;

public class TareasPendientes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date fecha = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		boolean bucle;
		while(bucle = true ){
		System.out.println("\nAñada Tarea");
		String tarea = sc.nextLine();
		
		try {
	 		FileWriter fichero = new FileWriter("C:\\Users\\Nico\\eclipse-workspace\\TO-DO APP\\src\\PackageTDA\\TDA.txt",true);
			PrintWriter pw = new PrintWriter(fichero);
			pw.println(tarea);
			pw.println(dateFormat.format(fecha));
			pw.println("------------------------------------");
			pw.close();
			System.out.println("Tarea Guardada");
			
		} catch (Exception e) {
			System.err.println("Problema para abrir el archivo");
			}
		}
		
}
}
