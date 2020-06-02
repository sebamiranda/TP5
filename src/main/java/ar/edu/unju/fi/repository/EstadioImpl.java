/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Miranda3370Tp5Application;
import ar.edu.unju.fi.model.Estadio;


/**
 * @author SEBA
 *
 */
@Repository("estadioImpl")
public class EstadioImpl implements IEstadio {
	@Autowired
	private Estadio estadio;
	
	//creacion de una variable static para simular las acciones de los metodos
	public static Logger LOG = LoggerFactory.getLogger(Miranda3370Tp5Application.class);

	
	@Override
	public void guardad() {
		//accion para guardar en la bd
		LOG.info("El estadio fue guardado"+estadio.getNombre());

	}

	@Override
	public Estadio mostrar() {
		//se muestran los datos de la base de datos
		LOG.info("Mostrar los datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		//elimina el estadio de la bd
		LOG.info("Se elimino el estadio");
	}

	@Override
	public Estadio modificar() {
		LOG.info("El estadio fue guardado"+estadio.getNombre());

		return estadio;
	}

	

}
