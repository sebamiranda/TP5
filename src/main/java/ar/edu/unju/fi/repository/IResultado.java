/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;


/**
 * @author SEBA
 *
 */
public interface IResultado {
	public void guardad();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();

}
