/**
 * 
 * @author Daniela Batz 19214
 *
 */
public class Paciente implements Comparable<Paciente> {
	private String nombre; //nombre del paciente 
	private String sintoma; //sintoma del paciente 
	private String cod; //codigo de emergencia del paciente 
	
	/**
	 * Constructor que crea un nuevo objeto Paciente 
	 * recibiendo distinitos parametros
	 * @param nombre guarda el nombre del paciente
	 * @param sintoma guarda el sintoma del paciente
	 * @param cod guarda el codigo de emergecnia del paciente
	 */
	public Paciente (String nombre, String sintoma, String cod) {
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.cod = cod;
	}
	
	/**
	 * Constructor que permite otener el nombre del paciente
	 * @return el nombre del paciente
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Constructor que permite obtener el sintoma del paciente
	 * @return el sintoma el sintoma del paciente
	 */
	public String getSintoma() {
		return sintoma;
	}
	
	/**
	 * Constructor que permite obtener el codigo de emergencia del paciente
	 * @return el codigo de emergencia
	 */
	public String getCode() {
		return cod;
	}
	
	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return nombre+" , "+sintoma+" , "+cod;
	}
	
	/**
	 * (non-Javadoc)
	 * 
	 */
	public int compareTo(Paciente other) {
		return this.cod.compareTo(other.getCode());
	}
	
}
