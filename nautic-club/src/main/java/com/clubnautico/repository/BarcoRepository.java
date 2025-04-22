package com.clubnautico.repository;

import com.clubnautico.entity.Barco;
import com.clubnautico.entity.Socio;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BarcoRepository extends JpaRepository<Barco, Long> {
	
	//buscamos barcos por cuotas
	
	@Query("SELECT b FROM Barco b WHERE b.cuota > ?1")
    List<Barco> findByCuotaGreaterThan(BigDecimal cuota);

	
}
