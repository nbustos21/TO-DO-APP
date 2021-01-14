package PackageTDA;

import java.io.*;
import java.util.*;

public class VerTareas {

	public static void VerTareas() {
		try {
			File LeerTP = new File("src\\PackageTDA\\LeerTP.txt");
			Scanner tp = new Scanner(LeerTP);
			while(tp.hasNextLine()) {
				String datos2 = tp.nextLine();
				System.out.println(datos2);
			}
			File LeerTC = new File("src\\PackageTDA\\LeerTC.txt");
			Scanner tc = new Scanner(LeerTC);
			while(tc.hasNextLine()) {
				String datos1 = tc.nextLine();
				System.out.println(datos1);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("No se encuentra el archivo");
			e.printStackTrace();	
		}

	} 

}
