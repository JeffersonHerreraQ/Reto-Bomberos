package com.jeffhq.Crud.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity   //indica que es una entidad
@AllArgsConstructor  //indica que posee todos loas argumentos de constructor (debido a lombok)
@NoArgsConstructor
@Getter             //ya se está incluyendo getter y setter(debido a lombok)
@Setter
@ToString           //tiene String (debido a lombok)

public class Emergencia {   //creo la entidad como clase

    private Date fecha_reg;   //defino atributos
    private Date fecha_eme;
    private String titulo;
    private String descripcion;
    private Float latitud;
    private Float longitud;

    @Id      //indico que la entidad tiene un id, estas líneas se crean dando click en la entidad y generando el id
    @GeneratedValue
    private Long codigo;

    @ManyToOne //Indico la relacion que hay con el personal. Cascade pongo para cuando elimino un registro, se elimina tambien la relacion
    @JoinColumn(name = "personal_id")
    private Personal personal;
}
