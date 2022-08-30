package example.com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.com.demo.Entity.Electronics;

public interface ElectronicsRepository extends JpaRepository<Electronics,Integer>{
	Electronics findByName(String name);

}
