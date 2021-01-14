package PackageTDA;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import PackageTDA.*;


public class main {

	public static tareas[] tasks=new tareas[50];
	public static int noTareas = 0;
	public static void main(String[] args) {
		
		Scanner inicio = new Scanner(System.in);
		System.out.println("\tBienvenido al administrador de tareas.");
		
		boolean funcionar = true;
		while(funcionar == true) {
			
		System.out.println("\t\t¿Que desea hacer?");
		System.out.println("\n1- Añadir nueva tarea");
		System.out.println("2- Completar tarea");
		System.out.println("3- Ver tareas");
		System.out.println("4- Salir");
		
		int opcion = inicio.nextInt();
		inicio.nextLine();
		
		
		switch (opcion) {
		
		case 1:
			TareasPendientes.TareasPendientes();
			break;
		case 2:
			TareasCompletadas.TareasCompletadas();
			break;
		case 3:
			VerTareas.VerTareas();
			break;
		case 4:
			System.out.println("\nHasta la próxima mi pana");
			 funcionar = false;
			 break;
			}

		}

	}
	
	private static void leerArchivo() {
		Scanner tda;
		try {
			File LeerTDA = new File("src\\PackageTDA\\TDA.txt");
			tda = new Scanner(LeerTDA);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(tda.hasNextLine()) {
			String datos = tda.nextLine();
			//Falta ir generando Tareas
			String titulo = datos.split("_")[0];
			Date fecha = datos.split("_")[1];
			System.out.println(datos);
			tasks[noTareas++] = new Tarea(titulo,fecha,estado);
		}
	}
	
	private static void escribirArchivo() {
		
	}
	
	private static void crearTarea() {
		
	}
	
	private static void completarTarea() {
		
	}
	
}
