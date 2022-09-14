package example.com.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import example.com.demo.Entity.Electronics;
import example.com.demo.Services.ElectronicsService;

@RestController
public class ElectronicsController {
	
	@Autowired
	private ElectronicsService service;
	
	@PostMapping("/addElectronics")
	public Electronics addElectronics(@RequestBody Electronics k) {
		return service.saveElectronics(k);
	}
	@PostMapping("/addElectronicss")
	public List<Electronics>addElectronicss(@RequestBody List<Electronics> m) {
		return service.saveElectronicss(m);
		
	}
	@GetMapping("/Electronicss")
	public Optional<Electronics>FindAllElectronics() {
		return service.getElectronics();
	}
	@GetMapping("/Electronics/{id}")
	public Electronics findElectronicsById(@PathVariable Integer id) {
		return service.getElectronicsById(id);
	}
	@GetMapping("/Electronics/{name}")
	public Electronics findByName(@PathVariable String name) {
		return service.getElectronicsByName(name);
	}
	@PostMapping("/update")
	public Electronics updateElectronics(@RequestBody Electronics k) {
		return service.saveElectronics(k);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteElectronics(@PathVariable int id) {
		return service.deleteElectronics(id);
	}
}
