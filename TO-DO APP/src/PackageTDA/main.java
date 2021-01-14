package PackageTDA;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import PackageTDA.tareas;

public class main {

	public static void main(String[] args) {
		String TDA = "C:\\Users\\Nico\\eclipse-workspace\\TO-DO APP\\src\\PackageTDA\\TDA.txt";
		Scanner sc = new Scanner(System.in);
		Date fecha = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println("\tBienvenido al administrador de tareas.");
		
		boolean funcionar = true;
		while(funcionar == true) {
			
		System.out.println("\t\t¿Que desea hacer?");
		System.out.println("\n1- Añadir nueva tarea");
		System.out.println("2- Completar tarea");
		System.out.println("3- Ver tareas");
		System.out.println("4- Salir");
		
		int opcion = sc.nextInt();
		sc.nextLine();
		
		switch (opcion) {
		
		case 1:
			
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
				break;
		case 2:
			System.out.println("\nEn Mantenimiento xD");
			 break;
		case 3:
			try {
				File myFile = new File("C:\\Users\\Nico\\eclipse-workspace\\TO-DO APP\\src\\PackageTDA\\TDA.txt");
				Scanner vista = new Scanner(myFile);
				while(vista.hasNextLine()) {
					String datos = vista.nextLine();
					System.out.println(datos);
				}
				
			}catch (FileNotFoundException e) {
				System.out.println("Problema para abrir el archivo");
				e.printStackTrace();	
			}
			break;
		case 4:
			System.out.println("\nHasta la próxima mi pana");
			 funcionar = false;
			 break;
		}

	}

}
}
