/**
 * Extraido de: Duane A Bailey (2007) java structures in java for principled programmer
 * @author Daniela Batz 19214
 *
 * @param <E>
 */

public interface iPriorityQueue <E extends Comparable<E>> {
	public E getFirst();
    // pre: !isEmpty()
    // post: returns the minimum value in priority queue

    public E remove();
    // pre: !isEmpty()
    // post: returns and removes minimum value from queue

    public void add(E value);
    // pre: value is non-null comparable
    // post: value is added to priority queue

    public boolean isEmpty();
    // post: returns true iff no elements are in queue

    public int size();
    // post: returns number of elements within queue

    public void clear();
    // post: removes all elements from queue
	
	public E poll();
    // pre: !isEmpty()
    // post: returns the minimum value in priority queue
}
