package com.jeffhq.Crud.service;

import com.jeffhq.Crud.model.Emergencia;
import com.jeffhq.Crud.repository.EmergenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service    //indico que esta clase es un servicio
public class EmergenciaService {

    @Autowired  //anotacion para indicar a spingboot que abajo estoy haciendo inyecccion de dependencias.
    EmergenciaRepository emergenciaRepository;   //inyecto la interfaz creada en el repositorio para que se comuniquen

    public void crearEmergencia(Emergencia emergencia){  //genero los métodos, lo que va a hacer el crud
        emergenciaRepository.save(emergencia);
    }
    public List<Emergencia> verEmergencia(){
        List<Emergencia> emergencias = new ArrayList<Emergencia>();
        emergencias.addAll(emergenciaRepository.findAll());  //tenemos una lista vacia, y a esa lista se va a agregar todo
        return emergencias;   //retorna la lista

    }
    public void eliminarEmergencia(Long codigo){
        emergenciaRepository.deleteById(codigo);
    }

}
