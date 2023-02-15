package com.jeffhq.Crud.controller;

import com.jeffhq.Crud.model.Emergencia;
import com.jeffhq.Crud.service.EmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmergenciaController {

    @Autowired // aviso que abajo hago inyeccion de dependencia
    EmergenciaService emergenciaService; //inyeccion de dependencia

    @PostMapping ("/emergencia") //  indico que es para hacer una petición post. Escribir en la base de datos
    private void crearEmergencia(@RequestBody Emergencia emergencia){  //request body  se utiliza cuando voy a enviar informacion en el cuerpo de la peticion
        emergenciaService.crearEmergencia(emergencia); //invocamos a la dependencia
    }

    @GetMapping("/emergencia")
    private List<Emergencia> verEmergencia(){
        return emergenciaService.verEmergencia();
    }

    @DeleteMapping("/emergencia/{codigo}")
    private void eliminarEmergencia(@PathVariable("codigo") Long codigo){ //capturo el id como una variable
        emergenciaService.eliminarEmergencia(codigo);
    }

    @PutMapping("/emergencia")
    private void editarEmergencia(@RequestBody Emergencia emergencia){
        emergenciaService.crearEmergencia(emergencia);
    }
}
