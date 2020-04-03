/**
 * 
 * @author Daniela Batz 19214
 *
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class VectorHeapTest {

	public VectorHeapTest() {
		// TODO Auto-generated constructor stub
	}
	@BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

	//Se comprueba el funcionamiento del metodo add 
    //asi que primero se a�aden valores al vector Heap 
    //y luego se revisa si ha cambiado el tama�o del vector
    @Test
    public void testAdd() {
        System.out.println("add");
        VectorHeap<Integer> instance = new VectorHeap();
        instance.add(75);
        instance.add(20);
        instance.add(1);
        instance.add(16);
        instance.add(5);
        int expResult = 5;
        int result = instance.size();
        assertEquals(expResult, result);

		//Despues se comprueba que el primer valor del vector 
        // ya sea el que tiene mayor prioridad (sin importar que se haya ingresado 
        //de ultimo o en cualquier posicion)
		int expResul2 = 1;
		int result2 = instance.getFirst();
        assertEquals(expResult, result);
    }

	//Para que se compruebe el funcionamiento del metodo 
    //"remove", primero se a�aden valores al vector Heap y 
    //se elimina el primer valor, que es el que mayor prioridad tiene
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap<Integer> instance = new VectorHeap();
        instance.add(43);
        instance.add(25);
        instance.add(1);
		instance.add(53);
        int expResult = 1;
        int result = instance.remove();
        assertEquals(expResult, result);

		//Despues de que se comprueba que se haya removido del vector, 
        //esto se hace obteniendo el tama�o del vector.
		int expResul2 = 3;
		int result2 = instance.size();
        assertEquals(expResult, result);
    }

}
