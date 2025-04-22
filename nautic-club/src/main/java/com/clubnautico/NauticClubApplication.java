package com.clubnautico;

import com.clubnautico.entity.Salida;
import com.clubnautico.entity.Barco;
import com.clubnautico.entity.Socio;
import com.clubnautico.repository.SalidaRepository;
import com.clubnautico.repository.BarcoRepository;
import com.clubnautico.repository.SocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class NauticClubApplication implements CommandLineRunner {

    @Autowired
    private SocioRepository socioRepository;
    
    @Autowired
    private BarcoRepository barcoRepository;
    
    @Autowired
    private SalidaRepository salidaRepository;

    public static void main(String[] args) {
        SpringApplication.run(NauticClubApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // creamos un socio
    	
        Socio socio = new Socio();
        socio.setNombre("Juan");
        socio.setApellido("Pérez");
        socioRepository.save(socio);

        // barco asociado al socio
        
        Barco barco = new Barco();
        barco.setMatricula("ABC123");
        barco.setNombre("La Sirena");
        barco.setNumeroAmarre(5);
        barco.setCuota(new BigDecimal("150.00"));
        barco.setSocio(socio);
        barcoRepository.save(barco);

        // salida de barco
        
        Salida salida = new Salida();
        salida.setFechaHoraSalida(LocalDateTime.now());
        salida.setDestino("Isla del Tesoro");
        salida.setNombrePatron("Carlos");
        salida.setApellidoPatron("García");
        salida.setBarco(barco);
        salidaRepository.save(salida);

        // buscamos socios por nombre
        
        List<Socio> sociosEncontrados = socioRepository.findByNombre("Juan");
        sociosEncontrados.forEach(System.out::println);
        
     // consultas personalizadas
        BigDecimal cuotaMinima = new BigDecimal("100.00");
        String destino = "Isla del Tesoro";

        // buscar barcos con cuota mayor que cuotaMinima
        List<Barco> barcosConCuotaAlta = barcoRepository.findByCuotaGreaterThan(cuotaMinima);
        barcosConCuotaAlta.forEach(System.out::println);

        // buscar salidas según destino
        List<Salida> salidasPorDestino = salidaRepository.findByDestino(destino);
        salidasPorDestino.forEach(System.out::println);

        
    }
}
