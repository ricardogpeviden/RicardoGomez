package com.clubnautico.repository;

import com.clubnautico.entity.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface SocioRepository extends JpaRepository<Socio, Long> {

    // Buscamos socios por nombre por JPQL
	
	@Query("SELECT Socio FROM Socio WHERE nombre = ?1")
	List<Socio> findByNombre(String nombre);
}
