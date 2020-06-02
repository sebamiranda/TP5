/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Equipo;


/**
 * @author SEBA
 *
 */
public interface IEquipo {
	
	public void guardad();
	public Equipo mostrar();
	public void eliminar();
	public Equipo modificar();

}
