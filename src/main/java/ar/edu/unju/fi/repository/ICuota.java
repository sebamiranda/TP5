/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Cuota;

/**
 * @author SEBA
 *
 */
public interface ICuota {
	public void guardad();
	public Cuota mostrar();
	public void eliminar();
	public Cuota modificar();

}
