package pe.gob.ca.p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SaludaNombreResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("persona/{nombre}")
	public String getSaludo(@PathVariable("nombre") String nombre) {
		String url ="http://Aguilar-Practica2-servicio-saludo/api/saludame/"+nombre;
		return restTemplate.getForObject(url,String.class);
	}
	
}
