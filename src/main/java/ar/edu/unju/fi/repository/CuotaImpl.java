/**
 * 
 */
package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Miranda3370Tp5Application;
import ar.edu.unju.fi.model.Cuota;


/**
 * @author SEBA
 *
 */
@Repository("usuarioImpl")
public class CuotaImpl implements ICuota {

	@Autowired
	private Cuota cuota;
	
	//creacion de una variable static para simular las acciones de los metodos
	public static Logger LOG = LoggerFactory.getLogger(Miranda3370Tp5Application.class);

	
	@Override
	public void guardad() {
		//accion para guardar el  en la bd
		LOG.info("La cuota fue guardado"+cuota.getPeriodo()+cuota.getMonto());

	}

	@Override
	public Cuota mostrar() {
		//se muestran los datos de la base de datos
		LOG.info("Mostrar las cuotas");
		return cuota;
	}

	@Override
	public void eliminar() {
		//elimina de la bd
		LOG.info("Se elimino la cuota");
	}

	@Override
	public Cuota modificar() {
		LOG.info("La cuota fue modificada"+cuota.getPeriodo()+cuota.getMonto());
		return cuota;
	}
}
