/**
 * 
 */
package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;


/**
 * @author SEBA
 *
 */
public interface INoticia {
	
	public void guardad();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();

}
