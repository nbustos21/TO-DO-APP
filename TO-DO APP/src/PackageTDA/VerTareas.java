package PackageTDA;

import java.io.*;
import java.util.*;

public class VerTareas {

	public static void main(String[] args) {
		try {
			File myFile = new File("C:\\Users\\Nico\\eclipse-workspace\\TO-DO APP\\src\\PackageTDA\\TDA.txt");
			Scanner sc = new Scanner(myFile);
			while(sc.hasNextLine()) {
				String datos = sc.nextLine();
				System.out.println(datos);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("No se encuentra el archivo");
			e.printStackTrace();	
		}

	}

}
