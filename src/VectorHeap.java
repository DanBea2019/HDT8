import java.util.PriorityQueue;
import java.util.Vector;
/**
 * Extraido de: Duane A Bailey (2007) java structures in java for principled programmer
 * @author Daniela Batz 19214
 *
 * @param <E>
 */
public class VectorHeap <E extends Comparable<E>> implements iPriorityQueue<E> {
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
		int i;
		data = new Vector<E>(vh.size());
		/**
		 * Agrega un nuevo elemennto al heap
		 */
		for (i=0; i < vh.size(); i++) {
			add(vh.get(i));
		}
	}
	/**
	 * Va a retonar el padre del nodo que indique
	 * @param i es el Nodo del cual conocera el padre
	 * @return el padre del Nodo en la posicion i
	 */
	protected static int padre(int i){
		return (i-1)/2;
	}
	/**
	 * Va a retonar el hijo izquierdo del nodo que se va a indicar
	 * @param i es el Nodo del cual se conocera el hijo izquierdo
	 * @return la localidad del izquierdo del Nodo
	 */
	protected static int izq(int i) {
		return 2*i+1;
	}
	/**
	 * Se retornara el hijo derecho del nodo
	 * @param i es el Nodo del cual se conocera el hijo derecho
	 * @return la localidad del hijo derecho del nodo
	 */
	protected static int der(int i) {
		return 2*(i+1);
	}
	
	/**
	 * @param hoja indica el nodo en unamejor posicion
	 */
	protected void filtrar(int hoja) {
		int padre = padre(hoja);
		E value = data.get(hoja);
		
		while (hoja > 0 && value.compareTo(data.get(padre)) < 0){
			data.set(hoja, data.get(padre));
			hoja = padre;
		}
		data.set(hoja, value);
	}
	
	/**
	 * el valor es agregado al priority queue
	 */
	public void add(E value) {
		data.add(value);
		filtrar(data.size() -1);
	}
	
	protected void bajar(int raiz) {
		int heapS = data.size();
		E value = data.get(raiz);
		while (raiz < heapS) {
			int poshijo = izq(raiz);
			if (poshijo < heapS) {
				if ((der(raiz)<heapS) && (data.get(poshijo + 1)).compareTo(data.get(poshijo)) <0 ) {
					poshijo++;
				}
				if ((data.get(poshijo)).compareTo(value)<0){
					data.set(raiz, data.get(poshijo));
					raiz = poshijo;
				} else {
					data.set(raiz, value);
					return;
				}
			}
		}
	}
	/**
	 * Regresa y remueve el valor minimo del queue
	 */
	public E remove() {
		E Valmin = getFirst();
		data.set(0, data.get(data.size() - 1));
		data.setSize(data.size()-1);
		if (data.size() > 1) bajar(0);
		return Valmin;
	}
	
	public E getFirst() {
		return data.firstElement();
	}
	
	public void clear() {
		data.clear();
	}
	
	public int size() {
		return data.size();
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	@Override
	public E poll() {
		// TODO Auto-generated method stub
		return null;
	}
}
