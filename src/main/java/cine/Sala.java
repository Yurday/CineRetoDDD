package cine;

import cine.values.Capacidad;
import cine.values.NombreSala;
import cine.values.SalaId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Sala extends Entity <SalaId> {

    private NombreSala nombreSala;
    private Capacidad capacidad;

    public Sala (SalaId entityId, NombreSala nombreSala, Capacidad capacidad){
        super(entityId);
        this.nombreSala = nombreSala;
        this.capacidad = capacidad;
    }

    public void modificarNombreDeSala(NombreSala nombreSala){
        this.nombreSala = Objects.requireNonNull(nombreSala);
    }
}
