/**
 * 
 */
package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author SEBASTIAN MIRANDA
 *
 */
@Component
public class Equipo {
	
	/**
	 * ATRIBUTOS
	 */

	private String Nombre;
	@Autowired
	private Estadio estadio;
	
	
	//----CONSTRUCTORES---
	
	/**
	 * CONSTRUCTOR SIN PARAMETROS
	 */
	public Equipo() {
		super();
	}
		
	
	/**
	 * CONSTRUCTOR PRAMETRIZADO
	 * @param nombre
	 * @param estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		super();
		Nombre = nombre;
		this.estadio = estadio;
	}

	//----GETTERS AND SETTER----

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}


	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	
	
	
	
	
}
