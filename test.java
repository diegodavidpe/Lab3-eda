  
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main (String [] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList <Persona> lista= new ArrayList<Persona>(5);
		
		lista.add(new Persona("Sofia", 15, "mujer"));
		lista.add(new Persona("Ana", 20, "mujer"));
		lista.add(new Persona("Sofi", 17, "mujer"));
		lista.add(new Persona("Andrea", 5, "mujer"));
		lista.add(new Persona("Juan", 25, "hombre"));
		OperacionesArray.mostrarArray(lista);
		System.out.println("Posicion de Ana:  " +OperacionesArray.posicion(lista, "Ana"));
		OperacionesArray.eliminar(lista, "juan");
		OperacionesArray.mostrarArray(lista);
		
	}
	
}
