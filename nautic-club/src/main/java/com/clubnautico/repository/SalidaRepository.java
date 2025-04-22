package com.clubnautico.repository;

import com.clubnautico.entity.Salida;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalidaRepository extends JpaRepository<Salida, Long> {
	
	//Buscamos salidas por destino

    @Query("SELECT s FROM Salida s WHERE s.destino = ?1")
    List<Salida> findByDestino(String destino);
}

