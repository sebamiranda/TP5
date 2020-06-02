/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Miranda3370Tp5Application;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author SEBA
 *
 */
@Repository("resultadoImpl")
public class ResultadoImpl implements IResultado {
	
	@Autowired
	private Resultado resultado;
	
	//creacion de una variable static para simular las acciones de los metodos
	public static Logger LOG = LoggerFactory.getLogger(Miranda3370Tp5Application.class);

	
	@Override
	public void guardad() {
		//accion para guardar el resultado en la bd
		LOG.info("El resultado fue guardado"+resultado.getEquipo1()+","+resultado.getGolesEquipo1()+resultado.getEquipo2()+resultado.getGolesEquipo2());

	}

	@Override
	public Resultado mostrar() {
		//se muestran los datos de la base de datos
		LOG.info("Mostrar los resultados");
		return resultado;
	}

	@Override
	public void eliminar() {
		//elimina el usuario de la bd
		LOG.info("Se elimino resultado");
	}

	@Override
	public Resultado modificar() {
		LOG.info("El resultado fue guardado"+resultado.getEquipo1()+","+resultado.getGolesEquipo1()+resultado.getEquipo2()+resultado.getGolesEquipo2());
		return resultado;
	}


}
