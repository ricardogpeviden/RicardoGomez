package com.ejemplo.api.controller;

import com.ejemplo.api.model.Project;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*Controlador REST para gestionar el recurso Project */
@RestController
@RequestMapping("/api/projects")
public class ProjectController {

	/*Endpoint para obtener la información de un project*/
    @Operation(
        summary = "Obtener información del proyecto", 
        description = "Retorna un objeto 'Project' con la información: id, description, language, open."
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Proyecto encontrado"),
        @ApiResponse(responseCode = "404", description = "Proyecto no encontrado")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Project> getProject(@PathVariable Long id) {
    	
        // Creamos un objeto Project con datos
        Project project = new Project(id, "Proyecto de ejemplo", "Java", true);
        
        // Retornamos el objeto Project con código HTTP 200 que es okay
        return new ResponseEntity<>(project, HttpStatus.OK);
    }
}
