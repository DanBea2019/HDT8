/**
 * 
 * @author Daniela Batz 19214
 *
 */
import java.io.*; 
import java.util.List;
import java.util.*; 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.util.PriorityQueue;
public class Main {
	public static void main (String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		String file = "pacientes.txt";
		String [] separador; //separa las frases
		BufferedReader tx = new BufferedReader(new FileReader(file));
		
		String linea;
		
		Vector<Paciente> listaPa = new Vector<Paciente>();
		
		try {
			while ((linea = tx.readLine()) != null) {
				//separador de las frases
				separador = linea.split(" , ");
				listaPa.add(new Paciente(separador[0], separador[1], separador[2]));
			}
		} catch (IOException e) {
			System.out.println("ERROR: no se encuentra el archivo");
		}
		//imprime el listado actual de los pacientes
		System.out.println("Listado:\n");
		for (int i=0; i<listaPa.size(); i++) {
			System.out.println(listaPa.get(i));
		}
		
		System.out.println("\nListado de pacientes \nimplementada con JCF:\n");
		
		VectorHeap vectorHeap = new VectorHeap(listaPa);
		String orden="";
		
		while (vectorHeap.iterator().hasNext()) {
			Paciente paciente = (Paciente) vectorHeap.poll();
			orden += paciente.toString()+"\n";
		}
		
		System.out.println(orden);
		
		System.out.println("\nListado de pacientes \nimplementada con VectorHeap:\n");
		
		orden="";
		VectorHeap vectorHeap2 = new VectorHeap(listaPa);
		int size = vectorHeap2.size();
		
		for(int i=0; i<size; i++) {
			Paciente paciente = (Paciente)vectorHeap.remove();
			orden += paciente.toString()+"\n";
		}
		
		System.out.println(orden);
	}
}
