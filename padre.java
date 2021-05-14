mport java.util.ArrayList;
import java.util.Random;

public class Test {
	static ArrayList<Object> gen = new ArrayList<Object>();
	
	public static void main(String[] args) {
		guardarEdificioOfi();
		guardarPolideportivos();
		mostrarNums();
	}
	
	public static void guardarPolideportivos() {
		Polideportivo aux;
		Edificio edi1;
		InstalacionDeportiva instDe1;
				
		for (int i = 0; i < 3; i++) {
			edi1 = new Edificio();
			edi1.setSuperficieEdificio(i*12.0);
			
			instDe1 = new InstalacionDeportiva();
			instDe1.setSuperf(i*15.0);
			instDe1.setTipoDeInstalacion(i);
			
			aux = new Polideportivo();
			aux.setEdif(edi1);
			aux.setInstDep(instDe1);
			aux.setNom("Polidep " + (i+1));
			
			gen.add(aux);
		}
	}
	
	public static void guardarEdificioOfi() {
		EdificioOficinas aux;
		Edificio edi1;
				
		for (int i = 0; i < 2; i++) {
			edi1 = new Edificio();
			edi1.setSuperficieEdificio(i*13.0);
			
			aux = new EdificioOficinas();
			aux.setEdif(edi1);
			aux.setNumOficinas(i+5);
			
			gen.add(aux);
		}
	}
	
	public static void mostrarNums() {
		for(Object i : gen){
			System.out.println(i);
		}
	}
	
}
