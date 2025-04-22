package com.clubnautico;

import com.clubnautico.entity.Socio;
import com.clubnautico.repository.SocioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

//clic derecho sobre la clase de test y selecciono Run As -> JUnit Test

@SpringBootTest
public class NauticClubApplicationTests {

    @Autowired
    private SocioRepository socioRepository;

    @Test
    public void testCrearSocio() {
        Socio socio = new Socio();
        socio.setNombre("Test");
        socio.setApellido("User");
        socio = socioRepository.save(socio);
        assertNotNull(socio.getId(), "El id no debe ser nulo tras guardar el socio");
    }
}
