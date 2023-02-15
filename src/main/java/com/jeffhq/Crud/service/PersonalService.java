package com.jeffhq.Crud.service;

import com.jeffhq.Crud.model.Personal;
import com.jeffhq.Crud.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonalService {
    @Autowired  //anotacion para indicar a spingboot que abajo estoy haciendo inyecccion de dependencias.
    PersonalRepository personalRepository;   //inyecto la interfaz creada en el repositorio para que se comuniquen
    public void crearPersonal(Personal personal){
        personalRepository.save(personal);
    }
    public List<Personal> verPersonal(){
        List<Personal> personals = new ArrayList<Personal>();
        personals.addAll(personalRepository.findAll());  //tenemos una lista vacia, y a esa lista se va a agregar todo
        return personals;   //retorna la lista

    }
    public void eliminarPersonal(Long id){
        personalRepository.deleteById(id);
    }
}
