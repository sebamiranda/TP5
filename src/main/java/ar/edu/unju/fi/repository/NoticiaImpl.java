/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Miranda3370Tp5Application;
import ar.edu.unju.fi.model.Noticia;


/**
 * @author SEBA
 *
 */
@Repository("noticiaImpl")
public class NoticiaImpl implements INoticia {
	
	@Autowired
	private Noticia noticia;
	
	//creacion de una variable static para simular las acciones de los metodos
	public static Logger LOG = LoggerFactory.getLogger(Miranda3370Tp5Application.class);

	
	@Override
	public void guardad() {
		//accion para guardar  en la bd
		LOG.info("El noticia fue guardada"+noticia.getTitulo()+noticia.getResumen());

	}

	@Override
	public Noticia mostrar() {
		//se muestran los datos de la base de datos
		LOG.info("Mostrar Noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		//elimina noticia de la bd
		LOG.info("Se elimino la noticia");
	}

	@Override
	public Noticia modificar() {
		LOG.info("El noticia fue guardada"+noticia.getTitulo()+noticia.getResumen());
		return noticia;
	}

	
	

}
