package PackageTDA;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import PackageTDA.*;


public class main {

	public static void main(String[] args) {
		
		String TDA = "C:\\Users\\Nico\\eclipse-workspace\\TO-DO APP\\src\\PackageTDA\\TDA.txt";
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
	
}
