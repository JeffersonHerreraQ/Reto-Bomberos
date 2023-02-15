package com.jeffhq.Crud.model;

import com.jeffhq.Crud.enums.Tipo;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Personal {

    @Id
    @GeneratedValue
    private Long id;

    private String cedula;
    private String nombres;
    private String apellidos;

    @Enumerated(EnumType.STRING)   //restrinjo para que tenga solo las dos opciones
    @Column(name="tipo")      //añado una nueva columna con el tipo
    private Tipo tipo;   //defino la variable tipo

    @OneToMany(mappedBy = "personal")
    private List<Emergencia> emergencias; //un personal puede tener varias emergencias

}
