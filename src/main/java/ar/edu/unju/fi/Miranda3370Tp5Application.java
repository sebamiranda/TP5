package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Miranda3370Tp5Application implements CommandLineRunner {
	
	@Autowired
	IUsuarioService usuarioService;
	
	@Autowired
	Usuario usuario;

	public static void main(String[] args) {
		SpringApplication.run(Miranda3370Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
	
	//inicializando las variables de mi objeto usuario
	usuario.setApellido("Perez");
	usuario.setDireccion("avda Mitre 256");
	usuario.setDni(30215478);
	usuario.setFechaAlta(LocalDate.now());
	usuario.setFechaNacimiento(LocalDate.of(1980,11,12));
	usuario.setId(1);
	usuario.setNombre("Juan");
	usuario.setPassword("123");
	usuario.setTipo("SOCIO");
	
	usuarioService.guardar();
	
	
		
		
		
	}
}
