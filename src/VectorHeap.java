import java.util.PriorityQueue;
import java.util.Vector;
/**
 * 
 * @author Daniela Batz 19214
 *
 * @param <E>
 */
public class VectorHeap<E extends Comparable<E>> implements iPriorityQueue<E> {
	/**
	 * data es el que se encarga de almacenar la infromacion del VectorHeap 
	 */
	protected Vector<E> data;
	/**
	 * Constructor sin ningun vector determinado
	 */
	public VectorHeap() {
		data = new Vector<E>();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param vh convierte a VectorHeap
	 */
	public VectorHeap(Vector<E> vh) {
		
	}

}
