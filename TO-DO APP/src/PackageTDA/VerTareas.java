package PackageTDA;

import java.io.*;
import java.util.*;

public class VerTareas {

	public static void VerTareas() {
		try {
			File LeerTDA = new File("src\\PackageTDA\\TDA.txt");
			Scanner tda = new Scanner(LeerTDA);
			while(tda.hasNextLine()) {
				String datos2 = tda.nextLine();
				System.out.println(datos2);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("No se encuentra el archivo");
			e.printStackTrace();	
		}

	} 

}
