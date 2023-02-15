package com.jeffhq.Crud.controller;

import com.jeffhq.Crud.model.Emergencia;
import com.jeffhq.Crud.model.Personal;
import com.jeffhq.Crud.service.EmergenciaService;
import com.jeffhq.Crud.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonalController {
    @Autowired // aviso que abajo hago inyeccion de dependencia
    PersonalService personalService; //inyeccion de dependencia

    @PostMapping("/personal")
    private void crearPersonal(@RequestBody Personal personal){
        personalService.crearPersonal(personal);
    }

    @GetMapping("/personal")
    private List<Personal> verPersonal(){
        return personalService.verPersonal();
    }

    @DeleteMapping("/personal/{id}")
    private void eliminarPersonal(@PathVariable("id") Long id){ //capturo el id como una variable
        personalService.eliminarPersonal(id);
    }

    @PutMapping ("/personal")
    private void editarPersonal(@RequestBody Personal personal){
        personalService.crearPersonal(personal);
    }
}
