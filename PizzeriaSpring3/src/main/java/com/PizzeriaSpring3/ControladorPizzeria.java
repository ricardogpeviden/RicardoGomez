package com.PizzeriaSpring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class ControladorPizzeria {
	
	//Se hacen inyecciones, como el bean de ConfiguracionPizzeria

    @Autowired
    private List<Pizza> pizzas;
    // Para realizar el mapeado, siempre se debe incluir:
    @GetMapping("/")
    //Se imprime con responsebody
    @ResponseBody
    public String mostrarPizzas() {
        String salida = "Bienvenido a la Pizzería<br><br>";
        for (Pizza pizza : pizzas) {
            salida += pizza.toString() + "<br>";
        }
        return salida;
    }
}
