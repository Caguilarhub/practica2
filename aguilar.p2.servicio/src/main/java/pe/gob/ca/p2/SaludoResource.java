package pe.gob.ca.p2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoResource {
	
	@RequestMapping(value = "/saludame/{nombre}", method = RequestMethod.GET)
	public String getPersona(@PathVariable("nombre") String nombre) {		
		return "HOLA "+nombre;
	}
}
