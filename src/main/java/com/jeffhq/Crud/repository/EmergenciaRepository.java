package com.jeffhq.Crud.repository;

import com.jeffhq.Crud.model.Emergencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergenciaRepository extends JpaRepository<Emergencia, Long> {  //Se extiende la interfaz aplicando la herencia para importar metodos para cruds (delete, add, put, save)
}
