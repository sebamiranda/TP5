/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;

/**
 * @author SEBA
 *
 */
public interface IUsuario {
	
	public void guardad();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();
	

}
