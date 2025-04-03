package com.PizzeriaSpring3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfiguracionPizzeria {
	
	//Lista de pizzas con nombre e ingredientes para mostrar en el menu

    @Bean
    public List<Pizza> pizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Margarita", "Tomate, Mozzarella, Albahaca"));
        pizzas.add(new Pizza("Pepperoni", "Tomate, Mozzarella, Pepperoni"));
        pizzas.add(new Pizza("Cuatro Quesos", "Mozzarella, Gorgonzola, Parmesano, Ricotta"));
        return pizzas;
    }
}
