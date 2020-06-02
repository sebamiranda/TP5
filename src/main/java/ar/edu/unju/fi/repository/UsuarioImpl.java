/**
 * 
 */
package ar.edu.unju.fi.repository;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Miranda3370Tp5Application;
import ar.edu.unju.fi.model.Usuario;

/**
 * @author SEBA
 *
 */
@Repository("usuarioImpl")
public class UsuarioImpl implements IUsuario {
	
	@Autowired
	private Usuario usuario;
	
	//creacion de una variable static para simular las acciones de los metodos
	public static Logger LOG = LoggerFactory.getLogger(Miranda3370Tp5Application.class);

	
	@Override
	public void guardad() {
		//accion para guardar el usuario en la bd
		LOG.info("El usuario fue guardado"+usuario.getApellido()+","+usuario.getNombre());

	}

	@Override
	public Usuario mostrar() {
		//se muestran los datos de la base de datos
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		//elimina el usuario de la bd
		LOG.info("Se elimino el usuario");
	}

	@Override
	public Usuario modificar() {
		LOG.info("El usuario fue guardado"+usuario.getApellido()+","+usuario.getNombre());
		return usuario;
	}

}
